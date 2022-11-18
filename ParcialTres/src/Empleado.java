
public class Empleado {
	public Empleado(String nombre, String apellidos, String dirrecion, int dni, double salario, char sexo) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Dirrecion = dirrecion;
		Dni = dni;
		Salario = salario;
		this.sexo = sexo;
	}
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	//Se crean las clases con atributos privados
	private String Nombre;
	private String Apellidos;
	private String Dirrecion;
	private int Dni;
	private double Salario;
	private char sexo;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getDirrecion() {
		return Dirrecion;
	}
	public void setDirrecion(String dirrecion) {
		Dirrecion = dirrecion;
	}
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	protected double SALARIO_MINIMO;
	protected double DESCUENTO_EPS;
	protected double DESCUENTO_FP;
	
	
	
	


}
