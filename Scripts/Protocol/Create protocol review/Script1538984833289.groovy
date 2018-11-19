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

'Ожидание'
WebUI.waitForElementPresent(findTestObject('BASE/Toolbar_horizon/btn_createProtocol'), 0)

'Нажать Создать протокол'
WebUI.click(findTestObject('BASE/Toolbar_horizon/btn_createProtocol'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('Documents/document_protocol/tab_infoCommission'), 0)

'Нажать Сохранить документ'
WebUI.click(findTestObject('BASE/btn_save'))

'Ожидание сохранения документа'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

'Закрыть браузер'
WebUI.closeBrowser()

