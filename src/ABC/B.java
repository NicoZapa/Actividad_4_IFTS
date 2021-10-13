package ABC;

public class B extends A{
    private int numero;

    public B(int numero){
        super(numero);
        System.out.println(numero + " estoy construyendo B");
    }

    public void hola(){
        System.out.println("Hola en B");
    }
}
