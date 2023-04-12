
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escuela
 */
public class ImagenPanel extends javax.swing.JPanel{
    int x,y;
    String ruta;
    public ImagenPanel(JPanel unpanel,String rutaimagen){
 this.x=unpanel.getWidth();
 this.y=unpanel.getHeight();
 this.setSize(x,y);
 ruta=rutaimagen;
}
@Override
public void paint(Graphics g){
    ImageIcon Img=new ImageIcon(getClass().getResource(ruta));
    g.drawImage(Img.getImage(),0,0,x,y,null);
}
}
