package procesadores;

public class ColaDeTareasPorOrdenDeLlegada extends ColaDeTareas {

	@Override
	public void addTarea(Tarea nuevaTarea) {
		this.tareas.add(nuevaTarea);
	}

}
