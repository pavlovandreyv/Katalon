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


suiteProperties.put('id', 'Test Suites/Suites/Registration/Registration testEP_1_user')

suiteProperties.put('name', 'Registration testEP_1_user')

suiteProperties.put('description', '\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u044F \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044F')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("T:\\Katalon Studio\\E1\\Reports\\Suites\\Registration\\Registration testEP_1_user\\20181120_145957\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Suites/Registration/Registration testEP_1_user', suiteProperties, [new TestCaseBinding('Test Cases/Registration/Registration', 'Test Cases/Registration/Registration',  [ 'CertName' : '//span[contains(text(), \'\u041F\u0435\u0442\u0440\u043E\u0432 \u041F\u0435\u0442\u0440 \u041F\u0435\u0442\u0440\u043E\u0432\u0438\u0447\')]/../*[@type=\'radio\']' , 'Surname' : '\u041F\u0435\u0442\u0440\u043E\u0432testEP2' , 'Login' : 'test25EP_1' , 'Email' : 'test.cognitive+test25EP_1@cognitive.ru' , 'RegistrationEP' : true , 'DeleteAllCookies' : true ,  ]), new TestCaseBinding('Test Cases/Registration/Open urlE1_mailCognitive', 'Test Cases/Registration/Open urlE1_mailCognitive',  null), new TestCaseBinding('Test Cases/BASE/AuthorizationEP', 'Test Cases/BASE/AuthorizationEP',  null), new TestCaseBinding('Test Cases/BASE/Certificate selection', 'Test Cases/BASE/Certificate selection',  [ 'CertName' : '//span[contains(text(), \'\u0418\u0432\u0430\u043D\u043E\u0432 \u0418\u0432\u0430\u043D \u0418\u0432\u0430\u043D\u043E\u0432\u0438\u0447\')]/../*[@type=\'radio\']' ,  ]), new TestCaseBinding('Test Cases/Registration/Activation', 'Test Cases/Registration/Activation',  [ 'Surname' : '\u041F\u0435\u0442\u0440\u043E\u0432testEP2' , 'WorkGroup' : '2' ,  ])])
