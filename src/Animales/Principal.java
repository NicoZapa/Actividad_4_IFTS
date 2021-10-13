package Animales;

public class Principal {
    public static void main(String[] args){

        Perro perro_1 = new Perro("Firulais");
        Pato pato_1 = new Pato("Donald");
        Gato gato_1 = new Gato("Garfield");
        Labrador labrador_1 = new Labrador("Marley");

        perro_1.hacerRuido();
        perro_1.describir();

        pato_1.hacerRuido();
        pato_1.describir();

        gato_1.hacerRuido();
        gato_1.describir();

        //--SUBCLASE
        labrador_1.describir();

        //--ARRAY DE ANIMALES
        Animal Firulais = perro_1;
        Animal Donald = pato_1;
        Animal Garfield = gato_1;
        Animal Marley = labrador_1;

        Animal[] arrayAnimales = {Firulais, Donald, Garfield, Marley};

        Animal.escucharTodos(arrayAnimales);
    }
}
