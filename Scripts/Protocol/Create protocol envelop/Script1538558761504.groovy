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

'Авторизоваться'
WebUI.callTestCase(findTestCase('BASE/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Открыть извещение'
WebUI.callTestCase(findTestCase('BASE/Open/Open notice'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Toolbar_horizon/btn_createProtocol'), 0)

'Нажать Создать протокол'
WebUI.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_createProtocol'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_protocol/tab_infoCommission'), 0)

'Перейти на вкладку Информация о комиссии'
WebUI.click(findTestObject('document_protocol/tab_infoCommission'))

'Заполнить Название комиссии\r\n'
WebUI.setText(findTestObject('document_protocol/input_nameCommission'), 'Единая комиссия')

'Добавить участника комиссии'
WebUI.click(findTestObject('document_protocol/btn_addParticipant'))

'Раскрыть справочник сотрудников подразделения'
WebUI.click(findTestObject('document_protocol/btn_participant'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Выбрать первого в списке сотрудника'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Раскрыть справочник ролей'
WebUI.click(findTestObject('document_protocol/btn_role'))

'В поле поиска ролей ввести наименование'
WebUI.setText(findTestObject('DOCUMENT/Dictionary_check/input_find'), 'Председатель комиссии')

'Нажать найти'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'))

'Установить чек на выбранном значении'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Установить Присутствует'
WebUI.check(findTestObject('document_protocol/check_isPresent'))

'Добавить 2го члена комиссии'
WebUI.click(findTestObject('document_protocol/btn_addParticipant'))

WebUI.click(findTestObject('document_protocol/btn_participant2'))

WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

WebUI.click(findTestObject('document_protocol/btn_role2'))

WebUI.setText(findTestObject('DOCUMENT/Dictionary_check/input_find'), 'Зам. председателя комиссии')

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Добавить 3го члена комиссии'
WebUI.click(findTestObject('document_protocol/btn_addParticipant'))

WebUI.click(findTestObject('document_protocol/btn_participant3'))

WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

WebUI.click(findTestObject('document_protocol/btn_role3'))

WebUI.setText(findTestObject('DOCUMENT/Dictionary_check/input_find'), 'Член комиссии')

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

WebUI.click(findTestObject('document_protocol/btn_addParticipant'))

'Добавить 4го члена комиссии'
WebUI.click(findTestObject('document_protocol/btn_participant4'))

WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

WebUI.click(findTestObject('document_protocol/btn_role4'))

WebUI.setText(findTestObject('DOCUMENT/Dictionary_check/input_find'), 'Член комиссии')

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

WebUI.click(findTestObject('document_protocol/btn_addParticipant'))

'Добавить 5го члена комиссии'
WebUI.click(findTestObject('document_protocol/btn_participant5'))

WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

WebUI.click(findTestObject('document_protocol/btn_role5'))

WebUI.setText(findTestObject('DOCUMENT/Dictionary_check/input_find'), 'Член комиссии')

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Перейти на вкладку Критерии оценки заявки'
WebUI.click(findTestObject('document_protocol/tab_criteria'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_protocol/btn_criteria'), 0)

'Раскрыть справочник с критериями'
WebUI.click(findTestObject('document_protocol/btn_criteria'))

'Выбрать первое в списке значение'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Ввести Значимость критерия'
WebUI.setText(findTestObject('document_protocol/input_criteriaValue'), '100')

'Перейти на вкладку Информация и документы предусмотренные в составе заявки'
WebUI.click(findTestObject('document_protocol/tab_infoDoc'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_protocol/input_nameInfoDoc'), 0)

'Ввести наименование документа'
WebUI.setText(findTestObject('document_protocol/input_nameInfoDoc'), 'Техническая документация')

'Нажать Сохранить документ'
WebUI.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание сохранения документа'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

'Закрыть браузер'
WebUI.closeBrowser()

