package com.serenity.bdd.stepdefinitions;

import com.serenity.bdd.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import static com.serenity.bdd.utils.UrlPaginaWeb.PAGINA_INICIO_SESION;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductDefinitions {

    @Dado("{actor} navega a la ventana para agregar el 1er productos")
    public void usuarioAgregaProducto(Actor actor) {
        actor.wasAbleTo(
                NavegarPaginaWeb.usandoUrl(PAGINA_INICIO_SESION.getUrl()));
        theActorInTheSpotlight().attemptsTo(
                AbreProducto.abreVentanaProducto()
        );
        theActorInTheSpotlight().attemptsTo(
                AgregaProducto.agregaProducto()
        );
    }
    @Cuando("agrega el segundo producto")
    public void usuarioAgregaNuevoProducto() {
        theActorInTheSpotlight().attemptsTo(
            RegresaHome.regresaHome()
        );
        theActorInTheSpotlight().attemptsTo(
                AbreNuevoProducto.abreNuevoProducto()
        );
    }
    @Entonces("abre el carrito y finaliza la compra")
    public void finalizaCompra() {
        theActorInTheSpotlight().attemptsTo(
                AgregaNuevoProducto.agregaProducto()
        );
        theActorInTheSpotlight().attemptsTo(
                AbreCarroCompras.abreCarro()
        );
    }
}
