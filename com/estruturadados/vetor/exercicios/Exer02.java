package com.estruturadados.vetor.exercicios;

import com.estruturadados.vetor.Lista;
import java.util.ArrayList;

public class Exer02 {

  public static void main(String[] args) {
  
    ArrayList<String> arrayList = new ArrayList<String>(5);
    arrayList.add("X");
    arrayList.add("Y");
    arrayList.add("X");
    
    System.out.println(arrayList.lastIndexOf("X"));
    
    Lista<String> lista = new Lista<String>(5);
    lista.adiciona("X");
    lista.adiciona("Y");
    lista.adiciona("X");
    
    System.out.println(lista.ultimoIndice("X"));
    
  }

}
