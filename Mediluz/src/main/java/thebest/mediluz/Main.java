/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebest.mediluz;

import java.util.*;

/**
 *
 * @author Patricio
 */
public class Main {
    
    public static void main(String[] args) {
        
        int i = 0;
        User actual = new User();
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        actual.setNameUser(lector.nextLine());
        while(true){
            System.out.println("Ingrese opción a tratar");
            System.out.println("1.-Agregar mes");
            System.out.println("2.-Visualizar lista de electrodomesticos");
            System.out.println("3.-Calculo de gasto del mes");
            System.out.println("4.-Salir");
            switch(i){
            
                case 1: 
            }
        }
    }
}
