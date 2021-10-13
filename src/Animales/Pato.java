package Animales;

public class Pato extends Animal{

    public Pato(String nombre){
        super(nombre, "Pato");
    }

    @Override
    public void hacerRuido(){
        System.out.println("CUAC CUAC");
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Me gusta nadar\n");
    }
}
