package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula06Vetor {

  public static void main(String[] args) {
  
    Vetor vetor = new Vetor(10);
    
    vetor.adiciona("elemento 1"); //0
    vetor.adiciona("elemento 2"); //1
    vetor.adiciona("elemento 3"); //2
    
    System.out.println(vetor.busca("elemento 1"));
    System.out.println(vetor.busca("elemento 4"));
  }

}
