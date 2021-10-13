package Animales;

public class Labrador extends Perro{

    public Labrador(String nombre){
        super(nombre);
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Soy rubio y muy amigable");
    }
}
