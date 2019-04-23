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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www-dev.floorplans.com/')

WebUI.click(findTestObject('Object Repository/pdf_purchase_fp/a_Search'))

WebUI.click(findTestObject('Object Repository/pdf_purchase_fp/first plan'))

WebUI.click(findTestObject('Object Repository/pdf_purchase_fp/button_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/pdf_purchase_fp/Billing Postal Code'), '94080')

WebUI.click(findTestObject('Object Repository/pdf_purchase_fp/button_PROCEED TO CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/pdf_purchase_fp/input_Billing Address_email'), 'hhy@hanleywood.com')

WebUI.setText(findTestObject('Object Repository/pdf_purchase_fp/input_billingfirstName'), 'henry')

WebUI.setText(findTestObject('Object Repository/pdf_purchase_fp/input_billinglastName'), 'hy')

WebUI.setText(findTestObject('Object Repository/pdf_purchase_fp/input_billingaddress1'), 'westfield center')

WebUI.setText(findTestObject('Object Repository/pdf_purchase_fp/input_billingcity'), 'san francisco')

WebUI.selectOptionByValue(findTestObject('Object Repository/pdf_purchase_fp/select_State'), 'CA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/pdf_purchase_fp/select_Country'), 'US', true)

WebUI.setText(findTestObject('Object Repository/pdf_purchase_fp/input_billingphone'), '4152228888')

WebUI.executeJavaScript('document.querySelector(\'.js-creditcard-number\').value = \'4111111111111111\'', [])

WebUI.selectOptionByValue(findTestObject('Object Repository/pdf_purchase_fp/select_Exp Month'), '05', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/pdf_purchase_fp/select_Exp Year'), '2022', true)

WebUI.setText(findTestObject('Object Repository/pdf_purchase_fp/input_creditCardverificationCode'), '123')

WebUI.click(findTestObject('Object Repository/pdf_purchase_fp/button_Place Secure Order'))

WebUI.click(findTestObject('Object Repository/pdf_purchase_fp/ORDER CONFIRMED number'))

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/pdf_purchase_fp/ORDER CONFIRMED number')), '(?i)^(order)\\s#[0-9]+\\s(confirmed)$', true)

WebUI.closeBrowser()

