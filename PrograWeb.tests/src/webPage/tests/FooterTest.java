/**
 */
package webPage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webPage.Footer;
import webPage.WebPageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Footer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FooterTest extends TestCase {

	/**
	 * The fixture for this Footer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Footer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FooterTest.class);
	}

	/**
	 * Constructs a new Footer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Footer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Footer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Footer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Footer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebPageFactory.eINSTANCE.createFooter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FooterTest
