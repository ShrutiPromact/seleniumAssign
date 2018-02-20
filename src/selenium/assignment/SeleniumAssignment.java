/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium.assignment;

import static javafx.beans.binding.Bindings.select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/**
 *
 * @author Shruti
 */
public class SeleniumAssignment {
    
    public static void main(String[] args) throws InterruptedException {
      
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shruti\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        //driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
         
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]/span")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).clear();
         driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).sendKeys("3");
         
       driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
       
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
       
       Select obj1=new Select(driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]")));
       obj1.selectByIndex(1);
       
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
       
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")).click();
       
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")).click();
       
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[5]/input[2]")).clear();
         driver.findElement(By.xpath("//*[@id=\"product_1_1_0_0\"]/td[5]/input[2]")).sendKeys("5");
         
          Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        
         
        
    }
    
}
