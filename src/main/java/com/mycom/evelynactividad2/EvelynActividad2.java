/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycom.evelynactividad2;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 *
 * @author EVE-HP
 */
public class EvelynActividad2 {

    public static void main(String[] args) {
        
        ArrayList<Jugador>ListadoJugadores= new ArrayList<Jugador>(); //variable que crea lista de objetos JUGADOR        
        
        //OBJETO PARA LEER POR TECLADO        
        Scanner leeOpcion = new Scanner(System.in); 
        int opcion=0; 
        
        do{
            System.out.println("\nVIDEOJUEGOS...");
            System.out.println("1. Listar Jugadores");
            System.out.println("2. Agregar un Jugador");
            System.out.println("3. Eliminar Jugador");
            System.out.println("4. Buscar Jugador");
            System.out.println("5. SALIR");
            
                System.out.println("INGRESE UNA OPCION: ");
                opcion = leeOpcion.nextInt(); //VARIABLE INGRESADA POR TECLADO
                
                //INGRESA AL MENU LA OPCION SELECCIONADA
                switch (opcion) {
                case 1:                    
                    System.out.println("\nListar Jugadores");   
                    
                    System.out.println("NUM.....CEDULA...............NOMBRES APELLIDOS..............ALIAS.............CONSOLA...");
                    
                    //RECORRE LA LISTA DE JUGADORES INICIANDO DESDE 0 HATSA EL ULTIMO INGRESADO A LA LISTA
                    for(int i=0; i<ListadoJugadores.size();i++){
                        System.out.println(i+"....."+ListadoJugadores.get(i).getCedula()+"..............."+ListadoJugadores.get(i).getNombre()+" "+ListadoJugadores.get(i).getApellido()+".............."+ListadoJugadores.get(i).getAlias()+"............."+ListadoJugadores.get(i).getConsola()+"...");
                        System.out.println();
                    }
                    break;
                case 2:                    
                    System.out.println("\nAgregar un Jugador");
                    
                    Jugador participante = new Jugador(null, null, null, null, null, 0);
                    
                    Scanner variables = new Scanner(System.in);
                    
                    System.out.println("Ingresa Cedula: ");                    
                    String cedula =variables.nextLine();
                    participante.setCedula(cedula);
                    
                    System.out.println("Ingresa Nombres: ");
                    String nombres =variables.nextLine();                    
                    participante.setNombre(nombres);
                    
                    System.out.println("Ingresa Apellidos: ");
                    String apellidos =variables.nextLine();                    
                    participante.setApellido(apellidos);                    
                    
                    System.out.println("Ingresa ALIAS: ");
                    String alias =variables.nextLine();                    
                    participante.setAlias(alias);
                    
                    System.out.println("Ingresa Consola: ");
                    String consola =variables.nextLine();                    
                    participante.setConsola(consola);
                    
                    System.out.println("Ingresa Edad: ");
                    int edad =variables.nextInt();                    
                    participante.setEdad(edad);
                    
                    //INGRESO DE VALORES A LA LISTA            
                    ListadoJugadores.add(participante);
                    
                    break;
                case 3:
                    System.out.println("\nEliminar Jugador");
                    Scanner variablesEl = new Scanner(System.in);
                    System.out.println("Ingresa Numero Jugador: ");
                    int numJugador =variablesEl.nextInt();
                    
                    //ELIMINA EL REGISTRO INGRESADO DEL NUMERO DE LA LISTA
                    ListadoJugadores.remove(numJugador); 
                    
                    System.out.println("JUGADOR NUM: "+numJugador+" ELIMINADO");
                    break;
                case 4:
                    System.out.println("\nBuscar Jugador");
                    Scanner variablesBUS = new Scanner(System.in);
                    
                    System.out.println("Ingresa ALIAS Jugador: ");
                    String aliasJugador =variablesBUS.nextLine();
                    
                    //MANEJO DE EXCEPCIONES PARA CUANDO NO HAY EL JUGADOR O NO ENCUENTRA LO BUSCADO
                    try{
                        //EVENTO PARA ENCONTRAR EL JUGADOR QUE BUSCO POR EL ALIAS
                        Jugador encontrado = ListadoJugadores.stream().filter(buscaParticipante -> buscaParticipante.getAlias().equals(aliasJugador)).findFirst().get();
                        System.out.println("Jugador Encontrado: "+encontrado.getAlias() +" Es De: " + encontrado.getNombre()+" "+encontrado.getApellido());
                    }catch(NoSuchElementException ex){
                        System.out.println("NO SE ENCOENTRO EL JUGADOR");
                    }                
                    break;    
                case 5:
                    System.out.println("\nGRACIAS...");
                    break;     
                default:
                    System.out.println("\n!!!....INGRESE UNA OPCION VALIDA....!!!!");
                    break;  
            }
        
        }while(opcion!=5);
        
    }
}
