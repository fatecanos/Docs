package br.com.model.dominio;

/**
 *
 * @author Guilherme Puras
 */
public class Funcionario extends Pessoa {
    private String matricula;
    private Cargo cargo;
    private Setor setor;
    private Regional regional;
    private DataContratacao dtContratacao;
    private Perfil perfil;
    private Senha senha;

    public Funcionario() {}

    public Funcionario(String matricula, Cargo cargo, 
                       Setor setor, Regional regional, DataContratacao dtContratacao, 
                       Perfil perfil, Senha senha, String nome, String cpf, 
                       String email, Integer id, boolean ativo) {
        super(nome, cpf, email, id, ativo);
        this.matricula = matricula;
        this.cargo = cargo;
        this.setor = setor;
        this.regional = regional;
        this.dtContratacao = dtContratacao;
        this.perfil = perfil;
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    public DataContratacao getDtContratacao() {
        return dtContratacao;
    }

    public void setDtContratacao(DataContratacao dtContratacao) {
        this.dtContratacao = dtContratacao;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }
}
