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
WebUI.callTestCase(findTestCase('BASE/AuthorizationAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

'Переход на вкладку администрирования'
WebUI.click(findTestObject('page_home/span_administration'))

'Разворачивание списка пользователей для активации\r\n'
WebUI.click(findTestObject('page_administration/page_activation/user'))

'В поле поиска пользователей вводится логин пользователя'
WebUiBuiltInKeywords.setText(findTestObject('page_administration/page_activation/input_user'), GlobalVariable.Surname)

'Выбор активируемого пользователя'
WebUI.sendKeys(findTestObject('page_administration/page_activation/input_user'), Keys.chord(Keys.ENTER))

'Развернуть список рабочих групп'
WebUiBuiltInKeywords.click(findTestObject('page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

'Выбор рабочей группы'
WebUiBuiltInKeywords.click(findTestObject('page_administration/page_activation/item_IZ44fz'), FailureHandling.STOP_ON_FAILURE)

'Развернуть список рабочих групп'
WebUiBuiltInKeywords.click(findTestObject('page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

'Выбор рабочей группы'
WebUiBuiltInKeywords.click(findTestObject('page_administration/page_activation/item_approve44fz'), FailureHandling.STOP_ON_FAILURE)

'Развернуть список рабочих групп'
WebUiBuiltInKeywords.click(findTestObject('page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

'Выбор рабочей группы'
WebUiBuiltInKeywords.click(findTestObject('page_administration/page_activation/item_agreement44fz'), FailureHandling.STOP_ON_FAILURE)

'Активация пользователя'
WebUiBuiltInKeywords.click(findTestObject('page_administration/page_activation/button_save'))

'Проверка успешной активации\r\n'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('page_administration/page_activation/message_pass'), 120)

'Закрыть браузер'
WebUI.closeBrowser()

