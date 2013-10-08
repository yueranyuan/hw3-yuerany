package edu.cmu.deiis.analysis;

import java.util.Iterator;

import org.apache.uima.jcas.JCas;
import org.cleartk.token.type.Token;

import edu.cmu.deiis.types.Question;
import edu.cmu.deiis.types.Answer;
import edu.cmu.deiis.types.Annotation;

/**
 * This Processor creates token annotations for the sentences.  The tokenization is done using
 * the remote ClearTK tokens.  Punctuation are tagged as tokens.
 * @author yueran
 *
 */
public class TestElementTokenizeProcessor extends AbstractTestElementProcessor {
  
  public static String AnnotatorName = "TokenAnnotator";
  private static TokenAnnotationFactory tokenAnnotationFactory = 
          new TokenAnnotationFactory(AnnotatorName);
  private String[] stopWords = {"?",".",";",","}; // a fairly simple way of throwing away punctuation
  
  protected void processQuestion(Question question, JCas aJCas) {
    annotateWithTokens(question, aJCas);
  }
  
  protected void processAnswer(Answer answer, JCas aJCas) {
    annotateWithTokens(answer, aJCas);
  }
  
  /**
   * Read tokens from the remote Tokenizer.  Punctuations are skipped.
   * @param textAnnotation      The text to be tokenized
   * @param aJCas               UIMA Cas system used in the pipeline
   */
  @SuppressWarnings("unchecked")
  private void annotateWithTokens(Annotation textAnnotation, JCas aJCas) {
    Iterator<Token> tokIter = getAnnotationsFromIndex(aJCas, Token.type);
    int annotationBegin = textAnnotation.getBegin();
    outerloop:
    while (tokIter.hasNext()) {
      Token token = tokIter.next();
      // ignore stop words
      for (int i = 0; i < stopWords.length; i++) {
        if (token.getCoveredText().equals(stopWords[i])) {
          continue outerloop;
        }
      }
      tokenAnnotationFactory.Annotate(aJCas,
              annotationBegin + token.getBegin(),
              annotationBegin + token.getEnd());
    }
  }
}