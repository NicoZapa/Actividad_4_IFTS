package Matematica;

public class Sumador extends HacedorDeCuenta{

    public Sumador(int numero){
        super(numero);
    }

    @Override
    public int hacerCuenta(int num_s){
        return num_s + super.n;
    }
}
