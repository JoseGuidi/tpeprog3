/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7ej3;

/**
 *
 * @author ilari
 */
public class CondicionNivelSolinfYNivelRiegoSup extends Condicion{
    int nivelriego;
    int nivelsol;
    
    
    public boolean cumple(Planta p){
        return (!(p.requiereNivelDeRiegoInferior(nivelriego))&&!(p.requierenNivelDeSolSup(nivelsol)));
    }
    
    public CondicionNivelSolinfYNivelRiegoSup(int nivelsol,int nivelriego){
        this.nivelsol=nivelsol;
        this.nivelriego=nivelriego;
    }
    
}
