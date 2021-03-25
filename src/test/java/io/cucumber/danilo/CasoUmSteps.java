package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CasoUmSteps {

    public CasoUmSteps() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
    }

    public WebDriver browser;

    @Dado("que eu estou no site da gama academy")
    public void siteGamaHome() {
        browser.get("https://www.gama.academy/");
    }

    @Dado("clico para fechar a propaganda")
    public void clico_para_fechar_a_propaganda() throws InterruptedException {
        Thread.sleep(4000);
        browser.findElement(By.cssSelector(".ub-emb-close")).click();
    }

    @Dado("clico na opcao {string}")
    public void clico_na_opcao(String string) {
        WebElement input1 = browser.findElement(By.cssSelector(".nav-menu a"));
        input1.click();

    }

    @Entao("deve ver o item do {string}")
    public void deve_ver_o_item_do(String string) {
        WebElement input = browser.findElement(By.cssSelector(".manifesto h1.heading.lado"));
        assertEquals(string, input.getText());
        browser.quit();
    }

}
