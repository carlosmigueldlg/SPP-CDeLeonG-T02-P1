/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdeleong.t02;
import java.util.Scanner;

/**
 *
 * @author CarlosMiguel
 */
public class SPPCDeLeonGT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sue,he,pago;
        Scanner kb = new Scanner(System.in);
        int cate;
        
        System.out.println(" Bienvenido al programa pago de trabajadores");
        System.out.println(" Introduce la categoria del trabajador");
        cate= kb.nextInt();
        
            switch (cate){
                case 1:
                    System.out.println(" Introduzca su sueldo");
                    sue=kb.nextDouble();
                    System.out.println(" Introduzca las horas trabajadas");
                    he=kb.nextDouble();
                    pago= sue+he*30;
                    System.out.println(" Su pago es " + pago + "0 MXN");    
                    break;
                    
                case 2:
                    System.out.println(" Introduzca el sueldo");
                    sue=kb.nextDouble();
                    System.out.println(" Introduzca las horas trabajadas");
                    he=kb.nextDouble();
                    pago= sue+he*38;
                    System.out.println(" Su pago es " + pago + "0 MXN"); 
                    break;
                    
                case 3:
                    System.out.println(" Introduzca el sueldo");
                    sue=kb.nextDouble();
                    System.out.println(" Introduzca las horas trabajadas");
                    he=kb.nextDouble();
                    pago= sue+he*50;
                    System.out.println(" Su pago es " + pago + "0 MXN");
                    break;
                    
                case 4:
                    System.out.println(" Introduzca el sueldo");
                    sue=kb.nextDouble();
                    System.out.println(" Introduzca las horas trabajadas");
                    he=kb.nextDouble();
                    pago= sue+he*70;
                    System.out.println(" Su pago es " + pago + "0 MXN");
                    break;
                    
                    case 5:
                    System.out.println(" Introduzca el sueldo");
                    sue=kb.nextDouble();
                    System.out.println(" Introduzca las horas trabajadas");
                    he=kb.nextDouble();
                    pago= sue+he*80;
                    System.out.println(" Su pago es " + pago + "0 MXN");
                    break;
                    
                    case 6:
                    System.out.println(" Introduzca el sueldo");
                    sue=kb.nextDouble();
                    System.out.println(" Introduzca las horas trabajadas");
                    he=kb.nextDouble();
                    pago= sue+he*90;
                    System.out.println(" Su pago es " + pago + "0 MXN");
                    break;
                    
                    case 7:
                    System.out.println(" Introduzca el sueldo");
                    sue=kb.nextDouble();
                    System.out.println(" Introduzca las horas trabajadas");
                    he=kb.nextDouble();
                    pago= sue+he*100;
                    System.out.println(" Su pago es " + pago + "0 MXN");
                    break;
                    
                    case 8:
                    System.out.println(" Introduzca el sueldo");
                    sue=kb.nextDouble();
                    System.out.println(" Introduzca las horas trabajadas");
                    he=kb.nextDouble();
                    pago= sue+he*110;
                    System.out.println(" Su pago es " + pago + "0 MXN");
                    break;
                    
                default:
                        System.out.println(" Esa categoria no existe, intente del 1 al 8");
            }
    }
    
}
