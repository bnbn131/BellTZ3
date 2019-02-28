package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


//1. Создать класс, который будет инициализировать web driver  и переходить на страницу
public class YandexMarketTestSelenium {

    private WebDriver driver;
   // public static final String MAIN_PAGE_URL = "https://yandex.ru";

    @Before
    public void setUp() throws Exception {
        //2. Открыть браузер Chrome и развернуть на весь экран.
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Start");
    }

    @Test
    public void testYandexMarketComputersNotebook(){
        //3. Зайти на yandex.ru
        driver.get("https://yandex.ru");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //4. Перейти в яндекс маркет
        driver.findElement(By.linkText("Маркет")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //открываем выпадающее окно
        driver.findElement(By.cssSelector(".n-w-tab__control-hamburger")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //5. Выбрать раздел Компьютеры
        driver.findElement(By.linkText("Компьютерная техника")).click();
        //7. Реализуем в нем переходы с применением неявных ожиданий
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //6. Выбрать раздел Ноутбуки
        driver.findElement(By.linkText("Ноутбуки")).click();


    }





}
