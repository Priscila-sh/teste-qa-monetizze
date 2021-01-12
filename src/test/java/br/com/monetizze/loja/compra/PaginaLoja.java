package br.com.monetizze.loja.compra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.monetizze.loja.base.BaseSelenium;

public class PaginaLoja extends BaseSelenium {

	@FindBy(css = "body > div.site-wrap > div.site-section.mt-5 > div > div:nth-child(2) > div:nth-child(2) > div > a > img")
	private WebElement imagemVinho;

	@FindBy(css = "body > div.site-wrap > div:nth-child(4) > div > div > div.col-lg-5.ml-auto > p:nth-child(4) > a")
	private WebElement botaoComprar;

	@FindBy(linkText = "LOJA")
	private WebElement menuLoja;

	@FindBy(linkText = "Trius Cabernet France 2009")
	private WebElement botaoTelaVinhoTriusCabernetFrance2009;

	@FindBy(linkText = "Adicionar ao carrinho")
	private WebElement botaoAdicionarVinhoNoCarrinho;

	@FindBy(className = "img-fluid")
	private WebElement detalhesVinho;

	@FindBy(css = "body > div.site-wrap > div.site-section.pb-0 > div > div:nth-child(2) > form > div > table > tbody > tr:nth-child(2) > td:nth-child(4) > div > div.input-group-append > button")
	private WebElement botaoAdicionarMaisItens;

	@FindBy(css = "body > div.site-wrap > div.site-section.pt-5.bg-light > div > div > div.col-md-6.pl-5 > div > div > div:nth-child(4) > div > button")
	private WebElement botaoProsseguir;

	@FindBy(id = "c_country")
	private WebElement comboPais;

	@FindBy(id = "c_fname")
	private WebElement nome;

	@FindBy(id = "c_lname")
	private WebElement sobrenome;

	@FindBy(id = "c_companyname")
	private WebElement nomeEmpresa;

	@FindBy(id = "c_address")
	private WebElement endereco;

	@FindBy(css = "body > div.site-wrap > form > div > div > div > div.col-md-6.mb-5.mb-md-0 > div > div:nth-child(5) > input")
	private WebElement apartamento;

	@FindBy(id = "c_state_country")
	private WebElement estado;

	@FindBy(id = "c_postal_zip")
	private WebElement cep;

	@FindBy(id = "c_email_address")
	private WebElement email;

	@FindBy(id = "c_phone")
	private WebElement telefone;

	@FindBy(id = "c_order_notes")
	private WebElement detalhesAdicionais;

	@FindBy(id = "btnSubmit")
	private WebElement botaoFinalizarCompra;

	@FindBy(css = "body > div.site-wrap > div.site-section > div > div > div > h2")
	private WebElement notificacao;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div/p[2]/a")
	private WebElement botaoVoltar;

	// CONTATO
	@FindBy(linkText = "CONTATO")
	private WebElement menuContato;

	@FindBy(id = "fname")
	private WebElement nomeContato;

	@FindBy(id = "lname")
	private WebElement sobrenomeContato;

	@FindBy(id = "eaddress")
	private WebElement emailContato;

	@FindBy(id = "tel")
	private WebElement telefoneContato;

	@FindBy(id = "message")
	private WebElement mensagemContato;

	@FindBy(css = "input[value='Enviar']")
	private WebElement botaoEnviar;

	public PaginaLoja() {
		PageFactory.initElements(getDriver(), this);
	}

	public void acessarMenuLoja() {
		esperarCincoSegundos();
		menuLoja.click();
	}

	public void abrirTelaVinhoTriusCabernetFrance2009() {
		esperarCincoSegundos();
		botaoTelaVinhoTriusCabernetFrance2009.click();
	}

	public void clicarAdicionarVinhoNoCarrinho() {
		esperarTresSegundos();
		botaoAdicionarVinhoNoCarrinho.click();
	}

	public void clicarBotaoAddmais() {
		esperarTresSegundos();
		botaoAdicionarMaisItens.click();
	}

	public void clicarBotaoProsseguir() {
		botaoProsseguir.click();
	}

