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

'Переход на вкладку администрирования'
WebUI.click(findTestObject('Pages/page_home/span_administration'))

WebUI.waitForElementPresent(findTestObject('Pages/page_administration/page_activation/user'), 0)

'Разворачивание списка пользователей для активации\r\n'
WebUI.click(findTestObject('Pages/page_administration/page_activation/user'))

'В поле поиска пользователей вводится логин пользователя'
WebUiBuiltInKeywords.setText(findTestObject('Pages/page_administration/page_activation/input_user'), Surname)

'Выбор активируемого пользователя'
WebUI.sendKeys(findTestObject('Pages/page_administration/page_activation/input_user'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Pages/page_administration/page_activation/input_workGroup'), 0)

switch (WorkGroup) {
    case '1':
        'Развернуть список рабочих групп'
        WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

        'Выбор рабочей группы'
        WebUiBuiltInKeywords.click(findTestObject('BASE/workgroup/item_IZ44fz'), FailureHandling.STOP_ON_FAILURE)

        'Развернуть список рабочих групп'
        WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

        'Выбор рабочей группы'
        WebUiBuiltInKeywords.click(findTestObject('BASE/workgroup/item_approve44fz'), FailureHandling.STOP_ON_FAILURE)

        'Развернуть список рабочих групп'
        WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

        'Выбор рабочей группы'
        WebUiBuiltInKeywords.click(findTestObject('BASE/workgroup/item_approveS44fz'), FailureHandling.STOP_ON_FAILURE)

        'Развернуть список рабочих групп'
        WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

        'Выбор рабочей группы'
        WebUiBuiltInKeywords.click(findTestObject('BASE/workgroup/item_chief44fz'), FailureHandling.STOP_ON_FAILURE)

        break
    case '2':
        'Развернуть список рабочих групп'
        WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

        'Выбор рабочей группы'
        WebUiBuiltInKeywords.click(findTestObject('BASE/workgroup/item_user44fz'), FailureHandling.STOP_ON_FAILURE)

        break
    case '3':
        'Развернуть список рабочих групп'
        WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

        'Выбор рабочей группы'
        WebUiBuiltInKeywords.click(findTestObject('BASE/workgroup/item_IZ223fz'), FailureHandling.STOP_ON_FAILURE)

        'Развернуть список рабочих групп'
        WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

        'Выбор рабочей группы'
        WebUiBuiltInKeywords.click(findTestObject('BASE/workgroup/item_approval223fz'), FailureHandling.STOP_ON_FAILURE)

        'Развернуть список рабочих групп'
        WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

        'Выбор рабочей группы'
        WebUiBuiltInKeywords.click(findTestObject('BASE/workgroup/item_approveS223fz'), FailureHandling.STOP_ON_FAILURE)

        'Развернуть список рабочих групп'
        WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

        'Выбор рабочей группы'
        WebUiBuiltInKeywords.click(findTestObject('BASE/workgroup/item_chief223fz'), FailureHandling.STOP_ON_FAILURE)

        break
    case '4':
        'Развернуть список рабочих групп'
        WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/input_workGroup'), FailureHandling.STOP_ON_FAILURE)

        'Выбор рабочей группы'
        WebUiBuiltInKeywords.click(findTestObject('BASE/workgroup/item_user223fz'), FailureHandling.STOP_ON_FAILURE)

        break
}

'Активация пользователя'
WebUiBuiltInKeywords.click(findTestObject('Pages/page_administration/page_activation/button_save'))

'Проверка успешной активации\r\n'
WebUiBuiltInKeywords.waitForElementPresent(findTestObject('Pages/page_administration/page_activation/message_pass'), 120)

'Закрыть браузер'
WebUI.closeBrowser()

