package com.company;

import java.util.ArrayList;
public class primerEjercicio {
    //Arraylist donde se almacenan Arraylist que estan formados de las secuencias de numeros
    static ArrayList<ArrayList<Integer>> coleccion = new ArrayList<ArrayList<Integer>>();
    static boolean opcion=true;
    public static void main(String[] args) {
        //Se determina la lista de donde se pueden tomar numeros
        int lista[] = {10, 6, 5, 7, 1, 4};
        //Numero que buscamos igualar
        int numero = 15;

        //Se comprueba por medio de un metodo recursivo las combinaciones posibles
        for (int i = 0; i < lista.length; i++) {
            coleccion.add(new ArrayList<Integer>());
            ciclo(lista,numero,i,0,coleccion.size()-1,0);
        }

        //Se muestran los resultados
        imprimir();
    }
    //Metodo para comprobar si hay una combinacion de numeros psibles que igualen el numero dado
    public static void ciclo(int lista[], int numero, int posicion, int suma,int arregloInterno, int añadidos){
        //En caso de llegar al final y no encontrar uno se eleimina la lista que se creo previamente
        if(lista.length>posicion){
            suma=suma+lista[posicion];
            //En caso de ser menor entra al ciclo de nuevo y se compara recursivamente si este numero sumado
            //con otros nos permite llegar al numero buscado, en caso de que no lo haga se elimina este numero
            //y regresa al ciclo saltandose este numero
            if(suma<numero){
                coleccion.get(arregloInterno).add(lista[posicion]);
                ciclo(lista, numero, posicion+1, suma, arregloInterno,1);
                if(opcion==false){
                    opcion=true;
                    suma=suma-lista[posicion];
                    ciclo(lista,numero,posicion+1,suma,arregloInterno,0);
                }
            }else{
                //En caso de ser igual al numero buscado sale del ciclo y se almacena los numeros que lo lograron
                if(suma==numero){
                    coleccion.get(arregloInterno).add(lista[posicion]);
                //En caso de ser mayor se salta el numero que sobrepaso el numero buscado y regresa al ciclo
                }else{
                    suma=suma-lista[posicion];
                    ciclo(lista, numero, posicion+1, suma, arregloInterno,añadidos);
                }
            }
        }else{
            if(añadidos==0){
                //Eliminacion de ArrayList que no logra llegar al numero buscado
                coleccion.remove(arregloInterno);
            }else{
                //Eliminacion de numero en ArrayList para permitir saltarlo
                coleccion.get(arregloInterno).remove(coleccion.get(arregloInterno).size()-1);
                opcion=false;
            }

        }
    }

    //Metodo para imprimir resultado
    public static void imprimir(){

        for (int i = 0; i <coleccion.size(); i++) {
            System.out.print("[");
            for(int j=0;j<coleccion.get(i).size();j++){
                System.out.print(coleccion.get(i).get(j));
                if(j<coleccion.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            if(i<coleccion.size()-1){
                System.out.print("], ");
            }else{
                System.out.print("]");
            }

        }
    }
}