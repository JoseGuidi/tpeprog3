package procesadores;

public class MainProcesadores {

	public static void main(String[] args) {
	
		
		Tarea t1 = new Tarea(1,2,2,2); // id, p, m, c
		Tarea t2 = new Tarea(2,5,5,5);
		Tarea t3 = new Tarea(3,9,1,7);
		
		Procesador proc = new Procesador(new ColaDeTareasPorMemoria());

		proc.addTarea(t1);
		proc.addTarea(t2);
		proc.addTarea(t3);
	
		proc.ejecutar(); // Deberia ejecutar t2
		
		// Cambia la forma de ordenamiento al cambiar la Cola
		proc.cambiarCola(new ColaDeTareaPorCPU());
		
		proc.ejecutar(); //t3, si mantuviese la ColaPorMemoria hubiese ejecutado t1
		proc.ejecutar(); //t1
	}
	
}
