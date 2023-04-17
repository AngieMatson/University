/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresiones.pila;

import java.util.Scanner;

/**
 *
 * @author Tecnologia&Sistemas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Evaluador evaluar=new Evaluador();
        Scanner sc = new Scanner(System.in);
        System.out.println("digite la expresion a evaluar");
        String infija=sc.next();//para que nos capture el string
        System.out.println("el resultado es"+evaluar.evaluar(infija));
        
    }
    
}
