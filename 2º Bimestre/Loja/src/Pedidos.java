import java.util.List;

class Pedidos {
    private Cliente cliente;
    private List<String> produtos;
    private double valor;
    private int codigoPedido;

    public Pedidos(Cliente cliente, List<String> produtos, double valor, int codigoPedido) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.valor = valor;
        this.codigoPedido = codigoPedido;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }
}
