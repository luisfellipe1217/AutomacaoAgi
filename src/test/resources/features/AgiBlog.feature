# language: pt

  Funcionalidade: Busca de artigos
    Como um usuário
    Eu quero buscar artigos finaceiros no blog Agi
    Para que eu possa encontrar fontes de informações financeiras relevantes para meu dia a dia

  Contexto:
    Dado que estou na pagina inicial do AgiBlog
    Quando eu clicar no icone da lupa

@testCase1
  Cenario: Busca com palavra chave direta
    E digitar a palavra chave na caixa de texto aparente
    E teclar Enter
    Então devo receber os resultados da busca conforme a palavra chave inserida

@testCase2
  Cenario: Busca com mais de uma palavra chave composta
    E digitar um grupo de palavras chaves na caixa de texto aparente
    E teclar Enter
    Então devo receber os resultados da busca conforme as palavras inseridas

@testCase3
  Cenário: Busca com caracteres especiais
    E digitar algum termo com caracteres especiais
    E teclar Enter
    Então devo receber os resultados da busca conforme o termo informado

@testCase4
  Cenário: Busca com mais de uma pagina de resultados
    E digitar a palavra chave "Financeiro"
    E teclar Enter
    Então devo receber a busca com mais de uma página de resultados

