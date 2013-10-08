package edu.cmu.deiis.analysis;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;


/**
 * Creates answerScore annotations by scoring answers with named entities.
 * The class is simply an adapter so that we could plug in an AbstractTestElementScoringProcessor
 * for use in the UIMA pipeline (because UIMA annotators cannot inherit from abstract classes)
 * See that class for implementation details
 * 
 * 
 * @author yueran
 *
 */
public class NamedEntityScoreAnnotator extends JCasAnnotator_ImplBase {
  
  private AbstractTestElementScoringProcessor scoringProcessor;
  
  /**
   * read the scoring algorithm
   */
  public void initialize(UimaContext aContext) throws ResourceInitializationException {
    super.initialize(aContext);
    
    scoringProcessor = new TestElementNamedEntityScoringProcessor();
    
  }
  
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    scoringProcessor.process(aJCas);
  }
  
}