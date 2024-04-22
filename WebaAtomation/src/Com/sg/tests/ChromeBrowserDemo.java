package Com.sg.tests;

import org.openqa.selenium.WebDriver;

public class ChromeBrowserDemo {
public static ChromeBrowserDemo oBrowser=null;
	public static void main(String[] args) {
	launchBrowser();
	navigateURL();
	CloseAppliction();
	}
private static void launchBrowser() {

    try 
    {
    	oBrowser=new ChromeBrowserDemo();
}catch(Exception e)
    {
	e.getStackTrace();
    }
}

private static void navigateURL() {

    try 
    {
    	oBrowser.get("http://localhost/user/submit_tt.do");
}catch(Exception e)
    {
	e.getStackTrace();
    }
}
public static void closeApplication() {
	try {
		oBrowser.quit();
	}catch(Exception e)closeApplication();
}
	e.printStackTrace();

}

