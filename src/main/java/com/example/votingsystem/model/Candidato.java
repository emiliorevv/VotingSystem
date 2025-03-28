package com.example.votingsystem.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String descripcion;
    private String imagen;

    public Candidato(){

    }

    public Candidato(long id, String nombre, String descripcion, String imagen){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public void SetId(long id){
        this.id = id;
    }

    public long GetId(){
        return this.id;
    }

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public String GetNombre(){
        return this.nombre;
    }

    public void SetDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String GetDescripcion(){
        return this.descripcion;
    }

    public void SetImagen(String imagen){
        this.imagen = imagen;
    }

    public String GetImagen(){
        return this.imagen;
    }


    public void obtenerVotos(){


        //cuenta los votos asociados
        //calcula porcentaje sobre total
        //devuelve estadisticas
    }

}
