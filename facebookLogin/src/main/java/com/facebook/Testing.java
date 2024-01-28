package com.facebook;


	

import org.testng.annotations.Test;

//import facebooklogintest.facebook Datadriven.BaseUI;

	public class Testing extends BaseUI{

	@Test
	public void testOne(){

	invokeBrowser("Chrome");
	openUrl("https://www.facebook.com/");
	elementclick("//input[@id='email' and @name='email']");
	enterText("//input[@id='email' and @name='email']","ramanujulaganesh27@gmail.com");
	elementclick("//input[@id='pass' and @name='pass']");
	enterText("//input[@id='pass' and @name='pass']","ganeshramanujula143@");
	elementclick("//*[@name='login']");
	//enterText("//*[@id=\"login1\"]","Yaswanth09");
	tearDown();
	}

	@Test
	public void testTwo(){
	invokeBrowser("Chrome");
	openUrl("https://www.facebook.com/");
	elementclick("//input[@id='email' and @name='email']");
	enterText("//input[@id='email' and @name='email']","ramanujulaganesh27@gmail.com");
	elementclick("//input[@id='pass' and @name='pass']");
	enterText("//input[@id='pass' and @name='pass']","ganeshramanujula143@");
	elementclick("//*[@name='login']");
	//enterText("//*[@id=\"login1\"]","KATTA YASWANTH");
	tearDown();

	}

	@Test
	public void testThree() {
	invokeBrowser("Chrome");
	openUrl("https://www.facebook.com/");
	elementclick("//input[@id='email' and @name='email']");
	enterText("//input[@id='email' and @name='email']","ramanujulaganesh27@gmail.com");
	elementclick("//input[@id='pass' and @name='pass']");
	enterText("//input[@id='pass' and @name='pass']","ganeshramanujula143@");
	elementclick("//*[@name='login']");
	//enterText("//*[@id=\"login1\"]","Yaswanth");
	tearDown();

	}

	}



