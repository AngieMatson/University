import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI extends Remote {
	public boolean ConfirmarCuenta(String Nombre,String password)throws RemoteException;
    public int  IngresarCantidad(int IngresarValor)throws RemoteException;
    public int RetirarCantidad (int RetirarValor)throws RemoteException;
    public int MostrarCantidad()throws RemoteException;
	
	
    
}
