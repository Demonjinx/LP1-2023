package entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private Pessoa pessoa;
    @Column
    private ArrayList<String> produtos;

    public Pedidos(Pessoa pessoa, ArrayList produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList produtos) {
        this.produtos = produtos;
    }


    @Override
    public String toString() {
        return "Pedidos{" +
                ", pessoa=" + pessoa +
                ", produtos=" + produtos +
                '}';
    }
}
