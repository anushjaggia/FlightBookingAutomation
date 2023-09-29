import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FlightBookingAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  //verify dynamic dropdowns
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  driver.findElement(By.xpath("//a[@value='DEL']")).click();
		  Thread.sleep(1000);
		//  driver.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click();
		  //parent child rel xpath
		  driver.findElement(By.xpath("(//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ'])")).click();
	      driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
	      //verify disabled elements(here return date) 
		//do not change disabled after verifying round trip driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  if ( driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5") )
		  {
	      System.out.println("Return Calendar is disabled");
	      Assert.assertTrue(true);
		  }
		  else
		  {
		      Assert.assertTrue(false);
		  }

			//verify checkboxes
			
			driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		    Assert.assertTrue( driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected() );
			driver.findElement(By.cssSelector(".paxinfo")).click();
			
			
			
			//verify the count of number of checkboxes
			
			
	     System.out.println( driver.findElements(By.xpath("//input[@type='checkbox']")).size() );
	     
	     //verify passengers drop down
	 	 Thread.sleep(2000);
		 int i = 1;
	    	while(i<5)
		   {
		    driver.findElement(By.id("hrefIncAdt")).click();
		     i++;
		   }
		
	 	 driver.findElement(By.id("btnclosepaxoption")).click();
	    	Thread.sleep(2000);
		 Assert.assertEquals(driver.findElement(By.cssSelector(".paxinfo")).getText(),"5 Adult");
	     System.out.println(	driver.findElement(By.cssSelector(".paxinfo")).getText() );
			//verify static dropdown with select tag
			WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Select dropdown = new Select(staticDropdown);
			dropdown.selectByIndex(3);
			System.out.println( dropdown.getFirstSelectedOption().getText() );
			//verify submit search
            driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
            
	       
	}

}
