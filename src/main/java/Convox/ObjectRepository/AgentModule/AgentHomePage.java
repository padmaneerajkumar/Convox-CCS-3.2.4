package Convox.ObjectRepository.AgentModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Convox.GenericLibraries.WebDriverLibrary;

/**
 * This class consists of the all the Elements which are present in the Home Page of 
 * ConVox CCS 3.2.4 Application
 * @author Kiran
 *
 */
public class AgentHomePage{
	
	WebDriverLibrary wLib = new WebDriverLibrary();
	
	// Declaration
	@FindBy(xpath = "//img[@src='../images/exit.png']")
	private WebElement ExitBtn;
	
	@FindBy(xpath = "//img[@id='OUTBOUND']")
	private  WebElement OutboundBtn;
	
	@FindBy (xpath = "//input[@id='dial_phone_number']")
	private WebElement PhoneNumTxtField;
	
	@FindBy (xpath = "//strong[normalize-space()='CALL']")
	private WebElement CallBtn;
	
	@FindBy(xpath = "//button[@id='hold']")
	private WebElement HoldAndUnholdBtn;
	
	@FindBy(xpath = "//button[@id='mute']")
	private WebElement MuteAndUnMuteBtn;

	@FindBy(xpath = "//button[@id='PAUSE']")
	private WebElement BreakDropDown;

	@FindBy (xpath = "//a[normalize-space()='Lunch']")
	private WebElement LunchBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Tea']")
	private WebElement TeaBtn;
	
	@FindBy (xpath = "//th[@id='status_row']//center")
	private WebElement StatusCenter;
	
	@FindBy (xpath = "//input[@id='READY']")
	private WebElement ReadyBtn;
	
	@FindBy (xpath = "//li[@class='active']//a[1]")
	private WebElement CrmModule;
	
	@FindBy (xpath = "//textarea[@id='comments']")
	private WebElement CommentsTxtField;
	
	@FindBy (xpath = "//input[@id='crm_field_1']")
	private WebElement CompanyNameTxtField;
	
	@FindBy (xpath = "//select[@id='crm_field_2']")
	private WebElement CompanyLoctaionDropDown;
	
	@FindBy (xpath = "//select[@id='disp']")
	private WebElement DispositionsDropDowm;
	
	@FindBy (xpath = "//select[@id='set_followUps']")
	private WebElement SetFollowupDropDown;
	
	@FindBy (xpath = "//select[@id='break']")
	private WebElement BreakDD;
	
	@FindBy (xpath = "//select[@id='transfer']")
	private WebElement TransferDropDown;
	
	@FindBy (xpath = "//input[@value='EndCall']")
	private WebElement EndCallBtn;
	
	// Initialization
	public AgentHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	// Utilization
	
	public WebElement getExitBtn() {
		return ExitBtn;
	}
	
	public WebElement getOutboundBtn() {
		return OutboundBtn;
	}

	public WebElement getPhoneNumTxtField() {
		return PhoneNumTxtField;
	}

	public WebElement getCallBtn() {
		return CallBtn;
	}
	
	public WebElement getHoldAndUnholdBtn() {
		return HoldAndUnholdBtn;
	}

	public WebElement getMuteAndUnMuteBtn() {
		return MuteAndUnMuteBtn;
	}
	
	public WebElement getBreakDropDown() {
		return BreakDropDown;
	}

	public WebElement getLunchBtn() {
		return LunchBtn;
	}

	public WebElement getTeaBtn() {
		return TeaBtn;
	}

	public WebElement getStatusCenter() {
		return StatusCenter;
	}

	public WebElement getReadyBtn() {
		return ReadyBtn;
	}
	
	public WebElement getCrmModule() {
		return CrmModule;
	}

	public WebElement getCommentsTxtField() {
		return CommentsTxtField;
	}

	public WebElement getCompanyNameTxtField() {
		return CompanyNameTxtField;
	}

	public WebElement getCompanyLoctaionDropDown() {
		return CompanyLoctaionDropDown;
	}

	public WebElement getDispositionsDropDowm() {
		return DispositionsDropDowm;
	}

	public WebElement getSetFollowupDropDown() {
		return SetFollowupDropDown;
	}

	public WebElement getBreak() {
		return BreakDD;
	}

	public WebElement getTransferDropDown() {
		return TransferDropDown;
	}

	public WebElement getEndCallBtn() {
		return EndCallBtn;
	}
	
// Business Library Logics

	

	/**
	 * This Method is used to logout from Agent Module in ConVox CCS 3.2.4 Application
	 * @param driver
	 */
	public void LogoutFromAgentModule(WebDriver driver)
	{
		wLib.switchToFrame(driver, "agentframe");
		ExitBtn.click();
		Reporter.log("Clicked on Logout Button Succesfully",true);
		wLib.switchToDefaultFrame(driver);
	}
	
	/**
	 * This Method is used to do Manual Outbound Call in ConVox CCS 3.2.4 Application
	 * @param driver
	 * @param number
	 * @throws InterruptedException 
	 */
	public void Outboundcall(WebDriver driver,String number) throws InterruptedException
	{
		wLib.switchToFrame(driver, "agentframe");
		OutboundBtn.click();
		Reporter.log("Clicked on Outbound button Succesfully",true);
		wLib.switchToDefaultFrame(driver);
		wLib.switchToFrame(driver, "agentframe");
		PhoneNumTxtField.sendKeys(number);
		Reporter.log("Data entered in PhoneNumber Textfield Succesfully",true);
		wLib.switchToDefaultFrame(driver);
		Thread.sleep(5000);
		wLib.switchToFrame(driver, "agentframe");
		CallBtn.click();
		Reporter.log("Clicked on call Button Succesfully",true);
		wLib.switchToDefaultFrame(driver);
		Thread.sleep(5000);
	}
	
