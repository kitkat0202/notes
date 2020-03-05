package qtx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TheInternet extends TestSuperClass {

  private WebDriver getWebDriver(String url) {
	  driver.navigate().to(url);
	  return driver;
  }

//  // As a user
//  // I want to log in
//  // So users can do stuff
//  @Test
//  public void canLogIn() {
//    getWebDriver("http://the-internet.herokuapp.com/login");
//	  // arrange
//	  String userName = new String("tomsmith");
//	  String password = new String("SuperSecretPassword!");
//	  String expectedGreenBoxText = new String("You logged into a secure area!\n×");
//	  
//	  // act
//	  WebElement userNameTextBox = driver.findElement(By.id("username"));
//	  WebElement passwordTextBox = driver.findElement(By.id("password"));
//	  WebElement submitBox = driver.findElement(By.tagName("button"));
//	  
//	  userNameTextBox.sendKeys(userName);
//	  passwordTextBox.sendKeys(password);
//	  submitBox.click();
//	  
//	  // assert
//	  WebElement greenBox = driver.findElement(By.id("flash"));
//	  String actualGreenBoxText = greenBox.getText();
//	  
//	  Assert.assertEquals(actualGreenBoxText, expectedGreenBoxText, "Can not Log in!");
//	  driver.quit();
//  }
 
  
  
  // As a user
  // I want to select option 2 from a drop down list
  // So that some option is selected
  @Test
  public void canSelectDrobdownListItem() {
	  getWebDriver("http://the-internet.herokuapp.com/dropdown");
	  
	  String expectedSelection = new String("Option 2");
	  
	  Select dropdownList = new Select(driver.findElement(By.id("dropdown")));
	  dropdownList.selectByIndex(2);
	  
	  String actualOption2Text = dropdownList.getFirstSelectedOption().getText();
	  Assert.assertEquals(actualOption2Text, expectedSelection, "Can not select a dropdown list value!");
  }

}
