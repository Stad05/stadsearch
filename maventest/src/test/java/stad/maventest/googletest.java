package stad.maventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
    System.setProperty("webdriver.chrome.driver", "F:\\Batch 11_30 A.M\\Chrome\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    String url = "https://www.google.com";
    driver.get(url);
    
    driver.manage().window().maximize();
    driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
    
   // driver.navigate().back();
   // driver.navigate().forward();
    //driver.quit();
    
   String actualTitle = driver.getTitle();
   
   String expectedTitle = "Rahul Shetty Academy - Login page";
   
   if(actualTitle.equalsIgnoreCase(expectedTitle))
   
   {
       System.out.println("As Expected");
    
    
   }
   
   else
   {
	   
	   System.out.println("Not match");
   }
   
   String actualURL = driver.getCurrentUrl();
   
   String expectedURL = "www.google.com";
   
   if(actualURL.equalsIgnoreCase(expectedURL))
	   
   {
       System.out.println("As Expected");
    
    
   }
   
   else
   {
	   
	   System.out.println("URL Not match");
   }
   
   WebElement forgotpwdLink = driver.findElement(By.linkText("Forgot your password?"));
   
   forgotpwdLink.click();
   
   Thread.sleep(1000);
   
  WebElement name = driver.findElement(By.cssSelector("input[type='text']:nth-child(2)"));
  name.click();
  name.sendKeys("stad");
  
  WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
  
  email.click();
  email.sendKeys("abc@gmail.com");
  
  WebElement phone =driver.findElement(By.xpath("//input[contains(@placeholder,'Phone')]"));
  
  phone.click();
  phone.sendKeys("8765678654");
  
  driver.findElement(By.className("reset-pwd-btn")).click();
  
  WebElement resetText = driver.findElement(By.className("infoMsg"));
  
  String s = resetText.getText();
  
  System.out.println(s);
  
  String text[] = s.split("'");
  
  for(int i=0;i<text.length;i++)
  {
	  if(i==1)
	  {
	  System.out.println(text[i]);
	  }
	  
	  else
		  continue;
  }
  
   driver.findElement(By.cssSelector(".go-to-login-btn")).click();
   
   Thread.sleep(1000);
   WebElement username = driver.findElement(By.id("inputUsername"));
   username.click();
   
   String Username = "stad";
   username.sendKeys(Username);
  
  WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
   
  pwd.click();
  
  for(int i=0;i<text.length;i++)
  {
	  if(i==1)
	  {
	  pwd.sendKeys(text[i]);
	  }
	  
	  else
		  continue;
  }
  
  
  driver.findElement(By.cssSelector(".submit.signInBtn")).submit();
  
  Thread.sleep(1000);
  
  WebElement wctext = driver.findElement(By.cssSelector("div[class='login-container'] h2"));
  
  
  String usertext = wctext.getText();
  
  System.out.println(usertext);
  
  
  int l =usertext.length();
  
  System.out.println(l);
  
 
  int i=usertext.indexOf("stad", 0);
  
  
  System.out.println(i);
  
  String Uname = usertext.substring(i, l-1);
  System.out.println(Uname);
  
  if(Username.equalsIgnoreCase(Uname))
  {
  
	  System.out.println("correct profile name");
  
  }
  
  else
	  System.out.println("incorrect profile name");
  
  driver.findElement(By.className("logout-btn")).click();
 // System.out.println("Display ?"+logoutbtn); 
 
 
 
/*boolean logoutbtn =  driver.findElement(By.className("logout-btn")).isDisplayed();
 System.out.println("Display? :"+logoutbtn);
 
 boolean loguoutbten = driver.findElement(By.className("logout-btn")).isEnabled();
 System.out.println("Enable? :"+loguoutbten);
 
 driver.findElement(By.className("logout-btn")).click();
 */
 
	}
  
}