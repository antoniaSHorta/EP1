/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinisync;
import java.util.Date;
    
/**
 *
 * @author asali
 */

// CLASE PACIENTE
public class Paciente {

    // DEFINICION DATOS
    private String rut; //  SIN GUION
    private String Nombre;
    private String Apellido;
    private Date fecha_Nacimiento;
    private Float altura;
    private Float peso;
    private String grupo_Sanguineo;
    private String alergias; // SE SEPARAN POR COMA
    private char genero; // M, F, N, O
    private int telefono; // SIN +56
    private String correo;
    private String pre_Existencias; // SE SEPARAN POR COMA
    private String observaciones;
    
    // CONSTRUCTOR
    public Paciente(String rut, String Nombre, String Apellido, Date fecha_Nacimiento, Float altura, Float peso, String grupo_Sanguineo, String alergias, char genero, int telefono, String correo, String pre_Existencias, String observaciones) {
        this.rut = rut;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.altura = altura;
        this.peso = peso;
        this.grupo_Sanguineo = grupo_Sanguineo;
        this.alergias = alergias;
        this.genero = genero;
        this.telefono = telefono;
        this.correo = correo;
        this.pre_Existencias = pre_Existencias;
        this.observaciones = observaciones;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getGrupo_Sanguineo() {
        return grupo_Sanguineo;
    }

    public void setGrupo_Sanguineo(String grupo_Sanguineo) {
        this.grupo_Sanguineo = grupo_Sanguineo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPre_Existencias() {
        return pre_Existencias;
    }

    public void setPre_Existencias(String pre_Existencias) {
        this.pre_Existencias = pre_Existencias;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void mostrarPaciente(){
        System.out.printf("Rut es: %s\n", this.rut);
        System.out.printf("Nombre: %s %s\n", this.Nombre, this.Apellido);
        System.out.printf("Fecha de Nacimiento: %s\n", this.fecha_Nacimiento.toString());
        System.out.printf("Altura: %.2f\n", this.altura);
        System.out.printf("Peso: %.2f\n", this.peso);
        System.out.printf("Grupo Sanguineo: %s\n", this.grupo_Sanguineo);
        System.out.printf("Alergias: %s\n", this.alergias);
        System.out.printf("Genero: %c\n", this.genero);
        System.out.printf("Telefono: %d\n", this.telefono);
        System.out.printf("Correo: %s\n", this.correo);
        System.out.printf("Pre-Existencias: %s\n", this.pre_Existencias);
        System.out.printf("Observaciones: %s\n", this.observaciones);
        System.out.println();
    }
}


