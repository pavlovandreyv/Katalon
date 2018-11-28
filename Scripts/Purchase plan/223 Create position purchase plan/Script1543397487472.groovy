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
import groovy.time.TimeCategory as TimeCategory
import java.lang.System as System

WebUI.callTestCase(findTestCase('BASE/Open menu'), [('MenuMain') : 'Планирование', ('MenuLeft') : 'Позиции плана закупок'
        , ('MenuHorizontal') : 'Черновики'], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Documents/document_PPZ/223/btn_newPPZ'), 0)

WebUI.click(findTestObject('Documents/document_PPZ/223/btn_newPPZ'))

WebUI.waitForElementPresent(findTestObject('Documents/document_PPZ/223/base info/input_organization'), 0)

use(TimeCategory, { 
        today = new Date()

        date2 = (today + 20.days)
    })

Date11 = today.format('dd.MM.yyyy')

Date22 = date2.format('dd.MM.yyyy')

WebUI.setText(findTestObject('Documents/document_PPZ/223/base info/input_datePublication'), Date11.toString())

WebUI.setText(findTestObject('Documents/document_PPZ/223/base info/input_dateExecution'), Date22.toString())

WebUI.click(findTestObject('Documents/document_PPZ/223/base info/btn_typePurchase'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Documents/document_PPZ/223/tab_subjectPurchase'))

WebUI.waitForElementPresent(findTestObject('Documents/document_PPZ/223/subject purchase/input_subjectContract'), 0)

WebUI.setText(findTestObject('Documents/document_PPZ/223/subject purchase/input_subjectContract'), 'Поставка сельскохозяйственной продукции')

WebUI.setText(findTestObject('Documents/document_PPZ/223/subject purchase/input_NMCK'), '10000')

WebUI.setText(findTestObject('Documents/document_PPZ/223/subject purchase/grid_position/input_namePosition'), 'Пшеница')

WebUI.click(findTestObject('Documents/document_PPZ/223/subject purchase/grid_position/btn_OKPD2'))

WebUI.waitForElementPresent(findTestObject('BASE/Dictionary_check/input_find'), 0)

WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), '01.11.11.111')

WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Documents/document_PPZ/223/subject purchase/grid_position/btn_OKVED2'))

WebUI.waitForElementPresent(findTestObject('BASE/Dictionary_check/input_find'), 0)

WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), '01.11.11')

WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Documents/document_PPZ/223/tab_deliveryConditions'))

WebUI.waitForElementPresent(findTestObject('Documents/document_PPZ/223/delivery conditions/btn_OKATO'), 0)

WebUI.click(findTestObject('Documents/document_PPZ/223/delivery conditions/btn_OKATO'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BASE/btn_save'))

WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

