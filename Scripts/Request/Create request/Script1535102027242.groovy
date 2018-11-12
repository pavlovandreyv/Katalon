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

'Авторизоваться'
WebUI.callTestCase(findTestCase('BASE/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание доступности меню Планирование'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('page_home/span_planning'), 60)

'Нажать на меню "Планирование"'
WebUiBuiltInKeywords.click(findTestObject('page_home/span_planning'))

'Ожидание доступности меню "Позиции план-графика"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('menu_planning/a_positionSchedulePlan'), 60)

'Нажать на меню "Позиция план-графика"'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/a_positionSchedulePlan'))

'Ожидание меню "Включенные в план"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('menu_planning/a_includedInPlan'), 60)

'Нажать на кнопку "Включенные в план"'
WebUiBuiltInKeywords.click(findTestObject('menu_planning/a_includedInPlan'))

'Изменить значение реквизита документа'
new_object = WebUI.modifyObjectProperty(findTestObject('DOCUMENT/object'), 'text', 'equals', GlobalVariable.BudgetYear, 
    true)

'Ожидание доступности документа с определенным значением'
WebUiBuiltInKeywords.waitForElementPresent(new_object, 60)

'Скопировать url, для перехода внутри одной вкладки'
url_object = WebUiBuiltInKeywords.getAttribute(new_object, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

'Ожидание кнопки "Создать заявку на размещение"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/Toolbar_horizon/btn_createRequest'), 60)

'Нажать на кнопку "Создать заявку на размещение"'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_createRequest'))

'Ожидание кнопки "Утверждающего"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_request/btn_appruval'), 60)

'Нажать на кнопку "Утверждающий"'
WebUiBuiltInKeywords.click(findTestObject('document_request/btn_appruval'))

'Ожидание значения в адресной книге'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 60)

'Выбрать первое списке значение'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ввести Источник финансирования'
WebUI.setText(findTestObject('document_request/input_sourceFinancing'), GlobalVariable.sourceFinancing)

'Ввести Место доставки'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_placeDelivery'), GlobalVariable.Address)

'Перйти на вкладку "Контактная информация"'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Toolbar_vertical/menu_contactInfo'))

'Ожидание доступности поля Дополнительная контактная информация'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('document_request/input_additionalContactInfo'), 60)

'Ввести "Дополнительная контактная информация"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_additionalContactInfo'), GlobalVariable.Phone)

'Ввести "Должность руководителя контрактной службы"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_headContactService'), GlobalVariable.Position)

'Ввести "ФИО руководителя контрактной службы"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_FIOheadContactService'), GlobalVariable.Surname)

'Ввести "Телефон руководителя контрактной службы"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_phoneHeadContactService'), GlobalVariable.Phone)

'Ввести "Email руководителя контрактной службы"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_emailHeadContactService'), GlobalVariable.Email)

'Ввести "Должность ответственного за заключение контракта"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_positionResponsibleContracting'), GlobalVariable.Position)

'Ввести "ФИО ответственного за заключение контракта"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_FIOresponsibleContracting'), GlobalVariable.Surname)

'Ввести "Телефон ответственного за заключение контракта"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_phoneResponsibleContracting'), GlobalVariable.Phone)

'Ввести "Email ответственного за заключение контракта"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_emailResponsibleContracting'), GlobalVariable.Email)

'Ввести "Должность ответственного исполнителя"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_positionResponsibleExecution'), GlobalVariable.Position)

'Ввести "ФИО ответственного исполнителя"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_FIOresponsibleExecution'), GlobalVariable.Surname)

'Ввести "Телефон ответственного исполнителя"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_phoneResponsibleExecution'), GlobalVariable.Phone)

'Ввести "Email ответственного исполнителя"'
WebUiBuiltInKeywords.setText(findTestObject('document_request/input_emailResponsibleExecution'), GlobalVariable.Email)

'Нажать "Сохранить" документ'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание успешного сохранения проверкой доступности кнопки "Редактировать"'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 180)

'Закрыть браузер'
WebUI.closeBrowser()

