
public class Main {
	
	public static void main(String[] args) {
		Cliente Pericles = new Cliente();
		Pericles.setNome("Pericles");
				
		
		Conta cc = new ContaCorrente(Pericles);
		cc.depositar(100);
		//Depositei 100 reais na conta corrente
		
		Conta cp = new ContaPoupanca(Pericles);
		
		cc.transferir(50, cp);
		//transferi 50 reais para a minha conta poupança
		//Resultado deve ser 50 reais em cada conta
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
