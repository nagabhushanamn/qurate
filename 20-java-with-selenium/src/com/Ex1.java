package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "⁨/usr/local/bin/chromedriver");
		try {

			WebDriver browser = new ChromeDriver();
			browser.get("http://127.0.0.1:51441/");
			browser.manage().window().maximize();

//			String title = browser.getTitle();
//			System.out.println(title);

			Thread.sleep(3000);

			browser.findElement(By.id("inp1")).sendKeys("12");
			browser.findElement(By.id("inp2")).sendKeys("13");
			browser.findElement(By.id("go-btn")).click();

			Thread.sleep(3000);

			String result = browser.findElement(By.id("result")).getText();
			if (result.equals("25")) {
				System.out.println("wow");
			} else {
				System.out.println("oops");
			}

			browser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
