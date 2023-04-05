package procesadores;

public class ColaDeTareasPorMemoria extends ColaDeTareasOrdenada {

	@Override
	public boolean esMayor(Tarea tarea1, Tarea tarea2) {
		return tarea1.getMemoria() > tarea2.getMemoria();
	}

}
