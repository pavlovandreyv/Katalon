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

WebUI.waitForElementAttributeValue(findTestObject('Documents/document_request/223/tab_basicInfo'), 'class', 'active', 0)

'Порядок формирования цены договора'
WebUI.setText(findTestObject('Documents/document_request/223/basic info/input_procedurePrice'), 'Порядок формирования цены договора')

WebUI.click(findTestObject('Documents/document_request/223/tab_featurePublication'))

WebUI.waitForElementAttributeValue(findTestObject('Documents/document_request/223/tab_featurePublication'), 'class', 'active', 
    0)

'Сведения о начальной (максимальной) цене договора (цене заявки)'
WebUI.click(findTestObject('Documents/document_request/223/features publication/btn_infoNMCK'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Место доставки товара, являющегося предметом договора, место выполнения работы или оказания услуги, являющихся предметом договора'
WebUI.setText(findTestObject('Documents/document_request/223/features publication/input_place'), 'г. Чебоксары')

'Сроки поставки товара, завершения работы, оказания услуг '
WebUI.setText(findTestObject('Documents/document_request/223/features publication/input_time'), '2 месяца')

