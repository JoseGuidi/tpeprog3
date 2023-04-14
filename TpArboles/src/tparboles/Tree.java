/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tparboles;

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
    
    public void printPreOrder(){
        if(left!=null)
            left.printPreOrder();
        else
            System.out.println("-");
        System.out.println(value);
        if(right!=null)
            right.printPreOrder();
        else
            System.out.println("-");
    }
    
    public int getHeight(){
        int height=0;
        
        if(value!=null){
            if((left!=null)&&(right!=null)){
                if(left.getHeight()>right.getHeight()){
                    height+=left.getHeight();
                }
                else{
                    height+=right.getHeight();
                }
            }
            else if(left!=null){
                height+=left.getHeight();
            }
            else if(right!=null){
                height+=right.getHeight();
            }

            height++;
        }
        return height;
    }
    
    public void delete(Integer e){
        
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
