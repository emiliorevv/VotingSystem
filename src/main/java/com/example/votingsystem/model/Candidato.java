package com.example.votingsystem.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidato {

    @Id
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


    public long obtenerVotos(){

        return "Los votos obtenidos fueron: " + this.votos;

        //cuenta los votos asociados
        //calcula porcentaje sobre total
        //devuelve estadisticas
    }

}
