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

'Ожидание кнопки "Создать заявку на размещение"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/Button/btn_createRequest'), 60)

'Нажать на кнопку "Создать заявку на размещение"'
WebUiBuiltInKeywords.click(findTestObject('BASE/Button/btn_createRequest'))

'Ожидание кнопки "Утверждающего"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_request/btn_appruval'), 60)

'Нажать на кнопку "Утверждающий"'
WebUiBuiltInKeywords.click(findTestObject('Documents/document_request/btn_appruval'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ввести Источник финансирования'
WebUI.setText(findTestObject('Documents/document_request/input_sourceFinancing'), SourceFinancing)

'Ввести Место доставки'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_placeDelivery'), Address)

'Перйти на вкладку "Контактная информация"'
WebUiBuiltInKeywords.click(findTestObject('BASE/Tab/tab_contactInfo'))

'Ожидание доступности поля Дополнительная контактная информация'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Documents/document_request/input_additionalContactInfo'), 60)

'Ввести "Дополнительная контактная информация"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_additionalContactInfo'), Phone)

'Ввести "Должность руководителя контрактной службы"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_headContactService'), Position)

'Ввести "ФИО руководителя контрактной службы"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_FIOheadContactService'), Surname)

'Ввести "Телефон руководителя контрактной службы"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_phoneHeadContactService'), Phone)

'Ввести "Email руководителя контрактной службы"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_emailHeadContactService'), Email)

'Ввести "Должность ответственного за заключение контракта"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_positionResponsibleContracting'), Position)

'Ввести "ФИО ответственного за заключение контракта"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_FIOresponsibleContracting'), Surname)

'Ввести "Телефон ответственного за заключение контракта"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_phoneResponsibleContracting'), Phone)

'Ввести "Email ответственного за заключение контракта"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_emailResponsibleContracting'), Email)

'Ввести "Должность ответственного исполнителя"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_positionResponsibleExecution'), Position)

'Ввести "ФИО ответственного исполнителя"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_FIOresponsibleExecution'), Surname)

'Ввести "Телефон ответственного исполнителя"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_phoneResponsibleExecution'), Phone)

'Ввести "Email ответственного исполнителя"'
WebUiBuiltInKeywords.setText(findTestObject('Documents/document_request/input_emailResponsibleExecution'), Email)

'Нажать "Сохранить" документ'
WebUiBuiltInKeywords.click(findTestObject('BASE/btn_save'))

'Ожидание успешного сохранения проверкой доступности кнопки "Редактировать"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('BASE/btn_edit'), 180)

'Закрыть браузер'
WebUI.closeBrowser()

