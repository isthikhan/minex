package earning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class minex {

	@Test
	public void Minexlogin() {

		WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver(options);

		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("headless");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://minex.world/login");
		driver.findElement(By.id("InputEmail")).sendKeys("isthikhan@yahoo.com");
		driver.findElement(By.id("InputPass")).sendKeys("Alaba2laba?");

		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/form/button")).click();
		driver.navigate().to("https://minex.world/cabinet");
		
		

		WebElement element1 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div/div/div/nav/div/ul/li[3]/a")));
		element1.click();

		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div[2]/div/div/div[4]/div/button/span")));
		element2.click();

		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a/span")).click();

		driver.close();

	}
}

