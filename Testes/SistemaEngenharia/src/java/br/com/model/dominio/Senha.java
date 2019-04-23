package br.com.model.dominio;

/**
 *
 * @author Guilherme Puras
 */
public class Senha {
    private String palavraChave;

    public Senha() {}

    public Senha(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }
}
