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

WebUI.navigateToUrl('https://www-dev.floorplans.com/')

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp/a_Search'))

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp/a plan'))

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp/get ctb rpt'))

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp/build zip'), '94104')

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/build quality'), 'ABOVE_AVERAGE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/foundation'), 'DAYLIGHT_BASEMENT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/budget'), 'UP_TO_1M', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/start date'), 'NEED_TO_SELL_HOUSE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/lot'), 'MULTIPLE_LOTS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/build state'), 'CA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/pro builder'), 'false', true)

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp/button_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp/billing zip'), '94104')

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp/button_PROCEED TO CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp/input_Billing Address_email'), 'hhy@hanleywood.com')

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp/billing first name'), 'henry')

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp/billing last name'), 'hy')

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp/billing address'), 'westfield')

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp/billing city'), 'san francisco')

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/billing state'), 'CA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/billing country'), 'US', true)

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp/billing phone'), '4152228888')

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp/credit card number'), '4111 1111 1111 1111')

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/cc month'), '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp/cc year'), '2026', true)

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp/cc code'), '123')

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp/button_Place Secure Order'))

WebUI.closeBrowser()

