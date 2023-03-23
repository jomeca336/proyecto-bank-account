
public class crearCuenta {

	public static void main(String[] args) {
		
	cuenta primeraCuenta= new cuenta ();
	cuenta segundaCuenta= new cuenta();
	
	primeraCuenta.depositar(3000);
primeraCuenta.retirar(150);
primeraCuenta.transferir(segundaCuenta, 500);
	System.out.println(segundaCuenta.saldo); 
		
		
	}
	
	
}
