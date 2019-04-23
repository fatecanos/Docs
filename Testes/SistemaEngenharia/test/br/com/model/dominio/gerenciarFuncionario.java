package br.com.model.dominio;

/**
 *
 * @author Guilherme Puras
 */

import org.hamcrest.*;
import org.junit.*;
import java.util.Date;
import java.util.List;

public class FuncionarioTest {

    private Funcionario funcionario = null;
    
    @Before
    public void setUp(){
        /* Montando Cenário */
        
        Integer matriculaUm = 123;
        
        Cargo cargoUm = new Cargo("Desenvolvedor", 1, true);
        
        Setor setorUm = new Setor("Desenvolvimento", 1, true);
        
        Regional regionalUm = new Regional("Sudeste", 1, true);
        
        DataContratacao dtUm = new DataContratacao(new Date(15/04/2019));
        
        Usuario usuario = new Usuario("jonnytest",
                                      new Senha("llll"),
                                      new Pefil.ATENDENTE
        );

        String nomeUm = "Guilherme";
    
        String cpfUm = "123.456.789-1";

        String emailUm = "guilherme@gmail.com";

        GrupoAtendimento grupo = new GrupoAtendimento(1, "Grupo Azul");
        
        Funcionario funcionario = new Funcionario(matriculaUm,
                                                  cargoUm,
                                                  setorUm,
                                                  regionalUm, 
                                                  dtUm,
                                                  usuario,
                                                  nomeUm,
                                                  cpfUm,
                                                  emailUm,
                                                  grupo, 
                                                  1,
                                                  true
        );
    }

    /**
     * Teste básico de inserção de um funcionário.
     * 
     * @author Guilherme Puras, Lucas Nogueira, Matheus Renna
     * @date 17/04/2019
    */
    @Test
    public void testCreate() {
        assertEquals(new SQLException(), new FuncionarioDAO().cadastrar(funcionario));
    }
    
    /**
     * Teste básico de busca de um funcionário.
     * 
     * @author Guilherme Puras, Lucas Nogueira, Matheus Renna
     * @date 17/04/2019
    */
    @Test
    public void testRead() {
        Assert.assertEquals(new SQLException(), new FuncionarioDAO().consultar(funcionario) );
    }
    
   /**
     * Teste básico de edição de funcionário.
     * 
     * @author Guilherme Puras, Lucas Nogueira, Matheus Renna
     * @date 17/04/2019
    */
    
    @Test
    public void testUpdate {
        Assert.assertEquals(new SQLException(), new FuncionarioDAO().atualizar(funcionario) );
    }
    
   /**
     * Teste básico de remoção de um funcionário.
     * 
     * @author Guilherme Puras, Lucas Nogueira, Matheus Renna
     * @date 17/04/2019
    */
    @Test
    public void testDelete() {
        Assert.assertEquals(new SQLException(), new FuncionarioDAO().excluir(funcionario) );
    }
}
