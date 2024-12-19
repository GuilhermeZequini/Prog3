import java.util.List;
import java.util.ArrayList;

class Circuferencia extends FiguraGeometrica2D {
    private float raio;

    public Circuferencia(Ponto2D centro , float raio){
         super(new ArrayList<>());
        this.raio = raio;
        adicionarPonto(centro);
    }
    @Override
    public float calcularArea() {
        return (float) (Math.PI * raio * raio);
    }

    public float getRaio() {
        return raio;
    }
}