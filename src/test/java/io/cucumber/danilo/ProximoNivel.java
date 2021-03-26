package io.cucumber.danilo;

import static io.cucumber.danilo.config.Config.*;
import io.cucumber.java.pt.*;

public class ProximoNivel {

    @Dado("que eu estou na pagina de cursos")
    public void que_eu_estou_na_pagina_de_cursos() {
        abrir("https://pages.gama.academy/curso-de-product-management/");
    }

    @Quando("clico na opcao {string}")
    public void proximoNivel(String string) {
        seletorQueryCss(".lp-element lp-pom-button").click();
    }

    @Entao("devo ver o valor e o botao comprar agora")
    public void valorEBotao(String string) {
        seletorQueryCss("lp-element lp-pom-text nlh span");//valor
        seletorQueryCss(".hotmart-fb hotmart__button-checkout");//botão
        fechar("https://pages.gama.academy/curso-de-product-management/");
    }

}