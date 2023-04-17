// Imports
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RemoteException, FileNotFoundException {
    	Properties properties= new Properties(); //Scanner to input values
		Scanner sc = new Scanner(System.in);
    	try {
			properties.load(new FileInputStream(new File("client.properties")));
			Client client = new Client(
					(String) properties.get("IP"),
					(String) properties.get("PORT"),
					(String) properties.get("SERVICENAME")
			);
			//Validación de datos
			System.out.println("Elegir la opción:");
			System.out.println("1.Sacar Dinero" + "2.Retirar Dinero" + "3.Consultar Dinero");
			Scanner input = new Scanner(System.in);
			int elegir = Integer.parseInt(input.nextLine());
			switch (elegir) {
				case 1:
					if (elegir == 1) {
						//Ingreso de datos
						System.out.println("Ingrese el nombre: ");
						String name = sc.next().toString();
						System.out.println("Ingrese la contraseña: ");
						String password = sc.next().toString();
						//validación y pedir mediante el método
						if (client.ConfirmarCuenta(name, password)) {
							Scanner cantidad = new Scanner(System.in);
							int cant = Integer.parseInt(cantidad.nextLine());
							client.IngresarCantidad(cant);
						}
						System.out.println("Ingreso Exitoso" + " " + "El valor a ingresar fue" + client.IngresarCantidad(cant));
					} else {
				System.out.println("Datos ingresados son Incorrectos, verificar nuevamente.");
					}
				case 2:
					if (elegir == 2) {
						//Pedir datos
						System.out.println("Ingrese el nombre: ");
						String name = sc.next().toString();
						System.out.println("Ingrese la contraseña: ");
						String password = sc.next().toString();
						// Validar datos
						if (client.ConfirmarCuenta(name, password)) {
							Scanner retirar = new Scanner(System.in);
							int sacar = Integer.parseInt(retirar.nextLine());
							client.RetirarCantidad(sacar);

						}else {
						System.out.println("Datos ingresados son Incorrectos, verificar nuevamente.");
					}
					}
				case 3:
					if (elegir == 3) {
						System.out.println("Ingrese el nombre: ");
						String name = sc.next().toString();
						System.out.println("Ingrese la contraseña: ");
						String password = sc.next().toString();
						// Validar datos
						if (client.ConfirmarCuenta(name, password)) {
							Scanner consultar = new Scanner(System.in);
							int consul = Integer.parseInt(consultar.nextLine());
							client.RetirarCantidad(consul);
						}} else {
						System.out.println("Datos ingresados son Incorrectos, verificar nuevamente.");
					}

					}

			}catch(RemoteException e){
				throw new RuntimeException(e);
			} catch(FileNotFoundException e){
				throw new RuntimeException(e);
			} catch(IOException e){
				throw new RuntimeException(e);
			}
			System.out.println("RMI Client");
		} catch (IOException e)
			{
		throw new RuntimeException(e);
			}
		}
}}