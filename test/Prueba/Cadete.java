/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;


/**
 *
 * @author jorge
 */
public class Cadete {
     private String nombre;
     private String apellido;
     private String celular;
     private String horario;

    public Cadete() {       
    }

    public Cadete(String nombre, String apellido, String celular, String horario) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.horario = horario;
    }


    public String elCadete () {
        return "Su cadete es "+nombre+" "+ apellido+ " "+ celular + " "+ horario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
