package procesadores;

import java.util.ArrayList;

public abstract class ColaDeTareas {
	
	protected ArrayList<Tarea> tareas;
	
	public ColaDeTareas() {
		this.tareas =new ArrayList<>();
	}
	
	public abstract void addTarea(Tarea nuevaTarea);
	
	public Tarea getPrimeraTarea() {
		if (!this.tareas.isEmpty()) {
			return tareas.remove(0); // retorna y remueve
		}
		else
			return null;
	}

}
