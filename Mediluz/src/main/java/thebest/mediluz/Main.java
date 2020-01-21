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
        int option = 0;
        actual.setNameUser(lector.nextLine());
        while(true){
            System.out.println("Ingrese opción a tratar");
            System.out.println("1.-Agregar mes");
            System.out.println("2.-Visualizar mes");
            System.out.println("3.-Salir");
            option = lector.nextInt();
            if(option == 4){
                break;
            }
            switch(option){
            
                case 1:
                    actual.agregarMes();
                    break;
                case 2:
                    actual.verMes();
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        }
    }
}
