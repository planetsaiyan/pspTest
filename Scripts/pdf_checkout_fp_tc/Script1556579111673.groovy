import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(searchUrl)

WebUI.click(findTestObject('Object Repository/pdf_checkout_fp_tc/Page_Search/first_plan'))

WebUI.click(findTestObject('Object Repository/pdf_checkout_fp_tc/pdp/button_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/pdf_checkout_fp_tc/Page_Cart/input_postalCode'), '94080')

WebUI.click(findTestObject('pdf_checkout_fp_tc/Page_Cart/button_CHECKOUT'))

WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_Billing Address_email'), 'hhy@hanleywood.com')

WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_billingfirstName'), firstName)

WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_billinglastName'), lastName)

WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_billingaddress'), billingAddress)

WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_billingcity'), 'San Francisco')

WebUI.selectOptionByValue(findTestObject('pdf_checkout_fp_tc/Page_Checkout/select_Country'), 'US', true)

WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_billingphone'), '4152228888')

WebUI.closeBrowser()

