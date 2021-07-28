package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import tasks.CrearReunion;
import userinterfaces.Organizacion;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MeetingValida implements Question<String> {

    //private final String validareunion;

    public MeetingValida()
    {
        //this.validareunion = validareunion;
    }


    @Override
    public String answeredBy(Actor actor)
    {

        return null;
        //return BrowseTheWeb.as(actor).find(Organizacion.ELEMENTO_UNIDAD_NEGOCIO_CREADA).getText();

        /*
        if (Text.of(Organizacion.ELEMENTO_UNIDAD_NEGOCIO_CREADA).viewedBy(actor).asString().equals("Prueba1"))
        {
            return true;
        }
        else
        {
            return false;
        }
        */
    }

    public static MeetingValida validaReunion()
    {
        return new MeetingValida();
    }



}
