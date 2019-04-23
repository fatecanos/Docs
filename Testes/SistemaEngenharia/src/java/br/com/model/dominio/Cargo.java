package br.com.model.dominio;

/**
 *
 * @author Guilherme Puras
 */
public class Cargo extends EntidadeDominio {
    private String nome;

    public Cargo() {}
    
    public Cargo(String nome, Integer id, boolean ativo) {
        super(id, ativo);
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
