package dev.guadalupe.katavehiclesandtolls;

import org.junit.jupiter.api.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.springframework.boot.test.context.SpringBootTest;


public class KatavehiclesandtollsApplicationTests {
     
    @Test
    public void testRunApplication() {
        // Captura la salida del método runApplication()
        SystemOutRule systemOutRule = new SystemOutRule().enableLog();
        
        // Ejecuta el método
        KatavehiclesandtollsApplication.runApplication();

        // Verifica que los mensajes esperados se imprimen
        String output = systemOutRule.getLog();
        assertThat(output, containsString("Motorbike - Toll: $50"));
        assertThat(output, containsString("Car - Toll: $100"));
        assertThat(output, containsString("Truck - Toll: $200"));
    }
    }
    

