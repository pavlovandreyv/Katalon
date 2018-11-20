import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Suites/Change password/Recovery password')

suiteProperties.put('name', 'Recovery password')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("T:\\Katalon Studio\\E1\\Reports\\Suites\\Change password\\Recovery password\\20181120_145957\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Suites/Change password/Recovery password', suiteProperties, [new TestCaseBinding('Test Cases/Change password/Password recovery', 'Test Cases/Change password/Password recovery',  null), new TestCaseBinding('Test Cases/Registration/Open urlE1_mailCognitive', 'Test Cases/Registration/Open urlE1_mailCognitive',  [ 'E1' : '\u0423\u0432\u0435\u0434\u043E\u043C\u043B\u0435\u043D\u0438\u0435 \u043E \u0432\u0430\u0441\u0441\u0442\u0430\u043D\u043E\u0432\u043B\u0435\u043D\u0438\u0438 \u043F\u0430\u0440\u043E\u043B\u044F \u0432 \u04151 \u0417\u0430\u043A\u0443\u043F\u043A\u0438' ,  ]), new TestCaseBinding('Test Cases/Change password/Verified new password', 'Test Cases/Change password/Verified new password',  null)])
