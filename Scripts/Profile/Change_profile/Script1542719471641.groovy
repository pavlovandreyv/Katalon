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

WebUI.waitForElementPresent(findTestObject('Pages/page_profile/btn_profile'), 0)

WebUI.click(findTestObject('Pages/page_profile/btn_profile'))

WebUI.waitForElementPresent(findTestObject('Pages/page_profile/a_editProfile'), 0)

WebUI.click(findTestObject('Pages/page_profile/a_editProfile'))

WebUI.waitForElementPresent(findTestObject('Pages/page_profile/input_LastName'), 0)

WebUI.setText(findTestObject('Pages/page_profile/input_LastName'), LastName)

WebUI.setText(findTestObject('Pages/page_profile/input_FirstName'), FirstName)

WebUI.setText(findTestObject('Pages/page_profile/input_MiddleName'), MiddleName)

WebUI.setText(findTestObject('Pages/page_profile/input_Phone'), Phone)

WebUI.setText(findTestObject('Pages/page_profile/input_Email'), Email)

WebUI.click(findTestObject('Pages/page_profile/btn_save'))

WebUI.waitForElementPresent(findTestObject('BASE/Alert/msg_pass'), 0)

WebUI.click(findTestObject('Pages/page_home/img_E1'))

WebUI.waitForElementPresent(findTestObject('Pages/page_profile/btn_profile'), 0)

WebUI.click(findTestObject('Pages/page_profile/btn_profile'))

WebUI.waitForElementPresent(findTestObject('Pages/page_profile/a_editProfile'), 0)

WebUI.click(findTestObject('Pages/page_profile/a_editProfile'))

WebUI.verifyElementAttributeValue(findTestObject('Pages/page_profile/input_LastName'), 'value', LastName, 0)

WebUI.verifyElementAttributeValue(findTestObject('Pages/page_profile/input_FirstName'), 'value', FirstName, 0)

WebUI.verifyElementAttributeValue(findTestObject('Pages/page_profile/input_MiddleName'), 'value', MiddleName, 0)

WebUI.verifyElementAttributeValue(findTestObject('Pages/page_profile/input_Phone'), 'value', Phone, 0)

WebUI.verifyElementAttributeValue(findTestObject('Pages/page_profile/input_Email'), 'value', Email, 0)

WebUI.closeBrowser()

