package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com");
		
		String Title =driver.getTitle();
		
		// System.out.println(Title);
		
		if(Title.equals("New Cars in India 2025 | New Car Information | Best New Cars - CarWale"))
		
		{
			
			System.out.println("Test is passed");
			
		}
			
		else
        {
			
			System.out.println("Test is Fail");
			
		}
		
		Thread.sleep(3000);
		
		//boolean suzuki=driver.findElement(By.className("o-D o-hP o-iB o-iT o-G o-Q o-a0 o-aa o-hl o-ed")).isDisplayed();
	
		//boolean suzuki=driver.findElement(By.className("o-D")).isDisplayed();

		boolean suzuki=driver.findElement(By.cssSelector(".o-D.o-hP.o-iB.o-iT.o-G.o-Q.o-a0.o-aa.o-hl.o-ed")).isDisplayed();

		
		Thread.sleep(3000);

		
		System.out.println(suzuki);
		
		driver.close();
		//driver.quit();
		
		
	}

}
