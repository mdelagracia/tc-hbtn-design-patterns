import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public HashSet<ItemPedido> adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
        return itensDentroCaixa;
    }

    public HashSet<ItemPedido> adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);
        return itensForaCaixa;
    }

    @Override
    public String toString() {
        String result = "Fora da Caixa: \n";
        for (ItemPedido item: itensForaCaixa) {
            result += "        - " + item.getTipo() + " " + item.getNome() + "\n";
        }
        result += "Dentro da Caixa: \n";
        for(ItemPedido item: itensDentroCaixa) {
            result += "        - " + item.getTipo() + " " + item.getNome() + "\n";
        }
        return result;
    }
}
