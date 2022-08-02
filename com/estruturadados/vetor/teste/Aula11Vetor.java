package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Lista;
import com.estruturadados.vetor.teste.Contato;

public class Aula11Vetor {

  public static void main(String[] args) {
  
    Lista<Contato> vetor = new Lista<Contato>(1);
    
    Contato c1 = new Contato("Contato 1", "12345-6789", "contato1@email.com");
    
    vetor.adiciona(c1);
    
    System.out.println(vetor);
  }

}
