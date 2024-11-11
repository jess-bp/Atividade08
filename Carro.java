package Atividade08;

public class Carro implements MeioTransporte {
    
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }   
}