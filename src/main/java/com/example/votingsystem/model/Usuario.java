package com.example.votingsystem.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    private long id;
    private String nombre;
    private String password;
    private String email;
    private Role rol;

    public Usuario(){

    }

    public Usuario(long id, String nombre, String password, String email, Role rol){
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
        this.role = rol;
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

    public void SetPassword(String password){
        this.password = password;
    }

    public String GetPassword(){
        return this.password;
    }

    public void SetEmail(String email){
        this.email = email;
    }

    public String GetEmail(){
        return this.email;
    }

    public void SetRole(Role rol){
        this.role = rol;
    }

    public Role GetRol(){
        return this.rol;
    }

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
