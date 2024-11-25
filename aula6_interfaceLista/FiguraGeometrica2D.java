import java.util.List;
import java.util.ArrayList;

abstract class FiguraGeometrica2D implements IArimeticaGeometrica2D  {
    private List<Ponto2D> pontos;

    public FiguraGeometrica2D (List<Ponto2D> pontos){
        this.pontos = new ArrayList<>();
    }

    public void adicionarPonto(Ponto2D pontos) {
        pontos.add(pontos);
    }

    
    public void removerPonto(Ponto2D pontos) {
        pontos.remove(pontos);
    }

}

