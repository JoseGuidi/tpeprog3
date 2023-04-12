
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escuela
 */
public class Anotador extends javax.swing.JFrame {
int puntos=0;
int puntos2=0;
    /**
     * Creates new form Anotador
     */
    public Anotador() {
    initComponents();
    ImagenPanel ip=new ImagenPanel(Panel,"/img/mesita.png");
    Panel.add(ip).repaint();
    ponerimg1(puntos);
    ponerimg2(puntos2);
    ellosnos();
        
    }

    
           

private void ellosnos()
{
    String imagenruta1;
    String ruta="/img/";
    imagenruta1=ruta+"nos.png";
    ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta1));
    jLabel2.setIcon(icon1);
    imagenruta1=ruta+"ellos.png";
    ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta1));
    jLabel1.setIcon(icon2);
}
private void ponerimg1(int puntos)
{
    int p;
    p=puntos;
    String imagenruta;
    String ruta="/img/";
    if(p==0)
    {
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon0);
    }
    if(p==1){
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon1);
        
       
    }
    if(p==2){
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon2);
    }
    if(p==3)
    {
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon3);
    }
    if(p==4)
    {
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon4);
    }
    if(p==5)
    {
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon5);
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon0);
    } 
    if(p==6)
    {
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon6=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon6);
    }
        if(p==7)
    {
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon6=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon6);
        imagenruta=ruta+"2p.png";
        ImageIcon icon7=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon7);
    }
        if(p==8)
    {
       
      

        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon6=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon6);
        imagenruta=ruta+"2p.png";
        ImageIcon icon7=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon7);
        imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon8);
    }
        if(p==9)
    {
                imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon6=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon6);
        imagenruta=ruta+"2p.png";
        ImageIcon icon7=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon7);
        imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon8);
        imagenruta=ruta+"4p.png";
        ImageIcon icon9=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon9);
    }
        if(p==10)
    {
                        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p1.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon6=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon6);
        imagenruta=ruta+"2p.png";
        ImageIcon icon7=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon7);
        imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon8);
        imagenruta=ruta+"4p.png";
        ImageIcon icon9=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon9);
        imagenruta=ruta+"5p.png";
        ImageIcon icon10=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon10);
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon0);
    }
        if(p==11)
    {
        imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon8);
        imagenruta=ruta+"4p.png";
        ImageIcon icon9=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon9);
        imagenruta=ruta+"5p.png";
        ImageIcon icon10=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon10);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon1);
    }
        if(p==12)
    {
                imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon8);
        imagenruta=ruta+"4p.png";
        ImageIcon icon9=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon9);
        imagenruta=ruta+"5p.png";
        ImageIcon icon10=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon10);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon2);
    }
        if(p==13)
    {
                        imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon8);
        imagenruta=ruta+"4p.png";
        ImageIcon icon9=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon9);
        imagenruta=ruta+"5p.png";
        ImageIcon icon10=new ImageIcon(getClass().getResource(imagenruta));
        p2.setIcon(icon10);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon3);
    }
        if(p==14)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon4);
    }
        if(p==15)
    {
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon5);
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p4.setIcon(icon0);
    }
        if(p==16)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p3.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p4.setIcon(icon1);
    }
        if(p==17)
    {
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p4.setIcon(icon2);
    }
        if(p==18)
    {
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p4.setIcon(icon3);
    }
        if(p==19)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p4.setIcon(icon4);
    }
        if(p==20)
    {
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p4.setIcon(icon5);
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p5.setIcon(icon0);
    }
        if(p==21)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p4.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p4.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p5.setIcon(icon1);
    }
        if(p==22)
    {
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p5.setIcon(icon2);
    }
        if(p==23)
    {
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p5.setIcon(icon3);
    }
        if(p==24)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p5.setIcon(icon4);
    }
        if(p==25)
    {
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p5.setIcon(icon5);
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p6.setIcon(icon0);
    }
        if(p==26)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p5.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p5.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p6.setIcon(icon1);
    }
        if(p==27)
    {
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p6.setIcon(icon2);
    }
        if(p==28)
    {
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p6.setIcon(icon3);
    }
        if(p==29)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p6.setIcon(icon4);
    }
        if(p==30)
    {
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p6.setIcon(icon5);
        JOptionPane.showMessageDialog(null,"Ganó","Fin de juego", JOptionPane.ERROR_MESSAGE);
    }
}   
private void ponerimg2(int puntos2)
{
    int p;
    p=puntos2;
    String imagenruta;
    String ruta="/img/";
    if(p==0)
    {
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon0);
    }
    if(p==1){
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon1);
    }
    if(p==2){
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon2);
    }
    if(p==3)
    {
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon3);
    }
    if(p==4)
    {
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon4);
    }
    if(p==5)
    {
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon5);
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon0);
    } 
    if(p==6)
    {
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon6=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon6);
    }
        if(p==7)
    {
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon6=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon6);
        imagenruta=ruta+"2p.png";
        ImageIcon icon7=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon7);
    }
        if(p==8)
    {
       
      

        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon6=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon6);
        imagenruta=ruta+"2p.png";
        ImageIcon icon7=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon7);
        imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon8);
    }
        if(p==9)
    {
                imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon6=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon6);
        imagenruta=ruta+"2p.png";
        ImageIcon icon7=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon7);
        imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon8);
        imagenruta=ruta+"4p.png";
        ImageIcon icon9=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon9);
    }
        if(p==10)
    {
                        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon3);
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p7.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon6=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon6);
        imagenruta=ruta+"2p.png";
        ImageIcon icon7=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon7);
        imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon8);
        imagenruta=ruta+"4p.png";
        ImageIcon icon9=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon9);
        imagenruta=ruta+"5p.png";
        ImageIcon icon10=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon10);
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon0);
    }
        if(p==11)
    {
        imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon8);
        imagenruta=ruta+"4p.png";
        ImageIcon icon9=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon9);
        imagenruta=ruta+"5p.png";
        ImageIcon icon10=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon10);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon1);
    }
        if(p==12)
    {
                imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon8);
        imagenruta=ruta+"4p.png";
        ImageIcon icon9=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon9);
        imagenruta=ruta+"5p.png";
        ImageIcon icon10=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon10);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon2);
    }
        if(p==13)
    {
                        imagenruta=ruta+"3p.png";
        ImageIcon icon8=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon8);
        imagenruta=ruta+"4p.png";
        ImageIcon icon9=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon9);
        imagenruta=ruta+"5p.png";
        ImageIcon icon10=new ImageIcon(getClass().getResource(imagenruta));
        p8.setIcon(icon10);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon1);
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon2);
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon3);
    }
        if(p==14)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon4);
    }
        if(p==15)
    {
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon5);
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p10.setIcon(icon0);
    }
        if(p==16)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p9.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p10.setIcon(icon1);
    }
        if(p==17)
    {
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p10.setIcon(icon2);
    }
        if(p==18)
    {
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p10.setIcon(icon3);
    }
        if(p==19)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p10.setIcon(icon4);
    }
        if(p==20)
    {
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p10.setIcon(icon5);
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p11.setIcon(icon0);
    }
        if(p==21)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p10.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p10.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p11.setIcon(icon1);
    }
        if(p==22)
    {
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p11.setIcon(icon2);
    }
        if(p==23)
    {
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p11.setIcon(icon3);
    }
        if(p==24)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p11.setIcon(icon4);
    }
        if(p==25)
    {
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p11.setIcon(icon5);
        imagenruta=ruta+"0p.png";
        ImageIcon icon0=new ImageIcon(getClass().getResource(imagenruta));
        p12.setIcon(icon0);
    }
        if(p==26)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p11.setIcon(icon4);
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p11.setIcon(icon5);
        imagenruta=ruta+"1p.png";
        ImageIcon icon1=new ImageIcon(getClass().getResource(imagenruta));
        p12.setIcon(icon1);
    }
        if(p==27)
    {
        imagenruta=ruta+"2p.png";
        ImageIcon icon2=new ImageIcon(getClass().getResource(imagenruta));
        p12.setIcon(icon2);
    }
        if(p==28)
    {
        imagenruta=ruta+"3p.png";
        ImageIcon icon3=new ImageIcon(getClass().getResource(imagenruta));
        p12.setIcon(icon3);
    }
        if(p==29)
    {
        imagenruta=ruta+"4p.png";
        ImageIcon icon4=new ImageIcon(getClass().getResource(imagenruta));
        p12.setIcon(icon4);
    }
        if(p==30)
    {
        imagenruta=ruta+"5p.png";
        ImageIcon icon5=new ImageIcon(getClass().getResource(imagenruta));
        p12.setIcon(icon5);
        JOptionPane.showMessageDialog(null,"Ganó","Fin de juego", JOptionPane.ERROR_MESSAGE);
    }
}   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        n10 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        p7 = new javax.swing.JLabel();
        n6 = new javax.swing.JButton();
        p12 = new javax.swing.JLabel();
        p11 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        n1 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        p6 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Panel.setName("Panel"); // NOI18N

        n10.setText("+");
        n10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n10ActionPerformed(evt);
            }
        });

        n9.setText("-");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        n8.setText("+3");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        n7.setText("No quiero");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n6.setText("+2");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        n1.setText("-");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n5.setText("+3");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n4.setText("No quiero");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n3.setText("+2");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n2.setText("+");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n2)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n3)
                            .addComponent(n4)
                            .addComponent(n5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(186, 186, 186)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(p7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(n2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                            .addComponent(n10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(n9)))
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(n6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n8))
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(n3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        if(puntos==30)
        {
            puntos=30;
        }
        else{
        puntos=puntos+1;
        ponerimg1(puntos);
        System.out.println(puntos);}
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
                if(puntos==30)
        {
            puntos=30;
        }
                else{
        puntos=puntos+2;
        ponerimg1(puntos);
        System.out.println(puntos);}// TODO add your handling code here:
    }//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
                if(puntos2==30)
        {
            puntos2=30;
        }
                else{
        puntos2=puntos2+1;
        ponerimg2(puntos2);
        System.out.println(puntos);}// TODO add your handling code here:
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        if(puntos==30)
        {
            puntos=30;
        }
        else{
        puntos=puntos+3;
        ponerimg1(puntos);
        System.out.println(puntos);}// TODO add your handling code here:
    }//GEN-LAST:event_n5ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        if(puntos==0)
        {
            puntos=0;
        }
        else{
        puntos=puntos-1;
        ponerimg1(puntos);
        System.out.println(puntos);}// TODO add your handling code here:
    }//GEN-LAST:event_n1ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
                if(puntos2==30)
        {
            puntos2=30;
        }
                else{
        puntos2=puntos2+2;
        ponerimg2(puntos2);
        System.out.println(puntos2);}// TODO add your handling code here:
    }//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
                if(puntos==30)
        {
            puntos=30;
        }
                else{
        puntos=puntos+1;
        ponerimg1(puntos);
        System.out.println(puntos);}// TODO add your handling code here:
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
                if(puntos2==30)
        {
            puntos2=30;
        }
                else{
        puntos2=puntos2+3;
        ponerimg2(puntos2);
        System.out.println(puntos2);}// TODO add your handling code here:
    }//GEN-LAST:event_n8ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
                if(puntos2==0)
        {
            puntos2=0;
        }
                else{
        puntos2=puntos2-1;
        ponerimg2(puntos2);
        System.out.println(puntos2);}// TODO add your handling code here:
    }//GEN-LAST:event_n9ActionPerformed

    private void n10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n10ActionPerformed
                if(puntos2==30)
        {
            puntos2=30;
        }
                else{
        puntos2=puntos2+1;
        ponerimg2(puntos2);
        System.out.println(puntos2);}// TODO add your handling code here:
    }//GEN-LAST:event_n10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Anotador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anotador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anotador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anotador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anotador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton n1;
    private javax.swing.JButton n10;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p11;
    private javax.swing.JLabel p12;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    // End of variables declaration//GEN-END:variables
}
