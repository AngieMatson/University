import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Service extends UnicastRemoteObject implements RMI {
	Scanner lectura = new Scanner (System.in);
	
    private static final long serialVersionUID = 1L;
    public Service() throws RemoteException {
    }
     Cuenta cuentaCliente1= new Cuenta("angie", "angie", 1500000);
     
   Cuenta RegistroDeClientes[] ={cuentaCliente1};
    
   @Override
	public boolean ConfirmarCuenta(String Nombre, String password) throws RemoteException {
		for(int j=0;j<RegistroDeClientes.length;j++) {
			if(RegistroDeClientes[j].getNombre().equals(Nombre)) {
				if(RegistroDeClientes[j].getPassword().equals(password)) {
				   cuentaCliente1=RegistroDeClientes[j];
				   return true;
				}
			}
		}
		return false;
	}
	@Override
	public int IngresarMonto( int IngresarSaldo) throws RemoteException {
		if(IngresarSaldo<0) {
			System.out.println("Cantidad de dinero no suficiente");
			return 0;
		}
		else {
			System.out.println("Cantidad de dinero ingresado"+ IngresarSaldo);
			cuentaCliente1.setSaldo((cuentaCliente1.getSaldo()+ IngresarSaldo));
		return 1;	
		}
	}

	@Override
	public int RetirarMonto( int RetirarSaldo) throws RemoteException {
		if(RetirarSaldo<0) {
			System.out.println("Cantidad de dinero no suficiente");
			return 0;	
		}
		System.out.println("Cantidad de dinero retirado es: "+ RetirarSaldo);
		cuentaCliente1.setSaldo((cuentaCliente1.getSaldo()+ RetirarSaldo));
	return 1;	
	
	}

	@Override
	public int MostrarMonto() throws RemoteException {
		return cuentaCliente1.getSaldo();
		
	}
}
