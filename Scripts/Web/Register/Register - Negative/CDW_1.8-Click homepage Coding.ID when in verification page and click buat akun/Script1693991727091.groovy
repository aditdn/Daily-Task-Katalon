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

WebUI.navigateToUrl('https://demo-app.online/')

WebUI.click(findTestObject('Object Repository/Page_Be a Profressional Talent with Coding.ID/button_Buat                                _86b528 (4)'))

WebUI.setText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Nama_name (4)'), 'test123')

WebUI.setText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Tanggal lahir_birth_date (4)'), 
    '29-Mar-1997')

WebUI.setText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_E-Mail_email (4)'), 
    'contoh@mail.com')

WebUI.setText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Whatsapp_whatsapp (4)'), 
    '12345678')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Kata Sandi_password (4)'), 
    'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Konfirmasi kata sandi_password_confirmation (4)'), 
    'AWnwaDJYiAmw0Tn/ZROizA==')

WebUI.click(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/input_Konfirmasi kata sandi_inlineCheckbox1 (4)'))

WebUI.click(findTestObject('Object Repository/Page_Buat akun dan dapatkan akses di Coding.ID/button_Daftar (5)'))

WebUI.click(findTestObject('Object Repository/Page_Coding.ID - Verifikasi Email/img_Toggle navigation_logonya (1)'))

WebUI.closeBrowser()
