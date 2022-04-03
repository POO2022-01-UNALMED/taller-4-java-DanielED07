package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	//private String nombre;
	private Tipo(int codigo){//,String nombre) { // Se cambia public a private
		this.codigo = codigo;
		//this.nombre = nombre; No se considera el nombre, ya esta por defecto
	}
}
