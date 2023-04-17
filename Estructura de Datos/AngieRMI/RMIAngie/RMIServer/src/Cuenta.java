
public class Cuenta {
	private String nombre;
    private String contraseña;
    private String  CuentaNum;
    private int Saldo;
    public Cuenta(String nombre, String password, int saldo) {
		super();
		nombre = nombre;
		this.contraseña = contraseña;
		Saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre = nombre;
	}
	public String getPassword() {
		return contraseña;
	}
	public void setPassword(String password) {
		this.contraseña = contraseña;
	}
	public String getNumeroDeCuent() {
		return CuentaNum;
	}
	public void setNumeroDeCuent(String numeroDeCuent) {
		CuentaNum= CuentaNum;
	}
	public int getSaldo() {
		return Saldo;
	}
	public void setSaldo(int saldo) {
		Saldo = saldo;
	}
    
}
