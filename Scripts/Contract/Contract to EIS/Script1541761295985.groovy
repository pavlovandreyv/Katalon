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

'Авторизоваться'
WebUI.callTestCase(findTestCase('BASE/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Открыть извещение'
WebUI.callTestCase(findTestCase('BASE/Open/Open contract'), [:], FailureHandling.STOP_ON_FAILURE)

'Отправить в ЕИС'
WebUI.callTestCase(findTestCase('BASE/EIS/Send to EIS'), [:], FailureHandling.STOP_ON_FAILURE)

'Переключить статусы эмуляции загрузки с ЕИС'
WebUI.callTestCase(findTestCase('BASE/EIS/Update from EIS'), [:], FailureHandling.STOP_ON_FAILURE)

'Закрыть браузер'
WebUI.closeBrowser()

