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

WebUI.click(findTestObject('Object Repository/choosing_plan_set/button_Search Home Plans'))

WebUI.click(findTestObject('Object Repository/choosing_plan_set/img_Starting at _d-inline-block img-fluid p-2 hw-size-small'))

WebUI.selectOptionByLabel(findTestObject('choosing_plan_set/select_Plan_set'), '\\s*(PDF).+(Set).+', true)

WebUI.click(findTestObject('Object Repository/choosing_plan_set/button_Add to Cart'))

WebUI.delay(2)

def actualString = WebUI.getText(findTestObject('choosing_plan_set/div_Plan SetPDF Set'))

WebUI.verifyMatch(actualString, '.*(PDF\\sSet).*', true)

println('****actualString:' + actualString)

WebUI.closeBrowser()

