/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinisync;
import java.sql.SQLOutput;
import java.util.Date;

/**
 *
 * @author asali
 */
public class Planificador {
    private Date hora;
    private int disponibilidad; //Si es 0 esta libre, de lo contrario esta ocupado
    private Paciente ficha;
    private String observacion;

    public Planificador(Date hora, int disponibilidad, Paciente ficha, String observacion) {
        this.hora = hora;
        this.disponibilidad = disponibilidad;
        this.ficha = ficha;
        this.observacion = observacion;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Paciente getFicha() {
        return ficha;
    }

    public void setFicha(Paciente ficha) {
        this.ficha = ficha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    //METODOS
    public void mostrarDatosPlanificador ()
    {
        System.out.println("Hora:" + this.hora);
        System.out.println("Disponibilidad:" + this.disponibilidad);
        System.out.println("Ficha:");
        this.ficha.mostrarPaciente();
        System.out.println("Observacion:" + this.observacion);
    }
}
