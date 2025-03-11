# language: pt

  Funcionalidade: Busca de artigos
    Como um usuário do AgiBlog
    Quero buscar artigos financeiros no blog
    Para encontrar informações relevantes para o meu dia a dia

  Contexto:
    Dado que estou na página inicial do AgiBlog
    Quando eu clicar no ícone da lupa
    E visualizar a caixa de busca

  @testCase1
  Cenario: Busca com palavra chave direta
      Quando eu digitar uma palavra-chave válida na caixa de busca
      E pressionar a tecla "Enter"
      Então devo visualizar uma lista de artigos
      E os artigos exibidos devem conter a palavra-chave inserida no título ou no conteúdo

  @testCase2
  Cenário: Busca com caracteres especiais
    Quando eu digitar um termo contendo caracteres especiais (ex: "Renda+Fixa", "invest@mento", "R$")
    E pressionar a tecla "Enter"
    Então devo visualizar uma lista de artigos
    E os resultados devem tratar corretamente os caracteres especiais, retornando artigos relevantes

  @testCase3
  Cenário: Busca com mais de uma pagina de resultados
    Quando eu digitar a palavra-chave "financeiro"
    E pressionar a tecla "Enter"
    Então devo visualizar uma lista de artigos
    E se houver mais de uma página de resultados, deve ser exibida a paginação para navegação

