/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpeprog;

/**
 *
 * @author ilari
 */
public class CriterioNumerico extends Criterio{

    @Override
    public int compare(Object o1, Object o2) {
        Integer aux=(Integer)o1;
        Integer aux2=(Integer)o2;
        int result=aux-aux2;
        if(result>0)
            result=1;
        else if(result<0)
            result=-1;
        return result;
    }
    
}
