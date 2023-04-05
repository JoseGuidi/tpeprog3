/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3ej2;

/**
 *
 * @author ilari
 */
public class FabricaDeMuebles {
    private int stockMesas;
    private int stockSillas;
    private int stockBancos;
    private Mueble silla;
    private Mueble banco;
    private Mueble mesa;
    
    public FabricaDeMuebles(int stockMesas,int stockSillas,int stockBancos,Mueble silla,Mueble banco,Mueble mesa){
        this.setStockBancos(stockBancos);
        this.setStockMesas(stockMesas);
        this.setStockSillas(stockSillas);
        this.setBanco(banco);
        this.setMesa(mesa);
        this.setSilla(silla);
    }
    
    
    public int getStockMesas() {
        return stockMesas;
    }

    public int getStockSillas() {
        return stockSillas;
    }

    public int getStockBancos() {
        return stockBancos;
    }

    public void setStockMesas(int stockMesas) {
        this.stockMesas = stockMesas;
    }

    public void setStockSillas(int stockSillas) {
        this.stockSillas = stockSillas;
    }

    public void setStockBancos(int stockBancos) {
        this.stockBancos = stockBancos;
    }

    public void setSilla(Mueble silla) {
        this.silla = silla;
    }

    public void setBanco(Mueble banco) {
        this.banco = banco;
    }

    public void setMesa(Mueble mesa) {
        this.mesa = mesa;
    }

    public Mueble getSilla() {
        return silla;
    }

    public Mueble getBanco() {
        return banco;
    }

    public Mueble getMesa() {
        return mesa;
    }
    
    public String obtenerInfo(){
        return("Stock mesas"+this.getStockMesas()+" stock sillas "+this.getStockSillas()+" stock bancos "+this.getStockBancos()+" mesa "+this.getMesa().obtenerInformacionMueble()+" silla "+this.getSilla().obtenerInformacionMueble()+" banco "+this.getBanco().obtenerInformacionMueble());
    }
    public double calcularPrecioFabricacionTodoStock(){
        double result=0;
        for(int i=0;i<this.getStockBancos(); i++){
            result=result+this.getBanco().getCostoDeFabricacion();
        }
        for(int i=0;i<this.getStockSillas(); i++){
            result=result+this.getSilla().getCostoDeFabricacion();
        }
        for(int i=0;i<this.getStockMesas(); i++){
            result=result+this.getMesa().getCostoDeFabricacion();
        }
        return result;
    }
    public double calcularPrecioVentaTodoStock(){
        double result=0;
        for(int i=0;i<this.getStockBancos(); i++){
            result=result+this.getBanco().getValorDeVenta();
        }
        for(int i=0;i<this.getStockSillas(); i++){
            result=result+this.getSilla().getValorDeVenta();
        }
        for(int i=0;i<this.getStockMesas(); i++){
            result=result+this.getMesa().getValorDeVenta();
        }
        return result;
    }
}
