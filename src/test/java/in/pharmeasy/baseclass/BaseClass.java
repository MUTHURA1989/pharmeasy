package in.pharmeasy.baseclass;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions actions;
	public static JavascriptExecutor js;
	public static WebDriverWait waits;
	public static Alert alert;
	
	//WebDriver methods
	public void browserLaunch() {
	 WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   actions=new Actions(driver);
	   waits = new WebDriverWait(driver,Duration.ofSeconds(10));
	   js = (JavascriptExecutor)driver;
	  // alert = driver.switchTo().alert();

	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
}
	
	public void applicationLaunch(String url) {
		driver.get(url);
	}
	public void closeBrowser() {
		driver.quit();
		
	}
	public String currenturl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public String applicationTitle() {
		String title = driver.getTitle();
		return title;
		
	}
	public String page() {
		String pagesource = driver.getPageSource();
		return pagesource;
	}
	public void navigateLaunch(String url) {
		driver.navigate().to(url);
	}
	public void pageForward() {
		driver.navigate().forward();
	}
	public void pageBackward() {
		driver.navigate().back();
	}
	public void pageRefresh() {
		driver.navigate().refresh();
		}
	public String windowHandle() {
		String window =driver.getWindowHandle();
		return window;
	}
	public void childWindow() {
		String parent= driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String ch:child) {
			if(!parent.equals(ch)) {
				driver.switchTo().window(ch);
				
			}
		}
		
	}
	public void switchWindow(String window) {
		driver.switchTo().window(window);
		
	}
	public void pageclose() {
		driver.close();
	}
	//Take Screenshot
	public void screenshot(String output) {
		 TakesScreenshot ts =(TakesScreenshot)driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File target = new File(".//target//"+output+".png");
		 try {
		 FileUtils.copyFile(source, target);}
		 catch (Exception e) {
			e.printStackTrace();
		}
	}
	//WebElement methods
public void sendText(WebElement element, String inputtext) {
		element.sendKeys(inputtext);
	}
public void deleteText(WebElement element) {
	element.clear();
}
public void button(WebElement element) {
	element.click();
}
public void submitButton(WebElement element) {
	element.submit();
}
	
public String retrieveText(WebElement element) {
	String text=element.getText();
	return text;
}
public String retrieveAttribute(WebElement element,String attribute) {
	String attributeText=element.getAttribute(attribute);
	return attributeText;
}

public String tagname(WebElement element) {
	String tagname=element.getTagName();
	return tagname;
}
public String cssValue(WebElement element,String value) {
	String cssvalue=element.getCssValue(value);
	return cssvalue;
}
public boolean selected(WebElement w) {
	boolean selected =w.isSelected();
	return selected;
}
public boolean enable(WebElement w) {
	boolean enabled =w.isEnabled();
	return enabled;
}
public boolean displayed(WebElement w) {
	boolean displayed =w.isDisplayed();
	return displayed;
}
//Action class methods

public void mouseOver(WebElement element) {
	actions.moveToElement(element).build().perform();

}
public void actionButton(WebElement element) {
	actions.click(element).perform();

}
public void actionDouble(WebElement element) {
	actions.doubleClick(element).perform();

}
public void actionContext(WebElement element) {
	actions.contextClick(element).perform();

}
public void actionSendText(WebElement element,String input) {
actions.sendKeys(element,input).perform();;

}
public void actionDragAndDrop(WebElement source, WebElement target) {
	actions.dragAndDrop(source, target).build().perform();
}
public void actionClickAndHold(WebElement element ) {
	actions.clickAndHold(element).perform();
}
//JavaScript Executor
	public void scriptInput(WebElement element,String input) {
		js.executeScript("arguments[0].setAttribute('value','"+input+"')",element );
	}
	public void javaScriptButton (WebElement element) {
		js.executeScript("arguments[0].click())", element);
	}
	public Object retrieveText(WebElement e, String string) {
		Object text=js.executeScript("return arguments[0].getAttribute('"+string+"')", e);
		return text;
	}
	public void scrollUp(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	public void scrollDown(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(false)",element);

}
}

