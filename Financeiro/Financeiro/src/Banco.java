import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Banco {
	
	
	
	private int numInstrumentos = 2;
	
	public ArrayList<InstrumentoFinanceiro> x = new ArrayList<>();
	//public InstrumentoFinanceiro[] x  = new InstrumentoFinanceiro[numInstrumentos];

	public void adicionar(InstrumentoFinanceiro instrumento)
	{
		x.add(instrumento);	
		/*
		for(int i = 0; i < x.length ;i++)
		{
			x[i] = instrumento ;	
			
		}
		
		 for (int i = 0; i < x.length; i++) {
	            if (x[i] == null) {
	                x[i] = instrumento;
	                System.out.println("Novo Instrumento adicioando com suceso!");
	                break;
	            } else if (i == x.length - 1) {
	                System.out.println("Não há espaço para novos instrumentos.");
	            }
	        }
		*/
	}
	
	public float calcularSaldoTotal()
	{
		float auxCalculoTotal = 0;
		//for enhanced que passa pela ArrayList x e soma os valores
		for(InstrumentoFinanceiro instrumento : x)
		{			
			auxCalculoTotal = auxCalculoTotal + instrumento.calcularSaldoTotal();			
		}
		return auxCalculoTotal;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Banco x = new Banco();
		int escolha = 0;
		
		System.out.println("Bem-vindo");
		System.out.println("Digite seu saldo: ");
		float saldo = sc.nextFloat();
		
		do {
		System.out.println("1 - Adicionar Acao");
		System.out.println("2 - Adicionar ContaCorrente");
		System.out.println("3 - Adicionar FundoDeAplicacão");
		System.out.println("4 - Calcular");
		System.out.println("5 - Encerrar");
		escolha = sc.nextInt();
		
		switch (escolha)
		{
		case 1:
			System.out.println("Digite a quantidade de cotas:");
			Acao a = new Acao(sc.nextInt());
			a.setSaldo(saldo);
			x.adicionar(a);
			System.out.println("Valor total de cotas: " + a.calcularSaldoTotal());
			break;
		case 2:
			System.out.println("Digite o limite da conta: ");
			ContaCorrente c = new ContaCorrente(sc.nextFloat());
			c.setSaldo(saldo);
			x.adicionar(c);
			System.out.println("Valor total da conta: " + c.calcularSaldoTotal());
			break;
		case 3:
			System.out.println("Digite o rentabilidade mensal: (exemplo: 12) ");
			FundoDeAplicacao f = new FundoDeAplicacao(sc.nextFloat());
			f.setSaldo(saldo);
			x.adicionar(f);
			System.out.println("Valor total: saldo + rendimentos " + f.calcularSaldoTotal());
			break;
		case 4:
			System.out.println("Valor de todos Instrumentos financeiros até o momento: ");
			System.out.println(x.calcularSaldoTotal());
		
		}
		
		
		/*
		if(escolha == 1)
		{
			
			System.out.println("Digite a quantidade de cotas:");
			Acao a = new Acao(sc.nextInt());
			a.setSaldo(saldo);
			x.adicionar(a);
			System.out.println(a.calcularSaldoTotal());
			
		}
		if(escolha == 2)
		{
			
			System.out.println("Digite o limite da conta: ");
			ContaCorrente c = new ContaCorrente(sc.nextFloat());
			c.setSaldo(saldo);
			x.adicionar(c);
			System.out.println(c.calcularSaldoTotal());
			
		}
		if(escolha == 3)
		{
			
			System.out.println("Digite o rentabilidade mensal: (exemplo: 12) ");
			FundoDeAplicacao f = new FundoDeAplicacao(sc.nextFloat());
			f.setSaldo(saldo);
			x.adicionar(f);
			System.out.println(f.calcularSaldoTotal());
			
		}
		*/
		
		
		}while(escolha != 5);
		
		
		System.out.println("Valor final total dos instrumentos financeiros: ");
		System.out.println(x.calcularSaldoTotal());
		
		
	
		
		
	}

	
}
