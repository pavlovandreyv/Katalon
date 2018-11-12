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

'Авторизоваться'
WebUI.callTestCase(findTestCase('BASE/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Открыть протокол рассмотрения'
WebUI.callTestCase(findTestCase('BASE/Open/Open protocol review'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_protocol/tab_applications'), 0)

'Перейти на вкладку Заявки участника'
WebUI.click(findTestObject('document_protocol/tab_applications'))

'Изменить значение реквизита поискового документа'
new_object = WebUI.modifyObjectProperty(findTestObject('DOCUMENT/object'), 'text', 'equals', GlobalVariable.Contractor1, 
    true)

'Ожидание доступности документа'
WebUiBuiltInKeywords.waitForElementPresent(new_object, 60)

'Скопировать url, для перехода внутри одной вкладки'
url_object = WebUiBuiltInKeywords.getAttribute(new_object, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

'Взять заявку на редактирование'
WebUI.click(findTestObject('DOCUMENT/btn_edit'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_application/btn_resulsApp'), 0)

'Раскрыть справочник Результата оценки заявки'
WebUI.click(findTestObject('document_application/btn_resulsApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/input_find'), 0)

'Ввести поисковое значение Заявка отклонена'
WebUI.setText(findTestObject('DOCUMENT/Dictionary_check/input_find'), 'Заявка отклонена')

'Нажать найти'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_find'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Выбрать найденное значение'
WebUI.check(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор найденного значения'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание перехода маски в определенный статус'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/x-mask x-border-box2'), 60)

'Ожидание недоступности маски, перекрывающей "Сохранить"'
WebUI.waitForElementNotPresent(findTestObject('special/modal-backdrop fade'), 60)

'Раскрыть справочник Причины отказа'
WebUI.click(findTestObject('document_application/btn_rejectionReason'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Выбрать первое в списке значение'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('special/x-mask x-border-box2'), 0)

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('special/modal-backdrop fade'), 60)

'Ввести значение в поле Объяснения'
WebUI.setText(findTestObject('document_application/input_explanationFailure'), 'Нет предложения цены')

'Ожидание перехода маски в определенный статус'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/x-mask x-border-box2'), 60)

'Ожидание недоступности маски, перекрывающей "Сохранить"'
WebUI.waitForElementNotPresent(findTestObject('special/modal-backdrop fade'), 60)

'Раскрыть справочник Причин отказа'
WebUI.click(findTestObject('document_application/btn_rejectionReasonApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Dictionary_check/check_item'), 0)

'Выбрать вервое попавшееся значение'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/check_item'))

'Завершить выбор'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание перехода маски в определенный статус'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/x-mask x-border-box2'), 60)

'Ожидание недоступности маски, перекрывающей "Сохранить"'
WebUI.waitForElementNotPresent(findTestObject('special/modal-backdrop fade'), 60)

'Сохранить изменения'
WebUI.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('special/loading-image-small loading-image-shown'), 0)

'Перейти на вкладку Протокола'
WebUI.click(findTestObject('DOCUMENT/Toolbar_vertical/tab_protocol'))

'Изменить значение реквизита поискового документа'
new_object = WebUI.modifyObjectProperty(findTestObject('DOCUMENT/object'), 'text', 'equals', 'Протокол рассмотрения и оценки заявок на участие в открытом конкурсе', 
    true)

'Ожидание доступности документа'
WebUiBuiltInKeywords.waitForElementPresent(new_object, 60)

'Скопировать url, для перехода внутри одной вкладки'
url_object = WebUiBuiltInKeywords.getAttribute(new_object, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

'Ожидание. 2 ЗАЯВКА'
WebUI.waitForElementPresent(findTestObject('document_protocol/tab_applications'), 0)

'Перейти на вкладку Заявки участника'
WebUI.click(findTestObject('document_protocol/tab_applications'))

'Изменить значение реквизита поискового документа'
new_object = WebUI.modifyObjectProperty(findTestObject('DOCUMENT/object'), 'text', 'equals', GlobalVariable.Contractor2, 
    true)

'Ожидание доступности документа'
WebUiBuiltInKeywords.waitForElementPresent(new_object, 60)

'Скопировать url, для перехода внутри одной вкладки'
url_object = WebUiBuiltInKeywords.getAttribute(new_object, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

'Взять заявку на редактирование'
WebUI.click(findTestObject('DOCUMENT/btn_edit'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_application/btn_resulsApp'), 0)

'Раскрыть справочник Результата оценки заявки'
WebUI.click(findTestObject('document_application/btn_resulsApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_application/item_appAllowed'), 0)

'Нажать найти'
WebUI.check(findTestObject('document_application/item_appAllowed'))

'Завершить выбор найденного значения'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание перехода маски в определенный статус'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/x-mask x-border-box2'), 60)

'Ожидание недоступности маски, перекрывающей "Сохранить"'
WebUI.waitForElementNotPresent(findTestObject('special/modal-backdrop fade'), 60)

'Ввод порядкового номера'
WebUI.setText(findTestObject('document_application/input_serialNumber'), '1')

'Ввод оценки заявки'
WebUI.setText(findTestObject('document_application/input_rating'), '12')

'Переход на вкладку Критерии оценки заявки'
WebUI.click(findTestObject('document_application/tab_criterion'))

'Ввести значимость критерия'
WebUI.setText(findTestObject('document_application/input_value'), '100')

'Сохранить изменения'
WebUI.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

'Ожидание'
WebUI.waitForElementNotPresent(findTestObject('special/loading-image-small loading-image-shown'), 0)

'Перейти на вкладку Протокола'
WebUI.click(findTestObject('DOCUMENT/Toolbar_vertical/tab_protocol'))

'Изменить значение реквизита поискового документа'
new_object = WebUI.modifyObjectProperty(findTestObject('DOCUMENT/object'), 'text', 'equals', 'Протокол рассмотрения и оценки заявок на участие в открытом конкурсе', 
    true)

'Ожидание доступности документа'
WebUiBuiltInKeywords.waitForElementPresent(new_object, 60)

'Скопировать url, для перехода внутри одной вкладки'
url_object = WebUiBuiltInKeywords.getAttribute(new_object, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

'Ожидание. 3 ЗАЯВКА'
WebUI.waitForElementPresent(findTestObject('document_protocol/tab_applications'), 0)

'Перейти на вкладку Заявки участника'
WebUI.click(findTestObject('document_protocol/tab_applications'))

'Изменить значение реквизита поискового документа'
new_object = WebUI.modifyObjectProperty(findTestObject('DOCUMENT/object'), 'text', 'equals', GlobalVariable.Contractor3, 
    true)

'Ожидание доступности документа'
WebUiBuiltInKeywords.waitForElementPresent(new_object, 60)

'Скопировать url, для перехода внутри одной вкладки'
url_object = WebUiBuiltInKeywords.getAttribute(new_object, 'href')

'Перейти по скопированному url'
WebUI.navigateToUrl(url_object)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

'Взять заявку на редактирование'
WebUI.click(findTestObject('DOCUMENT/btn_edit'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_application/btn_resulsApp'), 0)

WebUI.setText(findTestObject('document_application/input_availablePrice'), '9999')

'Раскрыть справочник Результата оценки заявки'
WebUI.click(findTestObject('document_application/btn_resulsApp'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_application/item_appAllowed'), 0)

'Нажать найти'
WebUI.check(findTestObject('document_application/item_appAllowed'))

'Завершить выбор найденного значения'
WebUI.click(findTestObject('DOCUMENT/Dictionary_check/btn_select'))

'Ожидание перехода маски в определенный статус'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/x-mask x-border-box2'), 60)

'Ожидание недоступности маски, перекрывающей "Сохранить"'
WebUI.waitForElementNotPresent(findTestObject('special/modal-backdrop fade'), 60)

'Ввод порядкового номера'
WebUI.setText(findTestObject('document_application/input_serialNumber'), '2')

'Ввод оценки заявки'
WebUI.setText(findTestObject('document_application/input_rating'), '10')

'Переход на вкладку Критерии оценки заявки'
WebUI.click(findTestObject('document_application/tab_criterion'))

'Ввести значимость критерия'
WebUI.setText(findTestObject('document_application/input_value'), '100')

'Сохранить изменения'
WebUI.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

WebUI.closeBrowser()

