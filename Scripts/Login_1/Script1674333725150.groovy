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

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('Object Repository/HansDelbruck/Page_Prusa Account/input_(required)_email'), email)

WebUI.setText(findTestObject('Object Repository/HansDelbruck/Page_Prusa Account/input_(required)_password'), password)

WebUI.click(findTestObject('Object Repository/HansDelbruck/Page_Prusa Account/button_Log in'))

WebUI.click(findTestObject('Object Repository/HansDelbruck/Page_Prusa Account/a_Eshop'))

WebUI.click(findTestObject('Object Repository/HansDelbruck/Page_Original Prusa 3D printers directly fr_3e3e58/button_I am OK with that'))

WebUI.click(findTestObject('Object Repository/HansDelbruck/Page_Original Prusa 3D printers directly fr_3e3e58/a_Login'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('HansDelbruck/Page_Original Prusa 3D printers directly fr_3e3e58/button_User'))

/*
 * WebUI.waitForElementClickable(findTestObject('HansDelbruck/Page_Original
 * Prusa 3D printers directly fr_3e3e58/button_Logout'), 5)
 * 
 * WebUI.verifyElementPresent(findTestObject('HansDelbruck/Page_Original Prusa
 * 3D printers directly fr_3e3e58/button_Logout'), 0)
 */

