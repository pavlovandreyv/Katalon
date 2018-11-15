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

'Авторизоваться'
WebUI.callTestCase(findTestCase('BASE/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Открыть Заявку на размещение'
WebUI.callTestCase(findTestCase('BASE/Open/Open request'), [:], FailureHandling.STOP_ON_FAILURE)

'Ожидание'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/Toolbar_horizon/btn_createNotice'), 0)

'Нажать Создать Извещение\r\n'
WebUI.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_createNotice'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_notice/btn_approval'), 0)

'Развернуть адресную книгу Утверждающего'
WebUI.click(findTestObject('document_notice/btn_approval'))

WebUI.callTestCase(findTestCase('BASE/Dictionary check'), [:], FailureHandling.STOP_ON_FAILURE)

'Переход на вкладку Порядок проведения процедуры'
WebUI.click(findTestObject('document_notice/menu_PPP'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_notice/input_plannedPlacementPeriod'), 0)

'Определение дат для заполнения вкладки Порядок проведения процедуры'
use(TimeCategory, { 
        today = new Date()

        EndDate = (today + 20.days)
    })

'Смена формата даты Планируемый срок размещения'
CDate = today.format('dd.MM.yyyy')

'Смена формата даты Дата окончания подачи заявок'
EndDate = EndDate.format('dd.MM.yyyy')

'Заполнение Планируемый срок размещения'
WebUI.setText(findTestObject('document_notice/input_plannedPlacementPeriod'), CDate.toString())

'Заполнение Дата окончания подачи заявок'
WebUI.setText(findTestObject('document_notice/input_dateEndRequest'), EndDate.toString())

'Заполнить Дата рассмотрения заявок'
WebUI.setText(findTestObject('document_notice/input_dateReview'), EndDate.toString())

'Переход на вкладку Представление документации'
WebUI.click(findTestObject('document_notice/menu_provisionDocumentation'))

'Ожидание'
WebUI.waitForElementPresent(findTestObject('document_notice/input_dateEndDocumentation'), 0)

'Заполнение Дата окончания предоставления документации'
WebUI.setText(findTestObject('document_notice/input_dateEndDocumentation'), EndDate.toString())

'Заполнение Место предоставления документации'
WebUI.setText(findTestObject('document_notice/input_placeDocumentation'), GlobalVariable.Address)

'Нажать Сохранить'
WebUI.click(findTestObject('DOCUMENT/btn_save'))

'Ожидание завершения регистрации доступностью кнопки Редактировать'
WebUI.waitForElementPresent(findTestObject('DOCUMENT/btn_edit'), 0)

'Закрыть браузер'
WebUI.closeBrowser()

