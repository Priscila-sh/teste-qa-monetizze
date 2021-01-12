package br.com.monetizze.loja.base;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSelenium {

	private static WebDriver driver = null;
	public static final String CHROME_DRIVER = "src/test/resources/chromedriver.exe";
	public static final boolean HEADLESS = false;
	public static final String LOJA_VINHOS = "http://monetizzetesteqa.s3-website-us-east-1.amazonaws.com/";
	public static final String MSG_AGRADECER = "Obrigado!";

	@BeforeClass
	public static void inicializarSistema() {
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);

		if (HEADLESS) {
			driver = iniciarWebDriverEmModoHeadless();
		} else {

			driver = iniciarWebDriverEmModoDefault();
		}

		driver.manage().window().maximize();
		driver.get(LOJA_VINHOS);

	}

	@AfterClass
	public static void sairSistema() {
		driver.quit();
	}

	private static ChromeDriver iniciarWebDriverEmModoDefault() {
		return new ChromeDriver();
	}

	private static ChromeDriver iniciarWebDriverEmModoHeadless() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		return new ChromeDriver(options);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public void aguardarTela() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
	}

	public void esperarElementoSerClicavel(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void esperarTresSegundos() {
		aguardar(3);
	}

	public void esperarCincoSegundos() {
		aguardar(5);

	}

	public void esperarDezSegundos() {
		aguardar(10);
	}

	public void esperarQuinzeSegundos() {
		aguardar(15);
	}

	private void aguardar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
