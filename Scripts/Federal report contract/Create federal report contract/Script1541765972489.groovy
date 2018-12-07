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
import java.lang.System as System
import groovy.time.TimeCategory as TimeCategory

WebUI.waitForElementPresent(findTestObject('BASE/Button/btn_federalReportContract'), 0)

WebUI.click(findTestObject('BASE/Button/btn_federalReportContract'))

WebUI.waitForElementPresent(findTestObject('Documents/document_federalReportContract/btn_chief'), 0)

WebUI.click(findTestObject('Documents/document_federalReportContract/btn_chief'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Documents/document_federalReportContract/tab_execution'))

'Определение дат для заполнения вкладки Исполнение'
use(TimeCategory, { 
        today = new Date()

        datereal = (today + 20.days)
    })

'Смена формата даты Планируемый срок размещения'
DateReal = datereal.format('dd.MM.yyyy')

WebUI.waitForElementPresent(findTestObject('Documents/document_federalReportContract/date_execution'), 0)

'Заполнение Планируемый срок размещения'
WebUI.setText(findTestObject('Documents/document_federalReportContract/date_execution'), DateReal.toString())

WebUI.setText(findTestObject('Documents/document_federalReportContract/input_documentPayment'), 'Платежный документ №123000')

WebUI.setText(findTestObject('Documents/document_federalReportContract/input_documentExecution'), 'Акт о приеме от  01.01.2019')

WebUI.click(findTestObject('BASE/btn_save'))

WebUI.waitForElementPresent(findTestObject('BASE/Button/btn_showContract'), 0)

WebUI.closeBrowser()

