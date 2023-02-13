package edu.craptocraft.conductores;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class PoolConductores {

    private List<Conductor> poolConductores = new ArrayList<Conductor>();


    public PoolConductores(List<Conductor> poolConductores){
        this.poolConductores = poolConductores;
    }
    public List<Conductor> getPoolConductores(){
        return this.poolConductores;
    }

    public Conductor asignarConductor(){

        Conductor conductor = new Conductor();
        boolean asignado = false;
        Random driver = new Random();

        while(!asignado){

            int numRandom = driver.nextInt(getPoolConductores().size());
            conductor = getPoolConductores().get(numRandom);
            
           if(!conductor.isOcupado()){
                asignado = true;
                conductor.setOcupado(true);
           }
        }

        return conductor;
        
    }


}
