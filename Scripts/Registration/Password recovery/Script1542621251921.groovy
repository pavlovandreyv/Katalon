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
WebUI.click(findTestObject('Pages/page_authorization/a_passwordRecovery'))

WebUI.waitForElementPresent(findTestObject('Pages/page_recovery/input_login'), 0)

WebUI.setText(findTestObject('Pages/page_recovery/input_login'), LoginRecovery)

WebUI.click(findTestObject('Pages/page_recovery/btn_recovery'))

WebUI.waitForElementPresent(findTestObject('Pages/page_recovery/msg_pass'), 0)

WebUI.closeBrowser()

