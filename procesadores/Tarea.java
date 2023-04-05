package procesadores;

public class Tarea {


	private int id;
	private int prioridad;
	private int memoria;
	private int cpu;

	public Tarea(int id, int p, int m, int c) {
		this.id = id;
		this.prioridad = p;
		this.memoria = m;
		this.cpu = c;
	}

	public int getMemoria() {
		return memoria;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public int getCpu() {
		return cpu;
	}
	
	public int getId() {
		return id;
	}
	
	public void ejecutar() {
		System.out.println("Me ejecuto: " + this);
	}
	
	// Redefinimos el equals para que funcione el contains y el remove
	// del ArrayList<Tarea> (ver clase MainArrayList).
	public boolean equals(Object obj) {
		try {
			Tarea otraTarea = (Tarea) obj;
			return otraTarea.getId() == this.id;
		} catch (Exception e) {
			return false;
		}
	}
	


	// Redefinimos el toString para poder imprimir por pantalla
	// La lista de tareas de los procesadores
	public String toString() {
		return "Tarea [id=" + id + ", prioridad=" + prioridad + ", memoria=" + memoria + ", cpu=" + cpu + "]";
	}

}
