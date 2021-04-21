/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1if60326;

import java.util.Scanner;
/**
 *
 * @author Jun
 */
public class Actividad1IF60326 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner año = new Scanner (System.in);
    int añopresente = 2021;
    int añoescaneado;
    int añopasado;
    int añofuturo;
    
    System.out.print("Escriba un año aleatorio diferente al año actual");
    añoescaneado = año.nextInt();
    
    if (añopresente > añoescaneado){
    añopasado = añopresente - añoescaneado;
    System.out.print("Han pasado " + añopasado + " años desde el año actual");
    } else {
        añofuturo = añoescaneado - añopresente;
        System.out.print("Faltan " + añofuturo + " años para que sea el año actual");
    } 
  }
}
