package procesadores;

public class ColaDeTareaPorCPU extends ColaDeTareasOrdenada {

	@Override
	public boolean esMayor(Tarea tarea1, Tarea tarea2) {
		return tarea1.getCpu() > tarea2.getCpu();	
	}

}
