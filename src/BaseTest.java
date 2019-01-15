import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static ChromeDriver dr;
	static int a=7;

//	@Test
//	public void m1() throws InterruptedException {
//		System.out.println("Test Method 1");
//		//Thread.sleep(2000);
//		//dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("Email");
//		//dr.findElement(By.xpath(".//*[@id='u_0_2']")).click();
//		
//	}
	@Test
	public void me() {
		dr.get("https://www.facebook.com/");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		dr.manage().window().maximize();
		dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("heloo");
	}

//	@Before
//	public void m2() {
//		System.out.println("Before Method 2");
//	}
//
//	@After
//	public void m3() {
//		System.out.println("After Method 3");
//	}
	
	 //common stuff will be here. ex: Browser /driver open. Continuous process holay Before class use hobay.
					//example: akta browser er moddey thakayee jhokon 2ee ta test case chalobo browser close na koray thokon Before class use hobay
	
	@BeforeClass 
	public static void m4() {
		System.out.println("BeforeClass Method 4");
		System.out.println(a);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
	}
	
	@AfterClass    //Common for each test will be here .Ex: Browser Close
	public static void m5() throws InterruptedException {
		System.out.println("AfetrClass Method 5");
		//Thread.sleep(5000);
		dr.quit();
		
	}

	@Ignore //ayi test ta run hobay na ignore annotation er jonney
	@Test
	public void m6() {
		System.out.println("Ignore 6");
	}
	
	@Test
	public void m7() {
		System.out.println("Test2 Method 7");
		
	}
}
