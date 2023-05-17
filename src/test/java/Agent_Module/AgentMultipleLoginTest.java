package Agent_Module;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Convox.GenericLibraries.BaseClass;
import Convox.GenericLibraries.XLUtility;
import Convox.ObjectRepository.AgentModule.AgentLoginPage;

@Listeners(Convox.GenericLibraries.ListenersImplementationLibrary.class)
public class AgentMultipleLoginTest extends BaseClass{
	@Test(dataProvider = "LoginData")
	public void MultipleLoginTest(String username,String password,String station) throws Throwable
	{	
		// Login into Application
		AgentLoginPage alp = new AgentLoginPage(driver);
		alp.LoginToAgentModule(username, password, station);
		
		Reporter.log(username+" - - - Logged Into The Agent Module Succesfully - - - ",true);

	}

	@DataProvider(name = "LoginData")
	public String [][] getMultipleusername() throws Throwable
	{
		//Get The Data From Excel Sheet
		String path=".\\src\\test\\resources\\Agent Login.xlsx";
		XLUtility xlutil=new XLUtility(path);

		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);	

		String loginData[][]=new String[totalrows][totalcols];


		for(int i=1;i<=totalrows;i++) 
		{
			for(int j=0;j<totalcols;j++) 
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}

		}

		return loginData;
	}
}
