package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

	@Test(groups="smoke")
	public void method1()
	{
		System.out.println("hi");
	
	}
}
