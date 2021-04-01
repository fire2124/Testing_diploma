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

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/input_Zastvky MHD_mhdStops'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/img_Aktulne dopravn informcie_leaflet-marke_fff28c_1_2_3_4'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PO.TOK/div_Typ zastvky Stop_MhdNzov zastvky (medzi_d91e08'), 
    20)

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/a_'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/input_Zastvky MHD_mhdStops'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/input_Zastvky SAD_sadStops'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/img_Aktulne dopravn informcie_leaflet-marke_fff28c_1_2_3_4_5'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PO.TOK/div_Typ zastvky Stop_SadNzov zastvky ubovec_ffebef'), 
    20)

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/a_'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/input_Zastvky SAD_sadStops'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/input_Zastvky vlakov_trainStops'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/img_Aktulne dopravn informcie_leaflet-marke_fff28c_1_2_3_4_5_6'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PO.TOK/div_Typ zastvky Stop_TrainNzov zastvky Kend_a8f614'), 
    20)

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/a_'))

WebUI.click(findTestObject('Object Repository/Page_PO.TOK/input_Zastvky vlakov_trainStops'))

WebUI.closeBrowser()

