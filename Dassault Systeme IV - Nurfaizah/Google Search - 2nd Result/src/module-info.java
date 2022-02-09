package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aizpa\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe"); 
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //launch
        driver.get("http://www.google.com/");
        Thread.sleep(3000);

        //search keys
        driver.findElement(By.id("input")).sendKeys(String.valueOf("Dassault Systeme")).sendKeys(Keys.ENTER);
        // Click on the search input box and send value  
        int myInt = 5;
        driver.findElement(By.id("number")).sendKeys(String.valueOf(myInt));
        WebElement element = driver.findElement(By.id("getFactorial"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.id("resultDiv"));
        int i,fact=1;  
        int number=5;//It is the number to calculate factorial 
        if (number == 0)    
            fact = 1;    
        else    
            for(i=1;i<=number;i++){    
                fact=fact*i;    
            }     
        // Compare the result 
        String expect = "The factorial of " + number + " is: "+ fact;
        if ((result.getText()).equals(expect)) {
        	System.out.println("Pass!");
        	System.out.println((result.getText()).equals(expect));
        }
        else {
        	System.out.println("Failed!");
        	System.out.println((result.getText()).equals(expect));
        }
        	
        driver.quit();   
	}

}