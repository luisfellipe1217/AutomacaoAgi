$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AgiBlog.feature");
formatter.feature({
  "name": "Busca de artigos",
  "description": "    Como um usuário do AgiBlog\n    Quero buscar artigos financeiros no blog\n    Para encontrar informações relevantes para o meu dia a dia",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou na página inicial do AgiBlog",
  "keyword": "Dado "
});
formatter.match({
  "location": "SearchAgiBlogSteps.queEstouNaPáginaInicialDoAgiBlog()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no ícone da lupa",
  "keyword": "Quando "
});
formatter.match({
  "location": "SearchAgiBlogSteps.euClicarNoÍconeDaLupa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizar a caixa de busca",
  "keyword": "E "
});
formatter.match({
  "location": "SearchAgiBlogSteps.visualizarACaixaDeBusca()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Busca com palavra chave direta",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@testCase1"
    }
  ]
});
formatter.step({
  "name": "eu digitar uma palavra-chave válida na caixa de busca (ex: \"teste\")",
  "keyword": "Quando "
});
formatter.match({
  "location": "SearchAgiBlogSteps.euDigitarUmaPalavraChaveVálidaNaCaixaDeBuscaEx(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pressionar a tecla \"Enter\"",
  "keyword": "E "
});
formatter.match({
  "location": "SearchAgiBlogSteps.pressionarATecla(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo visualizar uma lista de artigos (ex: \"teste\")",
  "keyword": "Então "
});
formatter.match({
  "location": "SearchAgiBlogSteps.devoVisualizarUmaListaDeArtigos(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "os artigos exibidos devem conter a palavra-chave inserida no título ou no conteúdo",
  "keyword": "E "
});
formatter.match({
  "location": "SearchAgiBlogSteps.osArtigosExibidosDevemConterAPalavraChaveInseridaNoTítuloOuNoConteúdo()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou na página inicial do AgiBlog",
  "keyword": "Dado "
});
formatter.match({
  "location": "SearchAgiBlogSteps.queEstouNaPáginaInicialDoAgiBlog()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no ícone da lupa",
  "keyword": "Quando "
});
formatter.match({
  "location": "SearchAgiBlogSteps.euClicarNoÍconeDaLupa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizar a caixa de busca",
  "keyword": "E "
});
formatter.match({
  "location": "SearchAgiBlogSteps.visualizarACaixaDeBusca()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Busca com caracteres especiais",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@testCase2"
    }
  ]
});
formatter.step({
  "name": "eu digitar um termo contendo caracteres especiais (ex: \"R$\")",
  "keyword": "Quando "
});
formatter.match({
  "location": "SearchAgiBlogSteps.euDigitarUmTermoContendoCaracteresEspeciaisEx(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pressionar a tecla \"Enter\"",
  "keyword": "E "
});
formatter.match({
  "location": "SearchAgiBlogSteps.pressionarATecla(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo visualizar uma lista de artigos (ex: \"R$\")",
  "keyword": "Então "
});
formatter.match({
  "location": "SearchAgiBlogSteps.devoVisualizarUmaListaDeArtigos(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "os resultados devem tratar corretamente os caracteres especiais, retornando artigos relevantes (ex: \"R$\")",
  "keyword": "E "
});
formatter.match({
  "location": "SearchAgiBlogSteps.osResultadosDevemTratarCorretamenteOsCaracteresEspeciaisRetornandoArtigosRelevantes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou na página inicial do AgiBlog",
  "keyword": "Dado "
});
formatter.match({
  "location": "SearchAgiBlogSteps.queEstouNaPáginaInicialDoAgiBlog()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no ícone da lupa",
  "keyword": "Quando "
});
formatter.match({
  "location": "SearchAgiBlogSteps.euClicarNoÍconeDaLupa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizar a caixa de busca",
  "keyword": "E "
});
formatter.match({
  "location": "SearchAgiBlogSteps.visualizarACaixaDeBusca()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Busca com mais de uma pagina de resultados",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@testCase3"
    }
  ]
});
formatter.step({
  "name": "eu digitar a palavra-chave \"financeiro\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "SearchAgiBlogSteps.euDigitarAPalavraChave(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pressionar a tecla \"Enter\"",
  "keyword": "E "
});
formatter.match({
  "location": "SearchAgiBlogSteps.pressionarATecla(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo visualizar uma lista de artigos (ex: \"financeiro\")",
  "keyword": "Então "
});
formatter.match({
  "location": "SearchAgiBlogSteps.devoVisualizarUmaListaDeArtigos(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se houver mais de uma página de resultados, deve ser exibida a paginação para navegação",
  "keyword": "E "
});
formatter.match({
  "location": "SearchAgiBlogSteps.seHouverMaisDeUmaPáginaDeResultadosDeveSerExibidaAPaginaçãoParaNavegação()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});