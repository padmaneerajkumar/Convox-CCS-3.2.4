package Agent_Module;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Convox.GenericLibraries.BaseClass;
import Convox.ObjectRepository.AgentModule.AgentHomePage;

@Listeners(Convox.GenericLibraries.ListenersImplementationLibrary.class)
public class AgentOperationsTest extends BaseClass {
	
	/**
	 * This Tetst Script is used to make Outbound calls in ConVox CCS 3.2.4 Application
	 * @throws InterruptedException
	 */
	@Test
	public void OutboundCallManual() throws InterruptedException
	{
		AgentHomePage ahp = new AgentHomePage(driver);
		ahp.Outboundcall(driver, "9100187911");
	}
	
	
	/**
	 * This Tetst Script is used to Click Hold and Unhold button in ConVox CCS 3.2.4 Application
	 * @throws InterruptedException
	 */
	@Test
	public void HoldAndUnholdCall() throws InterruptedException
	{
		AgentHomePage ahp = new AgentHomePage(driver);
		ahp.Outboundcall(driver, "9100187911");
		ahp.HoldAndUnholdCall(driver);
	}
	
	/**
	 *This Tetst Script is used to Click Mute and UnMute button in ConVox CCS 3.2.4 Application 
	 * @throws InterruptedException
	 */
	@Test
	public void MuteAndUnMuteCall() throws InterruptedException
	{
		AgentHomePage ahp = new AgentHomePage(driver);
		ahp.Outboundcall(driver, "9100187911");
		ahp.MuteAndUnMuteCall(driver);
	}
	
	/**
	 * This Tetst Script is used to Take the calls in ConVox CCS 3.2.4 Application
	 * @throws Throwable 
	 */
	@Test
	public void ReadyToCall() throws Throwable
	{
		AgentHomePage ahp = new AgentHomePage(driver);
		ahp.ReadyToCall(driver);
	}
	
	/**
	 * This Tetst Script is used to Take Break From the calls in ConVox CCS 3.2.4 Application
	 * @throws InterruptedException 
	 */
	@Test
	public void BreakFromCall() throws InterruptedException
	{
		AgentHomePage ahp = new AgentHomePage(driver);
		ahp.ReadyToCall(driver);
		Thread.sleep(3000);
		ahp.BreakFromCall(driver,"Lunch");
		ahp.StatusOfAgent(driver);
		
	}
	
	/**
	 * This Tetst Script is used to show the status of CRM popup in ConVox CCS 3.2.4 Application
	 * @throws Throwable
	 */
	@Test
	public void CrmPopup() throws Throwable
	{
		AgentHomePage ahp = new AgentHomePage(driver);
		ahp.Outboundcall(driver, "9100187911");
		ahp.CrmPopup(driver);
	}
	
	/**
	 * This Tetst Script is used to Update the  CRM popup and End the call in ConVox CCS 3.2.4 Application
	 * @throws InterruptedException
	 */
	@Test
	public void CrmUpdateAndEndCall() throws InterruptedException
	{
		AgentHomePage ahp = new AgentHomePage(driver);
		ahp.Outboundcall(driver, "9100187911");
		ahp.CrmPopup(driver);
		Thread.sleep(3000);
		ahp.CrmUpdateAndEndCall(driver, "Checking CRM Update", "Dipija telecom ", "Hyderabad", "NI --- Not Interested");
	}
	
	/**
	 * This Tetst Script is used to Wrap up The call in ConVox CCS 3.2.4 Application
	 * @throws Throwable
	 */
	@Test
	public void Wrapupcall() throws Throwable
	{
		AgentHomePage ahp = new AgentHomePage(driver);
		ahp.Outboundcall(driver, "9100187911");
		ahp.CrmPopup(driver);
		Thread.sleep(3000);
		ahp.WrapupCall(driver);
	}
	
}
