package com.serenity.bdd.tasks;

import com.serenity.bdd.interactions.LlenarFormularioCompra;
import com.serenity.bdd.models.FormularioPago;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;

@AllArgsConstructor
public class LlenarFormulario implements Task {

    private final FormularioPago formularioPago;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LlenarFormularioCompra.conModelo(formularioPago));
    }

    public static Performable paraFormulario(FormularioPago formularioPago) {
        return instrumented(LlenarFormulario.class, formularioPago);
    }
}
