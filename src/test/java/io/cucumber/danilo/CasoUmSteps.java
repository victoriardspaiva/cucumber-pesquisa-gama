package io.cucumber.danilo;

import static io.cucumber.danilo.CompartihadoSteps.*;
import static io.cucumber.danilo.config.Config.*;
import io.cucumber.java.pt.*;

public class CasoUmSteps {

    @Dado("que eu estou no site da gama academy")
    public void paginaHome() {
        siteGamaHome();
    }

    @Quando("clico para fechar a propaganda")
    public void propaganda() throws InterruptedException {
        fecharPropaganda();
    }

    @E("clico em {string}")
    public void clico_na_opcao(String string) {
        seletorQueryCss(".nav-menu a").click();
    }

    @Entao("deve ver o item do {string}")
    public void deve_ver_o_item_do(String string) {
        seletorQueryCss(".manifesto h1.heading.lado");
        fechar();
    }

}
