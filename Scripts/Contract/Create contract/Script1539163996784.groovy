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

WebUI.waitForElementPresent(findTestObject('BASE/Button/btn_createContract'), 0)

WebUI.click(findTestObject('BASE/Button/btn_createContract'))

WebUI.waitForElementPresent(findTestObject('Documents/document_contract/input_numberContract'), 0)

WebUI.setText(findTestObject('Documents/document_contract/input_numberContract'), '1212600384618000003')

'Определение дат'
use(TimeCategory, { 
        today = new Date()

        Date2 = (today + 30.days)

        Date3 = (today + 90.days)
    })

'Дата заключения контракта'
Date1 = today.format('dd.MM.yyyy')

'Дата начала исполнения контракта'
Date2 = Date2.format('dd.MM.yyyy')

'Дата окончания исполнения контракта'
Date3 = Date3.format('dd.MM.yyyy')

WebUI.setText(findTestObject('Documents/document_contract/input_dateContract'), Date1.toString())

WebUI.setText(findTestObject('Documents/document_contract/input_dateContractStart'), Date2.toString())

WebUI.setText(findTestObject('Documents/document_contract/input_dateContractEnd'), Date3.toString())

WebUI.click(findTestObject('Documents/document_contract/btn_methodPrice'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Documents/document_contract/tab_financing'))

WebUI.waitForElementPresent(findTestObject('Documents/document_contract/btn_addStage'), 0)

WebUI.click(findTestObject('Documents/document_contract/btn_addStage'))

WebUI.waitForElementPresent(findTestObject('Documents/document_contract/input_dateStage'), 0)

WebUI.setText(findTestObject('Documents/document_contract/input_dateStage'), Date3.toString())

WebUI.waitForElementPresent(findTestObject('Documents/document_contract/btn_addSum'), 0)

WebUI.click(findTestObject('Documents/document_contract/btn_addSum'))

WebUI.waitForElementPresent(findTestObject('Documents/document_contract/btn_KBK'), 0)

WebUI.click(findTestObject('Documents/document_contract/btn_KBK'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Documents/document_contract/input_amount'), AmountPPG)

WebUI.click(findTestObject('Documents/document_contract/btn_nameBudget'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Documents/document_contract/btn_OKTMO'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BASE/btn_save'))

WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

