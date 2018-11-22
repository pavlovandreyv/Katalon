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

'Проверки поля Год финансирования\r\n'
WebUI.verifyElementPresent(findTestObject('Documents/document_budget/input_yearFinansing'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Documents/document_budget/input_yearFinansing'), 'value', BudgetYear, 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Documents/document_budget/input_yearFinansing'), 'readonly', 0)

WebUI.verifyElementHasAttribute(findTestObject('Documents/document_budget/input_yearFinansing'), 'required', 0)

'Проверки поля Организация-заказчик\r\n'
WebUI.verifyElementPresent(findTestObject('Documents/document_budget/input_organization'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementHasAttribute(findTestObject('Documents/document_budget/input_organization'), 'readonly', 0)

WebUI.verifyElementHasAttribute(findTestObject('Documents/document_budget/input_organization'), 'required', 0)

WebUI.verifyElementAttributeValue(findTestObject('Documents/document_budget/input_organization'), 'value', Organization, 
    0)

'Проверки поля ГРБС'
WebUI.verifyElementPresent(findTestObject('Documents/document_budget/input_GRBS'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementHasAttribute(findTestObject('Documents/document_budget/input_GRBS'), 'readonly', 0)

WebUI.verifyElementAttributeValue(findTestObject('Documents/document_budget/input_GRBS'), 'value', GRBS, 0)

'Проверка наличия кнопки добавления Источника финансирования\r\n'
WebUI.verifyElementPresent(findTestObject('Documents/document_budget/btn_add'), 0, FailureHandling.STOP_ON_FAILURE)

'Проверка наличия кнопки удаления Источника финансирования\r\n'
WebUI.verifyElementPresent(findTestObject('Documents/document_budget/btn_delete'), 0, FailureHandling.STOP_ON_FAILURE)

'Проверить, что Сумма лимита валидируется как денежная единица'
WebUI.verifyElementAttributeValue(findTestObject('Documents/document_budget/input_limitAmount'), 'class', 'form-control money', 
    0)

