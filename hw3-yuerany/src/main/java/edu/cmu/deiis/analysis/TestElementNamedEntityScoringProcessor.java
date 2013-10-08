package edu.cmu.deiis.analysis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.uima.jcas.JCas;
import org.cleartk.ne.type.NamedEntity;
import org.cleartk.ne.type.NamedEntityMention;

import edu.cmu.deiis.types.Question;
import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.Annotation;

/**
 * This processor generates AnswerScore annotations for each Answer based on an Named Entity score
 * @author yueran
 *
 */
public class TestElementNamedEntityScoringProcessor extends AbstractTestElementScoringProcessor {
  
  List<NamedEntity> questionNamedEntities;
  
  /**
   * Computes a score based on the number of named entities from the reference list 
   * that occur in the compared list
   * @param referenceNe   reference list of named entities
   * @param myNe          the list of named entities to compare
   * @return              the percentage of reference entities found in the compare list
   */
  private double scoreWithNamedEntities(List<NamedEntity> referenceNe, List<NamedEntity> myNe) {
    // handle edge case: if the reference sentence has no named entities, this evaluator is useless
    if (referenceNe.size() == 0) {
      return 0.0;
    }
    // handle the general case
    Iterator<NamedEntity> referenceNeIter = referenceNe.iterator();
    double scoreCounter = 0.0;
    while (referenceNeIter.hasNext()) {
      NamedEntity ne = referenceNeIter.next();
      if (myNe.contains(ne)) {
        scoreCounter += 1.0;
      }
    }
    return scoreCounter / referenceNe.size();
  }
  
  /**
   * gets a list of named entities inside the span of a text annotation
   * @param textAnnotation      the text to look for named entities in
   * @param aJCas               UIMA Cas that contains the named entities
   * @return                    list of named entities inside the text annotation
   */
  @SuppressWarnings("unchecked")
  //we are feeding in the proper type so casting should not be an issue
  private List<NamedEntity> getNamedEntities(Annotation textAnnotation, JCas aJCas) {
    int annotationBegin = textAnnotation.getBegin();
    int annotationEnd = textAnnotation.getEnd();
    Iterator<NamedEntityMention> nemIter = 
            (Iterator<NamedEntityMention>) getAnnotationsFromIndex(aJCas, NamedEntityMention.type);
    // Linked List used because we will be converting to an iterator
    List<NamedEntity> relevantNamedEntities = new LinkedList<NamedEntity>();
    while (nemIter.hasNext()) {
      NamedEntityMention nem = (NamedEntityMention)nemIter.next();
      // check that the named entity is for this sentence
      if (nem.getBegin() >= annotationBegin && nem.getEnd() <= annotationEnd) {
        NamedEntity ne = nem.getMentionedEntity();
        if (!relevantNamedEntities.contains(ne)) {
          relevantNamedEntities.add(ne);
        }
      }
    }
    return relevantNamedEntities;
  }

  /**
   * Gets the named entities from the question
   */
  @Override
  protected void processQuestion(Question question, JCas aJCas) {
    questionNamedEntities = getNamedEntities(question, aJCas);
  }

  /**
   * Gets Named Entities for each answer and scores the answer according to NGram
   * match with the question
   */
  @Override
  // assumes that questionNamedEntities already exists
  protected void processAnswer(Answer answer, JCas aJCas) {
    List<NamedEntity> answerNamedEntities = getNamedEntities(answer, aJCas);
    double neScore = scoreWithNamedEntities(questionNamedEntities, answerNamedEntities);
    // The named entity scorer is not very good, so has a low confidence
    // TODO generate this confidence score programatically
    answerScoreAnnotationFactory.Annotate(aJCas, answer, neScore, 0.3);
  }
}