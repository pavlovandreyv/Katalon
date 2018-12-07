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

use(TimeCategory, { 
        today = new Date()

        today7 = (today + 7.days)
    })

Date1 = today.format('dd.MM.yyyy')

Date7 = today7.format('dd.MM.yyyy')

'Проверка "Дата регистрации"'
WebUI.verifyElementText(findTestObject('Documents/document_purchaseRegulation/view/dateRegistration'), Date1.toString())

'Проверка "Организация заказчик"'
WebUI.verifyElementText(findTestObject('Documents/document_purchaseRegulation/view/organization'), findTestData('Test data.xlsx/Tab_Variables_User').getValue(
        'Organization', 1))

'Проверка "Название положения"'
WebUI.verifyElementText(findTestObject('Documents/document_purchaseRegulation/view/nameRegulation'), 'Положение №1 от 01.01.2019')

'Проверка "Утверждающий"'
txt_approval = WebUI.getText(findTestObject('Documents/document_purchaseRegulation/view/approval'), FailureHandling.STOP_ON_FAILURE)

txt_approval.contains(findTestData('Test data.xlsx/Tab_Variables_User').getValue('Surname', 1))

'Проверка "Статус"'
WebUI.verifyElementText(findTestObject('Documents/document_purchaseRegulation/view/status'), 'Черновик')

'Проверка "Номер редакции"'
WebUI.verifyElementText(findTestObject('Documents/document_purchaseRegulation/view/numberEdition'), '1')

'Проверка "Дата вступления в силу"'
WebUI.verifyElementText(findTestObject('Documents/document_purchaseRegulation/view/dateStart'), Date7.toString())

'Проверка "Наименование органа утвердившего положение"'
WebUI.verifyElementText(findTestObject('Documents/document_purchaseRegulation/view/nameApprovalRegulation'), 'Совет директоров')

'Проверка "Наименование способа закупки"'
WebUI.verifyElementPresent(findTestObject('Documents/document_purchaseRegulation/view/nameTypePurchase'), 0)

'Проверка вкладки "Основные сведения"'
WebUI.verifyElementPresent(findTestObject('BASE/Tab/tab_basicInfo'), 0)

'Проверка вкладки "Присоединенные файлы"'
WebUI.verifyElementPresent(findTestObject('BASE/Tab/tab_attachedFiles'), 0)

'Проверка вкладки "Маршруты"'
WebUI.verifyElementPresent(findTestObject('BASE/Tab/tab_route'), 0)

'Проверка вкладки "Прошлые версии"'
WebUI.verifyElementAttributeValue(findTestObject('BASE/Tab/tab_lastVersions'), 'style', 'display: none;', 0)

'Проверка кнопки "Присоединить файлы"'
WebUI.verifyElementPresent(findTestObject('BASE/Button/btn_attachFile'), 0)

'Проверка кнопки "На утверждение'
WebUI.verifyElementPresent(findTestObject('BASE/Button/btn_forApproval'), 0)

