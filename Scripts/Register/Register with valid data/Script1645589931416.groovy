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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Page_Brick Sign Up/img_brickLogo'), 0)

WebUI.setText(findTestObject('Page_Brick Sign Up/txtField_firstName'), 'First')

WebUI.setText(findTestObject('Page_Brick Sign Up/txtField_lastName'), 'Name')

WebUI.setText(findTestObject('Page_Brick Sign Up/txtField_email'), 'email@domain.com')

WebUI.click(findTestObject('Page_Brick Sign Up/drop_selectedFlag'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Brick Sign Up/List_Phone_Country/li_Indonesia62'))

WebUI.setText(findTestObject('Page_Brick Sign Up/txtField_phoneNumber'), '+6281234567890')

WebUI.setText(findTestObject('Page_Brick Sign Up/txtField_address'), 'Jl. Alamat, Kel, Kec, Prov, Indonesia, 12345')

WebUI.setEncryptedText(findTestObject('Page_Brick Sign Up/txtField_password'), '2d4fYql8gEMcXQVWxOuTLw==')

WebUI.setEncryptedText(findTestObject('Page_Brick Sign Up/txtField_passwordConfirm'), '2d4fYql8gEMcXQVWxOuTLw==')

WebUI.click(findTestObject('Page_Brick Sign Up/btn_register'))

WebUI.verifyElementPresent(findTestObject('Page_Brick Sign Up/h2_Success'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Brick Sign Up/lbl_Check your email to confirm your registration'), 0)

WebUI.click(findTestObject('Page_Brick Sign Up/btn_okClosePopUp'))

WebUI.closeBrowser()

WebUI.acceptAlert()

