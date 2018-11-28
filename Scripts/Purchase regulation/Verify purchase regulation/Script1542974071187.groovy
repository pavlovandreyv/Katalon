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

'Проверки поля Организация-заказчик'
WebUI.verifyElementAttributeValue(findTestObject('Documents/document_purchaseRegulation/base info/input_organization'), 
    'value', findTestData('Test data.xlsx/Tab_Variables_User').getValue('Organization', 1), 0)

WebUI.verifyElementHasAttribute(findTestObject('Documents/document_purchaseRegulation/base info/input_organization'), 'readonly', 
    0)

'Проверки "Использовать положение другой организации"'
WebUI.verifyElementAttributeValue(findTestObject('Documents/document_purchaseRegulation/base info/input_checkOther'), 'value', 
    'on', 0)

'Проверки "Наименование положения"'
WebUI.verifyElementHasAttribute(findTestObject('Documents/document_purchaseRegulation/base info/input_nameRegulation'), 
    'required', 0)

'Проверки "Наименование ограна, утвердившего положения"'
WebUI.verifyElementHasAttribute(findTestObject('Documents/document_purchaseRegulation/base info/input_nameApprovalRegulation'), 
    'required', 0)

'Проверки "Наименование способа закупки"'
WebUI.verifyElementHasAttribute(findTestObject('Documents/document_purchaseRegulation/base info/table_purchase/input_nameTypePurchase'), 
    'readonly', 0)

WebUI.verifyElementAttributeValue(findTestObject('Documents/document_purchaseRegulation/base info/table_purchase/input_nameTypePurchase'), 
    'required', 'true', 0)

'Проверки "Закупка в электронной форме"'
WebUI.verifyElementAttributeValue(findTestObject('Documents/document_purchaseRegulation/base info/table_purchase/input_checkElectronic'), 
    'value', 'on', 0)

WebUI.verifyElementAttributeValue(findTestObject('Documents/document_purchaseRegulation/base info/table_purchase/input_checkElectronic'), 
    'readonly', 'true', 0)

'Проверки "Многоэтапная"'
WebUI.verifyElementAttributeValue(findTestObject('Documents/document_purchaseRegulation/base info/table_purchase/input_checkMultistage'), 
    'value', 'on', 0)

'Проверки "Количество этапов закупки"'
WebUI.verifyElementHasAttribute(findTestObject('Documents/document_purchaseRegulation/base info/table_purchase/input_quantityStage'), 
    'value', 0)

'Проверки "Условия применения способа закупки"'
WebUI.verifyElementHasAttribute(findTestObject('Documents/document_purchaseRegulation/base info/table_purchase/input_conditions'), 
    'value', 0)

'Проверки "Добавить новую строку" в таблице способов закупки'
WebUI.verifyElementPresent(findTestObject('Documents/document_purchaseRegulation/base info/table_purchase/btn_addPurchare'), 
    0)

'Проверки "Удалить строку" в таблице способов закупки'
WebUI.verifyElementPresent(findTestObject('Documents/document_purchaseRegulation/base info/table_purchase/btn_deletePurchare'), 
    0)

'Проверки "Добавить новую строку" в таблице оснований'
WebUI.verifyElementPresent(findTestObject('Documents/document_purchaseRegulation/base info/table_reason/btn_addReason'), 
    0)

'Проверки "Удалить строку" в таблице оснований'
WebUI.verifyElementPresent(findTestObject('Documents/document_purchaseRegulation/base info/table_reason/btn_deleteReason'), 
    0)

'Проверки "Код основания"'
WebUI.verifyElementHasAttribute(findTestObject('Documents/document_purchaseRegulation/base info/table_reason/input_cod'), 
    'value', 0)

'Проверки "Наименование основания закупки у единственного поставщика"'
WebUI.verifyElementHasAttribute(findTestObject('Documents/document_purchaseRegulation/base info/table_reason/input_name'), 
    'value', 0)

'Проверки "Порядок заключения и исполнения договоров"'
WebUI.verifyElementAttributeValue(findTestObject('Documents/document_purchaseRegulation/base info/input_procedureContracts'), 
    'rows', '6', 0)

'Проверки "Дополнительные сведения"'
WebUI.verifyElementAttributeValue(findTestObject('Documents/document_purchaseRegulation/base info/input_otherInfo'), 'rows', 
    '6', 0)

