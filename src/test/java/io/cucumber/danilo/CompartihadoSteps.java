package io.cucumber.danilo;

import static io.cucumber.danilo.config.Config.*;

public class CompartihadoSteps {
    
    public static void siteGamaHome() {
        abrir("https://www.gama.academy/");
    }
    
    public static void fecharPropaganda() throws InterruptedException {
        Thread.sleep(2000);
        seletorQueryCss(".ub-emb-close").click();
    }
}
