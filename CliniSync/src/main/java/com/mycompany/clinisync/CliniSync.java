/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */   

package com.mycompany.clinisync;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asali
 */
public class CliniSync {
    
    // METODO PARA INGRESAR DATOS DESDE EL TECLADO
    public static Scanner Entrada = new Scanner(System.in);
    
    // DEFINIMOS LA ENTRADA POR ARCHIVO TXT "" DEBE INGRESAR RUTA DE DONDE SE UBICA EL ARCHIVO
    public static String file = "";
    
    public static void main(String[] args) 
    {
        // IRA MENU 
    }
    
    
    // EMPIEZAN  METODOS PARA LEER DATOS DEL PROGRAMA
    public void leerDatosPaciente()
    {
        /*ArrayList<Paciente> paciente = new ArrayList<Paciente>();
        try
        {
            BufferedReader archivo = new BufferedReader(new FileReader(file));
            
            int i;
            String linea;
            String campos[] = new String[12];
            while ((linea = archivo.readLine()) != null){
                campos = linea.split(";");
                Date fecha = new SimpleDateFormat("dd/mm/yyyy").parse(campos[3]);
            }
        }
        
      */  
    }
    public void leerDatosDoctor()
    {
    }
    public void leerDatosPlanificador ()
    {
        
    }
    public void leerDatosHistorial ()
    {
        
    }
    
    // EMPIEZAN METODOS PARA MOSTRAR DATOS DEL PROGRAMA EN PANTALLA 
    public void mostrarDatosPaciente ()
    {
        
    }
    public void mostrarDatosDoctor ()
    {
        
    }
    public void mostrarDatosPlanificador ()
    {
        
    }
    public void mostrarDatosHistorial ()
    {
        
    }
}
