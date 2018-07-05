package com.framework.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.framework.test.TestBase;

public class ScreenShot extends TestBase{
	
	
	public void takeScreenShot(String filename) {
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String date = format1.format(cal.getTime());
		String time = new SimpleDateFormat("hh-mm-ss").format(cal.getTime());
	
		File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//ScreenShots//"+date+"//"+time+"_filename"));
	
	}
}
 