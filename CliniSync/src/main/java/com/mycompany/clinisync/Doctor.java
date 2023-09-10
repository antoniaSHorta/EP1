/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinisync;

import java.util.ArrayList;

/**
 *
 * @author asali
 */
public class Doctor {
    private String nombre;
    private String apellido;
    private String rut;
    private String especialidad;
    private String formacion;
    private String direccion; // CONSULTA
    private String correo;
    private String telefono;
    private String consulta; // DONDE ATIENDE PUEDE SER MAS DE UNA

    ArrayList<Planificador>horario = new ArrayList<>();
    public Doctor(String nombre, String apellido, String rut, String especialidad, String formacion, String direccion, String correo, String telefono, String consulta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.especialidad = especialidad;
        this.formacion = formacion;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.consulta = consulta;
    }

    public String getNombre() {
        return nombre;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String formacion) {
        this.formacion = formacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    //METODODS
    public void mostrarDatosDoctor ()
    {
        System.out.println("Nombre:" + this.nombre);
        System.out.println("Apellido:" + this.apellido);
        System.out.println("Rut:" + this.rut);
        System.out.println("Especialidad:" + this.especialidad);
        System.out.println("Formacion:" + this.formacion);
        System.out.println("Direccion:" + this.direccion);
        System.out.println("Correo:" + this.correo);
        System.out.println("Telefono:" + this.telefono);
        System.out.println("Consulta:" + this.consulta);
        System.out.println();
    }
}
