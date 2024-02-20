package com.cubos.exercicio_funcoes;

public class Carro {

 private boolean ligado = false;
 private int velocidade = 0;

 public boolean getLigado(){
    return ligado;
 }
 
 public int getVelocidade() {
     return velocidade;
 }
  
  public void ligar(){
    if(this.ligado) {
        System.out.println("O carro já está ligado.");
    }   else{
        this.ligado = true;
        System.out.println("Carro ligado" + ". Velocidade: " + this.getVelocidade());
    }
  }

  public void desligar(){
    if(!this.ligado){
        System.out.println("O carro já está desligado.");
    }else{
        this.ligado = false;
        this.velocidade = 0;
        System.out.println("Carro desligado" + ". Velocidade: " + this.getVelocidade());
    }
  }

  public void acelerar(){
    if(!this.ligado){
        System.out.println("Não é possivel acelerar um carro desligado");
    }else{
        this.velocidade += 10;
        System.out.println("Carro ligado"  + ". Velocidade: " + this.getVelocidade());
    }
  }

  public void desacelerar(){
    if(!this.ligado){
        System.out.println("Não é possivel desacelerar um carro desligado");
    }else{
        this.velocidade -= 10;
        System.out.println("Carro ligado"  + ". Velocidade: " + this.getVelocidade());
    }
  }

}
