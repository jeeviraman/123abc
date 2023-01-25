package Juiceshop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import scala.collection.Set;

public class Juiceshop01 {
	
	@Test
	
	public void shop()throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver ", "\"C:\\Users\\HP\\Desktop\\chromedriver_win32\"");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/#/register");
		driver.manage().window().maximize();
		//Login to website and click cookie popup
		
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(5)));
		
		By dismisspopup=By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]");
	    driver.findElement(dismisspopup).click();
	    
	    By cookiepopup=By.xpath("/html/body/div[1]/div/a");
		driver.findElement(cookiepopup).click();
		
		//create Account
		By account=By.id("navbarAccount");
		driver.findElement(account).click();
		Thread.sleep(1000);
		
		By loginbtn=By.id("navbarLoginButton");
		driver.findElement(loginbtn).click();
		Thread.sleep(1000);
		
		By notcustomeryet=By.xpath("//*[@id=\"newCustomerLink\"]/a");
		driver.findElement(notcustomeryet).click();
		//Thread.sleep(1000);
		//login page
		
		By email=By.className("mat-form-field-infix ng-tns-c118-9");
		driver.findElement(email).sendKeys("jessirak123@gmail.com");
		Thread.sleep(1000);
		
		By password=By.className("mat-form-field-flex ng-tns-c118-10");
		driver.findElement(password).sendKeys("stonelake123");
		Thread.sleep(1000);
		
		By repeatpw=By.className("mat-form-field-infix ng-tns-c118-25");
		driver.findElement(repeatpw).sendKeys("stonelake123");
		Thread.sleep(1000);
		
		By securityqn=By.id("mat-select-value-7");
		driver.findElement(securityqn).click();
		Thread.sleep(1000);
		
		
		By secqn1=By.className("mat-option-text");
		driver.findElement(secqn1).click();
		Thread.sleep(1000);
		
		By answer=By.xpath("//*[@id=\"registration-form\"]/div[1]/mat-form-field[2]/div/div[1]/div[3]");
		driver.findElement(answer).sendKeys("triyash");
		Thread.sleep(1000);
		
		By register=By.id("registerButton");
		driver.findElement(register).click();
		Thread.sleep(3000);
		
		By loginbtn2=By.id("loginButton");
		driver.findElement(loginbtn2).click();
		Thread.sleep(3000);
		
		//adding items to the basket
		
		By Appjuiceatb=By.xpath("//*[@id=\"cdk-overlay-8\"]/mat-tooltip-component");
		driver.findElement(Appjuiceatb).click();
		Thread.sleep(1000);
		
		By Banajuiceatb=By.className("mat-button-wrapper");
		driver.findElement(Banajuiceatb).click();
		Thread.sleep(2000);
		
		//scroll the webpage till bottom
		
		WebElement endpage=driver.findElement(By.xpath("//mat-paginator/div/div/div[2]/button[2]/span[1]"));
		Actions action1=new Actions(driver);
		action1.scrollToElement(endpage).perform();
		endpage.click();
		Thread.sleep(2000);
		//ordering item on nextpage
		
		By jshophoodie=By.className("mat-ripple mat-button-ripple");
		driver.findElement(jshophoodie).click();
		
		//going to cart to increase quantity in each items
		
		By yourcart=By.className("mat-button-wrapper");
		driver.findElement(yourcart).click();
		Thread.sleep(1000);
		

		By Banajuiceinc=By.className("svg-inline--fa fa-plus-square fa-w-14");
	    driver.findElement(Banajuiceinc).click();
		Thread.sleep(1000);
		
		By Applejuiceinc=By.className("svg-inline--fa fa-plus-square fa-w-14");
		driver.findElement(Applejuiceinc).click();
		Thread.sleep(1000);
		
		By jshophoodieinc=By.className("svg-inline--fa fa-plus-square fa-w-14");
		driver.findElement(jshophoodieinc).click();
		Thread.sleep(1000);
	
		By checkoutbtn=By.id("checkoutButton");
		driver.findElement(checkoutbtn).click();
		Thread.sleep(1000);
		
		//Adding new address
		By addnewaddress=By.className("mat-button-focus-overlay");
		driver.findElement(addnewaddress).click();
		Thread.sleep(3000);
		
		//Adding country
		By country=By.className("mat-form-field-label-wrapper ng-tns-c118-31");
		driver.findElement(country).sendKeys("India");
		Thread.sleep(3000);
		
		//Add name
		By name=By.id("mat-form-field-label-35");
		driver.findElement(name).sendKeys("Jessica");
		Thread.sleep(3000);
		
		//adding Mobile no
		By mobileno=By.className("mat-form-field-label-wrapper ng-tns-c118-33");
		driver.findElement(mobileno).sendKeys("9879038765");
		Thread.sleep(3000);
		
		//adding zipcode
		By Zipcode=By.className("mat-form-field-label-wrapper ng-tns-c118-34");
		driver.findElement(Zipcode).sendKeys("890765");
		Thread.sleep(3000);
		
		//adding Address
		By addressadd=By.id("address");
		driver.findElement(addressadd).sendKeys("675 stone lake drive");
		Thread.sleep(3000);
		
		//Adding city
		By cityname=By.id("mat-input-18");
		driver.findElement(cityname).sendKeys("colarado");
		Thread.sleep(3000);
		
		//Adding State
		By state=By.id("mat-input-19");
		driver.findElement(state).sendKeys("Denver");
		Thread.sleep(3000);
		
		//click Submit button
		By submitbtn=By.id("submitButton");
		driver.findElement(submitbtn).click();
		Thread.sleep(5000);
		-----------------------------------------------------------------------------
		---------------------------------------------------------------------------------
		By radiobtn = By.id("mat-radio-40");
		driver.findElement(radiobtn).click();
		Thread.sleep(2000);
		
	 // Continue Button
		By Continuebtn = By.xpath("//mat-card/button[@aria-label='Proceed to payment selection']");
		driver.findElement(Continuebtn).click();
		Thread.sleep(2000);
	
	// Delivery options 
		By Deliveryoptions = By.xpath("//mat-cell[1]/mat-radio-button[@id='mat-radio-42']");
		driver.findElement(Deliveryoptions).click();
		Thread.sleep(2000);		
	
	//Continue button on Delivery address 		
		By Deliveryoptionsbtn = By.xpath("//mat-card/div[4]/button[2]/span[1]");
		driver.findElement(Deliveryoptionsbtn).click();
		Thread.sleep(2000);
		
		//Add new card 
		By AddNewCardbtn = By.xpath("//mat-expansion-panel/mat-expansion-panel-header/span[2][@class='mat-expansion-indicator ng-tns-c150-35 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']");
		driver.findElement(AddNewCardbtn).click();
		Thread.sleep(2000);
		
		//enter name for card
		By nameforcard = By.xpath("//mat-form-field[1]/div/div[1]/div[3]/input[@id='mat-input-16']");
		driver.findElement(nameforcard).sendKeys("myname");
		Thread.sleep(2000);
				
		//enter card number 
		By Cardnumberinp = By.xpath("//mat-form-field[2]/div/div[1]/div[3]/input[@id='mat-input-17']");
		driver.findElement(Cardnumberinp).sendKeys("2345698067234029");
		Thread.sleep(2000);	
		
		//Expiry MOnth
		By ExpiryMonth = By.xpath("//mat-form-field[3]/div/div[1]/div[3]/select[@id='mat-input-18']");
		driver.findElement(ExpiryMonth).sendKeys("10");
		Thread.sleep(2000);			

		//Expiry Year
		By ExpiryYear = By.xpath("//mat-form-field[4]/div/div[1]/div[3]/select[@id='mat-input-19']");
		driver.findElement(ExpiryYear).sendKeys("2081");
		Thread.sleep(2000);	
		
		//Submit button 
		By SubmitCardbtn = By.xpath("//app-payment-method/div/div/mat-expansion-panel/div/div/button[@id='submitButton']");
		driver.findElement(SubmitCardbtn).click();
		Thread.sleep(2000);	
		
		//Select the Added Card 
		By SelectAddedCardbtn = By.xpath("//mat-radio-button[@id='mat-radio-44']");
		driver.findElement(SelectAddedCardbtn).click();
		Thread.sleep(2000);
		
		// Add Coupon Details 
		By AddCoupnbtn = By.xpath("//app-payment/mat-card/div/mat-expansion-panel[1]/mat-expansion-panel-header[@id='mat-expansion-panel-header-1']");
		driver.findElement(AddCoupnbtn).click();
		Thread.sleep(2000);
		
		// Add a Coupon NUmber 
		By AddCoupnumberinp = By.xpath("//mat-expansion-panel[1]/div/div/mat-form-field/div/div[1]/div[3]/input[@placeholder='Please enter your coupon code']");
		driver.findElement(AddCoupnumberinp).sendKeys("2345689218");
		Thread.sleep(2000);
	
		//Click on Redeem coupon Button 
		By CoupnRedembtn = By.xpath("//mat-card/div/mat-expansion-panel[1]/div/div/button[@id='applyCouponButton']");
		driver.findElement(CoupnRedembtn).click();
		Thread.sleep(2000);		
		
		//Invalid Coupon Value 
		By InvalidCoupntxt = By.xpath("//div[@class='error ng-star-inserted']");
		Thread.sleep(2000);
		System.out.println(driver.findElement(InvalidCoupntxt).getText());
	
		// Proceed to Review 
		By Proceedtonextbtn = By.xpath("//mat-card//div[2]/button[2][@aria-label='Proceed to review']");
		Thread.sleep(1000);
		driver.findElement(Proceedtonextbtn).click();
		
		// Place your Order and Pay to Review 
		By Placetheorderbtn = By.xpath("//mat-card/button[@id='checkoutButton']");
		Thread.sleep(1000);
		driver.findElement(Placetheorderbtn).click();
		
		//Print Order COnfirmation
		By PrintOrderCOnfirmation = By.xpath("//button[@aria-label='Print order confirmation']");
		Thread.sleep(1000);
		driver.findElement(PrintOrderCOnfirmation).click();
		
		// Navigate to Track Order History
		driver.navigate().to("https://juice-shop.herokuapp.com/#/order-history");
		Thread.sleep(2000);
		
		//Track the Order Items
		By TrackOrderinfo = By.xpath("//button[@aria-label='Track Your Order']");
		Thread.sleep(1000);
		driver.findElement(TrackOrderinfo).click();
		
		//find for all the window and move back to the parent window
		
		String currentwindow = driver.getWindowHandle();
		
		Set<String> handles = driver.getWindowHandles();		
		for(String handle: handles)
		{
			if(handle.equals(currentwindow))
			{
				driver.switchTo().window(handle);
			}			
		}
		
		
		
		//Expected delivery Days
		By Expecteddeliverydays = By.xpath("//span[@class='fa-layers-counter accent-notification']");
		Thread.sleep(1000);
		System.out.println("Expected Delivery Days in :" + driver.findElement(Expecteddeliverydays).getText());	
		
		driver.findElement(Accountbtn).click();
		Thread.sleep(1000);
		
		//Logout Button
		
		By Logoutbtn = By.xpath("//button[4][@aria-label='Logout']");
		Thread.sleep(1000);
		driver.findElement(Logoutbtn).click();
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		


}
}