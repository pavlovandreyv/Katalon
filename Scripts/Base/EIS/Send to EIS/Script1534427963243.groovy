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

'Нажать на кнопку "Опубликовать в ЕИС"'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Toolbar_horizon/btn_senToEIS'))

'Ввести логин'
WebUiBuiltInKeywords.setText(findTestObject('DOCUMENT/EIS/input_loginEIS'), GlobalVariable.Login, FailureHandling.CONTINUE_ON_FAILURE)

'Ввести пароль'
WebUiBuiltInKeywords.setText(findTestObject('DOCUMENT/EIS/input_passwordEIS'), GlobalVariable.Password, FailureHandling.CONTINUE_ON_FAILURE)

'Отправить сущность в ЕИС'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Alert/btn_OK'))

'Ожидание ссобщения ошибки логина/пароля'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('DOCUMENT/EIS/msg_error'), 60, FailureHandling.CONTINUE_ON_FAILURE)

'Ожидание: модальный контрол'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('special/modal-loading-wrapper'), 60)

'Закрыть окно отправки в ЕИС'
WebUiBuiltInKeywords.click(findTestObject('DOCUMENT/Alert/btn_cancel'))

'Обновить форму после отправки в ЕИС для обновления статусов'
WebUiBuiltInKeywords.refresh()

