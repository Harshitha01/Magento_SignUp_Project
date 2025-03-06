package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TestUtils {

	public static void takeScreenshot(WebDriver driver, String name) {
	    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	    File directory = new File("screenshots");
	    if (!directory.exists()) {
	        directory.mkdirs();  // Create if missing
	    }

	    File destFile = new File("screenshots/" + name + ".png");

	    try {
	        Files.copy(srcFile.toPath(), destFile.toPath());
	        System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
