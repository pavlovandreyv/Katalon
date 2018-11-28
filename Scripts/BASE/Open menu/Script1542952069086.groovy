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

object_menuMain = WebUI.modifyObjectProperty(findTestObject('Menu/menu_main'), 'text', 'contains', MenuMain, true)

object_menuLeft = WebUI.modifyObjectProperty(findTestObject('Menu/menu_left'), 'text', 'contains', MenuLeft, true)

object_menuHorizontal = WebUI.modifyObjectProperty(findTestObject('Menu/menu_horizontal'), 'text', 'contains', MenuHorizontal, 
    true)

WebUI.waitForElementPresent(object_menuMain, 0)

WebUI.click(object_menuMain)

WebUI.waitForElementPresent(object_menuLeft, 0)

WebUI.click(object_menuLeft)

WebUI.waitForElementPresent(object_menuHorizontal, 0)

WebUI.click(object_menuHorizontal)

WebUI.waitForElementPresent(findTestObject('BASE/grid'), 0)

