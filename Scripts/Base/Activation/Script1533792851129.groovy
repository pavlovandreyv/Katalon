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

'Авторизация администратором'
WebUI.callTestCase(findTestCase('Base/Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

'Переход на вкладку администрирования'
WebUI.click(findTestObject('page_home/span_administration'))

'Разворачивание списка пользователей для активации\r\n'
WebUI.click(findTestObject('page_administration/page_activation/user'))

'В поле поиска пользователей вводится логин пользователя'
WebUiBuiltInKeywords.setText(findTestObject('page_administration/page_activation/input_user'), findTestData('Excel/User').getValue(
        'Фамилия', 1))

'Выбор пользователя для активации. Клик "Enter"'
WebUiBuiltInKeywords.sendKeys(findTestObject('page_administration/page_activation/input_user'), Keys.chord(Keys.ENTER))

'Фокусировка в поле редактирвоания рабочих групп'
WebUiBuiltInKeywords.click(findTestObject('page_administration/page_activation/input_workGroup'))

'Включение пользователя в рабочую группу'
WebUiBuiltInKeywords.click(findTestObject('page_administration/page_activation/item_iz44fz'), FailureHandling.STOP_ON_FAILURE)

'Активация пользователя'
WebUiBuiltInKeywords.click(findTestObject('page_administration/page_activation/button_save'))

'Проверка успешной активации\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('page_administration/page_activation/message_pass'), 0)

