/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeprog;

/**
 *
 * @author ilari
 */
public class CriterioNegado extends Criterio{
    Criterio c1;
    @Override
    public int compare(Object o1, Object o2) {
        return c1.compare(o1, o2)*-1;
    }

    public CriterioNegado(Criterio c1) {
        this.c1 = c1;
    }
    
}
