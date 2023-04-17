
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	private String serviceName;
    private String ip;
    private String port;
	private RMI service;
	private String url;

	public Client(String ip, String port, String serviceName) {
        this.service = null;
        this.ip = ip;
        this.port = port;
        this.serviceName = serviceName;
        this.url = "rmi://" + ip + ":" + port + "/" + serviceName;
    }
	  
	   public boolean ConfirmarCuenta(String Nombre, String password) throws RemoteException {
		try {
			service=(RMI)Naming.lookup(url);
			return service.ConfirmarCuenta(Nombre, password);
			
		}catch(MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
			return false;
			}
		}
		public int IngresarCantidad( int IngresarValor) throws RemoteException {
			try {
				service=(RMI)Naming.lookup(url);
				return service.IngresarCantidad(IngresarValor);
				
			}catch(MalformedURLException | RemoteException | NotBoundException e) {
				e.printStackTrace();
				return 0;
			}
		}

		public int RetirarCantidad( int RetirarValor) throws RemoteException {
			try {
				service=(RMI)Naming.lookup(url);
				return service.RetirarCantidad(RetirarValor);
				
			}catch(MalformedURLException | RemoteException | NotBoundException e) {
				e.printStackTrace();
				return 0;
			}
		}

		
		public int MostrarCantidad() throws RemoteException {
			try {
				service=(RMI)Naming.lookup(url);
				return service.MostrarCantidad();
				
			}catch(MalformedURLException | RemoteException | NotBoundException e) {
				e.printStackTrace();
				return 0;
			}
		}

}
