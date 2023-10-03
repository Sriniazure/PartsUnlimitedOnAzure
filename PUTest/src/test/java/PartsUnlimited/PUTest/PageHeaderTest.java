package PartsUnlimited.PUTest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.basepage.HomePage;
import com.pom.basepage.LoginPage;

public class PageHeaderTest extends LoginPage {
	@Test
	public void testForHomepage(){
		HomePage HP = new HomePage();
		HP.getpagetitle();
		String PageTitle = driver.getTitle();
		Assert.assertEquals(PageTitle, "Home Page - Testing123 – Parts Unlimited");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//List<WebElement> links = driver.findElements(By.xpath("//div[@class='hidden-xs']/ul/li/a"));
		for (WebElement ele : links){
			System.out.println(ele.getAttribute("href"));
		}
	    
	}
}
