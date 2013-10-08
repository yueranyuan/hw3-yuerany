package edu.cmu.deiis.analysis;


import java.util.LinkedList;
import java.util.List;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.jcas.JCas;

import edu.cmu.deiis.types.AnswerScore;
import edu.cmu.deiis.types.Answer;

/**
 * This processor aggregates the answer scores with a weighted sum
 * @author yueran
 *
 */
public class TestElementAggregateScoringProcessor extends AbstractTestElementScoringProcessor {
  
  /**
   * Construct the processor
   * make sure the annotation is tagged as an aggregate
   */
  public TestElementAggregateScoringProcessor() {
    answerScoreAnnotationFactory.AnnotatorName = "AggregateAnswerScoreAnnotator";
  }
  
  /**
   * gets an aggregate score of previous AnswerScores by using a sum weighted by
   * the confidence
   */
  @SuppressWarnings("unchecked")
  @Override
  // assumes that questionNgrams already exists
  protected void processAnswer(Answer answer, JCas aJCas) {
    // loop through answer scores for this answer and sum up the weighted scores
    int count = 0;
    double score = 0.0;
    FSIterator<AnswerScore> answerScoreIter = 
            (FSIterator<AnswerScore>) getAnnotationsFromIndex(aJCas, AnswerScore.type);
    while (answerScoreIter.hasNext()) {
      AnswerScore answerScore = answerScoreIter.next();
      if (answer == answerScore.getAnswer()) {
        score += answerScore.getConfidence() * answerScore.getScore();
        count ++;
      }
    }
    // normalize score
    score = (count > 0) ? score / count : 0.0;
    // make final annotation
    answerScoreAnnotationFactory.Annotate(aJCas, answer, score, 1.0);
  }
  
  /**
   * Aggregate scores and then do clean up to remove the old scores
   */
  @SuppressWarnings("unchecked")
  @Override
  protected void process(JCas aJCas) throws AnalysisEngineProcessException {
    super.process(aJCas);
    
    // clean up all the old answer scores
    List<FeatureStructure> removedFs = new LinkedList<FeatureStructure>();
    FSIterator<AnswerScore> answerScoreIter = 
            (FSIterator<AnswerScore>) getAnnotationsFromIndex(aJCas, AnswerScore.type);
    while (answerScoreIter.hasNext()) {
      AnswerScore answerScore = answerScoreIter.next();
      if (answerScore.getCasProcessorId() != answerScoreAnnotationFactory.AnnotatorName) {
        removedFs.add(answerScore);
      }
    }
    for (int i = 0; i < removedFs.size(); i++) {
      aJCas.removeFsFromIndexes(removedFs.get(i));
    }
  }
}