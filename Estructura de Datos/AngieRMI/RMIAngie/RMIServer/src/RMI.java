import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI extends Remote {
 public boolean ConfirmarCuenta(String Nombre,String contraseña)throws RemoteException;
 public int  IngresarMonto(int IngresarValor)throws RemoteException;
 public int RetirarMonto (int RetirarValor)throws RemoteException;
 public int MostrarMonto()throws RemoteException;
}
