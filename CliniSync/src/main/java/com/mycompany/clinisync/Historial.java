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
public class Historial {
    private Paciente ficha;
    private Date dia_consulta;
    private String receta_Entregada;
    private String examenes;
    private String obs;

    public Historial(Paciente ficha, Date dia_consulta, String receta_Entregada, String examenes, String obs) {
        this.ficha = ficha;
        this.dia_consulta = dia_consulta;
        this.receta_Entregada = receta_Entregada;
        this.examenes = examenes;
        this.obs = obs;
    }

    public Paciente getFicha() {
        return ficha;
    }

    public void setFicha(Paciente ficha) {
        this.ficha = ficha;
    }

    public Date getDia_consulta() {
        return dia_consulta;
    }

    public void setDia_consulta(Date dia_consulta) {
        this.dia_consulta = dia_consulta;
    }

    public String getReceta_Entregada() {
        return receta_Entregada;
    }

    public void setReceta_Entregada(String receta_Entregada) {
        this.receta_Entregada = receta_Entregada;
    }

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    //
    public void mostrarDatosHistorial ()
    {
        System.out.println("Ficha:");
        this.ficha.mostrarPaciente();
        System.out.println("Dia:" + this.dia_consulta);
        System.out.println("Receta:" + this.receta_Entregada);
        System.out.println("Examenes:" +this.examenes);
        System.out.println("Observaciones:" + this.obs);
    }
}
