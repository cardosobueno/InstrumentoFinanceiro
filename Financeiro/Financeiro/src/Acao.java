
public class Acao extends InstrumentoFinanceiro {
	
	private int cotas;
	
	public Acao(int cotas) {
		super();
		this.cotas = cotas;
	}

	public void setCotas(int cotas)
	{
		this.cotas = cotas;
	}
	
	public float calcularSaldoTotal()
	{
		return this.getSaldo() * this.cotas;
	}
}



	
	
	



