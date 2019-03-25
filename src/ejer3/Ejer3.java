/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dismaelectric
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    LlenadoLista();
    }
    public static void LlenadoLista(){
        ArrayList lista = new ArrayList();
        Scanner key = new Scanner(System.in);
        boolean flag=true;
       
        while(flag){
            System.out.println("Ingrese numero:");
            int aux=key.nextInt();
            lista.add(aux);
        System.out.println("¿Desea continuar agregando?");
        System.out.println("1.Si, continuar");
        System.out.println("No");
        int aux2=key.nextInt();
        switch(aux2){
            case 1:
                LlenadoLista();
                break;
            case 2:
                System.out.println("Adiós");
            }
        System.out.println(lista);
        }
    public static void Continuar(){
        Scanner key = new Scanner(System.in);
        System.out.println("¿Desea continuar agregando?");
        System.out.println("1.Si, continuar");
        System.out.println("No");
        int aux2=key.nextInt();
        switch(aux2){
            case 1:
                LlenadoLista();
                break;
            case 2:
                System.out.println("Adiós");
                
        }
    }
    }
   
//Arreglar el bucle del While