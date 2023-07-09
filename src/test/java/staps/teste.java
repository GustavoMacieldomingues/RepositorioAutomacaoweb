package staps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import elementos.elementossDeTelaCadastro;
import metodos.MetodosPage;

 public class teste {
	 elementossDeTelaCadastro e = new elementossDeTelaCadastro();
	 MetodosPage m = new MetodosPage();
	 @Dado("^dado que eu esteja no site\"([^\"]*)\"$")
	public void dado_que_eu_esteja_no_site(String url) throws Throwable {
	     m.abrirNavegador(url);
	   
	    
	}

	@Quando("^eu clicar para alterar a versão$")
	public void eu_clicar_para_alterar_a_versão() throws Throwable {
	  m.clicar(e.getBtnMudarVersao());
	  m.clicar(e.getBtnMudarVersao4()); 
	   
	}

	@Quando("^clicar no botão add record$")
	public void clicar_no_botão_add_record() throws Throwable {
	  m.clicar(e.getBtnAddRecord());
	    
	}

	@Quando("^preencher os campos de cadastro$")
	public void preencher_os_campos_de_cadastro() throws Throwable {
	    m.clicar(e.getBtnEscreverCampo1());
	
	
	
	}

	@Então("^o cadastro é efetuado com sucesso$")
	public void o_cadastro_é_efetuado_com_sucesso() throws Throwable {
	   
	    
	}




}
