import java.util.List;
import java.util.ArrayList;

class Retangulo extends FiguraGeometrica2D {
    
    public Retangulo(List<Ponto2D> pontos){
        super(pontos);
    }

     @Override
    public float calcularArea() {
        if (getPontos().size() != 2) {
            throw new IllegalArgumentException("O retângulo deve ter exatamente 2 pontos (diagonal).");
        }
        Ponto2D p1 = getPontos().get(0);
        Ponto2D p2 = getPontos().get(1);

        int largura = Math.abs(p1.getX() - p2.getX());
        int altura = Math.abs(p1.getY() - p2.getY());
        return largura * altura;
    }
}