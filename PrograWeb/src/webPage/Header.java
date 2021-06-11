/**
 */
package webPage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webPage.Header#getTitle <em>Title</em>}</li>
 *   <li>{@link webPage.Header#getLogo <em>Logo</em>}</li>
 *   <li>{@link webPage.Header#getWebpage <em>Webpage</em>}</li>
 * </ul>
 *
 * @see webPage.WebPagePackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see webPage.WebPagePackage#getHeader_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link webPage.Header#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo</em>' attribute.
	 * @see #setLogo(String)
	 * @see webPage.WebPagePackage#getHeader_Logo()
	 * @model
	 * @generated
	 */
	String getLogo();

	/**
	 * Sets the value of the '{@link webPage.Header#getLogo <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo</em>' attribute.
	 * @see #getLogo()
	 * @generated
	 */
	void setLogo(String value);

	/**
	 * Returns the value of the '<em><b>Webpage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link webPage.WebPage#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpage</em>' container reference.
	 * @see #setWebpage(WebPage)
	 * @see webPage.WebPagePackage#getHeader_Webpage()
	 * @see webPage.WebPage#getHeader
	 * @model opposite="header" required="true" transient="false"
	 * @generated
	 */
	WebPage getWebpage();

	/**
	 * Sets the value of the '{@link webPage.Header#getWebpage <em>Webpage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webpage</em>' container reference.
	 * @see #getWebpage()
	 * @generated
	 */
	void setWebpage(WebPage value);

} // Header
