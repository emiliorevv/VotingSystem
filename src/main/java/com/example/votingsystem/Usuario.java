package com.example.votingsystem;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Usuario {
    private long id;
    private String nombre;
    private String password;
    private String email;
    private Role role;



    public registrarse(){
        //valida datos de entrada (mail, contraseña)
        //verifica que el usuario no exista
        //codifica la contraseña
        //persiste el usuario

    }

    public iniciarSesion(){
        //Verifica credenciales
        //Genera token/sesion
        //Registra tiempo de inicio
    }

    public votar(){
        //Verifica elegibilidad(que el usuario no haya elegido antes)
        //Registra voto
        //Confirma operacion
    }
