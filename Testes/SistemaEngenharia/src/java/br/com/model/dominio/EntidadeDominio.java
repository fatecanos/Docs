package br.com.model.dominio;

/**
 *
 * @author Guilherme Puras
 * @version %I% %G%
 * 
 */
public class EntidadeDominio {
    private Integer id;
    private boolean ativo;

    public EntidadeDominio() {}
    
    public EntidadeDominio(Integer id, boolean ativo) {
        this.id = id;
        this.ativo = ativo;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
