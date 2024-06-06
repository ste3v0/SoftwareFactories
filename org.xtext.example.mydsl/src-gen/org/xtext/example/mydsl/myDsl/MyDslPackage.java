/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>User story</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__USER_STORY = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.User_StoryImpl <em>User Story</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.User_StoryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUser_Story()
   * @generated
   */
  int USER_STORY = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_STORY__TITLE = 0;

  /**
   * The feature id for the '<em><b>Nutzen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_STORY__NUTZEN = 1;

  /**
   * The feature id for the '<em><b>Rolle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_STORY__ROLLE = 2;

  /**
   * The feature id for the '<em><b>Ziel wunsch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_STORY__ZIEL_WUNSCH = 3;

  /**
   * The number of structural features of the '<em>User Story</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_STORY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TitleImpl <em>Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TitleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTitle()
   * @generated
   */
  int TITLE = 2;

  /**
   * The feature id for the '<em><b>Substantiv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__SUBSTANTIV = 0;

  /**
   * The feature id for the '<em><b>Infinitiv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__INFINITIV = 1;

  /**
   * The number of structural features of the '<em>Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NutzenImpl <em>Nutzen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NutzenImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNutzen()
   * @generated
   */
  int NUTZEN = 3;

  /**
   * The feature id for the '<em><b>Subject</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUTZEN__SUBJECT = 0;

  /**
   * The feature id for the '<em><b>Verb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUTZEN__VERB = 1;

  /**
   * The number of structural features of the '<em>Nutzen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUTZEN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RolleImpl <em>Rolle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RolleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRolle()
   * @generated
   */
  int ROLLE = 4;

  /**
   * The feature id for the '<em><b>Substantiv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLE__SUBSTANTIV = 0;

  /**
   * The number of structural features of the '<em>Rolle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Ziel_WunschImpl <em>Ziel Wunsch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Ziel_WunschImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getZiel_Wunsch()
   * @generated
   */
  int ZIEL_WUNSCH = 5;

  /**
   * The feature id for the '<em><b>Subject</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIEL_WUNSCH__SUBJECT = 0;

  /**
   * The feature id for the '<em><b>Infinitiv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIEL_WUNSCH__INFINITIV = 1;

  /**
   * The number of structural features of the '<em>Ziel Wunsch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIEL_WUNSCH_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getUser_story <em>User story</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>User story</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getUser_story()
   * @see #getModel()
   * @generated
   */
  EReference getModel_User_story();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.User_Story <em>User Story</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Story</em>'.
   * @see org.xtext.example.mydsl.myDsl.User_Story
   * @generated
   */
  EClass getUser_Story();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.User_Story#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.xtext.example.mydsl.myDsl.User_Story#getTitle()
   * @see #getUser_Story()
   * @generated
   */
  EReference getUser_Story_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.User_Story#getNutzen <em>Nutzen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nutzen</em>'.
   * @see org.xtext.example.mydsl.myDsl.User_Story#getNutzen()
   * @see #getUser_Story()
   * @generated
   */
  EReference getUser_Story_Nutzen();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.User_Story#getRolle <em>Rolle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rolle</em>'.
   * @see org.xtext.example.mydsl.myDsl.User_Story#getRolle()
   * @see #getUser_Story()
   * @generated
   */
  EReference getUser_Story_Rolle();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.User_Story#getZiel_wunsch <em>Ziel wunsch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ziel wunsch</em>'.
   * @see org.xtext.example.mydsl.myDsl.User_Story#getZiel_wunsch()
   * @see #getUser_Story()
   * @generated
   */
  EReference getUser_Story_Ziel_wunsch();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Title</em>'.
   * @see org.xtext.example.mydsl.myDsl.Title
   * @generated
   */
  EClass getTitle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Title#getSubstantiv <em>Substantiv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Substantiv</em>'.
   * @see org.xtext.example.mydsl.myDsl.Title#getSubstantiv()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Substantiv();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Title#getInfinitiv <em>Infinitiv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Infinitiv</em>'.
   * @see org.xtext.example.mydsl.myDsl.Title#getInfinitiv()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Infinitiv();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Nutzen <em>Nutzen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nutzen</em>'.
   * @see org.xtext.example.mydsl.myDsl.Nutzen
   * @generated
   */
  EClass getNutzen();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Nutzen#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subject</em>'.
   * @see org.xtext.example.mydsl.myDsl.Nutzen#getSubject()
   * @see #getNutzen()
   * @generated
   */
  EAttribute getNutzen_Subject();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Nutzen#getVerb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verb</em>'.
   * @see org.xtext.example.mydsl.myDsl.Nutzen#getVerb()
   * @see #getNutzen()
   * @generated
   */
  EAttribute getNutzen_Verb();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Rolle <em>Rolle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rolle</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rolle
   * @generated
   */
  EClass getRolle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Rolle#getSubstantiv <em>Substantiv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Substantiv</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rolle#getSubstantiv()
   * @see #getRolle()
   * @generated
   */
  EAttribute getRolle_Substantiv();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Ziel_Wunsch <em>Ziel Wunsch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ziel Wunsch</em>'.
   * @see org.xtext.example.mydsl.myDsl.Ziel_Wunsch
   * @generated
   */
  EClass getZiel_Wunsch();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Ziel_Wunsch#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subject</em>'.
   * @see org.xtext.example.mydsl.myDsl.Ziel_Wunsch#getSubject()
   * @see #getZiel_Wunsch()
   * @generated
   */
  EAttribute getZiel_Wunsch_Subject();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Ziel_Wunsch#getInfinitiv <em>Infinitiv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Infinitiv</em>'.
   * @see org.xtext.example.mydsl.myDsl.Ziel_Wunsch#getInfinitiv()
   * @see #getZiel_Wunsch()
   * @generated
   */
  EAttribute getZiel_Wunsch_Infinitiv();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>User story</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__USER_STORY = eINSTANCE.getModel_User_story();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.User_StoryImpl <em>User Story</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.User_StoryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUser_Story()
     * @generated
     */
    EClass USER_STORY = eINSTANCE.getUser_Story();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_STORY__TITLE = eINSTANCE.getUser_Story_Title();

    /**
     * The meta object literal for the '<em><b>Nutzen</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_STORY__NUTZEN = eINSTANCE.getUser_Story_Nutzen();

    /**
     * The meta object literal for the '<em><b>Rolle</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_STORY__ROLLE = eINSTANCE.getUser_Story_Rolle();

    /**
     * The meta object literal for the '<em><b>Ziel wunsch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_STORY__ZIEL_WUNSCH = eINSTANCE.getUser_Story_Ziel_wunsch();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TitleImpl <em>Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TitleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTitle()
     * @generated
     */
    EClass TITLE = eINSTANCE.getTitle();

    /**
     * The meta object literal for the '<em><b>Substantiv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TITLE__SUBSTANTIV = eINSTANCE.getTitle_Substantiv();

    /**
     * The meta object literal for the '<em><b>Infinitiv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TITLE__INFINITIV = eINSTANCE.getTitle_Infinitiv();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NutzenImpl <em>Nutzen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NutzenImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNutzen()
     * @generated
     */
    EClass NUTZEN = eINSTANCE.getNutzen();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUTZEN__SUBJECT = eINSTANCE.getNutzen_Subject();

    /**
     * The meta object literal for the '<em><b>Verb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUTZEN__VERB = eINSTANCE.getNutzen_Verb();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RolleImpl <em>Rolle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RolleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRolle()
     * @generated
     */
    EClass ROLLE = eINSTANCE.getRolle();

    /**
     * The meta object literal for the '<em><b>Substantiv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLLE__SUBSTANTIV = eINSTANCE.getRolle_Substantiv();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Ziel_WunschImpl <em>Ziel Wunsch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Ziel_WunschImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getZiel_Wunsch()
     * @generated
     */
    EClass ZIEL_WUNSCH = eINSTANCE.getZiel_Wunsch();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ZIEL_WUNSCH__SUBJECT = eINSTANCE.getZiel_Wunsch_Subject();

    /**
     * The meta object literal for the '<em><b>Infinitiv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ZIEL_WUNSCH__INFINITIV = eINSTANCE.getZiel_Wunsch_Infinitiv();

  }

} //MyDslPackage
