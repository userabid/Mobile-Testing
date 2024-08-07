import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\Kelas\\Eduwork\\Katalon\\EduApp\\mobileapp\\GoogleCalculator_8.6.1.apk', true)

Mobile.tap(findTestObject('GoogleCalculator/dot3'), 0)

Mobile.tap(findTestObject('GoogleCalculator/Choosetheme_Button'), 0)

Mobile.tap(findTestObject('GoogleCalculator/DarkTheme_Button'), 0)

Mobile.tap(findTestObject('GoogleCalculator/OK_Button'), 0)

Mobile.tap(findTestObject('GoogleCalculator/number1'), 0)

Mobile.tap(findTestObject('GoogleCalculator/plusButton'), 0)

Mobile.tap(findTestObject('GoogleCalculator/number2'), 0)

Mobile.tap(findTestObject('GoogleCalculator/equalButton'), 0)

Mobile.closeApplication()

