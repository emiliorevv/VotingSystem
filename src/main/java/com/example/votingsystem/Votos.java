package com.example.votingsystem;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Votos{
    @Id
    private long votos;
    private LocalDateTime fechaVoto;


    public registrarVotos(){
        //Verifica que eleccion este activa
        //Comprueba que usuario no haya votado
        //Anonimiza si es necesario
        //Persiste el voto
    }
}