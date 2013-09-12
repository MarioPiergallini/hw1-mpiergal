

/* First created by JCasGen Wed Sep 11 21:55:18 EDT 2013 */
package edu.cmu.lti.mpiergal.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** The question to be answered
 * Updated by JCasGen Wed Sep 11 21:55:18 EDT 2013
 * XML source: C:/Users/Mario/Git/hw1-mpiergal/hw1-mpiergal/src/main/resources/hw1-mpiergal-typesystem.xml
 * @generated */
public class Question extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: answerArray

  /** getter for answerArray - gets The array of potential answers associated with this question.
   * @generated */
  public FSArray getAnswerArray() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "edu.cmu.lti.mpiergal.hw1.Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerArray)));}
    
  /** setter for answerArray - sets The array of potential answers associated with this question. 
   * @generated */
  public void setAnswerArray(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "edu.cmu.lti.mpiergal.hw1.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answerArray - gets an indexed value - The array of potential answers associated with this question.
   * @generated */
  public Answer getAnswerArray(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "edu.cmu.lti.mpiergal.hw1.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerArray), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerArray), i)));}

  /** indexed setter for answerArray - sets an indexed value - The array of potential answers associated with this question.
   * @generated */
  public void setAnswerArray(int i, Answer v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answerArray == null)
      jcasType.jcas.throwFeatMissing("answerArray", "edu.cmu.lti.mpiergal.hw1.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answerArray), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: evaluation

  /** getter for evaluation - gets The evaluation of the system's precision on this question
   * @generated */
  public Evaluation getEvaluation() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_evaluation == null)
      jcasType.jcas.throwFeatMissing("evaluation", "edu.cmu.lti.mpiergal.hw1.Question");
    return (Evaluation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_evaluation)));}
    
  /** setter for evaluation - sets The evaluation of the system's precision on this question 
   * @generated */
  public void setEvaluation(Evaluation v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_evaluation == null)
      jcasType.jcas.throwFeatMissing("evaluation", "edu.cmu.lti.mpiergal.hw1.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_evaluation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    