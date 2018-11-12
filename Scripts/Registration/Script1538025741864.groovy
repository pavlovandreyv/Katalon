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

'Очистить куки IE'
for (def index : (0..2)) {
    '????????? ????'
    WebUI.deleteAllCookies()
}

'Обновить страницу'
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'Развернуть браузер на весь экран'
WebUI.maximizeWindow()

'Перейти в раздел Регистрации'
WebUI.click(findTestObject('page_authorization/a_registry'))

'Развернуть список организаций'
WebUI.click(findTestObject('page_registration/organization'))

'Ввести в поле поиска данные искомой организации'
WebUI.setText(findTestObject('page_registration/input_organization'), GlobalVariable.Organization)

'Завершить выбор'
WebUI.sendKeys(findTestObject('page_registration/input_organization'), Keys.chord(Keys.ENTER))

'Условие для смены руководителя'
if (GlobalVariable.ChangeChief) {
    'Установить чекбокс смены руководителя'
    WebUI.click(findTestObject('page_registration/input_ChangeChief'), FailureHandling.CONTINUE_ON_FAILURE)
}

'Ввести Фамилию'
WebUI.setText(findTestObject('page_registration/input_FirstName'), GlobalVariable.Name)

'Ввести Имя'
WebUI.setText(findTestObject('page_registration/input_LastName'), GlobalVariable.Surname)

'Ввести Отчество'
WebUI.setText(findTestObject('page_registration/input_MiddleName'), GlobalVariable.Patronymic)

'Ввести Должность'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Position'), GlobalVariable.Position)

'Ввести электронную почту'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Email'), GlobalVariable.Email)

'Ввести телефон'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Phone'), GlobalVariable.Phone)

'Ввести логин'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Login'), GlobalVariable.Login)

'Ввести пароль'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Password'), GlobalVariable.Password)

'Ввести подтверждение пароля'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_PasswordConfirm'), GlobalVariable.Password)

'Нажать на кнопку Зарегистрирвоать'
WebUI.click(findTestObject('page_registration/button_registration'))

'Ожидание успешной регистрации'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('page_registration/massage_pass'), 120)

'Закрыть браузер'
WebUI.closeBrowser()

