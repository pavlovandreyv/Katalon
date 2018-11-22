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

WebUI.waitForElementPresent(findTestObject('Pages/page_profile/a_changePassword'), 0)

WebUI.click(findTestObject('Pages/page_profile/a_changePassword'))

WebUI.waitForElementPresent(findTestObject('Pages/page_profile/input_password'), 0)

WebUI.setText(findTestObject('Pages/page_profile/input_password'), Password)

WebUI.setText(findTestObject('Pages/page_profile/input_newPassword'), NewPassword)

WebUI.setText(findTestObject('Pages/page_profile/input_newPasswordConfirm'), NewPasswordConfirm)

WebUI.click(findTestObject('Pages/page_profile/btn_changePassword'))

WebUI.waitForElementPresent(findTestObject('BASE/Alert/msg_pass'), 0)

WebUI.closeBrowser()

