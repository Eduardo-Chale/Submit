package com.company;

import java.util.ArrayList;
import java.util.List;

public class cuartoEjercicio {

    public static void main(String[] args) {
        //Creacion de variable a comprobar, este es un ejemplo puede ser cualquier tipo de objeto
        List a=new ArrayList();
        //Se ejecuta con el metodo creado
        comprobar(a);
    }
    //Metodo para comprobar que tipo de objeto es
    public static void comprobar(Object objeto){
        //Se comprueba si es de tipo String
        if (objeto instanceof String){
            System.out.println("Eres una palabra");
        }else{
            //Si es una instancia de Number
            if(objeto instanceof Number){
                System.out.println("Eres un numero");
            }else{
                //Si es una instacia de Iterable
                if(objeto instanceof Iterable){
                    System.out.println("Eres una lista");
                }else{
                    //En caso de no ser de los anteriormente mencionados se determinada que es de otro tipo
                    System.out.println("Eres de otro tipo");
                }
            }
        }
    }
}
