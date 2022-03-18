package testcase;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.DriverSetup;

public class Testcaselocator extends DriverSetup {

	String baseUrl="http://test.beacontech.xyz/";
	
	@Test
	public void locatorlearning() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		//log_IN
		driver.findElement(By.id("UserName")).sendKeys("shoeb");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys("floydshoeb$");
		//Thread.sleep(2000);
		
		driver.findElement(By.className("col-xs-4")).click();
		//Thread.sleep(2000); 
		
		
		
		driver.get("http://test.beacontech.xyz/merchandising/order");
		driver.findElement(By.id("iconName")).click();
		Thread.sleep(2000); 
		
		WebElement element = driver.findElement(By.id("ddlBuyer"));
		Select select =new Select(element);
		select.selectByValue("3");


		driver.findElement(By.id("txt4")).sendKeys("PO001");
		driver.findElement(By.id("txt2")).sendKeys("2022-02-14");
		Thread.sleep(2000); 
		driver.findElement(By.id("txt5")).sendKeys("2022");
		driver.findElement(By.id("Commission")).sendKeys("5");
		driver.findElement(By.id("txt6")).sendKeys("Automation");
		Thread.sleep(5000); 
		
		// located element with contains()
		//driver.findElement(By.xpath("//*[contains(text(),'ADD')]"));
		
		WebElement elementadd = driver.findElement(By.id("btnsave"));
		elementadd.submit();
		
//		driver.findElement(By.id("btnsave")).click(); 
//		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[type='button']")).click()
		//driver.findElement(By.className("button[@class='col-lg-12']"));
		//driver.findElement(By.id("//button[@id='btnsave']")).click(); 
		//driver.findElement(By.xpath("//div[@class='col-lg-12']//button[@id='btnsave']")).click();
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.querySelector('...').click();");
		
//		System.out.println("ok");
		
		
		//driver.findElement(By.xpath("(//a[starts-with(@href,'/Merchandising/OrderView/')])[594]")).click();
		
		driver.findElement(By.xpath("(//a[starts-with(@href,'/Merchandising/OrderView/')])[1]")).click();
		
		//driver.get ("http://test.beacontech.xyz/Merchandising/OrderView/594");
		//Thread.sleep(2000); 
		
		driver.findElement(By.id("iconName")).click();
		
		
		driver.findElement(By.xpath("//input[@id='vmStyle_Style']")).sendKeys("Men's Pyjama");
		
		
		driver.findElement(By.xpath("//input[@id='vmStyle_Reference']")).sendKeys("PO002");
		Thread.sleep(2000);
		
		
		//Finish Category★ 
		WebElement FinishCategory = driver.findElement(By.id("Mkt_CategoryFK"));
		Select up  =new Select(FinishCategory);
		up.selectByIndex(1);
		Thread.sleep(2000);
		
		//Finish Sub-Category★ select2-Mkt_SubCategoryFK-container Mkt_SubCategoryFK
		WebElement subCategory = driver.findElement(By.id("Mkt_SubCategoryFK"));
		Select sub  =new Select(subCategory);
		sub.selectByValue("41");

		Thread.sleep(2000);
		
		//Finish Item★ 
		WebElement Finishitem = driver.findElement(By.id("Mkt_ItemFK"));
		Select item  =new Select(Finishitem);
		item.selectByIndex(1);
		Thread.sleep(2000);
		
		//Fabrication  
		
		driver.findElement(By.xpath("//input[@id='vmStyle_Fabrication']")).sendKeys("100% cotton");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@id='vmStyle_SizeIDs']")).click();
//		
//		Thread.sleep(2000);
		
		WebElement sizes = driver.findElement(By.id("vmStyle_SizeIDs"));
		Select size  =new Select(sizes);
		size.selectByValue("1");
		size.selectByValue("2");
		Thread.sleep(2000);
		
		
		WebElement color = driver.findElement(By.id("drColorFK"));
		Select colour  =new Select(color);
		colour.selectByValue("1");
		colour.selectByValue("2");
		Thread.sleep(2000);
		
		
		// Create WebElement
		//WebElement eleClear = driver.findElement(By.id("vmStyle_PackQty")); 
		// Perform clear operation
		//eleClear.clear();
		// OR
		// Clear particular WebElement e.g: Textbox.
		driver.findElement(By.id("vmStyle_PackQty")).clear();
		//driver.findElement(By.id("vmStyle_PackQty")).clear();
		
		driver.findElement(By.xpath("//input[@id='vmStyle_PackQty']")).sendKeys("70000");
		
		driver.findElement(By.id("vmStyle_PackPieceQty")).clear();
		driver.findElement(By.xpath("//input[@id='vmStyle_PackPieceQty']")).sendKeys("2");
		
//		WebElement packprice = driver.findElement(By.id("vmStyle_PackPrice")); 
//		// Perform clear operation
//		packprice.clear();
//		// OR
//		// Clear particular WebElement e.g: Textbox.
		driver.findElement(By.id("vmStyle_PackPrice")).clear();
		driver.findElement(By.xpath("//input[@id='vmStyle_PackPrice']")).sendKeys("7");
		
		driver.findElement(By.id("vmStyle_SetQuantity")).clear();
		driver.findElement(By.xpath("//input[@id='vmStyle_SetQuantity']")).sendKeys("2");
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnsave")).click();
		
