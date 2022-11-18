
public class DesarrolladorFrontend extends Empleado implements OperacionEmpleado  {
	public DesarrolladorFrontend(int aniosExperienciaBootstrap, boolean experienciaCloud) {
		super();
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
		this.experienciaCloud = experienciaCloud;
	}
	private int aniosExperienciaBootstrap;
	private boolean experienciaCloud;
	public int getAniosExperienciaBootstrap() {
		return aniosExperienciaBootstrap;
	}
	public void setAniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
	}
	public boolean isExperienciaCloud() {
		return experienciaCloud;
	}
	public void setExperienciaCloud(boolean experienciaCloud) {
		this.experienciaCloud = experienciaCloud;
	}
	protected double SALARIO_MINIMO;
	protected double DESCUENTO_EPS;
	protected double DESCUENTO_FP;
	private double AUMENTO_VARIABLE;
	
	public static void main(String[] args) {
		SALARIO_MINIMO sm = new SALARIO_MINIMO(980000);
		DESCUENTO_EPS de = new DESCUENTO_EPS(4);
		DESCUENtO_FP df = new DESCUENtO_FP(4);
		
	}
	public double getAUMENTO_VARIABLE() {
		return AUMENTO_VARIABLE;
	}
	public void setAUMENTO_VARIABLE(double aUMENTO_VARIABLE) {
		AUMENTO_VARIABLE = aUMENTO_VARIABLE;
	}

	
}
