package br.com.monetizze.loja.compra;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.monetizze.loja.base.BaseSelenium;

public class TesteLoja extends BaseSelenium {

	private PaginaLoja lojaVinhos = new PaginaLoja();
	private String nome = "Nome";
	private String sobrenome = "Teste";
	private String endereco = "Rua da cidade";
	private String apartamento = "Apartamento 0";
	private String estado = "Parana";
	private String cep = "80200200";
	private String email = "email@email.com.br";
	private String telefone = "4133224455";
	private String detalhesAdicionais = "Detalhes adicionais para teste";
	private String nomeContato = "NomeContato";
	private String sobrenomeContato = "SobrenomeContato";
	private String emailContato = "email@contato.com";
	private String telefoneContato = "4133552266";
	private String mensagemContato = "mensagem para contato de testes";
	private String nomeEmpresa = "Empresa De QA";

	@Test
	public void comprarVinhoLojaVirtual() {
		lojaVinhos.acessarMenuLoja();
		lojaVinhos.abrirTelaVinhoTriusCabernetFrance2009();
		lojaVinhos.clicarAdicionarVinhoNoCarrinho();
		lojaVinhos.clicarBotaoAddmais();
		lojaVinhos.clicarBotaoProsseguir();
		lojaVinhos.selecionarPais();
		lojaVinhos.inserirNome(nome);
		lojaVinhos.inserirSobrenome(sobrenome);
		lojaVinhos.inserirNomeEmpresa(nomeEmpresa);
		lojaVinhos.inserirEndereco(endereco);
		lojaVinhos.inserirApartamento(apartamento);
		lojaVinhos.inserirEstado(estado);
		lojaVinhos.inserirCep(cep);
		lojaVinhos.inserirEmail(email);
		lojaVinhos.inserirTelefone(telefone);
		lojaVinhos.inserirDetalhesAdicionais(detalhesAdicionais);
		lojaVinhos.clicarBotaoFinalizarCompra();

		assertEquals(BaseSelenium.MSG_AGRADECER, lojaVinhos.obterMensagemNotificacao());
	}

	@Test
	public void verificarDadosCompraVinho() {
		comprarVinhoLojaVirtual();

		assertEquals(nome, lojaVinhos.obterNome());
		assertEquals(sobrenome, lojaVinhos.obterSobrenome());
		assertEquals(endereco, lojaVinhos.obterEndereco());
		assertEquals(apartamento, lojaVinhos.obterApartamento());
		assertEquals(estado, lojaVinhos.obterEstado());
		assertEquals(cep, lojaVinhos.obterCep());
		assertEquals(email, lojaVinhos.obterEmail());
		assertEquals(telefone, lojaVinhos.obterTelefone());
		assertEquals(detalhesAdicionais, lojaVinhos.obterDetalhesAdicionais());
	}

	@Test
	public void enviarMensagemContato() {

		lojaVinhos.acessarMenucontato();
		lojaVinhos.inserirNomeContato(nomeContato);
		lojaVinhos.inserirSobrenomeContato(sobrenomeContato);
		lojaVinhos.inserirEmailContato(emailContato);
		lojaVinhos.inserirTelefoneContato(telefoneContato);
		lojaVinhos.inserirMensagemContato(mensagemContato);
		lojaVinhos.clicarEnviarMensagem();

	}

	@Test
	public void verificarDadosEnviarMensagem() {
		enviarMensagemContato();
		assertEquals(nomeContato, lojaVinhos.obterNomeContato());
		assertEquals(sobrenomeContato, lojaVinhos.obterSobrenomeContato());
		assertEquals(emailContato, lojaVinhos.obterEmailContato());
		assertEquals(telefone, lojaVinhos.obterTelefoneContato());
		assertEquals(mensagemContato, lojaVinhos.obterDetalhesAdicionais());

	}

}
