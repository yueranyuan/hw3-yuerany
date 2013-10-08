
/* First created by JCasGen Sat Oct 05 00:41:12 EDT 2013 */
package org.cleartk.timeml.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Mon Oct 07 21:36:24 EDT 2013
 * @generated */
public class Time_Type extends Anchor_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Time_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Time_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Time(addr, Time_Type.this);
  			   Time_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Time(addr, Time_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Time.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.cleartk.timeml.type.Time");
 
  /** @generated */
  final Feature casFeat_timeType;
  /** @generated */
  final int     casFeatCode_timeType;
  /** @generated */ 
  public String getTimeType(int addr) {
        if (featOkTst && casFeat_timeType == null)
      jcas.throwFeatMissing("timeType", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getStringValue(addr, casFeatCode_timeType);
  }
  /** @generated */    
  public void setTimeType(int addr, String v) {
        if (featOkTst && casFeat_timeType == null)
      jcas.throwFeatMissing("timeType", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setStringValue(addr, casFeatCode_timeType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_beginPoint;
  /** @generated */
  final int     casFeatCode_beginPoint;
  /** @generated */ 
  public String getBeginPoint(int addr) {
        if (featOkTst && casFeat_beginPoint == null)
      jcas.throwFeatMissing("beginPoint", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getStringValue(addr, casFeatCode_beginPoint);
  }
  /** @generated */    
  public void setBeginPoint(int addr, String v) {
        if (featOkTst && casFeat_beginPoint == null)
      jcas.throwFeatMissing("beginPoint", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setStringValue(addr, casFeatCode_beginPoint, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endPoint;
  /** @generated */
  final int     casFeatCode_endPoint;
  /** @generated */ 
  public String getEndPoint(int addr) {
        if (featOkTst && casFeat_endPoint == null)
      jcas.throwFeatMissing("endPoint", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getStringValue(addr, casFeatCode_endPoint);
  }
  /** @generated */    
  public void setEndPoint(int addr, String v) {
        if (featOkTst && casFeat_endPoint == null)
      jcas.throwFeatMissing("endPoint", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setStringValue(addr, casFeatCode_endPoint, v);}
    
  
 
  /** @generated */
  final Feature casFeat_quant;
  /** @generated */
  final int     casFeatCode_quant;
  /** @generated */ 
  public String getQuant(int addr) {
        if (featOkTst && casFeat_quant == null)
      jcas.throwFeatMissing("quant", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getStringValue(addr, casFeatCode_quant);
  }
  /** @generated */    
  public void setQuant(int addr, String v) {
        if (featOkTst && casFeat_quant == null)
      jcas.throwFeatMissing("quant", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setStringValue(addr, casFeatCode_quant, v);}
    
  
 
  /** @generated */
  final Feature casFeat_freq;
  /** @generated */
  final int     casFeatCode_freq;
  /** @generated */ 
  public String getFreq(int addr) {
        if (featOkTst && casFeat_freq == null)
      jcas.throwFeatMissing("freq", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getStringValue(addr, casFeatCode_freq);
  }
  /** @generated */    
  public void setFreq(int addr, String v) {
        if (featOkTst && casFeat_freq == null)
      jcas.throwFeatMissing("freq", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setStringValue(addr, casFeatCode_freq, v);}
    
  
 
  /** @generated */
  final Feature casFeat_functionInDocument;
  /** @generated */
  final int     casFeatCode_functionInDocument;
  /** @generated */ 
  public String getFunctionInDocument(int addr) {
        if (featOkTst && casFeat_functionInDocument == null)
      jcas.throwFeatMissing("functionInDocument", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getStringValue(addr, casFeatCode_functionInDocument);
  }
  /** @generated */    
  public void setFunctionInDocument(int addr, String v) {
        if (featOkTst && casFeat_functionInDocument == null)
      jcas.throwFeatMissing("functionInDocument", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setStringValue(addr, casFeatCode_functionInDocument, v);}
    
  
 
  /** @generated */
  final Feature casFeat_temporalFunction;
  /** @generated */
  final int     casFeatCode_temporalFunction;
  /** @generated */ 
  public String getTemporalFunction(int addr) {
        if (featOkTst && casFeat_temporalFunction == null)
      jcas.throwFeatMissing("temporalFunction", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getStringValue(addr, casFeatCode_temporalFunction);
  }
  /** @generated */    
  public void setTemporalFunction(int addr, String v) {
        if (featOkTst && casFeat_temporalFunction == null)
      jcas.throwFeatMissing("temporalFunction", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setStringValue(addr, casFeatCode_temporalFunction, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated */ 
  public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_valueFromFunction;
  /** @generated */
  final int     casFeatCode_valueFromFunction;
  /** @generated */ 
  public String getValueFromFunction(int addr) {
        if (featOkTst && casFeat_valueFromFunction == null)
      jcas.throwFeatMissing("valueFromFunction", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getStringValue(addr, casFeatCode_valueFromFunction);
  }
  /** @generated */    
  public void setValueFromFunction(int addr, String v) {
        if (featOkTst && casFeat_valueFromFunction == null)
      jcas.throwFeatMissing("valueFromFunction", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setStringValue(addr, casFeatCode_valueFromFunction, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mod;
  /** @generated */
  final int     casFeatCode_mod;
  /** @generated */ 
  public String getMod(int addr) {
        if (featOkTst && casFeat_mod == null)
      jcas.throwFeatMissing("mod", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mod);
  }
  /** @generated */    
  public void setMod(int addr, String v) {
        if (featOkTst && casFeat_mod == null)
      jcas.throwFeatMissing("mod", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setStringValue(addr, casFeatCode_mod, v);}
    
  
 
  /** @generated */
  final Feature casFeat_anchorTime;
  /** @generated */
  final int     casFeatCode_anchorTime;
  /** @generated */ 
  public int getAnchorTime(int addr) {
        if (featOkTst && casFeat_anchorTime == null)
      jcas.throwFeatMissing("anchorTime", "org.cleartk.timeml.type.Time");
    return ll_cas.ll_getRefValue(addr, casFeatCode_anchorTime);
  }
  /** @generated */    
  public void setAnchorTime(int addr, int v) {
        if (featOkTst && casFeat_anchorTime == null)
      jcas.throwFeatMissing("anchorTime", "org.cleartk.timeml.type.Time");
    ll_cas.ll_setRefValue(addr, casFeatCode_anchorTime, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Time_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_timeType = jcas.getRequiredFeatureDE(casType, "timeType", "uima.cas.String", featOkTst);
    casFeatCode_timeType  = (null == casFeat_timeType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_timeType).getCode();

 
    casFeat_beginPoint = jcas.getRequiredFeatureDE(casType, "beginPoint", "uima.cas.String", featOkTst);
    casFeatCode_beginPoint  = (null == casFeat_beginPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_beginPoint).getCode();

 
    casFeat_endPoint = jcas.getRequiredFeatureDE(casType, "endPoint", "uima.cas.String", featOkTst);
    casFeatCode_endPoint  = (null == casFeat_endPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endPoint).getCode();

 
    casFeat_quant = jcas.getRequiredFeatureDE(casType, "quant", "uima.cas.String", featOkTst);
    casFeatCode_quant  = (null == casFeat_quant) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_quant).getCode();

 
    casFeat_freq = jcas.getRequiredFeatureDE(casType, "freq", "uima.cas.String", featOkTst);
    casFeatCode_freq  = (null == casFeat_freq) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_freq).getCode();

 
    casFeat_functionInDocument = jcas.getRequiredFeatureDE(casType, "functionInDocument", "uima.cas.String", featOkTst);
    casFeatCode_functionInDocument  = (null == casFeat_functionInDocument) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_functionInDocument).getCode();

 
    casFeat_temporalFunction = jcas.getRequiredFeatureDE(casType, "temporalFunction", "uima.cas.String", featOkTst);
    casFeatCode_temporalFunction  = (null == casFeat_temporalFunction) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_temporalFunction).getCode();

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_valueFromFunction = jcas.getRequiredFeatureDE(casType, "valueFromFunction", "uima.cas.String", featOkTst);
    casFeatCode_valueFromFunction  = (null == casFeat_valueFromFunction) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_valueFromFunction).getCode();

 
    casFeat_mod = jcas.getRequiredFeatureDE(casType, "mod", "uima.cas.String", featOkTst);
    casFeatCode_mod  = (null == casFeat_mod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mod).getCode();

 
    casFeat_anchorTime = jcas.getRequiredFeatureDE(casType, "anchorTime", "org.cleartk.timeml.type.Time", featOkTst);
    casFeatCode_anchorTime  = (null == casFeat_anchorTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_anchorTime).getCode();

  }
}



    