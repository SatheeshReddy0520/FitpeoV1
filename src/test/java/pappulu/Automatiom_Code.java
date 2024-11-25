package pappulu;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Automatiom_Code {
	
	WebDriver driver;
	public void CodeTest() throws InterruptedException {
		 
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.fitpeo.com/");
	    driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
		Thread.sleep(2000);
		
	   
		WebElement slider=driver.findElement(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']"));
		
		Thread.sleep(3000);
		
		 int minValue = 0;  
         int maxValue = 1000;  
         int desiredValue = 820;  

         
         int sliderWidth = slider.getSize().getWidth();

       
         int offset = (int) (((double) (desiredValue - minValue) / (maxValue - minValue)) * sliderWidth);

        
         Actions actions = new Actions(driver);
         actions.clickAndHold(slider)
                .moveByOffset(offset, 0)  
                .release()  
                .perform();

         System.out.println("Slider moved to desired value: " + desiredValue);
		
         Thread.sleep(3000);
	    WebElement txt=	driver.findElement(By.xpath("//input[@aria-invalid=\"false\"]"));
	              txt.clear();
	              txt.sendKeys("560");
	              
	              Thread.sleep(3000);   
	              
	              
	          driver.findElement(By.xpath("//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-1sp9p8c']//input[@type='checkbox']")).click();   
	          driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]")).click();
	          driver.findElement(By.xpath("//div[3]//label[1]//span[1]//input[1]")).click();
              driver.findElement(By.xpath("//div[8]//label[1]//span[1]//input[1]")).click();
              
	              
	              

	    	 Thread.sleep(2000);
              
	    WebElement total=driver.findElement(By.xpath("//div[@class='MuiBox-root css-m1khva']//p[text()='$']"));
	    
	    System.out.println(total.getText());
	     
	     driver.quit();
	}
		
		
	}
	
	

