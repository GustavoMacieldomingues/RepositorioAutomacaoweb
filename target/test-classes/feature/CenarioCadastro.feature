# language : pt
@tag
Funcionalidade: fazer cadastro com sucesso
  
  @tag1
  Cenario: fazer cadastro
    Dado dado que eu esteja no site"https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap"
    Quando eu clicar para alterar a versão
    E clicar no botão add record
    E preencher os campos de cadastro
    Então o cadastro é efetuado com sucesso
    

  