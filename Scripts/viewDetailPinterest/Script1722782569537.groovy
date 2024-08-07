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

Mobile.startApplication('D:\\Kelas\\Eduwork\\Katalon\\EduApp\\mobileapp\\Pinterest_12.28.0.apk', true)

Mobile.tap(findTestObject('pinterest/enterEmailAddress'), 0)

Mobile.setText(findTestObject('pinterest/enterEmailAddress', [('variable') : 'abid.rezpect@gmail.com']), 'abid.rezpect@gmail.com', 
    0)

Mobile.tap(findTestObject('pinterest/continueButton'), 0)

Mobile.tap(findTestObject('pinterest/passwordBar'), 0)

Mobile.sendKeys(findTestObject('pinterest/passwordBar'), 'Mabid2707')

Mobile.tap(findTestObject('pinterest/nextButton'), 0)

Mobile.tap(findTestObject('pinterest/Full-name'), 0)

Mobile.sendKeys(findTestObject('pinterest/Full-name'), 'Abid')

Mobile.tap(findTestObject('pinterest/nextButton'), 0)

Mobile.tap(findTestObject('pinterest/OK-Button'), 0)

