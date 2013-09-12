

/* First created by JCasGen Tue Sep 10 22:23:04 EDT 2013 */
package edu.cmu.lti.mpiergal.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


import org.apache.uima.jcas.tcas.Annotation;


/** The basic type
 * Updated by JCasGen Wed Sep 11 21:55:17 EDT 2013
 * XML source: C:/Users/Mario/Git/hw1-mpiergal/hw1-mpiergal/src/main/resources/hw1-mpiergal-typesystem.xml
 * @generated */
public class BaseType extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseType.class);
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
  protected BaseType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: source

  /** getter for source - gets Which component created the object
   * @generated */
  public String getSource() {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.lti.mpiergal.hw1.BaseType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseType_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets Which component created the object 
   * @generated */
  public void setSource(String v) {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.lti.mpiergal.hw1.BaseType");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseType_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets How confident the system is in that annotation
   * @generated */
  public double getConfidence() {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.lti.mpiergal.hw1.BaseType");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((BaseType_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets How confident the system is in that annotation 
   * @generated */
  public void setConfidence(double v) {
    if (BaseType_Type.featOkTst && ((BaseType_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.lti.mpiergal.hw1.BaseType");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((BaseType_Type)jcasType).casFeatCode_confidence, v);}    
  }

    