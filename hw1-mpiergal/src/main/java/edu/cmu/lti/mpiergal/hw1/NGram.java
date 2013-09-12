

/* First created by JCasGen Wed Sep 11 21:55:18 EDT 2013 */
package edu.cmu.lti.mpiergal.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** An NGram of length to be specified.
 * Updated by JCasGen Wed Sep 11 21:55:18 EDT 2013
 * XML source: C:/Users/Mario/Git/hw1-mpiergal/hw1-mpiergal/src/main/resources/hw1-mpiergal-typesystem.xml
 * @generated */
public class NGram extends BaseType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tokenArray

  /** getter for tokenArray - gets An array containing the tokens which comprise the n-gram
   * @generated */
  public FSArray getTokenArray() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray)));}
    
  /** setter for tokenArray - sets An array containing the tokens which comprise the n-gram 
   * @generated */
  public void setTokenArray(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokenArray - gets an indexed value - An array containing the tokens which comprise the n-gram
   * @generated */
  public Token getTokenArray(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray), i)));}

  /** indexed setter for tokenArray - sets an indexed value - An array containing the tokens which comprise the n-gram
   * @generated */
  public void setTokenArray(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_tokenArray), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: nGramLength

  /** getter for nGramLength - gets How many tokens the n-gram contains
   * @generated */
  public int getNGramLength() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_nGramLength == null)
      jcasType.jcas.throwFeatMissing("nGramLength", "edu.cmu.lti.mpiergal.hw1.NGram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGram_Type)jcasType).casFeatCode_nGramLength);}
    
  /** setter for nGramLength - sets How many tokens the n-gram contains 
   * @generated */
  public void setNGramLength(int v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_nGramLength == null)
      jcasType.jcas.throwFeatMissing("nGramLength", "edu.cmu.lti.mpiergal.hw1.NGram");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGram_Type)jcasType).casFeatCode_nGramLength, v);}    
  }

    