package procesadores;

public abstract class ColaDeTareasOrdenada extends ColaDeTareas {

	@Override
	public void addTarea(Tarea nuevaTarea) {
		int index = 0;
		boolean encontrado = false;

		while (!encontrado && index < this.tareas.size()) {
			Tarea aux = this.tareas.get(index);
			if (this.esMayor(aux, nuevaTarea)) {
				index++;
			} else {
				encontrado = true;
			}
		}
		this.tareas.add(index, nuevaTarea);

	}
	
	public abstract boolean esMayor(Tarea tarea1, Tarea tarea2);

}
