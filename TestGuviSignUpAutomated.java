import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGuviSignUpAutomated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joesa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.manage().window().maximize();
			
			driver.get("https://www.guvi.in/");
			
			WebElement signUpButton = driver.findElement(By.linkText("Sign up"));
			signUpButton.click();
			
			WebElement nameField = driver.findElement(By.id("name"));
			nameField.sendKeys("Suganthi");
			
			WebElement emailField = driver.findElement(By.id("email"));
			emailField.sendKeys("testguvi0425@gmail.com");
			
			WebElement passwordField = driver.findElement(By.id("password"));
			passwordField.sendKeys("testguvi@0425");
			
			//WebElement confirmPasswordField = driver.findElement(By.cssSelector("confirm-password"));
			//confirmPasswordField.sendKeys("SuSan@0425");
			
			WebElement mobilenumberField = driver.findElement(By.id("mobileNumber"));
			mobilenumberField.sendKeys("9123456789");
			
			WebElement submitsignUpField = driver.findElement(By.cssSelector("//*[@id=\\\"signup-btn\\\"]"));
			submitsignUpField.click();
			
			Thread.sleep(3000);
			String titleAfterSignup = driver.getTitle();
			if(titleAfterSignup.contains("Expected title after signup"))
			{
				System.out.println("Signup Successfully");
			} else {
				System.out.println("Signup failed");
			}
			
			WebElement loginButton = driver.findElement(By.linkText("Login"));
			loginButton.click();
			
			WebElement loginEmail = driver.findElement(By.id("login-email"));
			loginEmail.sendKeys("testguvi0425@gmail.com");
			
			WebElement loginPassword = driver.findElement(By.id("login-password"));
			loginPassword.sendKeys("testguvi@0425");
			
			WebElement submitLoginButton = driver.findElement(By.xpath("//button[@id='Login']"));
			submitLoginButton.click();
			
			Thread.sleep(3000);
			String titleAfterLogin = driver.getTitle();
			if (titleAfterLogin.contains("Expected title after login")) {
				System.out.println("Login Successfully");
				
			} else {
				System.out.println("Login Failed");
			}
			
		}catch (Exception e) {
				e.printStackTrace();
			}finally {
				driver.quit();
			}
		
		}
	} 


