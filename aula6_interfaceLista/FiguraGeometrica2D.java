import java.util.List;
import java.util.ArrayList;

abstract class FiguraGeometrica2D implements IArimeticaGeometrica2D {
    private List<Ponto2D> pontos;

    public FiguraGeometrica2D(List<Ponto2D> pontos) {
        this.pontos = pontos != null ? new ArrayList<>(pontos) : new ArrayList<>();
    }

    public void adicionarPonto(Ponto2D ponto) {
        this.pontos.add(ponto);
    }

    public void removerPonto(Ponto2D ponto) {
        this.pontos.remove(ponto);
    }

    public List<Ponto2D> getPontos() {
        return pontos;
    }
}
