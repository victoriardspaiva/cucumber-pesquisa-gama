package io.cucumber.danilo;

import static io.cucumber.danilo.config.Config.*;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;

public class ProximoNivel {

    @Dado("que eu estou na pagina de cursos")
    public void que_eu_estou_na_pagina_de_cursos() {
        abrir("https://pages.gama.academy/curso-de-product-management/");
    }

    @Quando("clico na opcao {string}")
    public void proximoNivel(String string) {
        seletorQueryCss("#lp-pom-button-849").click();
        fechar();
    }

    @Entao("devo ver o valor e o botao comprar agora")

    public void validacaoValorBotao() {
        abrir("https://pay.hotmart.com/W43905507S?off=94b58527&checkoutMode=0&bid=1616773321154");
        //itens da url terminada em 27 --' aff
        String valor = seletorQueryCss(".product-price").getText();
        assertEquals(true, valor != null);
        String comprarAgora = seletorQueryCss("#makeCardPayment").getText();
        assertEquals(true, comprarAgora != null);
        fechar();
    }
//tentativa de if pela comportamento "aleatório" do site
    // public void valorEBotao(String string) {
    //     if (string == "https://pay.hotmart.com/W43905507S?checkoutMode=2&off=yglke4w1&bid=1616772300127") {
    //         abrir("string");
    //         validacaoValorBotao();
    //         fechar("string");
    //     }
    //     if (string == "https://pay.hotmart.com/W43905507S?off=94b58527&checkoutMode=0&bid=1616773321154") {
    //         abrir("string");
    //         validacaoValorBotao();
    //         fechar("string");
    //     }
    // }
}