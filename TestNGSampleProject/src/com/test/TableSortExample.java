package com.test;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSortExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click(); // Click only once if you wish to show elements in descending order.
		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < firstColList.size(); i++) {
			originalList.add(firstColList.get(i).getText());
		}
		ArrayList<String> copiedList = new ArrayList<String>();
		for (int i = 0; i < originalList.size(); i++) {
			copiedList.add(originalList.get(i));
		}
		// string
		Collections.sort(copiedList);
		//==> For checking descending order.
		// Collections.reverse(copiedList); 
		for (String s1 : originalList) {
			System.out.println(s1);
		}
		System.out.println("*******************");
		for (String s2 : copiedList) {
			System.out.println(s2);
		}
		Assert.assertTrue(originalList.equals(copiedList));
	}
}
