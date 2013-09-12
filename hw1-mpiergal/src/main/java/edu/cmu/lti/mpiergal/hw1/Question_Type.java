
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

/** The question to be answered
 * Updated by JCasGen Wed Sep 11 21:55:18 EDT 2013
 * @generated */
public class Question_Type extends Sentence_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Question_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Question_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Question(addr, Question_Type.this);
  			   Question_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Question(addr, Question_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.mpiergal.hw1.Question");
 
  /** @generated */
  final Feature casFeat_answerArray;
  /** @generated */
  final int     casFeatCode_answerArray;
  /** @generated */ 
  public int getAnswerArray(int addr) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "edu.cmu.lti.mpiergal.hw1.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerArray);
  }
  /** @generated */    
  public void setAnswerArray(int addr, int v) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "edu.cmu.lti.mpiergal.hw1.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerArray, v);}
    
   /** @generated */
  public int getAnswerArray(int addr, int i) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "edu.cmu.lti.mpiergal.hw1.Question");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i);
  }
   
  /** @generated */ 
  public void setAnswerArray(int addr, int i, int v) {
        if (featOkTst && casFeat_answerArray == null)
      jcas.throwFeatMissing("answerArray", "edu.cmu.lti.mpiergal.hw1.Question");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answerArray), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_evaluation;
  /** @generated */
  final int     casFeatCode_evaluation;
  /** @generated */ 
  public int getEvaluation(int addr) {
        if (featOkTst && casFeat_evaluation == null)
      jcas.throwFeatMissing("evaluation", "edu.cmu.lti.mpiergal.hw1.Question");
    return ll_cas.ll_getRefValue(addr, casFeatCode_evaluation);
  }
  /** @generated */    
  public void setEvaluation(int addr, int v) {
        if (featOkTst && casFeat_evaluation == null)
      jcas.throwFeatMissing("evaluation", "edu.cmu.lti.mpiergal.hw1.Question");
    ll_cas.ll_setRefValue(addr, casFeatCode_evaluation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Question_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerArray = jcas.getRequiredFeatureDE(casType, "answerArray", "uima.cas.FSArray", featOkTst);
    casFeatCode_answerArray  = (null == casFeat_answerArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerArray).getCode();

 
    casFeat_evaluation = jcas.getRequiredFeatureDE(casType, "evaluation", "edu.cmu.lti.mpiergal.hw1.Evaluation", featOkTst);
    casFeatCode_evaluation  = (null == casFeat_evaluation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_evaluation).getCode();

  }
}



    