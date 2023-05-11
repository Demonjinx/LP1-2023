import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // crindo os clientes
        Cliente cliente1 = new Cliente("Mateus Armado", "412.853.154-10", "(11) 99596-0241");
        Cliente cliente2 = new Cliente("Roger Calvo", "123.654.321-00", "(52) 54782-1472");

        // criando os neg dos pedidos
        List<String> produtos1 = new ArrayList<>();
        produtos1.add("Produto: Guitarra do Hero");
        produtos1.add("Produto: E-girl");
        double valor1 = 150.0;
        int codigoPedido1 = 1;
        Pedidos pedido1 = new Pedidos(cliente1, produtos1,  valor1 ,  codigoPedido1);

        List<String> produtos2 = new ArrayList<>();
        produtos2.add("Produto; Shamppo ante calvice");
        Pedidos pedido2 = new Pedidos(cliente2, produtos2, 200.0, 2);

        // fazendo a loja
        Lojinha minhaLoja = new Lojinha("Simas Turbo");

        // add clientes e pedidos pra loja
        minhaLoja.adicionarCliente(cliente1);
        minhaLoja.adicionarCliente(cliente2);
        minhaLoja.adicionarPedido(pedido1);
        minhaLoja.adicionarPedido(pedido2);

        System.out.println("Nome da Loja: " + minhaLoja.getNome());

        System.out.println("Clientes:");
        for (Cliente cliente : minhaLoja.getClientes()) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println();
        }

        System.out.println("Pedidos:");
        for (Pedidos pedido : minhaLoja.getPedidos()) {
            System.out.println("Código do Pedido: " + pedido.getCodigoPedido());
            System.out.println("Valor: " + pedido.getValor());
            System.out.println("Cliente: " + pedido.getCliente().getNome());
            System.out.println("Produtos:");
            for (String produto : pedido.getProdutos()) {
                System.out.println("- " + produto);
            }
            System.out.println();
        }
    }

}