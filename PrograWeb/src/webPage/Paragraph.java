/**
 */
package webPage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webPage.Paragraph#getText <em>Text</em>}</li>
 *   <li>{@link webPage.Paragraph#getWebpage <em>Webpage</em>}</li>
 * </ul>
 *
 * @see webPage.WebPagePackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see webPage.WebPagePackage#getParagraph_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link webPage.Paragraph#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Webpage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link webPage.WebPage#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpage</em>' container reference.
	 * @see #setWebpage(WebPage)
	 * @see webPage.WebPagePackage#getParagraph_Webpage()
	 * @see webPage.WebPage#getParagraph
	 * @model opposite="paragraph" required="true" transient="false"
	 * @generated
	 */
	WebPage getWebpage();

	/**
	 * Sets the value of the '{@link webPage.Paragraph#getWebpage <em>Webpage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webpage</em>' container reference.
	 * @see #getWebpage()
	 * @generated
	 */
	void setWebpage(WebPage value);

} // Paragraph