//		driver.findElement(By.xpath("(//a[starts-with(@href,''/Merchandising/CreateForm/')])[1]")).click();
//		//href='/Merchandising/CreateForm/'
		
		
		//http://test.beacontech.xyz/Merchandising/StyleView/664
		driver.get("http://test.beacontech.xyz/Merchandising/StyleView/729");
		Thread.sleep(2000);
		
		//BOM_Fabric ItemFK_2
		WebElement ItemFK_2 = driver.findElement(By.id("ItemFK_2"));
		Select BOM_Fabric  =new Select(ItemFK_2);
		BOM_Fabric.selectByValue("6904");
		BOM_Fabric.selectByValue("6905");
		Thread.sleep(2000);
		
		//BOM_Fabric_color_Common_ColorFK
		WebElement Fabric_colour = driver.findElement(By.id("Common_ColorFK"));
		Select BOM_Fabric_c  =new Select(Fabric_colour);
		BOM_Fabric_c.selectByValue("1");
		
		
		//driver.findElement(By.id("vmBOM.GSM")).clear();
		driver.findElement(By.xpath("//input[@name='vmBOM.GSM']")).sendKeys("160");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("txt5")).sendKeys("500");
		
		//driver.findElement(By.id("vmBOM.Consumption")).clear();
		WebElement consumption=driver.findElement(By.name("vmBOM.Consumption"));
        consumption.sendKeys("500");
        
        //driver.findElement(By.id("vmBOM.ConRequiredQty")).clear();
        WebElement required_quantity=driver.findElement(By.name("vmBOM.ConRequiredQty"));
        required_quantity.sendKeys("5");
        
		WebElement tolerence=driver.findElement(By.name("vmBOM.Tolerance"));
        tolerence.sendKeys("0.1");
     
        //driver.findElement(By.id("vmBOM.UnitPrice")).clear();
        WebElement UnitPrice=driver.findElement(By.name("vmBOM.UnitPrice"));
        UnitPrice.sendKeys("10");
        Thread.sleep(2000);
        
        driver.findElement(By.id("btnsave")).click();
        
        //driver.get("href=/Merchandising/OrderView/608");
        //driver.get("http://test.beacontech.xyz/YarnCalculation/729");
        
        
        //driver.navigate().back();
        driver.get("http://test.beacontech.xyz/Merchandising/OrderView/608");
        
  
        driver.get("http://test.beacontech.xyz/Merchandising/YarnCalculation/735");
        Thread.sleep(9000);
//        WebElement ItemFK_2 = driver.findElement(By.id("ItemFK_2"));
//		Select BOM_Fabric  =new Select(ItemFK_2);
//		BOM_Fabric.selectByValue("6904");
//        Thread.sleep(9000);
        
        
        

        
        
//      driver.navigate().to("http://test.beacontech.xyz/YarnCalculation/729");
//      Thread.sleep(9000);
//      driver.get("http://test.beacontech.xyz/YarnCalculation/729");
//		Thread.sleep(6000);
//		
	
	}
}
		
        
//       
//        WebElement sewing = driver.findElement(By.id("ItemFK_6"));
//		Select lab  =new Select(sewing);
//		lab.selectByValue("14");
//		Thread.sleep(2000);
//		
//		//href="/Merchandising"
//		
////		WebElement sewing_colour = driver.findElement(By.name("//select[@name='vmBOM.Common_ColorFK'])[2]"));
////		Select sewing_value  =new Select(sewing_colour);
////		sewing_value .selectByValue("1");
////		Thread.sleep(5000);
//		
//		
//		WebElement Fabric_colour_sewing = driver.findElement(By.id("//select[@name='Common_ColorFK'])[2]"));
//		Select BOM_color_sewing  =new Select(Fabric_colour_sewing);
//		BOM_color_sewing.selectByValue("1");
//		Thread.sleep(5000);
//		
//		WebElement consumpti=driver.findElement(By.name("vmBOM.Consumption"));
//        consumpti.sendKeys("500");
//        Thread.sleep(5000);
//        
//        WebElement required_quanti=driver.findElement(By.name("vmBOM.ConRequiredQty"));
//        required_quanti.sendKeys("5");
//        
//        driver.findElement(By.xpath("(//input[@name='vmBOM.Tolerance'])[2]")).sendKeys("19");
//     
//        WebElement UnitPr=driver.findElement(By.name("vmBOM.UnitPrice"));
//        UnitPr.sendKeys("10");
//        Thread.sleep(2000);
//        
//        driver.findElement(By.id("btnsave")).click();
//        Thread.sleep(4000);
        
        
        
//		
//		//driver.findElement(By.cssSelector("p.error")).getText(); 
////		formula : tagname.value(if class is given)
////		formula : tagname #value (if id is given)
//		
//		
//		//link_test
//		driver.findElement(By.linkText("forgotyourpass")).click();
//		Thread.sleep(2000); 
//		
//		//xpath
//		driver.findElement(By.xpath("//input[@placeholder='name']")).sendKeys("papep");
//		// 	relative xpath //tagname[@attribute='value']
//		
//		driver.findElement(By.cssSelector("input[placeholder='email']")).sendKeys("@gmail.com");
//		driver.findElement(By.xpath("//input[@placeholder='phone number']")).sendKeys("016729999");
//		
//		Thread.sleep(2000); 
//		
//		//driver.findElement(By.cssSelector(".tag.name"));
//		
//		driver.findElement(By.cssSelector("reset")).click();
//		driver.findElement(By.xpath("//div[@class='forgorpass']/button[1]")).click();
//		
//		driver.findElement(By.cssSelector("#inputusername")).sendKeys("shoeb");
//		driver.findElement(By.cssSelector("#input[type*='pss']")).sendKeys("shoeb");
//		
//		
//		//for_checkbox
//		driver.findElement(By.id("checkbox")).click();
//		
//		//if only chose one word
//		driver.findElement(By.xpath("//button[contains(@class,'submit')])")).click();
		//driver.findElement(By.xpath("//input[@id='vmStyle_Reference']")).sendKeys("PO002");
		
		
		

		

		
		
		
	

	


 