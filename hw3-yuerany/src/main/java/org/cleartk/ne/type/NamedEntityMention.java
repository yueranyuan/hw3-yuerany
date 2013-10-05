

/* First created by JCasGen Sat Oct 05 00:41:12 EDT 2013 */
package org.cleartk.ne.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.cleartk.score.type.ScoredAnnotation;


/** 
 * Updated by JCasGen Sat Oct 05 00:41:12 EDT 2013
 * XML source: /home/yueran/git/hw3-yuerany/hw3-yuerany/src/main/resources/descriptors/ScoreAnnotator.xml
 * @generated */
public class NamedEntityMention extends ScoredAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NamedEntityMention.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NamedEntityMention() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NamedEntityMention(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NamedEntityMention(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NamedEntityMention(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: mentionType

  /** getter for mentionType - gets 
   * @generated */
  public String getMentionType() {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionType == null)
      jcasType.jcas.throwFeatMissing("mentionType", "org.cleartk.ne.type.NamedEntityMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionType);}
    
  /** setter for mentionType - sets  
   * @generated */
  public void setMentionType(String v) {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionType == null)
      jcasType.jcas.throwFeatMissing("mentionType", "org.cleartk.ne.type.NamedEntityMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionType, v);}    
   
    
  //*--------------*
  //* Feature: mentionedEntity

  /** getter for mentionedEntity - gets 
   * @generated */
  public NamedEntity getMentionedEntity() {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionedEntity == null)
      jcasType.jcas.throwFeatMissing("mentionedEntity", "org.cleartk.ne.type.NamedEntityMention");
    return (NamedEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionedEntity)));}
    
  /** setter for mentionedEntity - sets  
   * @generated */
  public void setMentionedEntity(NamedEntity v) {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionedEntity == null)
      jcasType.jcas.throwFeatMissing("mentionedEntity", "org.cleartk.ne.type.NamedEntityMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionedEntity, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: annotation

  /** getter for annotation - gets 
   * @generated */
  public Annotation getAnnotation() {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_annotation == null)
      jcasType.jcas.throwFeatMissing("annotation", "org.cleartk.ne.type.NamedEntityMention");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_annotation)));}
    
  /** setter for annotation - sets  
   * @generated */
  public void setAnnotation(Annotation v) {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_annotation == null)
      jcasType.jcas.throwFeatMissing("annotation", "org.cleartk.ne.type.NamedEntityMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_annotation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: head

  /** getter for head - gets 
   * @generated */
  public Annotation getHead() {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_head == null)
      jcasType.jcas.throwFeatMissing("head", "org.cleartk.ne.type.NamedEntityMention");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_head)));}
    
  /** setter for head - sets  
   * @generated */
  public void setHead(Annotation v) {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_head == null)
      jcasType.jcas.throwFeatMissing("head", "org.cleartk.ne.type.NamedEntityMention");
    jcasType.ll_cas.ll_setRefValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_head, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: mentionId

  /** getter for mentionId - gets 
   * @generated */
  public String getMentionId() {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionId == null)
      jcasType.jcas.throwFeatMissing("mentionId", "org.cleartk.ne.type.NamedEntityMention");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionId);}
    
  /** setter for mentionId - sets  
   * @generated */
  public void setMentionId(String v) {
    if (NamedEntityMention_Type.featOkTst && ((NamedEntityMention_Type)jcasType).casFeat_mentionId == null)
      jcasType.jcas.throwFeatMissing("mentionId", "org.cleartk.ne.type.NamedEntityMention");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamedEntityMention_Type)jcasType).casFeatCode_mentionId, v);}    
  }

    