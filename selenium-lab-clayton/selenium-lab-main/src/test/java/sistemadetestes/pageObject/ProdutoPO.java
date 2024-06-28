package sistemadetestes.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {

    @FindBy(id = "codigo")
    public WebElement inputCodProduto;

    @FindBy(id = "nome")
    public WebElement inputNomeProduto;

    @FindBy(id = "quantidade")
    public WebElement inputQuantidadeProduto;

    @FindBy(id = "valor")
    public WebElement inputValorProduto;

    @FindBy(id = "btn-salvar")
    public WebElement buttonSalvarProduto;

    @FindBy(css = "alert-danger")
    public WebElement divAlerta;
    
    @FindBy(css = "btn-sair")
    public WebElement buttonSairProduto;

    public ProdutoPO(WebDriver driver) {
        super(driver);
    }

    public void preencherCodigoProduto(String nome) {
        inputNomeProduto.clear();
        inputNomeProduto.sendKeys(nome + Keys.TAB);
    }

    public void preencherNomeProduto(String nome) {
        inputNomeProduto.clear();
        inputNomeProduto.sendKeys(nome + Keys.TAB);
    }

    public void preencherValorProduto(String preco) {
        inputValorProduto.clear();
        inputValorProduto.sendKeys(preco + Keys.TAB);
    }

    public void clicarSalvarProduto() {
        buttonSalvarProduto.click();
    }
    
    public void clicarSairProduto() {
        buttonSairProduto.click();
    }

    public String obterMensagemAlerta() {
        return divAlerta.getText();
    }

    public String obterTituloPagina() {
        return driver.getTitle();
    }
    
}
