import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Automation1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1077257\\Desktop\\msedgedriver.exe");
		EdgeDriver edgeDriver = new EdgeDriver();
		// TODO Auto-generated method stub
		edgeDriver.get("https://www.savaari.com/");

		String halfXpath = "//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div";

		edgeDriver.findElement(By.id("fromCityList")).sendKeys("Bangalore");
		Thread.sleep(1000);
		edgeDriver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
		edgeDriver.findElement(By.xpath(halfXpath + "/form/div[2]/div/input")).sendKeys("Mysore");
		Thread.sleep(1500);
		edgeDriver.findElement(By.xpath(halfXpath + "/form/div[2]/div/input")).sendKeys(Keys.ENTER);
		edgeDriver.findElement(By.id("pickUpTime")).sendKeys(Keys.ENTER);
		edgeDriver.findElement(By.xpath(halfXpath + "/form/div[4]/div/button")).click();

	}

}
