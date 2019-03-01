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


suiteProperties.put('id', 'Test Suites/TestSuite3')

suiteProperties.put('name', 'TestSuite3')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\Katalon\\Tests\\Assignment\\Reports\\TestSuite3\\20190301_103157\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestSuite3', suiteProperties, [new TestCaseBinding('Test Cases/Test4 - Iteration 1', 'Test Cases/Test4',  [ 'password' : 'hUKwJTbofgPU9eVlw/CnDQ==' , 'usernmae' : 'Admin' ,  ]), new TestCaseBinding('Test Cases/Test4 - Iteration 2', 'Test Cases/Test4',  [ 'password' : 'hUKwJTbofgPU9eVlw/CnDQ==' , 'usernmae' : 'Admin1' ,  ]), new TestCaseBinding('Test Cases/Test4 - Iteration 3', 'Test Cases/Test4',  [ 'password' : 'dhUKwJTbofgPU9eVlw/CnDQ==' , 'usernmae' : 'Admin' ,  ])])
