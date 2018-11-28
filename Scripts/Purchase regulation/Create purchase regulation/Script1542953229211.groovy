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

WebUI.callTestCase(findTestCase('BASE/Open menu'), [('MenuMain') : 'Планирование', ('MenuLeft') : 'Положение о закупках'
        , ('MenuHorizontal') : 'Проекты'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Documents/document_purchaseRegulation/btn_createRegulation'), 0)

WebUI.click(findTestObject('Documents/document_purchaseRegulation/btn_createRegulation'))

use(TimeCategory, { 
        today = new Date()

        date1 = (today + 7.days)
    })

'Дата вступления в силу'
DateStart = date1.format('dd.MM.yyyy')

WebUI.waitForElementPresent(findTestObject('Documents/document_purchaseRegulation/base info/input_dateStart'), 0)

WebUI.setText(findTestObject('Documents/document_purchaseRegulation/base info/input_dateStart'), DateStart.toString())

WebUI.click(findTestObject('Documents/document_purchaseRegulation/base info/btn_approval'))

WebUI.waitForElementPresent(findTestObject('BASE/Dictionary_check/input_find'), 0)

WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), Approval)

WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Documents/document_purchaseRegulation/base info/input_nameRegulation'), 'Положение №1 от 01.01.2019')

WebUI.setText(findTestObject('Documents/document_purchaseRegulation/base info/input_nameApprovalRegulation'), 'Совет директоров')

WebUI.click(findTestObject('Documents/document_purchaseRegulation/base info/table_purchase/btn_codPurchase'))

WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), 'Единственный поставщик')

WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

'to do: удалить после правок EZAKUP-623'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Documents/document_purchaseRegulation/base info/table_reason/btn_addReason'))

WebUI.callTestCase(findTestCase('Purchase regulation/Verify purchase regulation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BASE/btn_save'))

WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

WebUI.callTestCase(findTestCase('Purchase regulation/Verify view purchase regulation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

