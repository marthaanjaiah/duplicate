package gettingduplicate;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class duplicate {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumhq.org/download/");
	WebElement s=driver.findElement(By.xpath("//p[6]"));
	String s1=s.getText();
	 String s2=s1.toUpperCase();
	System.out.println(s2);
	char[] c=s2.toCharArray();
    HashMap<Character,Integer> ha=new HashMap<Character,Integer>();

	for(Character c1:c){
		if(ha.containsKey(c1)){
			ha.put(c1, ha.get(c1)+1);
		}
		else
		{
			ha.put(c1, 1);
		}
	}
	System.out.println(ha);
	Set<Character> ha1=ha.keySet();
	for(Character ha2:ha1){
		if(ha.get(ha2)>1){
			System.out.print(ha+"is"+ha.get(ha2)+"times");
		}
			
		}
	driver.quit();
	}
}




