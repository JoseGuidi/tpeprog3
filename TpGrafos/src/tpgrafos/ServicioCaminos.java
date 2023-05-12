/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpgrafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ilari
 */
public class ServicioCaminos {
    private Grafo<?> grafo;
	private int origen;
	private int destino;
	
	
	// Servicio caminos
	public ServicioCaminos(Grafo<?> grafo, int origen, int destino) {
		this.grafo = grafo;
		this.origen = origen;
		this.destino = destino;
		
	}

	public List<List<Integer>> caminos() {
		// Resolver Caminos
		return new ArrayList<>();
	}
        
}
