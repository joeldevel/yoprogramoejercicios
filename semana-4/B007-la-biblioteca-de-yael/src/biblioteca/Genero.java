package biblioteca;

public enum Genero {
	FANTASIA(102), INFANTIL(125), NOVELA(589), TERROR(125), COCINA(100);
	private int codigo;
	private Genero(int codigo) {
		this.codigo=codigo;
	}
	public int getCodigo() {
		return this.codigo;
	}
}
