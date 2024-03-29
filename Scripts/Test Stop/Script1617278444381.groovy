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

WebUI.navigateToUrl('http://localhost:3000/occupancy_of_stops')

WebUI.doubleClick(findTestObject('Object Repository/Page_PO.TOK/p_Zastvka'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/input_Vyberte konkrtnu zastvku a interval_interval'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PO.TOK/p_Poet seknd strvench na zastvke'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PO.TOK/p_Dtum a as vskytu na zastvkach'), 0)

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/p_Autobusov linka'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PO.TOK/p_Poet seknd strvench na zastvke'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PO.TOK/p_Dtum a as vskytu na zastvkach'), 0)

WebUI.closeBrowser()

