package junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Created by ievgeng on 12/21/2015
 */
public class Test3 {
    @Test
    public void newTest3(){
        WebDriver driver1 = new ChromeDriver();
        driver1.get("http://comments.azurewebsites.net/");

        try {
            driver1.findElement(By.id("applybudashon"));
            System.out.println("Element Found");
        } catch (NoSuchElementException e) {
            System.out.println("Element Not Found");
        }
    }
}
