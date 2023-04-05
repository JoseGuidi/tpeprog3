package procesadores;

public class Procesador {

	private ColaDeTareas cola;
	
	public Procesador(ColaDeTareas cola) {
		this.cola = cola;
	}
	
	public void cambiarCola(ColaDeTareas nueva) {
		Tarea t = this.cola.getPrimeraTarea();
		while (t != null) {
			nueva.addTarea(t);
			t = this.cola.getPrimeraTarea();
		}
		this.cola = nueva;
	}
	
	public void ejecutar() {
		this.cola.getPrimeraTarea().ejecutar();
	}
	
	public void addTarea(Tarea nuevaTarea) {
		this.cola.addTarea(nuevaTarea);
	}

}
