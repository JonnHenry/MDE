/**
 */
package webPage.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import webPage.Paragraph;
import webPage.WebPageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParagraphTest extends TestCase {

	/**
	 * The fixture for this Paragraph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Paragraph fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParagraphTest.class);
	}

	/**
	 * Constructs a new Paragraph test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Paragraph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Paragraph fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Paragraph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Paragraph getFixture() {
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
		setFixture(WebPageFactory.eINSTANCE.createParagraph());
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

} //ParagraphTest
