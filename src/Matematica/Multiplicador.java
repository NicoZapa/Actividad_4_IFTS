package Matematica;

public class Multiplicador extends HacedorDeCuenta{


    public Multiplicador(int n){
        super(n);
    }

    @Override
    public int hacerCuenta(int num_m){
        return num_m * super.n;
    }
}
