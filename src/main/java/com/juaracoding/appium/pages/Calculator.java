package com.juaracoding.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
	public AndroidDriver<MobileElement> driver;

	public Calculator(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.android.calculator:id/digit_8")
	MobileElement btnDelapan;
	@AndroidFindBy(id = "com.android.calculator:id/digit_2")
	MobileElement btnDua;
	@AndroidFindBy(id = "com.android.calculator:id/eq")
	MobileElement btnSamaDengan;
	@AndroidFindBy(id = "com.android.calculator:id/op_sub")
	MobileElement btnPengurangan;
	@AndroidFindBy(id = "com.android.calculator:id/op_mul")
	MobileElement btnPerkalian;
	@AndroidFindBy(id = "com.google.android.calculator:id/op_div")
	MobileElement btnPembagian;
	@AndroidFindBy(id = "com.google.android.calculator:id/result_final")
	MobileElement hasil;

	public void calcPengurangan() {
		btnDelapan.click();
		System.out.println("Click button angka 8");
		btnPengurangan.click();
		System.out.println("Click button kurang");
		btnDua.click();
		System.out.println("Click button angka 2");
		btnSamaDengan.click();
		System.out.println("Click button sama dengan");
	}
	public void calcPerkalian() {
		btnDua.click();
		System.out.println("Click button angka 2");
		btnPerkalian.click();
		System.out.println("Click button perkalian");
		btnDua.click();
		System.out.println("Click button angka 8");
		btnSamaDengan.click();
		System.out.println("Click button sama dengan");
	}

	public void calcPembagian() {
		btnDelapan.click();
		System.out.println("Click button angka 8");
		btnPembagian.click();
		System.out.println("Click button pembagian");
		btnDua.click();
		System.out.println("Click button angka 2");
		btnSamaDengan.click();
		System.out.println("Click button sama dengan");
	}

	public String getTxtHasil() {
		return hasil.getText();
	}

}
