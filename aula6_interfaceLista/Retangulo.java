import java.util.List;


class Retangulo extends FiguraGeometrica2D {
    
    public Retangulo(List<Ponto2D> pontos){
        super(pontos);
    }

     
    @Override
    public float calcularArea() {
        // Verifica se existem exatamente 2 pontos (base e altura)
        if (getPontos().size() != 2) {
            throw new IllegalArgumentException("O retângulo deve ter exatamente 2 pontos.");
        }

        Ponto2D p1 = getPontos().get(0);
        Ponto2D p2 = getPontos().get(1);

        // A base é a diferença entre as coordenadas X
        int base = Math.abs(p1.getX() - p2.getX());
        
        // A altura é a diferença entre as coordenadas Y
        int altura = Math.abs(p1.getY() - p2.getY());

        // Verifica se a base ou altura são zero, o que não formaria um retângulo válido
        if (base == 0 || altura == 0) {
            throw new IllegalArgumentException("A base ou altura não podem ser zero.");
        }

        // Retorna a área do retângulo (base * altura)
        return base * altura;
    }
}
