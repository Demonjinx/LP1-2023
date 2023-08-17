package entity;
import jakarta.persistence.*;

@Entity(name = "endereco")
@Table(name = "endereco")

public class Endereco {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private int id;
        @Column
        private String cidade;
        @Column
        private String rua;

        public Endereco(String rua, String cidade) {
            this.cidade = cidade;
            this.rua = rua;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", rua='" + rua + '\'' +
                '}';
    }
}
