package com.example.votingsystem.model;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Resultados {

    @Id
    private long id;
    private int cantidadVotos;

    public Resultados(){

    }

    public Resultados(long id, int cantidadVotos){
        this.id = id;
        this.cantidadVotos = cantidadVotos;
    }

    public void SetId(long id){
        this.id = id;
    }

    public long GetId(){
        return this.id;
    }

    public void SetCantidadVotos(int cantidadVotos){
        this.cantidadVotos = cantidadVotos;
    }

    public int GetCantidadVotos(){
        return this.cantidadVotos;
    }


    public calcularResultados(){
        //Obtiene todos los votos de una eleccion
        //Agrupa por candidato
        //Calcula estadisticas
        //Guarda resultados
    }
}
