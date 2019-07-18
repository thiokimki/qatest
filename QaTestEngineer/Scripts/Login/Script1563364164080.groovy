import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

//Maximaize Chrome
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://gist.github.com/discover')

WebUI.click(findTestObject('Page_Discover gists  GitHub/a_Signin'))

//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Login UserName and password
WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email addres'), findTestData('LoginData').getValue(
        1, 1))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password'), findTestData('LoginData').getValue(
        2, 1))

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

//Script For Look My All Gist 
WebUI.click(findTestObject('Page_Discover gists/img_Back to GitHub_avatar'))

WebUI.click(findTestObject('Page_Discover gists/a_Your gists (1)'))

//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Script For Add Gist
WebUI.click(findTestObject('Page_Discover gists/a_Back to GitHub_Header-link'))

//for Input Gist
WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/input_See all of your gists_gi (1)'), findTestData(
        'LoginData').getValue(3, 1) //'nama')
    )

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/div_1 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/div_1sedangtest (1)'), findTestData('LoginData').getValue(
        4, 1))

WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/button_Create public gist (1)'))

//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Select Data Gist For Edit
WebUI.click(findTestObject('Page_Discover gists/img_Back to GitHub_avatar'))

WebUI.click(findTestObject('Page_Discover gists/a_Your gists (1)'))

WebUI.click(findTestObject('Object Repository/Page_thiokimkis gists/a_1 file_1 (1)'))

WebUI.click(findTestObject('Page_qasedangt.md/a_Edit'))

//WebUI.setText(findTestObject('Page_Editing qasedangt.md/input_Delete_gistcontentsname'), 'nasional.md')
WebUI.setText(findTestObject('Page_Editing qasedangt.md/input_Delete_gistcontentsname'), findTestData('LoginData').getValue(
        5, 1))

WebUI.click(findTestObject('Page_Editing qasedangt.md/button_Update public gist'))

//--------------------------------------------------------------------------------------------------------------------------------------------------------
// FOr Delete Gist
WebUI.click(findTestObject('Page_Discover gists/img_Back to GitHub_avatar'))

WebUI.click(findTestObject('Page_Discover gists/a_Your gists (1)'))

WebUI.click(findTestObject('Object Repository/Page_thiokimkis gists/a_1 file_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_EditName Gist/button_Delete'))

WebUI.waitForAlert(2)

WebUI.verifyAlertPresent(2)

WebUI.acceptAlert()

WebUI.delay(2)

//--------------------------------------------------------------------------------------------------------------------------------------------------------
//Action LogOut
WebUI.click(findTestObject('Page_qa-NameGist.md/img_Back to GitHub_avatar'))

WebUI.click(findTestObject('Page_qa-NameGist.md/button_Sign out'))

WebUI.click(findTestObject('Page_Sign out/input_Are you sure you want to'))

WebUI.closeBrowser()

