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

'Ожидание'
WebUI.waitForElementPresent(findTestObject('BASE/Toolbar_horizon/btn_createProtocol'), 0)

'Нажать Создать протокол'
WebUI.click(findTestObject('BASE/Toolbar_horizon/btn_createProtocol'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('Documents/document_protocol/tab_infoCommission'), 0)

'Перейти на вкладку Информация о комиссии'
WebUI.click(findTestObject('Documents/document_protocol/tab_infoCommission'))

'Заполнить Название комиссии\r\n'
WebUI.setText(findTestObject('Documents/document_protocol/input_nameCommission'), 'Единая комиссия')

'Добавить участника комиссии'
WebUI.click(findTestObject('Documents/document_protocol/btn_addParticipant'))

'Раскрыть справочник сотрудников подразделения'
WebUI.click(findTestObject('Documents/document_protocol/btn_participant'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Раскрыть справочник ролей'
WebUI.click(findTestObject('Documents/document_protocol/btn_role'))

'В поле поиска ролей ввести наименование'
WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), 'Председатель комиссии')

'Нажать найти'
WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Установить Присутствует'
WebUI.check(findTestObject('Documents/document_protocol/check_isPresent'))

'Добавить 2го члена комиссии'
WebUI.click(findTestObject('Documents/document_protocol/btn_addParticipant'))

WebUI.click(findTestObject('Documents/document_protocol/btn_participant2'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Раскрыть справочник ролей'
WebUI.click(findTestObject('Documents/document_protocol/btn_role2'))

'В поле поиска ролей ввести наименование'
WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), 'Зам. председателя комиссии')

'Нажать найти'
WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Установить Присутствует'
WebUI.check(findTestObject('Documents/document_protocol/check_isPresent'))

'Добавить 3го члена комиссии'
WebUI.click(findTestObject('Documents/document_protocol/btn_addParticipant'))

WebUI.click(findTestObject('Documents/document_protocol/btn_participant3'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Раскрыть справочник ролей'
WebUI.click(findTestObject('Documents/document_protocol/btn_role3'))

'В поле поиска ролей ввести наименование'
WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), 'Член комиссии')

'Нажать найти'
WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Установить Присутствует'
WebUI.check(findTestObject('Documents/document_protocol/check_isPresent'))

WebUI.click(findTestObject('Documents/document_protocol/btn_addParticipant'))

'Добавить 4го члена комиссии'
WebUI.click(findTestObject('Documents/document_protocol/btn_participant4'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Раскрыть справочник ролей'
WebUI.click(findTestObject('Documents/document_protocol/btn_role4'))

'В поле поиска ролей ввести наименование'
WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), 'Член комиссии')

'Нажать найти'
WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Установить Присутствует'
WebUI.check(findTestObject('Documents/document_protocol/check_isPresent'))

WebUI.click(findTestObject('Documents/document_protocol/btn_addParticipant'))

'Добавить 5го члена комиссии'
WebUI.click(findTestObject('Documents/document_protocol/btn_participant5'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Раскрыть справочник ролей'
WebUI.click(findTestObject('Documents/document_protocol/btn_role5'))

'В поле поиска ролей ввести наименование'
WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), 'Член комиссии')

'Нажать найти'
WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Установить Присутствует'
WebUI.check(findTestObject('Documents/document_protocol/check_isPresent'))

'Перейти на вкладку Критерии оценки заявки'
WebUI.click(findTestObject('Documents/document_protocol/tab_criteria'))

WebUI.click(findTestObject('Documents/document_protocol/btn_criteria'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ввести Значимость критерия'
WebUI.setText(findTestObject('Documents/document_protocol/input_criteriaValue'), '100')

'Перейти на вкладку Информация и документы предусмотренные в составе заявки'
WebUI.click(findTestObject('Documents/document_protocol/tab_infoDoc'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('Documents/document_protocol/input_nameInfoDoc'), 0)

'Ввести наименование документа'
WebUI.setText(findTestObject('Documents/document_protocol/input_nameInfoDoc'), 'Техническая документация')

'Нажать Сохранить документ'
WebUI.click(findTestObject('BASE/btn_save'))

'Ожидание сохранения документа'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

'Закрыть браузер'
WebUI.closeBrowser()

