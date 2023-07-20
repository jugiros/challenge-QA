package com.serenity.bdd.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.serenity.bdd.userinterfaces.PaginaProducto.BUTTON_ADD_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregaNuevoProducto implements Task {

    public static Performable agregaProducto() {
        return instrumented(AgregaNuevoProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
//        try {
//            actor.attemptsTo(Click.on(BUTTON_ADD_PRODUCT).afterWaitingUntilEnabled());
//        } catch (UnhandledAlertException f) {
//            try {
//                Alert alert = Serenity.getDriver().switchTo().alert();
//                String alertText = alert.getText();
//                System.out.println("Alert data: " + alertText);
//                alert.accept();
//            } catch (NoAlertPresentException e) {
//                e.printStackTrace();
//            }
//        }
        actor.attemptsTo(Click.on(BUTTON_ADD_PRODUCT).afterWaitingUntilEnabled());
    }

}
