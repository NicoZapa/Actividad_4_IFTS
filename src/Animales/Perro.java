package Animales;

public class Perro extends Animal{

    public Perro(String nombre){
        super(nombre, "Perro");
    }

    @Override
    public void hacerRuido(){
        System.out.println("GUAU GUAU");
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Me gusta ladrarle a las bicicletas\n");
    }
}
