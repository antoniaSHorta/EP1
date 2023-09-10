/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinisync;
import javax.print.Doc;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author asali
 */
public class CliniSync {

    // METODO PARA INGRESAR DATOS DESDE EL TECLADO
    public static Scanner Entrada = new Scanner(System.in);

    // DEFINIMOS LA ENTRADA POR ARCHIVO TXT "" DEBE INGRESAR RUTA DE DONDE SE UBICA EL ARCHIVO
    public static void main(String[] args) throws ParseException {
        int opcion = -1, opcion_leer = 0;
        //leer y mostrar datos
        Opciones operaciones = new Opciones();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Doctor> doctor = new ArrayList<>();
        ArrayList<Planificador> planificador = new ArrayList<>();
        ArrayList<Historial> historial = new ArrayList<>();

        while (opcion != 0) {
            operaciones.Menu();
            opcion = Entrada.nextInt();

            switch (opcion) {
                case 1 -> { //Agreagar datos
                    System.out.println("1. Leer pacientes");
                    System.out.println("2. Leer Doctores");
                    System.out.println("3. Leer Planificados");
                    System.out.println("4. Leer Historial");
                    opcion_leer = Entrada.nextInt();

                    if (opcion_leer == 1) {
                        pacientes = leerDatosPaciente();
                    } else if (opcion_leer == 2) {
                        doctor = leerDatosDoctor();
                    } else if (opcion_leer == 3) {
                        if (pacientes != null) {
                            planificador = leerDatosPlanificador(pacientes);
                        }
                    } else if (opcion_leer == 4) {
                        if (pacientes != null) {
                            historial = leerDatosHistorial(pacientes);
                        }
                    }
                    break;
                }
                case 3 -> {//Imprimir los datos
                    System.out.println("1. Mostrar pacientes");
                    System.out.println("2. Mostrar Doctores");
                    System.out.println("3. Mostrar Planificados");
                    System.out.println("4. Mostrar Historial");
                    opcion_leer = Entrada.nextInt();

                    if (opcion_leer == 1 && pacientes != null) {
                        for (int i = 0; i < pacientes.size(); i++) {
                            pacientes.get(i).mostrarPaciente();
                        }
                    }
                    if (opcion_leer == 2 && doctor != null) {
                        for(int i = 0; i < doctor.size(); i++){
                            doctor.get(i).mostrarDatosDoctor();
                        }
                    }
                    if (opcion_leer == 3 && planificador != null){
                        for(int i = 0; i < planificador.size(); i++){
                            planificador.get(i).mostrarDatosPlanificador();
                            }
                    }
                    if (opcion_leer == 4 && historial != null) {
                        for(int i = 0; i < historial.size(); i++){
                            historial.get(i).mostrarDatosHistorial();
                        }
                    }
                    break;
                }
                case 0-> System.out.println("Saliendo del programa");
                default -> System.out.println("Opcion no disponible");
            }
        }
    }


