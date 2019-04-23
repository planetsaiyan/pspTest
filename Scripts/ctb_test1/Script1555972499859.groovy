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

WebUI.click(findTestObject('Object Repository/fp_ctb_test1/a_Search'))

WebUI.click(findTestObject('Object Repository/fp_ctb_test1/click a plan'))

WebUI.click(findTestObject('Object Repository/fp_ctb_test1/get ctb'))

WebUI.setText(findTestObject('Object Repository/fp_ctb_test1/input_(USCanada only)_postalCode'), '94080')

WebUI.selectOptionByValue(findTestObject('Object Repository/fp_ctb_test1/select_Economy'), 'ABOVE_AVERAGE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/fp_ctb_test1/budget'), 'OVER_1M', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/fp_ctb_test1/pstart'), 'SIX_TO_TWELVE_MONTHS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/fp_ctb_test1/lot'), 'MULTIPLE_LOTS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/fp_ctb_test1/build state'), 'CA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/fp_ctb_test1/builder'), 'false', true)

WebUI.click(findTestObject('Object Repository/fp_ctb_test1/button_Add to Cart'))

WebUI.closeBrowser()

WebUI.closeBrowser()

