

/* First created by JCasGen Wed Sep 11 21:55:18 EDT 2013 */
package edu.cmu.lti.mpiergal.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** A sentence
 * Updated by JCasGen Wed Sep 11 21:55:18 EDT 2013
 * XML source: C:/Users/Mario/Git/hw1-mpiergal/hw1-mpiergal/src/main/resources/hw1-mpiergal-typesystem.xml
 * @generated */
public class Sentence extends BaseType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
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

  /** getter for tokenArray - gets The array of tokens which comprise the sentence.
   * @generated */
  public FSArray getTokenArray() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray)));}
    
  /** setter for tokenArray - sets The array of tokens which comprise the sentence. 
   * @generated */
  public void setTokenArray(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokenArray - gets an indexed value - The array of tokens which comprise the sentence.
   * @generated */
  public Token getTokenArray(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray), i)));}

  /** indexed setter for tokenArray - sets an indexed value - The array of tokens which comprise the sentence.
   * @generated */
  public void setTokenArray(int i, Token v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokenArray == null)
      jcasType.jcas.throwFeatMissing("tokenArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokenArray), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: unigramArray

  /** getter for unigramArray - gets The array of the unigrams in the sentence.
   * @generated */
  public FSArray getUnigramArray() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_unigramArray == null)
      jcasType.jcas.throwFeatMissing("unigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_unigramArray)));}
    
  /** setter for unigramArray - sets The array of the unigrams in the sentence. 
   * @generated */
  public void setUnigramArray(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_unigramArray == null)
      jcasType.jcas.throwFeatMissing("unigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_unigramArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for unigramArray - gets an indexed value - The array of the unigrams in the sentence.
   * @generated */
  public NGram getUnigramArray(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_unigramArray == null)
      jcasType.jcas.throwFeatMissing("unigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_unigramArray), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_unigramArray), i)));}

  /** indexed setter for unigramArray - sets an indexed value - The array of the unigrams in the sentence.
   * @generated */
  public void setUnigramArray(int i, NGram v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_unigramArray == null)
      jcasType.jcas.throwFeatMissing("unigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_unigramArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_unigramArray), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: bigramArray

  /** getter for bigramArray - gets An array of the bigrams contained in the sentence.
   * @generated */
  public FSArray getBigramArray() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_bigramArray == null)
      jcasType.jcas.throwFeatMissing("bigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_bigramArray)));}
    
  /** setter for bigramArray - sets An array of the bigrams contained in the sentence. 
   * @generated */
  public void setBigramArray(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_bigramArray == null)
      jcasType.jcas.throwFeatMissing("bigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_bigramArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for bigramArray - gets an indexed value - An array of the bigrams contained in the sentence.
   * @generated */
  public NGram getBigramArray(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_bigramArray == null)
      jcasType.jcas.throwFeatMissing("bigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_bigramArray), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_bigramArray), i)));}

  /** indexed setter for bigramArray - sets an indexed value - An array of the bigrams contained in the sentence.
   * @generated */
  public void setBigramArray(int i, NGram v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_bigramArray == null)
      jcasType.jcas.throwFeatMissing("bigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_bigramArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_bigramArray), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: trigramArray

  /** getter for trigramArray - gets An array of the trigrams contained in the sentence.
   * @generated */
  public FSArray getTrigramArray() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_trigramArray == null)
      jcasType.jcas.throwFeatMissing("trigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_trigramArray)));}
    
  /** setter for trigramArray - sets An array of the trigrams contained in the sentence. 
   * @generated */
  public void setTrigramArray(FSArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_trigramArray == null)
      jcasType.jcas.throwFeatMissing("trigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_trigramArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for trigramArray - gets an indexed value - An array of the trigrams contained in the sentence.
   * @generated */
  public NGram getTrigramArray(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_trigramArray == null)
      jcasType.jcas.throwFeatMissing("trigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_trigramArray), i);
    return (NGram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_trigramArray), i)));}

  /** indexed setter for trigramArray - sets an indexed value - An array of the trigrams contained in the sentence.
   * @generated */
  public void setTrigramArray(int i, NGram v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_trigramArray == null)
      jcasType.jcas.throwFeatMissing("trigramArray", "edu.cmu.lti.mpiergal.hw1.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_trigramArray), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_trigramArray), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    