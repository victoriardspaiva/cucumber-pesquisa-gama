package io.cucumber.danilo;

import static io.cucumber.danilo.CompartihadoSteps.*;
import static io.cucumber.danilo.config.Config.*;
import io.cucumber.java.pt.*;

public class FullStackSteps {

    @Dado("que eu estou na pagina home")
    public void que_eu_estou_na_pagina_home() {
        siteGamaHome();
    }

    @Quando("clico no botao {string}")
    public void fullstack(String string) {
        seletorQueryCss(".bt-chamada btc-alt w-button").click();
    }

    @Entao("ver as opcoes")
    public void verOpcoes(io.cucumber.datatable.DataTable dataTable) {
        seletorQueryCssTodos(".w-dyn-list");
        fechar();
    }

}
