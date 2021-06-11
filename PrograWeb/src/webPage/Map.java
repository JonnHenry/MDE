/**
 */
package webPage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webPage.Map#getLat <em>Lat</em>}</li>
 *   <li>{@link webPage.Map#getLong <em>Long</em>}</li>
 *   <li>{@link webPage.Map#getWebpage <em>Webpage</em>}</li>
 * </ul>
 *
 * @see webPage.WebPagePackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(float)
	 * @see webPage.WebPagePackage#getMap_Lat()
	 * @model
	 * @generated
	 */
	float getLat();

	/**
	 * Sets the value of the '{@link webPage.Map#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(float value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(float)
	 * @see webPage.WebPagePackage#getMap_Long()
	 * @model
	 * @generated
	 */
	float getLong();

	/**
	 * Sets the value of the '{@link webPage.Map#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(float value);

	/**
	 * Returns the value of the '<em><b>Webpage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link webPage.WebPage#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webpage</em>' container reference.
	 * @see #setWebpage(WebPage)
	 * @see webPage.WebPagePackage#getMap_Webpage()
	 * @see webPage.WebPage#getMap
	 * @model opposite="map" required="true" transient="false"
	 * @generated
	 */
	WebPage getWebpage();

	/**
	 * Sets the value of the '{@link webPage.Map#getWebpage <em>Webpage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webpage</em>' container reference.
	 * @see #getWebpage()
	 * @generated
	 */
	void setWebpage(WebPage value);

} // Map
