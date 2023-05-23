package com.saucedemo.www.pages;

import com.saucedemo.www.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends Utility {
 private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

 public LoginPage() {
  PageFactory.initElements(driver, this);
 }

 @CacheLookup
 @FindBy(xpath ="//div[@class='login_logo']")
 WebElement logo;
@CacheLookup
@FindBy(xpath ="//input[@id='user-name']")
 WebElement username;
@CacheLookup
 @FindBy(xpath = "//input[@id='password']")
 WebElement password;
 @CacheLookup
 @FindBy(xpath = "//input[@id ='login-button']")
 WebElement loginButton;
 @CacheLookup
 @FindBy(xpath = "//span[@class='title']")////span[@class='title']
 WebElement productsTitle;
 @CacheLookup
 @FindBy(xpath = "//div[@class='inventory_item']")
 List<WebElement> numberOfProducts;
 @CacheLookup
 @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]")
 WebElement errorMessage;
 public String getActualLogoText(){
  log.info("Getting text from Logo:  "+ logo.getText());
  return getTextFromElement(logo);}
 public String getActualProductlogo(){
  log.info("Getting text from Products title:  "+ productsTitle.getText());
  return getTextFromElement(productsTitle);}
 public void enterUserName(String text){
  log.info("Enter Username :"+text);
  sendTextToElement(username,text); }
 public void enterPassword(String text){
  log.info("Enter Password :"+text);
 sendTextToElement(password,text);}
 public void clickOnLoginButton(){
  log.info("Click on Login Button");
  clickOnElement(loginButton); }
 public int getNumberOfProductsDisplayed(){
  log.info("Get number of products displayed :");
  return getTheNumberOfElementOnTheList( numberOfProducts); }
 public String getActualErrorMessage(){
  log.info("Get error message");
  return errorMessage.getText(); }

}
