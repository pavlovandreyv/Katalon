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

'Переход на тестовый стенд'
WebUI.openBrowser(GlobalVariable.Server)

'Максимальный экран браузера'
WebUI.maximizeWindow()

'Переход на форму регистрации'
WebUI.click(findTestObject('page_authorization/a_registry'))

'Разворачивается список организаций'
WebUI.click(findTestObject('page_registration/organization'))

'Вводится значние в поле поиска организаций'
WebUI.setText(findTestObject('page_registration/input_organization'), GlobalVariable.Organization)

'Выбор найденной организации кликом на Enter'
WebUI.sendKeys(findTestObject('page_registration/input_organization'), Keys.chord(Keys.ENTER))

'Проверка необходимости в смене руководителя'
if (GlobalVariable.ChangeChief) {
    'Установка чекбокса смены руководителя'
    WebUI.click(findTestObject('page_registration/input_ChangeChief'), FailureHandling.CONTINUE_ON_FAILURE)
}

'Ввод фамилии'
WebUI.setText(findTestObject('page_registration/input_FirstName'), GlobalVariable.Name)

'Ввод имени'
WebUI.setText(findTestObject('page_registration/input_LastName'), GlobalVariable.Surname)

'Ввод отчества'
WebUI.setText(findTestObject('page_registration/input_MiddleName'), GlobalVariable.Patronymic)

'Ввод должности'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Position'), GlobalVariable.Position)

'Ввод электронной почты'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Email'), GlobalVariable.Email)

'Ввод телефона'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Phone'), GlobalVariable.Phone)

'Ввод логина'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Login'), GlobalVariable.Login)

'Ввод пароля'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Password'), GlobalVariable.Password)

'Ввод дублирующего пароля'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_PasswordConfirm'), GlobalVariable.Password)

'Завершение регистрации нового пользователя'
WebUI.click(findTestObject('page_registration/button_registration'))

'Проверка успешной регистрации'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('page_registration/massage_pass'), 0)

