package Atividade08;
public class Trem implements MeioTransporte {
    
    @Override
    public void acelerar() {
        System.out.println("Trem acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Trem freando");
    }
}