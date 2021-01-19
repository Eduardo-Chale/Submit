package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;

public class segundoEjercicio {
    public static void main(String[] args) {
        //Variable donde se almacena el pin
        int numero=0;
        //Se pide el pin al usuario
        numero = pedirDatos();
        //Permite adivinar el pin al usuario
        adivina(numero);
    }
    //Metodo para pedir pin
    public static int pedirDatos(){
        int numero=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingresa Pin de 4 digitos numericos");
        String entrada = sc.nextLine();

        //Se determina si el pin esta formato de 4 digitos numericos
        if(Pattern.matches("\\d{4}",entrada)){
            numero =Integer.parseInt(entrada);
            return numero;
        }else{
            System.out.println("Opcion no valida");
            return(pedirDatos());
        }

    }

    //Metodo para adivinar el pin
    public static void adivina(int numero){
        Scanner sc =new Scanner(System.in);
        System.out.println("Adivina el pin ingresado, esta formado de 4 digitos numericos");
        int entrada = sc.nextInt();
        //Se compara el pin con el numero que ingrese el usuario
        if(numero==entrada){
            System.out.println("Pin correcto");
        }else{
            System.out.println("Pin incorrecto");
            adivina(numero);
        }
    }
}
