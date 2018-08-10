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
WebUI.openBrowser(findTestData('Excel/Server').getValue('Server', 1))

'Максимальный экран браузера'
WebUI.maximizeWindow()

'Переход на форму регистрации'
WebUI.click(findTestObject('page_authorization/a_registry'))

'Разворачивается список организаций'
WebUI.click(findTestObject('page_registration/organization'))

'Вводится значние в поле поиска организаций'
WebUI.setText(findTestObject('page_registration/input_organization'), findTestData('Excel/User').getValue('Организация', 
        1))

'Выбор найденной организации кликом на Enter'
WebUI.sendKeys(findTestObject('page_registration/input_organization'), Keys.chord(Keys.ENTER))

'Установка чекбокса смены руководителя'
WebUI.click(findTestObject('page_registration/input_ChangeChief'))

'Ввод фамилии'
WebUI.setText(findTestObject('page_registration/input_FirstName'), findTestData('Excel/User').getValue('Имя', 1))

'Ввод имени'
WebUI.setText(findTestObject('page_registration/input_LastName'), findTestData('Excel/User').getValue('Фамилия', 1))

'Ввод отчества'
WebUI.setText(findTestObject('page_registration/input_MiddleName'), findTestData('Excel/User').getValue('Отчество', 1))

'Ввод должности'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Position'), findTestData('Excel/User').getValue('Должность', 
        1))

'Ввод электронной почты'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Email'), findTestData('Excel/User').getValue('E-mail', 
        1))

'Ввод телефона'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Phone'), findTestData('Excel/User').getValue('Телефон', 
        1))

'Ввод логина'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Login'), findTestData('Excel/User').getValue('Логин', 
        1))

'Ввод пароля'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_Password'), findTestData('Excel/User').getValue('Пароль', 
        1))

'Ввод дублирующего пароля'
WebUiBuiltInKeywords.setText(findTestObject('page_registration/input_PasswordConfirm'), findTestData('Excel/User').getValue(
        'Пароль', 1))

'//to do: убрать'
WebUI.delay(5)

'Завершение регистрации нового пользователя'
WebUI.click(findTestObject('page_registration/button_registration'))

'Проверка успешной регистрации'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('page_registration/massage_pass'), 0)

