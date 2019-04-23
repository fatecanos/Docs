package br.com.model.dominio;

/**
 *
 * @author Guilherme Puras
 */
public class Pessoa extends EntidadeDominio {
    private String nome;
    private String cpf;
    private String email;

    public Pessoa() {}

    public Pessoa(String nome, String cpf, String email, 
                  Integer id, boolean ativo) {
        super(id, ativo);
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    } 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
}
