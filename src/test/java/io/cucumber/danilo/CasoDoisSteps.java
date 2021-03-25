package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.*;

public class CasoDoisSteps {

    public CasoDoisSteps() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
    }

    public WebDriver browser;

    @Dado("que eu estou na pagina de cursos")
    public void paginaCurso() {
        browser.get("https://pages.gama.academy/curso-de-product-management/");
    }

    @Quando("clico no botao {string}")
    public void botaoProximoNivel(String string) {
        browser.findElement(By.cssSelector(".lp-element lp-pom-button")).click();
    }

    @Entao("devo ver o valor e o botao comprar agora")
    public void valorEBotaoComprar() {
        String botao = browser.findElement(By.cssSelector(".hotmart-fb hotmart__button-checkout")).getText();
        String valor = browser.findElement(By.cssSelector(".p lp-element lp-pom-text nlh")).getText();
        // String result = (botao && valor != null) ? result = true;
        assertEquals(true, valor != null);
        assertEquals(true, botao != null);
    }

    @Dado("que eu estou na pagina home")
    public void siteGamaHome() {
        browser.get("https://www.gama.academy/");
    }

    @Quando("clico no botao {string}")
    public void botaoDevFull(String string) {
        browser.findElement(By.cssSelector(".bt-chamada btc-alt w-button")).click();
    }

    @Entao("ver as opcoes")
    public void verOpcoes(io.cucumber.datatable.DataTable dataTable) {

    }
}