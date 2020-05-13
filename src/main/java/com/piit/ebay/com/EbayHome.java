package com.piit.ebay.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome {
	WebDriver driver;
	@FindBy(xpath="//*[span='Home']")
	WebElement home;
	@FindBy(linkText = "Saved")
	WebElement savelink;
	@FindBy(linkText = "Motors")
	WebElement motors;
	@FindBy(xpath = "//*[@id=\"gh-ac\"]")
	WebElement searchbox;
	@FindBy(id="gh-btn")
	WebElement searchbutton;
	public EbayHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
		
	}
	public void Clickonhome() {
		home.click();
	}
	public void Clickonsave() {
		savelink.click();
	}
	public void Clickonmotors() {
		motors.click();
	}
	public void Clickonsearch() {
		searchbox.click();
		searchbox.sendKeys("mac laptop");
		searchbutton.click();
	}
	
	

}
