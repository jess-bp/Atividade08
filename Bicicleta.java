package Atividade08;

public class Bicicleta implements MeioTransporte {

    @Override
    public void acelerar() {
        System.out.println("Bicicleta acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta freando");
    }   
}