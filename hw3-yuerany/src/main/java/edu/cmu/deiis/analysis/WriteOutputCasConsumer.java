package edu.cmu.deiis.analysis;

import java.util.ArrayList;
import java.util.List;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceProcessException;
import org.apache.uima.util.ProcessTrace;

public class WriteOutputCasConsumer extends CasConsumer_ImplBase {
  private TestElementEvaluationProcessor evaluationProcessor = new TestElementEvaluationProcessor();
  
  private List<Double> precisions = new ArrayList<Double>();
  
  @Override
  public void processCas(CAS aCAS) throws ResourceProcessException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new ResourceProcessException(e);
    }
    precisions.add(new Double(evaluationProcessor.score(jcas))); // track precisions
  }
  
  /**
   * compute the average precision after all processing is done
   */
  @Override
  public void collectionProcessComplete(ProcessTrace arg0) {
    // only aggregate if some precision exists
    if (precisions.size() == 0) {
      return;
    }
    
    double sum = 0.0;
    for (int i = 0; i < precisions.size(); i++) {
      sum += (double)precisions.get(i);
    }
    double average = sum / precisions.size(); // we know size is none 0
    
    System.out.println(String.format("Average Precision: %1.2f", average));
  }

}