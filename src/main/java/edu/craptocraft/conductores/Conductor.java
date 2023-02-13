package edu.craptocraft.conductores;

import java.util.ArrayList;

public class Conductor {
    
    private String nombre = null;
    private String modelo = null;
    private String matricula = null;
    private Double valoracionMedia = 0d;
    private Boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor(){};


    public Conductor(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public Double getValoracion(){
        return this.valoracionMedia;
    }

    public int getNumeroValoraciones(){
        return this.valoraciones.size();
    }

    public void setValoracion(byte valoracion){
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }

    protected Double calcularValoracionMedia(){

        int numValoracions = 0;

        for (byte valoracion : this.valoraciones){
            numValoracions += valoracion;
        }

        this.valoracionMedia = (double) numValoracions / this.valoraciones.size();

        return this.valoracionMedia;
    }

    public void setOcupado(Boolean ocupado){
        this.ocupado = ocupado;
    }

    public Boolean isOcupado(){
        return this.ocupado;

    }

}