	public void selecionarPais() {
		Select opcoes = new Select(comboPais);
		opcoes.selectByVisibleText("Brasil");
	}

	public void inserirNome(String nome) {
		this.nome.clear();
		this.nome.sendKeys(nome);
	}

	public void inserirSobrenome(String sobrenome) {
		this.sobrenome.clear();
		this.sobrenome.sendKeys(sobrenome);
	}

	public void inserirNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa.clear();
		this.nomeEmpresa.sendKeys(nomeEmpresa);
	}

	public void inserirEndereco(String endereco) {
		this.endereco.clear();
		this.endereco.sendKeys(endereco);
	}

	public void inserirApartamento(String apartamento) {
		this.apartamento.clear();
		this.apartamento.sendKeys(apartamento);
	}

	public void inserirEstado(String estado) {
		this.estado.clear();
		this.estado.sendKeys(estado);
	}

	public void inserirCep(String cep) {
		this.cep.clear();
		this.cep.sendKeys(cep);
	}

	public void inserirEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}

	public void inserirTelefone(String telefone) {
		this.telefone.clear();
		this.telefone.sendKeys(telefone);
	}

	public void inserirDetalhesAdicionais(String detalhesAdicionais) {
		this.detalhesAdicionais.clear();
		this.detalhesAdicionais.sendKeys(detalhesAdicionais);
	}

	public void clicarBotaoFinalizarCompra() {
		botaoFinalizarCompra.click();
	}

	public void clicarVoltar() {
		botaoVoltar.click();
	}

	// METODOS DA CLASE CONTATO
	public void acessarMenucontato() {
		esperarCincoSegundos();
		menuContato.click();
	}

	public void inserirNomeContato(String nomeContato) {
		aguardarTela();
		this.nomeContato.clear();
		this.nomeContato.sendKeys(nomeContato);
	}

	public void inserirSobrenomeContato(String sobrenomeContato) {
		this.sobrenomeContato.clear();
		this.sobrenomeContato.sendKeys(sobrenomeContato);
	}

	public void inserirEmailContato(String emailContato) {
		this.emailContato.clear();
		this.emailContato.sendKeys(emailContato);
	}

	public void inserirTelefoneContato(String telefoneContato) {
		this.telefoneContato.clear();
		this.telefoneContato.sendKeys(telefoneContato);
	}

	public void inserirMensagemContato(String mensagemContato) {
		this.mensagemContato.clear();
		this.mensagemContato.sendKeys(mensagemContato);
	}

	public void clicarEnviarMensagem() {
		botaoEnviar.click();
		esperarCincoSegundos();
	}

	// RECUPERAR DADOS COMPRA
	public String obterPais() {
		Select opcoes = new Select(comboPais);
		return opcoes.getFirstSelectedOption().getText().trim();
	}

	public String obterNome() {
		return nome.getAttribute("value");
	}

	public String obterSobrenome() {
		return sobrenome.getAttribute("value");
	}

	public String obetrNomeEmpresa() {
		return nomeEmpresa.getAttribute("value");
	}

	public String obterEndereco() {
		return endereco.getAttribute("value");
	}

	public String obterApartamento() {
		return apartamento.getAttribute("value");
	}

	public String obterEstado() {
		return estado.getAttribute("value");
	}

	public String obterCep() {
		return cep.getAttribute("value");
	}

	public String obterEmail() {
		return email.getAttribute("value");
	}

	public String obterTelefone() {
		return telefone.getAttribute("value");
	}

	public String obterDetalhesAdicionais() {
		return detalhesAdicionais.getAttribute("value");
	}

	// RECUPERAR DADOS CONTATO
	public String obterNomeContato() {
		return nomeContato.getAttribute("value");
	}

	public String obterSobrenomeContato() {
		return sobrenomeContato.getAttribute("value");
	}

	public String obterEmailContato() {
		return emailContato.getAttribute("value");
	}

	public String obterTelefoneContato() {
		return telefoneContato.getAttribute("value");
	}

	public String obterMensagemContato() {
		return mensagemContato.getAttribute("value");
	}

	public String obterMensagemNotificacao() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(notificacao));
		return notificacao.getText();
	}

}
