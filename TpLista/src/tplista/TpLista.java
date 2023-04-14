/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tplista;

/**
 *
 * @author ilari
 */
public class TpLista {

    public MySimpleLinkedList construirNuevaListaDes(MySimpleLinkedList a,MySimpleLinkedList b){
        MySimpleLinkedList aux=new MySimpleLinkedList();
        boolean finish=false;
        int j=0;
        while(!finish){
            int var1=(int)a.get(j);
            for(int i=j+1;i<a.size();i++){
                if(var1<(int)a.get(i)){
                    var1=(int)a.get(i);
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
