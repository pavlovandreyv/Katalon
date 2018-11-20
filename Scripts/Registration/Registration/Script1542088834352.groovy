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
import org.openqa.selenium.Keys as Keys
import java.lang.StringIndexOutOfBoundsException as StringIndexOutOfBoundsException
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Открыть браузер'
WebUI.openBrowser(GlobalVariable.Server)

if (DeleteAllCookies) {
    'Очистить куки (в IE иногда с первого раза не чистит)'
    for (def index : (0..4)) {
        'Удалить куки'
        WebUI.deleteAllCookies()
    }
}

'Удалить куки'
WebUI.deleteAllCookies()

'Обновить страницу'
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'Развернуть браузер на весь экран'
WebUI.maximizeWindow()

'Перейти в раздел Регистрации'
WebUI.click(findTestObject('Pages/page_authorization/a_registration'))

WebUI.waitForElementPresent(findTestObject('Pages/page_registration/btn_registration'), 0)

'Выборка: регистрировать с загрузкой данных из Сертификата или без'
switch (RegistrationEP) {
    case false:
        'Развернуть список организаций'
        WebUI.click(findTestObject('Pages/page_registration/btn_organization'))

        'Ввести в поле поиска данные искомой организации'
        WebUI.setText(findTestObject('Pages/page_registration/input_organization'), Organization)

        'Завершить выбор'
        WebUI.sendKeys(findTestObject('Pages/page_registration/input_organization'), Keys.chord(Keys.ENTER))

        'Ввести Фамилию'
        WebUI.setText(findTestObject('Pages/page_registration/input_firstName'), Name)

        'Ввести Имя'
        WebUI.setText(findTestObject('Pages/page_registration/input_lastName'), Surname)

        'Ввести Отчество'
        WebUI.setText(findTestObject('Pages/page_registration/input_middleName'), Patronymic)

        'Ввести Должность'
        WebUiBuiltInKeywords.setText(findTestObject('Pages/page_registration/input_position'), Position)

        break
    case true:
        'Нажать "Загрузить из ЭП"'
        WebUI.click(findTestObject('Pages/page_registration/btn_pullEP'))

        'Ожидание диалога подтверждения использования сертификатов'
        WebUiBuiltInKeywords.waitForAlert(60)

        'Нажать ОК'
        WebUI.acceptAlert()

        new_object = WebUI.modifyObjectProperty(findTestObject('dialog_EP/radio_certificate'), 'xpath', 'equals', CertName, 
            true)

        'Установить чек напротив выбранного сертификата'
        WebUiBuiltInKeywords.click(new_object)

        'Завершить выбор сертификата'
        WebUiBuiltInKeywords.click(findTestObject('BASE/Alert/btn_OK'))

        WebUI.waitForElementPresent(findTestObject('special/modal fade'), 0)

        break
}

'Ввести электронную почту'
WebUiBuiltInKeywords.setText(findTestObject('Pages/page_registration/input_email'), Email)

'Ввести телефон'
WebUiBuiltInKeywords.setText(findTestObject('Pages/page_registration/input_phone'), Phone)

'Ввести логин'
WebUiBuiltInKeywords.setText(findTestObject('Pages/page_registration/input_login'), Login)

'Ввести пароль'
WebUiBuiltInKeywords.setText(findTestObject('Pages/page_registration/input_password'), Password)

'Ввести подтверждение пароля'
WebUiBuiltInKeywords.setText(findTestObject('Pages/page_registration/input_passwordConfirm'), Password)

'Условие для смены руководителя'
if (ChangeChief) {
    'Установить чекбокс смены руководителя'
    WebUI.click(findTestObject('Pages/page_registration/input_changeChief'), FailureHandling.CONTINUE_ON_FAILURE)
}

'Нажать на кнопку Зарегистрирвоать'
WebUI.click(findTestObject('Pages/page_registration/btn_registration'))

'Ожидание успешной регистрации'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Pages/page_registration/massage_pass'), 120)

'Закрыть браузер'
WebUI.closeBrowser()

