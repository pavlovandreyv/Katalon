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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern

WebUI.openBrowser('https://mail.cognitive.ru')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('mail.cognitive.ru/input_login'), 0)

'Ввести Логин'
WebUI.setText(findTestObject('mail.cognitive.ru/input_login'), GlobalVariable.LoginMail)

'Ввести Пароль'
WebUI.setText(findTestObject('mail.cognitive.ru/input_password'), GlobalVariable.PasswordMail)

'Войти\r\n'
WebUI.click(findTestObject('mail.cognitive.ru/button_logIn'))

new_object = WebUI.modifyObjectProperty(findTestObject('mail.cognitive.ru/mail_E1'), 'text', 'equals', 'Новый пароль в Е1 Закупки', 
    true)

WebUI.waitForElementPresent(new_object, 0)

'Открыть письмо активации'
WebUI.doubleClick(new_object)

WebUI.waitForElementPresent(findTestObject('mail.cognitive.ru/mail_newPassword'), 0)

NewPassword = WebUI.getText(findTestObject('mail.cognitive.ru/mail_newPassword'))

Pattern regexPat = Pattern.compile('Ваш новый пароль: (.*).')

Matcher mat = regexPat.matcher(NewPassword)
String psw="";
if(mat.find())
{
	psw=mat.group(1);

}

WebUI.callTestCase(findTestCase('BASE/Authorization'), [('Login') : findTestData('Test data.xlsx/Tab_Variables_User').getValue('Login', 6)
        , ('Password') : psw, ('DeleteAllCookies') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

