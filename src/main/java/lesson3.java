import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.WebDriverListener;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

public class lesson3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); //перед каждым запуском тестов происходит установка драйвера и проверка обновлений браузера
        ChromeOptions options = new ChromeOptions();// задаём опции для браузера
        options.addArguments("--incognito");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// неявное ожидание для прогрузки сайта и формирования DOM структуры. Если объект отрисуется, то сразу сработает действие

        driver.get("https://slovo-shop.ru/index.php?route=account/login");

        WebElement Login = driver.findElement(By.xpath("//div[contains(@class,'form-group')]//input[contains(@id,'input-email')]"));
        WebElement Password = driver.findElement(By.xpath("//div[contains(@class,'form-group')]//input[contains(@id,'input-password')]"));
        WebElement Enter = driver.findElement(By.xpath("//div[contains(@class,'panel-footer')]//a[contains(.,\"Войти\")]"));

        Login.click();
        Login.sendKeys("galem27529@harcity.com");
        Password.click();
        Password.sendKeys("Privet777");
        Enter.click();

    }


}
