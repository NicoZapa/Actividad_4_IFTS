package ABC;

public class C extends B{
    private int numero;

    public C(int numero){
        super(numero);
        System.out.println(numero + " estoy construyendo C");
    }

    @Override
    public void hola(){
        System.out.println("Hola en C");
    }
}
