

import static org.junit.Assert.*;
import com.example.Botanico;
import com.example.CentroBotanico;
import com.example.Cuidado;
import com.example.Planta;

import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CentroBotanicoTest {

    @Test
    public void testAgregarPlanta() {
        CentroBotanico centroBotanico = new CentroBotanico();
        Planta planta = new Planta("Rosa", null);
        centroBotanico.agregarPlanta(planta);
        List<Planta> plantas = centroBotanico.getPlantas();
        assertEquals(1, plantas.size());
    }

    @Test
    public void testAgregarBotanico() {
        CentroBotanico centroBotanico = new CentroBotanico();
        Botanico botanico = new Botanico(123, null, null, null, null);
        centroBotanico.agregarBotanico(botanico);
        List<Botanico> botanicos = centroBotanico.getBotanicos();
        assertEquals(1, botanicos.size());
        assertEquals(botanico, botanicos.get(0));
    }

    @Test
    public void testProgramarCuidado() {
        CentroBotanico centroBotanico = new CentroBotanico();
        Planta planta = new Planta("Orquídea", null);
        Botanico botanico = new Botanico(456, null, null, null, null);
        List<Planta> plantas = Arrays.asList(planta);
        List<Botanico> botanicos = Arrays.asList(botanico);

        centroBotanico.programarCuidado("Jardín", "2023-01-01 10:00", plantas, botanicos);
        List<Cuidado> cuidados = centroBotanico.getCuidados();
        assertEquals(1, cuidados.size());
        
    }

    
}

