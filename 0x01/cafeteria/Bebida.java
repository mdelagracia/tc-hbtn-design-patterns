import java.util.List;

public abstract class Bebida {

    private List<String> ingredientes;
    private double preco;

  public List<String> obterIngredientes(){
      return ingredientes;
  }

  public double obterPreco(){
      return preco;
  }

    @Override
    public String toString() {
        return String.format("Preco: %.2f - Ingredientes: %s", obterPreco(), obterIngredientes());
    }
}
