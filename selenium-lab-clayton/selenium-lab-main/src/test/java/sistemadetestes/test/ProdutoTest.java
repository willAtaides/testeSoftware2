package sistemadetestes.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import sistemadetestes.pageObject.ProdutoPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdutoTest extends BaseTest {
    
    private static ProdutoPO produtoPage;

    @BeforeClass
    public static void prepararTestes() {
    	produtoPage = new ProdutoPO(driver);

    }

    @Test
    public void TC006_deveExibirMensagemCamposObrigatoriosAoSalvarApenasCodigo() {
        produtoPage.preencherCodigoProduto("12345"); 
        produtoPage.clicarSalvarProduto();

        String mensagem = produtoPage.obterMensagemAlerta();

        assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);
    }

    @Test
    public void TC007_deveVoltaParaTelaDeProdutosSalvos() {
        produtoPage.clicarSairProduto();

    }
    
    @Test
    public void TC008_deveExibirMensagemCamposObrigatoriosAoSalvarApenasOSCodigoENome() {
        produtoPage.preencherCodigoProduto("12345"); 
        produtoPage.preencherNomeProduto("Will"); 
        produtoPage.clicarSalvarProduto();

        String mensagem = produtoPage.obterMensagemAlerta();

        assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);
    }
}
