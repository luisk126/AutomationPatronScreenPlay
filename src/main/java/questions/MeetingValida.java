package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import tasks.CrearReunion;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MeetingValida implements Question {

    private final String validareunion;

    public MeetingValida(String validareunion)
    {
        this.validareunion = validareunion;
    }


    @Override
    public Object answeredBy(Actor actor)
    {
        if (Text.of("").viewedBy(actor).asString().equals(validareunion))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static MeetingValida validaReunion(String validareunion)
    {
        return new MeetingValida(validareunion);
    }



}
