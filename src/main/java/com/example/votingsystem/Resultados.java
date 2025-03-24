package com.example.votingsystem;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Resultados {

    @Id
    private long id;
    private int cantidadVotos;

    public calcularResultados(){
        //Obtiene todos los votos de una eleccion
        //Agrupa por candidato
        //Calcula estadisticas
        //Guarda resultados
    }
}
