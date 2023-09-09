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
    public static String file = "src/test/prueba.txt";
    
    public static void main(String[] args) throws ParseException
    {
        // IRA MENU 
    }
    
    
    // EMPIEZAN  METODOS PARA LEER DATOS DEL PROGRAMA
    public void leerDatosPaciente()
    {
        ArrayList<Paciente> paciente = new ArrayList<Paciente>();
        try
        {
            BufferedReader archivo = new BufferedReader(new FileReader(file)); // ARCHIVO TXT
            String linea;
            int i = 0;
            String campos[] = new String[13];
            while ((linea = archivo.readLine()) != null){
                campos = linea.split(";");
                String rut = campos[i];
                String nombre = campos[i+1];
                String apellido = campos[i+2];
                Date fecha_nacimiento = new SimpleDateFormat ("dd/mm/yyyy").parse(campos[i+3]);
                float altura = Float.parseFloat(campos[i+4]);
                float peso = Float.parseFloat(campos[i+5]);
                String grupo_sanguineo = campos[i+6];
                String alergias = campos[i+7];
                char genero = campos[i+8].charAt(0);
                int telefono = Integer.parseInt(campos[i+9]);
                String correo = campos[i+10];
                String pre_existencias = campos[i+11];
                String observaciones = campos[i+12];
                i = i + 12;
                Date fechaNacimiento = new SimpleDateFormat("dd/mm/yyyy").parse(campos[3]);
                paciente.add(new Paciente(campos[0], campos[1], campos[2], fechaNacimiento,
                        Float.valueOf(campos[4]), Float.valueOf(campos[5]), campos[6], campos[7], campos[8].charAt(0),
                        Integer.valueOf(campos[9]), campos[10], campos[11], campos[12]));
            }
        }
        catch (IOException e){}
        catch(ParseException e){}
        for(int i = 0; i<10;i++)
        {
            paciente.get(i).mostrarDatosPaciente();
        }
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
