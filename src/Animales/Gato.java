package Animales;

public class Gato extends Animal{

    public Gato(String nombre){
        super(nombre, "Gato");
    }

    @Override
    public void hacerRuido() {
        System.out.println("MIAU MIAU");
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Me encanta subirme a los muebles mas altos\n");
    }
}
