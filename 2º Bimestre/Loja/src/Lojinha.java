import java.util.ArrayList;
import java.util.List;

class Lojinha {
    private String nome;
    private List<Cliente> clientes;
    private List<Pedidos> pedidos;

    public Lojinha(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarPedido(Pedidos pedido) {
        pedidos.add(pedido);
    }
}