    // EMPIEZAN  METODOS PARA LEER DATOS DEL PROGRAMA
    public static ArrayList<Paciente> leerDatosPaciente()
    {
        ArrayList<Paciente> paciente = new ArrayList<Paciente>();
        String file = "D:\\WorkSapce\\TrabajoEp1\\CliniSync\\src\\test\\datosPacientes.txt";
        try
        {
            BufferedReader archivo = new BufferedReader(new FileReader(file)); // ARCHIVO TXT
            String linea;
            int i = 0;
            String campos[] = new String[13];
            while ((linea = archivo.readLine()) != null){
                if(i > 0) {
                    campos = linea.split(";");
                    String rut = campos[0];
                    String nombre = campos[1];
                    String apellido = campos[2];
                    Date fecha_nacimiento = new SimpleDateFormat("dd/mm/yyyy").parse(campos[3]);
                    float altura = Float.parseFloat(campos[4]);
                    float peso = Float.parseFloat(campos[5]);
                    String grupo_sanguineo = campos[6];
                    String alergias = campos[7];
                    char genero = campos[8].charAt(0);
                    int telefono = Integer.parseInt(campos[9]);
                    String correo = campos[10];
                    String pre_existencias = campos[11];
                    String observaciones = campos[12];

                    Date fechaNacimiento = new SimpleDateFormat("dd/mm/yyyy").parse(campos[3]);
                    paciente.add(new Paciente(campos[0], campos[1], campos[2], fechaNacimiento,
                            Float.valueOf(campos[4]), Float.valueOf(campos[5]), campos[6], campos[7], campos[8].charAt(0),
                            Integer.valueOf(campos[9]), campos[10], campos[11], campos[12]));
                }
                i ++;
            }
        }
        catch (IOException e){}
        catch(ParseException e){}
        return paciente;
    }
    public static ArrayList<Doctor> leerDatosDoctor()
    {
        ArrayList<Doctor> doctores = new ArrayList<>();
        String file = "D:/WorkSapce/TrabajoEp1/CliniSync/src/test/datosDoctor.txt";
        try{
            BufferedReader archivo = new BufferedReader(new FileReader(file));
            String linea;
            String []campos = new String[9];
            int i = 0;

            while ((linea = archivo.readLine()) != null){
                if (i > 0){
                    campos = linea.split(";");
                    doctores.add(new Doctor(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], campos[6], campos[7], campos[8]));

                }
                i++;
            }

        }catch (IOException e){}

        return doctores;
    }
    public static ArrayList<Planificador> leerDatosPlanificador (ArrayList<Paciente>pacientes) throws ParseException
    {
        ArrayList<Planificador> horario = new ArrayList<>();
        String file = "D:\\WorkSapce\\TrabajoEp1\\CliniSync\\src\\test\\datosPlanificador.txt";
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try{
            BufferedReader archivo = new BufferedReader(new FileReader(file));
            String linea;
            String []campos = new String[9];
            int i = 0;

            while ((linea = archivo.readLine()) != null){
                if (i > 0){
                    campos = linea.split(";");
                    if(buscarPaciente(pacientes, campos[2]) != null) {
                        Date fecha = null;
                        fecha = formatoFecha.parse(campos[0]);
                        horario.add(new Planificador(fecha, Integer.parseInt(campos[1]), buscarPaciente(pacientes, campos[2]), campos[3]));
                    }
                }
                i++;
            }
        }catch (IOException e){}
        return horario;
    }
    public static ArrayList<Historial> leerDatosHistorial (ArrayList<Paciente>pacientes) throws ParseException
    {
        ArrayList<Historial> historial = new ArrayList<>();
        String file = "D:\\WorkSapce\\TrabajoEp1\\CliniSync\\src\\test\\datosHistorial.txt";
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try{
            BufferedReader archivo = new BufferedReader(new FileReader(file));
            String linea;
            String []campos = new String[9];
            int i = 0;

            while ((linea = archivo.readLine()) != null){
                if (i > 0){
                    campos = linea.split(";");
                    if(buscarPaciente(pacientes, campos[0]) != null) {
                        Date fecha = null;
                        fecha = formatoFecha.parse(campos[1]);
                        Paciente sujeto = buscarPaciente(pacientes, campos[0]);
                        historial.add(new Historial(sujeto, fecha, campos[2], campos[3], campos[4]));
                    }
                }
                i++;
            }
        }catch (IOException e){}

        return historial;
    }

    // EMPIEZAN METODOS PARA MOSTRAR DATOS DEL PROGRAMA EN PANTALLA
    public static Paciente buscarPaciente(ArrayList<Paciente>paciente, String Rut)
    {
        for(int i=0; i< paciente.size(); i++)
        {
            if(paciente.get(i).getRut().equals(Rut))
                return paciente.get(i);
        }
        return null;
    }
}