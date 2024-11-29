package dev.guadalupe.katavehiclesandtolls;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;




public class KatavehiclesandtollsApplicationTests {
     
    @Test
    public void testRunApplication() throws Exception {
        // Captura la salida del método runApplication() usando SystemLambda
        String output = tapSystemOut(() -> {
            KatavehiclesandtollsApplication.runApplication();
        });

        // Verifica que los mensajes esperados se imprimen
        assertThat(output, containsString("Motorbike - Toll: $50"));
        assertThat(output, containsString("Car - Toll: $100"));
        assertThat(output, containsString("Truck - Toll: $200"));
    }
}
    
    

