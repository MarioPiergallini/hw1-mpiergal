
/* First created by JCasGen Wed Sep 11 21:55:18 EDT 2013 */
package edu.cmu.lti.mpiergal.hw1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** A sentence
 * Updated by JCasGen Wed Sep 11 21:55:18 EDT 2013
 * @generated */
public class Sentence_Type extends BaseType_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.mpiergal.hw1.Sentence");
 
  /** @generated */
  final Feature casFeat_tokenArray;
  /** @generated */
  final int     casFeatCode_tokenArray;
  /** @generated */ 
  public int getTokenArray(int addr) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray);
  }
  /** @generated */    
  public void setTokenArray(int addr, int v) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenArray, v);}
    
   /** @generated */
  public int getTokenArray(int addr, int i) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
  }
   
  /** @generated */ 
  public void setTokenArray(int addr, int i, int v) {
        if (featOkTst && casFeat_tokenArray == null)
      jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_tokenArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_unigramArray;
  /** @generated */
  final int     casFeatCode_unigramArray;
  /** @generated */ 
  public int getUnigramArray(int addr) {
        if (featOkTst && casFeat_unigramArray == null)
      jcas.throwFeatMissing("unigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_unigramArray);
  }
  /** @generated */    
  public void setUnigramArray(int addr, int v) {
        if (featOkTst && casFeat_unigramArray == null)
      jcas.throwFeatMissing("unigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_unigramArray, v);}
    
   /** @generated */
  public int getUnigramArray(int addr, int i) {
        if (featOkTst && casFeat_unigramArray == null)
      jcas.throwFeatMissing("unigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_unigramArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_unigramArray), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_unigramArray), i);
  }
   
  /** @generated */ 
  public void setUnigramArray(int addr, int i, int v) {
        if (featOkTst && casFeat_unigramArray == null)
      jcas.throwFeatMissing("unigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_unigramArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_unigramArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_unigramArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_bigramArray;
  /** @generated */
  final int     casFeatCode_bigramArray;
  /** @generated */ 
  public int getBigramArray(int addr) {
        if (featOkTst && casFeat_bigramArray == null)
      jcas.throwFeatMissing("bigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bigramArray);
  }
  /** @generated */    
  public void setBigramArray(int addr, int v) {
        if (featOkTst && casFeat_bigramArray == null)
      jcas.throwFeatMissing("bigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_bigramArray, v);}
    
   /** @generated */
  public int getBigramArray(int addr, int i) {
        if (featOkTst && casFeat_bigramArray == null)
      jcas.throwFeatMissing("bigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_bigramArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_bigramArray), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_bigramArray), i);
  }
   
  /** @generated */ 
  public void setBigramArray(int addr, int i, int v) {
        if (featOkTst && casFeat_bigramArray == null)
      jcas.throwFeatMissing("bigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_bigramArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_bigramArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_bigramArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_trigramArray;
  /** @generated */
  final int     casFeatCode_trigramArray;
  /** @generated */ 
  public int getTrigramArray(int addr) {
        if (featOkTst && casFeat_trigramArray == null)
      jcas.throwFeatMissing("trigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_trigramArray);
  }
  /** @generated */    
  public void setTrigramArray(int addr, int v) {
        if (featOkTst && casFeat_trigramArray == null)
      jcas.throwFeatMissing("trigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_trigramArray, v);}
    
   /** @generated */
  public int getTrigramArray(int addr, int i) {
        if (featOkTst && casFeat_trigramArray == null)
      jcas.throwFeatMissing("trigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_trigramArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_trigramArray), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_trigramArray), i);
  }
   
  /** @generated */ 
  public void setTrigramArray(int addr, int i, int v) {
        if (featOkTst && casFeat_trigramArray == null)
      jcas.throwFeatMissing("trigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_trigramArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_trigramArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_trigramArray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenArray = jcas.getRequiredFeatureDE(casType, "tokenArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_tokenArray  = (null == casFeat_tokenArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenArray).getCode();

 
    casFeat_unigramArray = jcas.getRequiredFeatureDE(casType, "unigramArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_unigramArray  = (null == casFeat_unigramArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unigramArray).getCode();

 
    casFeat_bigramArray = jcas.getRequiredFeatureDE(casType, "bigramArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_bigramArray  = (null == casFeat_bigramArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bigramArray).getCode();

 
    casFeat_trigramArray = jcas.getRequiredFeatureDE(casType, "trigramArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_trigramArray  = (null == casFeat_trigramArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_trigramArray).getCode();

  }
}



    