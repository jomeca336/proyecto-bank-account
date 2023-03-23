
public class cuenta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void depositar (double ValorDeposito) {
		
		this.saldo= this.saldo+ValorDeposito;
		double depositoAnterior= this.saldo - ValorDeposito;
		System.out.println("Deposito exitoso"+"su saldo anterior era "+ depositoAnterior +" y ahora es "+ this.saldo);
		
	}
	
	public void retirar (double ValorRetiro) {
		
		if(ValorRetiro>this.saldo) {
			
			System.out.println("Retiro Fallido. No tiene esa cantidad, "+ "su saldo es"+ this.saldo);
			
		} else {
			
			this.saldo= this.saldo - ValorRetiro;
			System.out.println("Ha retirado "+ ValorRetiro +" su saldo restante es "+ this.saldo);
		}
		
	}
	
	public void transferir (cuenta cuenta, double ValorTransferencia) {
		
		if(ValorTransferencia>this.saldo) {
			
			System.out.println("Transferencia Fallida. No tiene esa cantidad, "+ "su saldo es"+ this.saldo);
			
			
		} else {
			
			
			cuenta.saldo= cuenta.saldo + ValorTransferencia;
			System.out.println("Transferencia exitosa");
		}
		
		
		
	}
	
	
}
