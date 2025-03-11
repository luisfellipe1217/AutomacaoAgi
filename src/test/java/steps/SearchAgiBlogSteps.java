package steps;

import io.cucumber.java.After;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.SearchResults;
import support.WebDriverManager;

public class SearchAgiBlogSteps {

    WebDriverManager driverManager = new WebDriverManager();
    HomePage home = new HomePage(driverManager.driver);
    SearchResults resultsPage = new SearchResults(driverManager.driver);

    @Dado("que estou na pagina inicial do AgiBlog")
    public void queEstouNaPaginaInicialDoAgiBlog() {
        driverManager.webDriverInit();
        Assert.assertTrue(home.menu());
    }

    @Quando("eu clicar no icone da lupa")
    public void euClicarNoIconeDaLupa() {
        home.clickSearchButton();
    }

    @Quando("digitar a palavra chave na caixa de texto aparente")
    public void digitarAPalavraChaveNaCaixaDeTextoAparente() {
        home.inputTextSearchTextBox("teste");
    }

    @Quando("teclar Enter")
    public void teclarEnter() {
        home.sendEnterKeyOnSearchBox();
    }

    @Então("devo receber os resultados da busca conforme a palavra chave inserida")
    public void devoReceberOsResultadosDaBuscaConformeAPalavraChaveInserida() {
        Assert.assertEquals("Resultados encontrados para: teste", resultsPage.getResearchResultsText());
        Assert.assertTrue(resultsPage.getFirstResultCard());
    }

    @Quando("digitar um grupo de palavras chaves na caixa de texto aparente")
    public void digitarUmGrupoDePalavrasChavesNaCaixaDeTextoAparente() {

    }

    @Então("devo receber os resultados da busca conforme as palavras inseridas")
    public void devoReceberOsResultadosDaBuscaConformeAsPalavrasInseridas() {

    }

    @Quando("digitar algum termo com caracteres especiais")
    public void digitarAlgumTermoComCaracteresEspeciais() {

    }

    @Então("devo receber os resultados da busca conforme o termo informado")
    public void devoReceberOsResultadosDaBuscaConformeOTermoInformado() {

    }

    @Quando("digitar a palavra chave {string}")
    public void digitarAPalavraChave(String string) {

    }

    @Então("devo receber a busca com mais de uma página de resultados")
    public void devoReceberABuscaComMaisDeUmaPáginaDeResultados() {

    }

   // @After
   // public void finalizarTeste() {
    //    driverManager.webDriverClose();
   // }
}
