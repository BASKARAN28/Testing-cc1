package question1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.saucedemo.com/");
		driver.manage().window().maximize() ;
		WebElement username=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		username.sendKeys("standard_user");
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		System.out.println("A-Z:");
		String az=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println(az);
		System.out.println("Z-A:");
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
		String za=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		System.out.println(za);
		System.out.print(" Low to high:");
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		String lohi=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		System.out.println(lohi);
		String pricelohi=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		System.out.println(pricelohi);
		System.out.print(" High to Low:");
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
		String hilo=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		System.out.println(hilo);
		String pricehilo=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		System.out.println(pricehilo);
	}

}