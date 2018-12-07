import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import groovy.time.TimeCategory as TimeCategory

WebUI.waitForElementPresent(findTestObject('BASE/Button/btn_addExecutionContract'), 0)

'Нажать на кнопку "Создать исполнение контракта"'
WebUI.click(findTestObject('BASE/Button/btn_addExecutionContract'))

WebUI.waitForElementPresent(findTestObject('Documents/document_contractExecution/btn_typeDoc'), 0)

WebUI.click(findTestObject('Documents/document_contractExecution/btn_typeDoc'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Documents/document_contractExecution/input_numberExe'), '1234567890')

WebUI.click(findTestObject('Documents/document_contractExecution/btn_stageContract'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BASE/Tab/tab_executionContract'))

WebUI.waitForElementPresent(findTestObject('Documents/document_contractExecution/btn_addDoc'), 0)

WebUI.click(findTestObject('Documents/document_contractExecution/btn_addDoc'))

WebUI.check(findTestObject('Documents/document_contractExecution/input_radio'))

WebUI.click(findTestObject('Documents/document_contractExecution/btn_codDoc'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Documents/document_contractExecution/input_nameDoc'), 'Платежный документ №123000')

'Определение дат для заполнения вкладки Исполнение'
use(TimeCategory, { 
        today = new Date()

        date1 = (today + 10.days)
    })

'Смена формата даты Планируемый срок размещения'
DateDoc = date1.format('dd.MM.yyyy')

WebUI.setText(findTestObject('Documents/document_contractExecution/input_dateDoc'), DateDoc.toString())

WebUI.setText(findTestObject('Documents/document_contractExecution/input_numberDoc'), '1234567890')

WebUI.click(findTestObject('Documents/document_contractExecution/btn_addItem'))

WebUI.waitForElementPresent(findTestObject('Documents/document_contractExecution/btn_nameItem'), 0)

WebUI.click(findTestObject('Documents/document_contractExecution/btn_nameItem'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Documents/document_contractExecution/input_numberItem'), '1')

WebUI.setText(findTestObject('Documents/document_contractExecution/input_price'), '10000')

WebUI.click(findTestObject('BASE/btn_save'))

WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

WebUI.closeBrowser()

