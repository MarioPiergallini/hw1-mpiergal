

/* First created by JCasGen Tue Sep 10 22:23:04 EDT 2013 */
package edu.cmu.lti.mpiergal.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 22:23:04 EDT 2013
 * XML source: D:/Documents/Workspace/hw1-mpiergal/src/main/resources/hw1-mpiergal-typesystem.xml
 * @generated */
public class BaseType extends Annotation {
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

  /** @generated */  
  public BaseType(JCas jcas, int begin, int end) {
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
     
}

    