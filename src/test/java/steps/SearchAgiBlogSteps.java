package steps;

import io.cucumber.java.After;
import io.cucumber.java.es.Dado;
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

    @Dado("que estou na página inicial do AgiBlog")
    public void queEstouNaPáginaInicialDoAgiBlog() {
        driverManager.webDriverInit();
    }

    @Quando("eu clicar no ícone da lupa")
    public void euClicarNoÍconeDaLupa() {
        home.clickSearchButton();
    }

    @Quando("visualizar a caixa de busca")
    public void visualizarACaixaDeBusca() {
        Assert.assertTrue(home.inputSearchTextBoxVisible());
    }

    @Quando("eu digitar uma palavra-chave válida na caixa de busca")
    public void euDigitarUmaPalavraChaveVálidaNaCaixaDeBusca() {
        home.inputTextSearchTextBox("teste");
    }

    @Quando("pressionar a tecla {string}")
    public void pressionarATecla(String string) {
        home.sendEnterKeyOnSearchBox();
    }

    @Então("devo visualizar uma lista de artigos")
    public void devoVisualizarUmaListaDeArtigos() {
        Assert.assertEquals("Resultados encontrados para: teste", resultsPage.getResearchResultsText());
    }

    @Então("os artigos exibidos devem conter a palavra-chave inserida no título ou no conteúdo")
    public void osArtigosExibidosDevemConterAPalavraChaveInseridaNoTítuloOuNoConteúdo() {
        Assert.assertTrue(resultsPage.getFirstResultCard());
        Assert.assertTrue(resultsPage.getResearchResultsText().contains("teste"));
    }

    @Quando("eu digitar uma frase ou grupo de palavras na caixa de busca")
    public void euDigitarUmaFraseOuGrupoDePalavrasNaCaixaDeBusca() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("os artigos exibidos devem conter as palavras inseridas no título ou no conteúdo, respeitando a ordem inserida")
    public void osArtigosExibidosDevemConterAsPalavrasInseridasNoTítuloOuNoConteúdoRespeitandoAOrdemInserida() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("eu digitar um termo contendo caracteres especiais \\(ex: {string}, {string}, {string})")
    public void euDigitarUmTermoContendoCaracteresEspeciaisEx(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("os resultados devem tratar corretamente os caracteres especiais, retornando artigos relevantes")
    public void osResultadosDevemTratarCorretamenteOsCaracteresEspeciaisRetornandoArtigosRelevantes() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("eu digitar a palavra-chave {string}")
    public void euDigitarAPalavraChave(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("se houver mais de uma página de resultados, deve ser exibida a paginação para navegação")
    public void seHouverMaisDeUmaPáginaDeResultadosDeveSerExibidaAPaginaçãoParaNavegação() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @After
    public void finalizarTeste() {
        driverManager.webDriverClose();
   }
}
