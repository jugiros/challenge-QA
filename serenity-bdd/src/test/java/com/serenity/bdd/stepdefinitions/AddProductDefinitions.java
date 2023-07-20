package com.serenity.bdd.stepdefinitions;

import com.serenity.bdd.tasks.AbreProducto;
import com.serenity.bdd.tasks.AceptaAlerta;
import com.serenity.bdd.tasks.AgregaProducto;
import com.serenity.bdd.tasks.NavegarPaginaWeb;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import static com.serenity.bdd.utils.UrlPaginaWeb.PAGINA_INICIO_SESION;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductDefinitions {

    @Dado("{actor} navega a la ventana para agregar los productos")
    public void usuarioAgregaProductos(Actor actor) {
        actor.wasAbleTo(
                NavegarPaginaWeb.usandoUrl(PAGINA_INICIO_SESION.getUrl()));
        theActorInTheSpotlight().attemptsTo(
                AbreProducto.abreVentanaProducto()
        );
    }
    @Cuando("termina de agregar los productos abre el carrito y llena el formulario")
    public void llenaFormularioCompra() {
        theActorInTheSpotlight().attemptsTo(
                AgregaProducto.agregaProducto()
        );
    }
    @Entonces("finaliza la compra de los productos")
    public void finalizaCompra() {
        theActorInTheSpotlight().attemptsTo(
                AceptaAlerta.aceptaAlerta()
        );
    }
}
