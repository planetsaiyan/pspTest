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

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp_assert/search plans'))

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp_assert/first plan'))

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp_assert/get ctb rpt'))

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp_assert/build zip'), '94080')

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/quality'), 'STANDARD', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/foundation'), 'SLAB', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/budget'), 'OVER_1M', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/start'), 'THREE_TO_SIX_MONTHS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/lot'), 'YES', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/build state'), 'CA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/pro builder'), 'false', true)

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp_assert/button_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp_assert/billing zip'), '94104')

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp_assert/button_PROCEED TO CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp_assert/input_Billing Address_email'), 'hhy@hanleywood.com')

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp_assert/billing first'), 'henry')

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp_assert/billing last'), 'hy')

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp_assert/billing address'), 'westfield center')

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp_assert/billing city'), 'san francisco')

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/billing state'), 'CA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/billing country'), 'US', true)

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp_assert/billing phone'), '4152228888')

WebUI.executeJavaScript('document.querySelector(".js-creditcard-number").value ="4111111111111111"', [])

not_run: WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp_assert/credit card number'), '4111 1111 1111 1111')

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/cc exp month'), '04', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ctb_purchase_fp_assert/cc exp year'), '2020', true)

WebUI.setText(findTestObject('Object Repository/ctb_purchase_fp_assert/cc code'), '123')

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp_assert/button_Place Secure Order'))

WebUI.click(findTestObject('Object Repository/ctb_purchase_fp_assert/order confirmation msg'))

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/ctb_purchase_fp_assert/order confirmation msg')), '(?i)(order)\\s#[0-9]+\\s(confirmed)', true)

WebUI.closeBrowser()

