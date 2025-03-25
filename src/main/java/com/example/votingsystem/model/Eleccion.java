package com.example.votingsystem.model;
import java.persistence.Entity;
import java.persistence.Id;
import java.time.LocalDateTime;
import java.util.Scanner;

@Entity
public class Eleccion {

    @Id
    private long id;
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private boolean activa;

    public Eleccion(){

    }

    public Eleccion(long id, String titulo, String descripcion, LocalDateTime fechaInicio, LocalDateTime fechaFin, boolean activa){
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activa = activa;
    }

    public void SetId(long id){
        this.id = id;
    }

    public long GetId(){
        return this.id;
    }

    public void SetTitulo(String titulo){
        this.titulo = titulo;
    }

    public String GetTitulo(){
        return this.titulo;
    }

    public void SetDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String GetDescripcion(){
        return this.descripcion;
    }

    public void SetFechaInicio(LocalDateTime fechaInicio){
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime GetFechaInicio(){
        return this.fechaInicio;
    }

    public void SetFechaFin(LocalDateTime fechaFin){
        this.fechaFin = fechaFin;
    }

    public LocalDateTime GetFechaFin(){
        return this.fechaFin;
    }

    public void SetActiva(boolean activa){
        this.activa = activa;
    }

    public boolean GetActiva(){
        return this.activa;
    }


    public void crearEleccion(){
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