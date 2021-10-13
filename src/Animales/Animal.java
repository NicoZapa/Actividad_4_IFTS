package Animales;

abstract public class Animal {

    private String nombre;
    private String especie;

    public Animal(String nombre, String especie){
        this.nombre = nombre;
        this.especie = especie;
    }

    abstract public void hacerRuido();

    public void describir(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
    }

    public static void escucharTodos(Animal[] animal){
        for(Animal a: animal){
            a.hacerRuido();
        }
    }
}
