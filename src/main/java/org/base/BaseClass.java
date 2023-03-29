package org.base;

import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {

		public static WebDriver driver;
		
	//	public static WebDriver ChromeBrowser() {
	//    WebDriverManager.chromedriver().setup();
	//      driver = new ChromeDriver();
	 //    return driver;
	//	}

	//	public static WebDriver edgeDriver() {
	//		 WebDriverManager.edgedriver().setup();	
	//		   driver = new EdgeDriver();
	//		 return driver;	
	//	}
		
		public static void urlLaunch(String url) {
			driver.get(url);
		}
		
		public static void maximize() {
			driver.manage().window().maximize();		
		}
		 
		public static void implicitlywait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
		}
		
		public static void sendkeys(WebElement e, String data) {
		 e.sendKeys(data);
		}
		
		public static  String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
			
		}
		
		public static void quit() {
			driver.quit();
		}
		
		public static  String getTitle() {
			String title = driver.getTitle();
			return title;
			
		}
		
		public static void click(WebElement e) {
		e.click();
		}
		
		public static  String getText(WebElement e) {
			String text = e.getText();
			return text;
		}
			
			
	    public static String getAttribute(WebElement e) {
	    	String attribute = e.getAttribute("value");
	    	return attribute;
	    }
		
	    public static void moveToElement(WebElement target) {
	    	Actions a = new Actions(driver);
	    }
			
	    public static void dragandDrop(WebElement src,WebElement dest) {
	    	Actions a = new Actions(driver);
	    	a.dragAndDrop(src, dest);
	    }
		
	    public static void contextClick(WebElement e)  {
	       Actions a = new Actions(driver);
	       a.contextClick();
	    }	
		
	    public static void doubleClick(WebElement e)  {
	    	  Actions a = new Actions(driver);
			  a.doubleClick();
	    }
	    
	    public static void selectByIndex(WebElement drpdown, int index)  {
	    	Select s = new Select(drpdown);
	    	s.selectByIndex(index);
	    }
	    
	    public static void selectByValue(WebElement drpdown, String Value)  {
	    	Select s = new Select(drpdown);
	    	s.selectByValue(Value);
	    }
	    
	    public static void selectByVisibleText(WebElement drpdown, String Value)  {
	    	Select s = new Select(drpdown);
	    	s.selectByVisibleText(Value);
	    }
	    
	    public static void isMultiple(WebElement drpdown) {
	    	Select s = new Select(drpdown);
	        s.isMultiple();
	    }
	    
	    public static void getFirstSelectedOption(WebElement drpdown)  {
	    	Select s = new Select(drpdown);
	         s.getFirstSelectedOption();
	    }
	    
	    public static void deselectByIndex(WebElement drpdown, int index)  {
	    	Select s = new Select(drpdown);
	    	s.deselectByIndex(index);
	    }
	    
	    public static void deselectByValue(WebElement drpdown, String Value)  {
	    	Select s = new Select(drpdown);
	    	s.deselectByValue(Value);
	    }
	    
	    public static void deselectByVisibleText(WebElement drpdown, String Value)  {
	    	Select s = new Select(drpdown);
	    	s.deselectByVisibleText(Value);
	    }
	    
	    public static boolean isEnabled(WebElement e) {
	    	return e.isEnabled();
	    }
	    
	    public static boolean isDisplayed(WebElement e) {
	    	return e.isDisplayed();
	    }
	    
	    public static boolean isSelected(WebElement e) {
	    	return e.isSelected();
	    }
	    
	    public static void SwitchToFrameByIndex(int index) {
	    	driver.switchTo().frame(index);
	    }
	    
	    public static void SwitchToFrameByName(String nameValue) {
	    	driver.switchTo().frame(nameValue);
	    } 
	    
	   
	    
	     public static WebDriver browserLaunch(String browsername) {
			switch(browsername)	 {	
			case "chrome" :
		WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
			  break;
				  
		case "edge" :
			 WebDriverManager.edgedriver().setup();
				  driver = new EdgeDriver();
			  break;
			
	     	case "firefox" :
				 WebDriverManager.firefoxdriver().setup();
				  WebDriver driver1 = new FirefoxDriver();
			  break;	  
			}
			
			return driver;
	}

	
	}




