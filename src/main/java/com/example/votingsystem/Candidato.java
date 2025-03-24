package com.example.votingsystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Candidato {

    private long id;
    private String nombre;
    private String descripcion;
    private String imagen;

    public static void main(String[] args) {
        SpringApplication.run(Candidato.class, args);
    }



    public obtenerVotos(){
        //cuenta los votos asociados
        //calcula porcentaje sobre total
        //devuelve estadisticas
    }

}
