/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej3;

/**
 *
 * @author ilari
 */
public class CondicionNivelSolSupYNivelRiegoInferior extends Condicion{
    int nivelSol;
    int nivelRiego;
    
    public boolean cumple(Planta p){
        return (p.requierenNivelDeSolSup(nivelSol)&&p.requiereNivelDeRiegoInferior(nivelRiego));
    }
    
    public CondicionNivelSolSupYNivelRiegoInferior(int nivelSol,int nivelRiego){
        this.nivelRiego=nivelRiego;
        this.nivelSol=nivelSol;
    }
}