	/**
	 * This Method is used to Hold and Unhold the Call in ConVas CCS 3.2.4 Application
	 * @param driver
	 */
	public void HoldAndUnholdCall(WebDriver driver)
	{
		wLib.switchToFrame(driver, "agentframe");
		HoldAndUnholdBtn.click();
		Reporter.log("Successfully Clicked on the Hold Button",true);
		wLib.waitForPageLoad(driver);
		HoldAndUnholdBtn.click();
		Reporter.log("Successfully Clicked on the UnHold Button",true);
		wLib.switchToDefaultFrame(driver);
		
	}
	
	/**
	 * This Method is used to Hold and Unhold the Call in ConVas CCS 3.2.4 Application
	 * @param driver
	 */
	public void MuteAndUnMuteCall(WebDriver driver)
	{
		wLib.switchToFrame(driver, "agentframe");
		MuteAndUnMuteBtn.click();
		Reporter.log("Successfully Clicked on the Mute Button",true);
		wLib.waitForPageLoad(driver);
		MuteAndUnMuteBtn.click();
		Reporter.log("Successfully Clicked on the UnMute Button",true);
		wLib.switchToDefaultFrame(driver);
		
	}
	
	/**
	 * This Method is used to Take the Call in ConVas CCS 3.2.4 Application
	 * @param driver
	 */
	public void ReadyToCall(WebDriver driver)
	{
		wLib.switchToFrame(driver, "agentframe");
		ReadyBtn.click();
		Reporter.log("Successfully Clicked on the Ready Button",true);
		wLib.switchToDefaultFrame(driver);
	}
	
	/**
	 * This Method is used to Take Break from the call in ConVas CCS 3.2.4 Application
	 * @param driver
	 * @throws InterruptedException 
	 */
	public void BreakFromCall(WebDriver driver,String Break) 
	{
		wLib.switchToFrame(driver, "agentframe");
		BreakDropDown.click();
		Reporter.log("Successfully Clicked on the Break Button",true);
		if(Break.equalsIgnoreCase("Lunch"))
		{
			LunchBtn.click();
			Reporter.log("Successfully Selected Lunch Option",true);
		}
		else
		{
			TeaBtn.click();
			Reporter.log("Successfully Selected Tea Option",true);
		}
		wLib.switchToDefaultFrame(driver);
		
	}

	/**
	 * This Method is used to Tell the Status of Agent in ConVas CCS 3.2.4 Application
	 */
	public void StatusOfAgent(WebDriver driver)
	{
		wLib.switchToFrame(driver, "agentframe");
	    String status = StatusCenter.getText();
	    System.out.println(status);
		if (status.contains("BREAK"))
		{
			System.out.println("--- Agent was in  Break Status ---");
		}
		
		else if(status.equals("IDLE"))
		{
			System.out.println("--- Agent is in Ready status to take calls");
		}
		else
		{
			System.out.println("Invalid Status of Agent");
		}
		wLib.switchToDefaultFrame(driver);
	}
	
	/**
	 * This method is used to tell about the CRM Popup of Agent Module in ConVax CCS 3.2.4 Application
	 */
	public void CrmPopup(WebDriver driver)
	{
		wLib.switchToFrame(driver, "mainframe");
		String crm = CrmModule.getText();
		System.out.println(crm+"Poppedup Succefully");
		wLib.switchToDefaultFrame(driver);
	}
	
	
	/**
	 * This method is used to Update the CRM Popup of Agent Module in ConVax CCS 3.2.4 Application
	 * @param driver
	 * @param comments
	 * @param companyName,
	 * @param text
	 */
	public void CrmUpdateAndEndCall(WebDriver driver,String comments,String companyName,String companyLocation,String Disposition)
	{
		wLib.switchToDefaultFrame(driver);
		Reporter.log("Successfully Switched to Default Frame");
		wLib.switchToFrame(driver, "mainframe");
		Reporter.log("Successfully Switched to Main Frame");
		wLib.switchToFrame(driver, "ecrmframe");
		Reporter.log("Successfully Switched to CRM Frame");
		CommentsTxtField.clear();
		CommentsTxtField.sendKeys(comments);
		CompanyNameTxtField.clear();
		CompanyNameTxtField.sendKeys(companyName);
		wLib.handleDropDown(companyLocation, CompanyLoctaionDropDown);
		wLib.handleDropDown(Disposition, DispositionsDropDowm);
		EndCallBtn.click();
		Reporter.log("Primary Number Call Ended Succesfully",true);
		wLib.switchToDefaultFrame(driver); 
		Reporter.log("Data of primary Number Recorded Succesfully in CRM",true);
	}
	
	/**
	 * This method is used to End the Call in CRM Popup of Agent Module in ConVax CCS 3.2.4 Application
	 * @param driver
	 */
	public void EndCall(WebDriver driver)
	{
		wLib.switchToDefaultFrame(driver);
		wLib.switchToFrame(driver, "mainframe");
		wLib.switchToFrame(driver, "ecrmframe");
		EndCallBtn.click();
		wLib.switchToDefaultFrame(driver);
		Reporter.log("Primary Number Call Ended Succesfully",true);
	}
	
	/**
	 * This method is used to Wrapup the Call of Agent Module in ConVax CCS 3.2.4 Application
	 * @param driver
	 */
	public void WrapupCall(WebDriver driver)
	{
		wLib.switchToFrame(driver, "agentframe");
		String callStatus = StatusCenter.getText();
		if(callStatus.contains("WRAPUP"))
		{
		  Reporter.log("Customer Wrapup the Call",true);
		}else {
			Reporter.log("Customer Talking with the Agent",true);
		}
		wLib.switchToDefaultFrame(driver);
	}

}
