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


suiteProperties.put('id', 'Test Suites/Suites/Purchase plan/223 Create purchase plan')

suiteProperties.put('name', '223 Create purchase plan')

suiteProperties.put('description', '\u0421\u043E\u0437\u0434\u0430\u0442\u044C \u043F\u043E\u0437\u0438\u0446\u0438\u044E \u043F\u043B\u0430\u043D\u0430 \u0437\u0430\u043A\u0443\u043F\u043E\u043A')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("T:\\Katalon Studio\\E1\\Reports\\Suites\\Purchase plan\\223 Create purchase plan\\20181128_122303\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Suites/Purchase plan/223 Create purchase plan', suiteProperties, [new TestCaseBinding('Test Cases/BASE/Authorization', 'Test Cases/BASE/Authorization',  null), new TestCaseBinding('Test Cases/Purchase plan/223 Create purchase plan', 'Test Cases/Purchase plan/223 Create purchase plan',  null)])
