/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Rolle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rolle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RolleImpl#getSubstantiv <em>Substantiv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolleImpl extends MinimalEObjectImpl.Container implements Rolle
{
  /**
   * The default value of the '{@link #getSubstantiv() <em>Substantiv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstantiv()
   * @generated
   * @ordered
   */
  protected static final String SUBSTANTIV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubstantiv() <em>Substantiv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstantiv()
   * @generated
   * @ordered
   */
  protected String substantiv = SUBSTANTIV_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RolleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.ROLLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSubstantiv()
  {
    return substantiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSubstantiv(String newSubstantiv)
  {
    String oldSubstantiv = substantiv;
    substantiv = newSubstantiv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ROLLE__SUBSTANTIV, oldSubstantiv, substantiv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.ROLLE__SUBSTANTIV:
        return getSubstantiv();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ROLLE__SUBSTANTIV:
        setSubstantiv((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ROLLE__SUBSTANTIV:
        setSubstantiv(SUBSTANTIV_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.ROLLE__SUBSTANTIV:
        return SUBSTANTIV_EDEFAULT == null ? substantiv != null : !SUBSTANTIV_EDEFAULT.equals(substantiv);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (substantiv: ");
    result.append(substantiv);
    result.append(')');
    return result.toString();
  }

} //RolleImpl
