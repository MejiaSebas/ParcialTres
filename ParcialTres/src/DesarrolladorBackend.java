
public class DesarrolladorBackend extends Empleado implements OperacionEmpleado{
	private String skill;
	private String listaLenguajes;
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getListaLenguajes() {
		return listaLenguajes;
	}
	public void setListaLenguajes(String listaLenguajes) {
		this.listaLenguajes = listaLenguajes;
	}
	//Se crearon atributos y se crearon los metodos getter y setter
	
	private double AUMENTO_VARIABLE;
	@Override
	public void devolverSalario() {
	
		double S = SALARIO_MINIMO+AUMENTO_VARIABLE;
		setSalario(S*((DESCUENTO_EPS+DESCUENTO_FP)/100));
		
	}
	public double getAUMENTO_VARIABLE() {
		return AUMENTO_VARIABLE;
	}
	public void setAUMENTO_VARIABLE(double aUMENTO_VARIABLE) {
		AUMENTO_VARIABLE = aUMENTO_VARIABLE;
	}
	
}
