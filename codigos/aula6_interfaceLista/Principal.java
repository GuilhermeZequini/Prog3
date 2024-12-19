import java.util.List;
import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
      
        Ponto2D centro = new Ponto2D(5, 5);
        Circuferencia circ = new Circuferencia(centro, 10);
        System.out.println("Area da circunferencia: " + circ.calcularArea());

       
        Ponto2D p1 = new Ponto2D(0, 0);
        Ponto2D p2 = new Ponto2D(10, 5);
        List<Ponto2D> pontosRet = new ArrayList<>();
        pontosRet.add(p1);
        pontosRet.add(p2);

        Retangulo ret = new Retangulo(pontosRet);
        System.out.println("Area do retangulo: " + ret.calcularArea());
    }
}