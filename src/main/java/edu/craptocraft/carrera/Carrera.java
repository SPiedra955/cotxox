package edu.craptocraft.carrera;

import edu.craptocraft.tarifa.Tarifa;
import edu.craptocraft.conductores.*;

public class Carrera {

    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private Double distancia = 0d;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private Double costeTotal = 0d;
    private int propina = 0;
    
    private Conductor conductor = null;

    public Carrera (String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito(){
        return this.tarjetaCredito;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }
    
    public String getOrigen(){
        return this.origen;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public String getDestino(){
        return this.destino;
    }

    public void setDistancia(Double distancia){
        this.distancia = distancia;
    }

    public Double getDistancia(){
        return this.distancia;
    }

    public Double getCosteEsperado(){
        return Tarifa.getCosteDistancia(this.distancia);
    }

    public int getTiempoEsperado(){
        return tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado){
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera(){
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera){
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setConductor(Conductor conductor){
        this.conductor = conductor;
    }

    public Conductor getConductor(){
        return this.conductor;
    }

    public void  asignarConductor(PoolConductores conductores){

        setConductor(conductores.asignarConductor());

    }

    public void realizarPago(Double pago){
        this.costeTotal = pago;
    }

    public Double getCosteTotal(){
        return this.costeTotal;

    }    

    public void recibirPropina(int propina){
        this.propina = propina;
    }

    public int getPropina(){
        return this.propina;
    }

    public void liberarConductor(){
        getConductor().setOcupado(false);

    }
}

