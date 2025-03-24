package com.example.votingsystem;
import java.persistence.Entity;
import java.persistence.Id;

public class Eleccion {

    private long id;
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private boolean activa;

    public crearEleccion(){
        //Valida datos(titulo, descripcion)
        //Verifica fechas (inicio posterior a creación)
        //Persiste la eleccion
    }

    public activarEleccion(){
        //Verifica si todos los requisitos están listos
        //Cambia estado a activo
        //Notifica si es necesario
    }


    public finalizarEleccion(){
        //Verifica si la fecha fin ha llegado
        //Bloquea nuevos votos
        //Calcula resultados finales

    }

    public obtenerResultados(){
        //Cuenta votos por candidato
        //Calcula porcentajes
        //Estructura datos para visualización

    }
}