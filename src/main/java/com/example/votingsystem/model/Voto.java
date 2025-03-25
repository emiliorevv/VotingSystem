package com.example.votingsystem.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Voto{
    @Id
    private long voto;
    private LocalDateTime fechaVoto;

    public Voto(){

    }

    public Voto(long voto, LocalDateTime fechaVoto){
        this.voto = voto;
        this.fechaVoto = fechaVoto;
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



    public registrarVoto(){
        //Verifica que eleccion este activa
        //Comprueba que usuario no haya votado
        //Anonimiza si es necesario
        //Persiste el voto
    }
}