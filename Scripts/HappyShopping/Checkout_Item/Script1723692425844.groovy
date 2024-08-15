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

Mobile.startApplication('D:\\Kelas\\Eduwork\\Katalon\\EduApp\\mobileapp\\Happy Day Shopping_1.8.apk', true)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/HappyShoping/MenuButton'), 0)

Mobile.tap(findTestObject('Object Repository/HappyShoping/PROMOTIONS_Button'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/HappyShoping/ItemButton'), 0)

Mobile.tap(findTestObject('Object Repository/HappyShoping/AddtoBag_button'), 0)

Mobile.tap(findTestObject('Object Repository/HappyShoping/YourBag_Button'), 0)

Mobile.tap(findTestObject('Object Repository/HappyShoping/Checkout_Button'), 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/HappyShoping/android.view.View - Shopping cart'), 0)

Mobile.closeApplication()

