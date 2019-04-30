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
import java.lang.String as String

for (int row = 1; row <= findTestData('Data Files/checkout_billing_info').getRowNumbers(); row++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(GlobalVariable.storeUrl)

    WebUI.navigateToUrl(GlobalVariable.storeUrl + '/search')

    WebUI.click(findTestObject('Object Repository/pdf_checkout_fp_tc/Page_Search/first_plan'))

    WebUI.click(findTestObject('Object Repository/pdf_checkout_fp_tc/pdp/button_Add to Cart'))

    WebUI.setText(findTestObject('Object Repository/pdf_checkout_fp_tc/Page_Cart/input_postalCode'), findTestData('checkout_billing_info').getValue(
            'postal_code', row))

    WebUI.click(findTestObject('pdf_checkout_fp_tc/Page_Cart/button_CHECKOUT'))

    WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_Billing Address_email'), findTestData('checkout_billing_info').getValue(
            'email', row))

    WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_billingfirstName'), findTestData('checkout_billing_info').getValue(
            'first_name', row))

    WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_billinglastName'), findTestData('checkout_billing_info').getValue(
            'last_name', row))

    WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_billingaddress'), findTestData('checkout_billing_info').getValue(
            'billing_address1', row))

    WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_billingcity'), findTestData('checkout_billing_info').getValue(
            'billing_city', row))

    WebUI.selectOptionByValue(findTestObject('pdf_checkout_fp_tc/Page_Checkout/select_Country'), 'US', true)

    WebUI.setText(findTestObject('pdf_checkout_fp_tc/Page_Checkout/input_billingphone'), findTestData('checkout_billing_info').getValue(
            'billing_phone_number', row))

    WebUI.closeBrowser()
}

