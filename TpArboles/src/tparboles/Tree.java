/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tparboles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ilari
 */
public class Tree {
    
    private Integer value;
    private Tree left;
    private Tree right;

    public Tree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
    }

    public Integer getValue() {
            return value;
    }

    public Integer getRoot(){
        return this.getValue();
    }
    
    public boolean hasElem(Integer e){
        if(value.equals(e)){
            return true;
        }
        else{
            if(this.left!=null)
                this.left.hasElem(e);
            if(this.right!=null)
                this.right.hasElem(e);
        }
        return false;
    }
    
    public boolean isEmpty(){
        return value==null;
    }
    
    public void printInOrder(){
        if(left!=null)
            left.printInOrder();
        else
            System.out.println("-");
        System.out.println(value);
        if(right!=null)
            right.printInOrder();
        else
            System.out.println("-");
        
    }
    
    public void printPosOrder(){
        if(left!=null)
            left.printPosOrder();
        else
            System.out.println("-");
        if(right!=null)
            right.printPosOrder();
        else
            System.out.println("-");
        System.out.println(value);
    }
    
    public void printPreOrder(){
        
        System.out.println(value);
        if(left!=null)
            left.printPreOrder();
        else
            System.out.println("-");
        if(right!=null)
            right.printPreOrder();
        else
            System.out.println("-");
    }
    
    public int getHeight(){
        return (this.getHeightPlusOne()-1);
    }
    
    private int getHeightPlusOne(){
        int height=0;
        if(value!=null){
            if((left!=null)&&(right!=null)){
                if(left.getHeightPlusOne()>right.getHeightPlusOne()){
                    height+=left.getHeightPlusOne();
                }
                else{
                    height+=right.getHeightPlusOne();
                }
            }
            else if(left!=null){
                height+=left.getHeightPlusOne();
            }
            else if(right!=null){
                height+=right.getHeightPlusOne();
            }
            height++;
        }
        return height;
    }

   public int returnSum(){
       int sum=0;
       if (value!=null)
        sum=value;
       if(right!=null)
           sum+=right.returnSum();
       if(left!=null)
        sum+=left.returnSum();
       
       return sum;
   }
    
   public List numerosMayor(int n){
       ArrayList list=new ArrayList();
       if(value!=null){
           if(left!=null)
               list.addAll(left.numerosMayor(n));
           if(value>n)
               list.add(value);
           if(right!=null)
               list.addAll(right.numerosMayor(n));
       }
       return list; 
       
   }   
    public int returnSuc(Tree parent,String dir){
        if((left==null)&&(right==null)){
            int val=value;
            if(dir=="iz"){
                parent.left=null;
            }
            else
                parent.right=null;
            value=null;
            return val;
        }
            
        if(left.left==null){
            if(left.right!=null)
            {
                int val=left.value;
                Tree aux=left;
                this.left=left.right;
                aux.right=null;
                return val;
            }
            else{
                int val=left.value;
                left=null;
                return val;
            }
        }
        else return left.returnSuc(this,"iz");
    }
    
    private void reasignate(Tree n){
        this.value=n.value; //hace el puente entre los nodos
        Tree aux=n;
        Tree auxl=aux.left;
        Tree auxr=aux.right;
        n.value=null;
        n.left=null;
        n.right=null;
        this.left=auxl;
        this.right=auxr;
    }
    
    
    
    public boolean delete(Integer i){
        if(value!=null){
            if(value.equals(i)){
                if((right!=null)&&(left!=null)){
                     this.value=right.returnSuc(this,"der"); //cuando tenes que borrar uno que tiene dos hijos, lo tenes que sustituir por el
                                                    //predecesor o sucedor, el sucesor es el mas chico del arbol derecho
                     return true;
                }
                else if(right!=null){
                    this.reasignate(right); //cuando tenes que borrar derecha y tiene hijos, los reasigna
                    return true;
                }
                else if(left!=null){
                    this.reasignate(left);
                    return true;
                }
                else if((right==null)&&(left==null)){
                    this.value=null; //izquierda y derecha son nulos, mi valor es nulo
                    return true;
                }
            }
            else if(i<value)
                return left.delete(i);
            else
                return right.delete(i);
        }
        return false;
    }
    
    
    public List getLongestBranch(){
        ArrayList list=new ArrayList();
        if(value!=null)
            list.add(value);
        if((left!=null)&&(right!=null)){
            if(left.getHeight()>right.getHeight())
                list.addAll(left.getLongestBranch());
            else
                list.addAll(right.getLongestBranch());
        }
        else if(left!=null)
            list.addAll(left.getLongestBranch());
        else if(right!=null)
            list.addAll(right.getLongestBranch());
        return list;
    }
    
    
    
    public List getFrontier(){
        ArrayList list=new ArrayList();
        if((left==null)&&(right==null)){
            if(value!=null)
                list.add(value);
        }
        else{
            if(left!=null)
                list.addAll(left.getFrontier());
            if(right!=null)
                list.addAll(right.getFrontier());
        }
        return list;
    }
    
    public Integer getMaxElem(){
        if(value!=null){
            int max=value;
            if((left!=null)&&(left.getMaxElem()>max))
                max=left.getMaxElem();
            else if((right!=null)&&(right.getMaxElem()>max)){
                max=right.getMaxElem();
            }
            return max;
        }
        else
            return -1;
    }
    
    public Integer getMaxElement(){
        if(value!=null){
            
            if(right!=null){
                return right.getMaxElement();
            }
            else
                return value;
        }
        return -1; 
    }
    
    public List getElemAtLevel(int l){
        ArrayList list=new ArrayList();
        if(value!=null){
            if(l>0){
                if(left!=null)
                    list.addAll(left.getElemAtLevel(l-1));
                if(right!=null)
                    list.addAll(right.getElemAtLevel(l-1));
            }
            else
                list.add(value);
        }
        return list;
    }
    
    public void add(Integer newValue) {
            if (newValue < this.value) {
                    if (this.left == null)
                            this.left = new Tree(newValue);
                    else
                            this.left.add(newValue);
            } else if (newValue > this.value) {
                    if (this.right == null)
                            this.right = new Tree(newValue);
                    else
                            this.right.add(newValue);
            }
    }
}
