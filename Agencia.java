import java.util.*;

public class Agencia {

	private int numero;
	private Banco banco;
	private List<Cliente> contas = new ArrayList<Cliente>();
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public void cadastrarConta(Cliente conta) {
		contas.add(conta);
	}

	public Cliente pesquisarContaPorNumero(int numero) {

		for (Cliente conta : contas) {

			if (conta.getNumero() == numero) {
				return conta;
			}
		}

		throw new RuntimeException("Conta não encontrada: " + numero);
	}
	
	
	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public Cliente pesquisarPesquisarClientePorCpf(String cpf) {

		for (Cliente cliente : clientes) {

			if (cliente.getCpf().equals(cpf)) {
				return cliente;
			}
		}

		throw new RuntimeException("Conta não encontrada: " + numero);
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Banco getBanco() {
		return banco;
	}

}
