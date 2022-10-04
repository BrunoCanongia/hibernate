package br.com.brunoid.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "pessoa")
public class Pessoa {
    private int pessoaId;
    private String nome;
    private String nascimento;

    public Pessoa() {
    }
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "pessoa_id" )
    public int getPessoaId() {
        return pessoaId;
    }


    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNascimento() {
        return nascimento;
    }


    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "pessoaId=" + pessoaId + ", nome=" + nome + ", nascimento=" + nascimento + '}';
    }
    
    
}
