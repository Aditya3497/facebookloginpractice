package com.facebook;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class BaseUI {

	public WebDriver driver;
	public void invokeBrowser(String browserName)

	{


	if(browserName.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91777\\eclipse-workspace\\facebookLogin\\chromedriver.exe");
	driver = new ChromeDriver();
	} else if (browserName.equalsIgnoreCase("Mozilla")) {
	System.setProperty("webdriver.gecko.driver","");
	driver = new FirefoxDriver(); }
	}

	public void openUrl(String websiteURL) {
	driver.get(websiteURL);
	}

	public void tearDown() {
	driver.close();
	}

	public void quitBrowser() {
	driver.quit();
	}

	 public void enterText(String xpath, String data) {

	driver.findElement(By.xpath(xpath)).sendKeys(data);

	}
	    public void elementclick(String xpath) {
	    driver.findElement(By.xpath(xpath)).click();
	    }
	}



