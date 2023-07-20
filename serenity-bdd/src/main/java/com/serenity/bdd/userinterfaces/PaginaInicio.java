package com.serenity.bdd.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio {

    public static final Target LINK_PRODUCTO_1 = Target.the("Link para abrir el producto 1").locatedBy("//a[contains(text(), 'Samsung galaxy s6')]");
    public static final Target BUTTON_ADD_PRODUCT = Target.the("Botón para aregar el producto").locatedBy("//a[contains(text(), 'Add to cart')]");

    private PaginaInicio() {
    }

}
