package edu.craptocraft.tarifa;

import edu.craptocraft.carrera.Carrera;

public class Tarifa {

    static final Double COSTE_MILLA = 1.35;
    static final Double COSTE_MINUTO = 0.35;
    static final Double COSTE_MINIMO = 5.0;
    static final Byte PORCENTAJE_COMISION = 20;

    public Tarifa(){}

    public static Double getCosteDistancia(Double distancia){
        return distancia * COSTE_MILLA;
    }

    public static Double getCosteTiempo(int tiempo){
        return tiempo * COSTE_MINUTO;
    }

    public static Double getCosteTotalEsperado(Carrera carrera){

        Double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());

        return costeTotal > COSTE_MINIMO ? costeTotal : COSTE_MINIMO;
    }
    
}
