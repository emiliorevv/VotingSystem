package com.example.votingsystem.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Voto{
    @Id
    private long id;
    private boolean voto;
    private LocalDateTime fechaVoto;

    public Voto(){

    }

    public Voto(long id, boolean voto, LocalDateTime fechaVoto){
        this.id = id;
        this.voto = voto;
        this.fechaVoto = fechaVoto;
    }

    public void SetId(long id){
        this.id = id;
    }

    public long GetId(){
        return this.id;
    }


    public void SetVoto(long voto){
        this.voto = voto;
    }

    public long GetVoto(){
        return this.voto;
    }

    public void SetFechaVoto(LocalDateTime fechaVoto){
        this.fechaVoto = fechaVoto;
    }

    public LocalDateTime GetFechaVoto(){
        return this.fechaVoto;
    }



    public void registrarVoto(boolean voto, LocalDateTime fechaVoto){
        if (voto )
        //Verifica que eleccion este activa
        //Comprueba que usuario no haya votado
        //Anonimiza si es necesario
        //Persiste el voto
    }
}