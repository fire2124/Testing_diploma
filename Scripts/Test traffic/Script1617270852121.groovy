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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/strong_Dopravn obmedzenia'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PO.TOK/div_Leaflet   OpenStreetMap contributors'), 0)

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/label_3 hodiny'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/img_Dopravn obmedzenia_leaflet-marker-icon _8e51f4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PO.TOK/div_Typ obmedzenia Dopravn situciaKraj Preo_ed7a8b'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/a_'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/label_1 de'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/img_Dopravn obmedzenia_leaflet-marker-icon _8e51f4_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PO.TOK/div_Typ obmedzenia Dopravn situciaKraj Koic_3f70fa'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/a_'))

WebUI.closeBrowser()

