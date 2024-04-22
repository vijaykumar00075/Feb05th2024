package Com.sg.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge1 {
	public static WebDriver oedge =null;
	public static void main(String[] args) {
	
		launch();
		browse();
		close();
	}
	private static void launch()
	{
		try {
			oedge=new EdgeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void browse()
	{
		try {
			oedge.get("https://www.selenium.dev/");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void close() {
		try {
			oedge.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
