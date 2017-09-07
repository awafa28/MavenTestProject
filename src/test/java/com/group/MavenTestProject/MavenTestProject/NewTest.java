package com.group.MavenTestProject.MavenTestProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
  @Test
  public void openurl() {
	  driver.get("prepayqa.swipezoom.com:18443/bpm/");
	  Reporter.log("testng");
	  System.out.println("maven test successful");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
