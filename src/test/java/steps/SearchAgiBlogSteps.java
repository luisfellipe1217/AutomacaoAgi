package steps;

import io.cucumber.java.After;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.HomePage;
import pageObjects.SearchResults;

public class SearchAgiBlogSteps {

    WebDriver driver;
    HomePage home = new HomePage(driver);
    SearchResults resultsPage = new SearchResults(driver);

    @Before
    public void driverSetup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1050, 708");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @Dado("que estou na página inicial do AgiBlog")
    public void queEstouNaPáginaInicialDoAgiBlog() {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://blogdoagi.com.br/");
    }

    @Quando("eu clicar no ícone da lupa")
    public void euClicarNoÍconeDaLupa() {
        home.clickSearchButton();
    }

    @Quando("visualizar a caixa de busca")
    public void visualizarACaixaDeBusca() {
        Assert.assertTrue(home.inputSearchTextBoxVisible());
    }

    @Quando("eu digitar uma palavra-chave válida na caixa de busca \\(ex: {string})")
    public void euDigitarUmaPalavraChaveVálidaNaCaixaDeBuscaEx(String string) {
        home.inputTextSearchTextBox("teste");
    }

    @Quando("pressionar a tecla {string}")
    public void pressionarATecla(String string) {
        home.sendEnterKeyOnSearchBox();
    }

    @Então("devo visualizar uma lista de artigos \\(ex: {string})")
    public void devoVisualizarUmaListaDeArtigos(String string) {
        Assert.assertTrue(resultsPage.getResearchResultsText().contains("Resultados encontrados para:"));
    }

    @Então("os artigos exibidos devem conter a palavra-chave inserida no título ou no conteúdo")
    public void osArtigosExibidosDevemConterAPalavraChaveInseridaNoTítuloOuNoConteúdo() {
        Assert.assertTrue(resultsPage.getFirstResultCard());
        Assert.assertTrue(resultsPage.getResearchResultsText().contains("teste"));
    }

    @Quando("eu digitar um termo contendo caracteres especiais \\(ex: {string})")
    public void euDigitarUmTermoContendoCaracteresEspeciaisEx(String string) {
        home.inputTextSearchTextBox(string);
    }

    @Então("os resultados devem tratar corretamente os caracteres especiais, retornando artigos relevantes \\(ex: {string})")
    public void osResultadosDevemTratarCorretamenteOsCaracteresEspeciaisRetornandoArtigosRelevantes(String string) {
        Assert.assertTrue(resultsPage.getResearchResultsText().contains(string));
    }

    @Quando("eu digitar a palavra-chave {string}")
    public void euDigitarAPalavraChave(String string) {
        home.inputTextSearchTextBox(string);
    }

    @Então("se houver mais de uma página de resultados, deve ser exibida a paginação para navegação")
    public void seHouverMaisDeUmaPáginaDeResultadosDeveSerExibidaAPaginaçãoParaNavegação() {
        Assert.assertTrue(resultsPage.validateInfiniteWrapperPage());
    }

    @After
    public void finalizarTeste() {
        driver.close();
   }
}
