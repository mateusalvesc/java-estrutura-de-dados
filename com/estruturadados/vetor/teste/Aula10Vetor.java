package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.VetorObjetos;

public class Aula10Vetor {

  public static void main(String[] args) {
  
    VetorObjetos vetor = new VetorObjetos(3);
    
    Contato c1 = new Contato("Contato 1", "12345-6789", "contato1@email.com");
    Contato c2 = new Contato("Contato 2", "23451-7896", "contato2@email.com");
    Contato c3 = new Contato("Contato 3", "34512-8976", "contato3@email.com");
    
    Contato c4 = new Contato("Contato 1", "12345-6789", "contato1@email.com");
    
    vetor.adiciona(c1);
    vetor.adiciona(c2);
    vetor.adiciona(c3);
    
    System.out.println("Tamanho = " + vetor.tamanho());
    
    int pos = vetor.busca(c4);
    if (pos > -1) {
      System.out.println("Elemento existe no vetor");
    } else {
      System.out.println("Elemento não existe no vetor");
    }
    
    System.out.println(vetor);
  }

}
