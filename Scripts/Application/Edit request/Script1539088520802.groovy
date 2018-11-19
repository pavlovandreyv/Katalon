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
WebUI.waitForElementPresent(findTestObject('Documents/document_protocol/tab_applications'), 0)

'Перейти на вкладку Заявки участника'
WebUI.click(findTestObject('Documents/document_protocol/tab_applications'))

WebUI.callTestCase(findTestCase('BASE/Open object'), [('ObjectName') : findTestData('Test data.xlsx/Tab_Variables').getValue(
            'Contractor1', 1)], FailureHandling.STOP_ON_FAILURE)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

'Взять заявку на редактирование'
WebUI.click(findTestObject('BASE/btn_edit'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('Documents/document_application/btn_resulsApp'), 0)

'Раскрыть справочник Результата оценки заявки'
WebUI.click(findTestObject('Documents/document_application/btn_resulsApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('BASE/Dictionary_check/input_find'), 0)

'Ввести поисковое значение Заявка отклонена'
WebUI.setText(findTestObject('BASE/Dictionary_check/input_find'), 'Заявка отклонена')

'Нажать найти'
WebUI.click(findTestObject('BASE/Dictionary_check/btn_find'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Раскрыть справочник Причины отказа'
WebUI.click(findTestObject('Documents/document_application/btn_rejectionReason'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ввести значение в поле Объяснения'
WebUI.setText(findTestObject('Documents/document_application/input_explanationFailure'), 'Нет предложения цены')

'Раскрыть справочник Причин отказа'
WebUI.click(findTestObject('Documents/document_application/btn_rejectionReasonApp'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Сохранить изменения'
WebUI.click(findTestObject('BASE/btn_save'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('special/loading-image-small loading-image-shown'), 0)

'Перейти на вкладку Протокола'
WebUI.click(findTestObject('BASE/Toolbar_vertical/tab_protocol'))

WebUI.callTestCase(findTestCase('BASE/Open object'), [('ObjectName') : 'Протокол рассмотрения и оценки заявок на участие в открытом конкурсе'], 
    FailureHandling.STOP_ON_FAILURE)

'Ожидание. 2 ЗАЯВКА'
WebUI.waitForElementPresent(findTestObject('Documents/document_protocol/tab_applications'), 0)

'Перейти на вкладку Заявки участника'
WebUI.click(findTestObject('Documents/document_protocol/tab_applications'))

WebUI.callTestCase(findTestCase('BASE/Open object'), [('ObjectName') : findTestData('Test data.xlsx/Tab_Variables').getValue(
            'Contractor2', 1)], FailureHandling.STOP_ON_FAILURE)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

'Взять заявку на редактирование'
WebUI.click(findTestObject('BASE/btn_edit'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('Documents/document_application/btn_resulsApp'), 0)

'Раскрыть справочник Результата оценки заявки'
WebUI.click(findTestObject('Documents/document_application/btn_resulsApp'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ввод порядкового номера'
WebUI.setText(findTestObject('Documents/document_application/input_serialNumber'), '1')

'Ввод оценки заявки'
WebUI.setText(findTestObject('Documents/document_application/input_rating'), '12')

'Переход на вкладку Критерии оценки заявки'
WebUI.click(findTestObject('Documents/document_application/tab_criterion'))

'Ввести значимость критерия'
WebUI.setText(findTestObject('Documents/document_application/input_value'), '100')

'Сохранить изменения'
WebUI.click(findTestObject('BASE/btn_save'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('special/loading-image-small loading-image-shown'), 0)

'Перейти на вкладку Протокола'
WebUI.click(findTestObject('BASE/Toolbar_vertical/tab_protocol'))

WebUI.callTestCase(findTestCase('BASE/Open object'), [('ObjectName') : 'Протокол рассмотрения и оценки заявок на участие в открытом конкурсе'], 
    FailureHandling.STOP_ON_FAILURE)

'Ожидание. 3 ЗАЯВКА'
WebUI.waitForElementPresent(findTestObject('Documents/document_protocol/tab_applications'), 0)

'Перейти на вкладку Заявки участника'
WebUI.click(findTestObject('Documents/document_protocol/tab_applications'))

WebUI.callTestCase(findTestCase('BASE/Open object'), [('ObjectName') : findTestData('Test data.xlsx/Tab_Variables').getValue(
            'Contractor3', 1)], FailureHandling.STOP_ON_FAILURE)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

'Взять заявку на редактирование'
WebUI.click(findTestObject('BASE/btn_edit'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('Documents/document_application/btn_resulsApp'), 0)

WebUI.setText(findTestObject('Documents/document_application/input_availablePrice'), '9999')

'Раскрыть справочник Результата оценки заявки'
WebUI.click(findTestObject('Documents/document_application/btn_resulsApp'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Ввод порядкового номера'
WebUI.setText(findTestObject('Documents/document_application/input_serialNumber'), '2')

'Ввод оценки заявки'
WebUI.setText(findTestObject('Documents/document_application/input_rating'), '10')

'Переход на вкладку Критерии оценки заявки'
WebUI.click(findTestObject('Documents/document_application/tab_criterion'))

'Ввести значимость критерия'
WebUI.setText(findTestObject('Documents/document_application/input_value'), '100')

'Сохранить изменения'
WebUI.click(findTestObject('BASE/btn_save'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('BASE/btn_edit'), 0)

WebUI.closeBrowser()

