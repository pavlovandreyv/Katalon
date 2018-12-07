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

WebUI.waitForElementAttributeValue(findTestObject('Documents/document_contract/223/tab_basicInfo'), 'class', 'active', 0)

WebUI.setText(findTestObject('Documents/document_contract/223/basic info/input_nuberContract'), '1234567890')

use(TimeCategory, { 
        today = new Date()

        date2 = (today + 3.days)
    })

Date11 = today.format('dd.MM.yyyy')

Date22 = date2.format('dd.MM.yyyy')

WebUI.setText(findTestObject('Documents/document_contract/223/basic info/input_dateContract'), Date11.toString())

WebUI.setText(findTestObject('Documents/document_contract/223/basic info/input_dateStart'), Date22.toString())

WebUI.setText(findTestObject('Documents/document_contract/223/basic info/input_priceContract'), '1000')

WebUI.click(findTestObject('Documents/document_contract/223/tab_infoContractor'))

WebUI.waitForElementAttributeValue(findTestObject('Documents/document_contract/223/tab_infoContractor'), 'class', 'active', 
    0)

WebUI.click(findTestObject('Documents/document_contract/223/info contractor/btn_organization'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BASE/btn_save'))

WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

