package edu.craptocraft.carrera;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.craptocraft.conductores.Conductor;
import edu.craptocraft.conductores.PoolConductores;

public class CarreraTest {

    Carrera carrera;

    @Before
    public void ConstructorTest(){

        String [] TarjetasVisa = {
            "4556965301308858",
            "4916222449472054",
            "4716418743686629",
            "4024007134633147",
            "4916909784608918",
            "4556689688534379",
            "4916367928386711",
            "4716148940754702",
            "4532661365014537",
            "4562341446120685",
        };


        for (String TarjetaVisa : TarjetasVisa){
            carrera = new Carrera(TarjetaVisa);
            assertEquals(TarjetaVisa, carrera.getTarjetaCredito());
        }
    }
    
    @Test
    public void setOrigenTest(){
        String origen = "Aeroport Son Sant Joan";
        carrera.setOrigen(origen);
        assertEquals(origen, carrera.getOrigen());
    }

    @Test
    public void setDestinoTest(){
        String destino = "Magaluf";
        carrera.setDestino(destino);
        assertEquals(destino, carrera.getDestino());
    }

    @Test
    public void setDistanciaTest(){
        Double distancia = 7.75;
        carrera.setDistancia(distancia);
        assertEquals(distancia, carrera.getDistancia());
    }

    @Test
    public void setTiempoEsperadoTest(){
        int tiempo = 10;
        carrera.setTiempoEsperado(tiempo);
        assertEquals(tiempo, carrera.getTiempoEsperado());

    }

    @Test
    public void setTiempoCarreraTest(){
        int minutos = 10;
        carrera.setTiempoCarrera(minutos);
        assertEquals(minutos, carrera.getTiempoCarrera());
    }

    @Test
    public void setConductor(){
        String nombre = "Samantha";
        Conductor conductor = new Conductor(nombre);
        carrera.setConductor(conductor);
        assertEquals(nombre, carrera.getConductor().getNombre());
    }

    @Test
    public void asignarConductor(){
        carrera.setConductor(null);
        String nombre = "Samantha";
        Conductor conductor = new Conductor(nombre);
        ArrayList<Conductor> poolConductores = new ArrayList<>();
        poolConductores.add(conductor);
        PoolConductores conductores = new PoolConductores(poolConductores);
        carrera.asignarConductor(conductores);
        assertEquals("Samantha", carrera.getConductor().getNombre());
    }

    @Test
    public void realizarPago(){
        carrera.realizarPago(carrera.getCosteEsperado());
        assertEquals(carrera.getCosteEsperado(), carrera.getCosteTotal());
    }

    @Test
    public void liberarConductorTest(){
        Conductor conductor = new Conductor("Samantha");
        carrera.setConductor(conductor);
        carrera.liberarConductor();
        assert(!carrera.getConductor().isOcupado());

        }
}


    

    

