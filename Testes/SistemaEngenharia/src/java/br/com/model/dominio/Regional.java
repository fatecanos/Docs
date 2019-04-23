package br.com.model.dominio;

/**
 *
 * @author Guilherme Puras
 */
public class Regional extends EntidadeDominio {
    private String nome;

    public Regional() {}
    
    public Regional(String nome, Integer id, boolean ativo) {
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
