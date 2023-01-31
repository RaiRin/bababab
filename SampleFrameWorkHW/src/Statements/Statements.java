package Statements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statements {

	//ChromeDriver dr = new ChromeDriver();
	WebDriver dr;
	public void single(){
		
		if(dr.findElement(By.xpath("")).isDisplayed()) {
			System.out.println("Passed");
			
		}
		else {
			System.out.println("failed");
		}
		
	}
		
	public void multi() {
		if(dr.getCurrentUrl().equals("www.amazon.com")) {
			
		}
		else if(dr.findElement(By.id("")).isEnabled()) {
			
		}
		else if(dr.findElement(By.xpath("")).isSelected()) {
			
		}
		else if(dr.getTitle().contains("facebook")){
			
		}
		else {
			
		}
	}
	
	
	public void m3() {
		String result=null;
		switch(result) {
		case "PASS" :
			System.out.println("pass");
			break;
		
		case "FAIL" :
			System.out.println("fail");
			break;
		
		case "SKIP" :
			System.out.println("skip");
			break;
		
		}
		
	}
	
	
	
	
	
}
