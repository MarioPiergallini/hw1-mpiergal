

/* First created by JCasGen Wed Sep 11 21:55:18 EDT 2013 */
package edu.cmu.lti.mpiergal.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** A potential answer for a question
 * Updated by JCasGen Wed Sep 11 21:55:18 EDT 2013
 * XML source: C:/Users/Mario/Git/hw1-mpiergal/hw1-mpiergal/src/main/resources/hw1-mpiergal-typesystem.xml
 * @generated */
public class Answer extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: isCorrect

  /** getter for isCorrect - gets The gold standard of whether the answer is correct
   * @generated */
  public boolean getIsCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "edu.cmu.lti.mpiergal.hw1.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets The gold standard of whether the answer is correct 
   * @generated */
  public void setIsCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "edu.cmu.lti.mpiergal.hw1.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isCorrect, v);}    
   
    
  //*--------------*
  //* Feature: prediction

  /** getter for prediction - gets The score predicted for this answer.
   * @generated */
  public AnswerScore getPrediction() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_prediction == null)
      jcasType.jcas.throwFeatMissing("prediction", "edu.cmu.lti.mpiergal.hw1.Answer");
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_prediction)));}
    
  /** setter for prediction - sets The score predicted for this answer. 
   * @generated */
  public void setPrediction(AnswerScore v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_prediction == null)
      jcasType.jcas.throwFeatMissing("prediction", "edu.cmu.lti.mpiergal.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_prediction, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    