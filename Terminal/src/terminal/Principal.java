/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal;

import java.util.Vector;

/**
 *
 * @author PC
 */
public class Principal extends javax.swing.JFrame {
Vector vempresas;
Vector vdestinos;
Vector vpasaje;
Vector vlocalidad;
Vector vpasajero;

public void add_empresa(EmpresasMicro l)
{
    vempresas.add(l);
}
public EmpresasMicro get_empresa(int pos)
{
    return (EmpresasMicro) vempresas.elementAt(pos);
}
public int get_cantidadempresas()
{
    return vempresas.size();
}
public Vector get_vectorempresas()
{
    return vempresas;
}
public void add_destino(Destinos l)
{
    vdestinos.add(l);
}
public Destinos get_destino(int pos)
{
    return (Destinos) vdestinos.elementAt(pos);
}
public int get_cantidaddestinos()
{
    return vdestinos.size();
}
public Vector get_vectordestinos()
{
    return vdestinos;
}
public void add_pasaje(Pasaje l)
{
    vpasaje.add(l);
}
public Pasaje get_pasaje(int pos)
{
    return (Pasaje) vpasaje.elementAt(pos);
}
public int get_cantidadpasaje()
{
    return vpasaje.size();
}
public Vector get_vectorpasaje()
{
    return vpasaje;
}
public void add_localidad(Localidad l)    
{
    vlocalidad.add(l);
}
public Localidad get_localidad(int pos)
{
    return (Localidad) vlocalidad.elementAt(pos);
}
public int get_cantidadlocalidades()
{
    return vlocalidad.size();
}
public Vector get_vectorlocalidad()
{
    return vlocalidad;
}
public void add_pasajero(Pasajero l)
{
    vpasajero.add(l);
}
public Pasajero get_pasajero(int pos)
{
    return (Pasajero) vpasajero.elementAt(pos);
}
public int get_cantidadpasajeros()
{
    return vpasajero.size();
}
public Vector get_vectorpasajeros()
{
    return vpasajero;
}
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        vempresas=new Vector();
        vdestinos=new Vector();
        vpasaje=new Vector();
        vlocalidad=new Vector();
        vpasajero=new Vector();
        
        Bnuevoempresa.setVisible(false);
        Blistadoempresa.setVisible(false);
        Bnuevodestino.setVisible(false);
        Blistadodestino.setVisible(false);
        Bnuevopasajero.setVisible(false);
        Blistadopasajero.setVisible(false);
        Bnuevopasaje.setVisible(false);
        Blistadopasaje.setVisible(false);
        Blistadolocalidad.setVisible(false);
        Bnuevolocalidad.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones_localidad = new javax.swing.ButtonGroup();
        botones_pasajero = new javax.swing.ButtonGroup();
        botones_pasaje = new javax.swing.ButtonGroup();
        botones_destinos = new javax.swing.ButtonGroup();
        botones_empresas = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Bnuevodestino = new javax.swing.JRadioButton();
        Blistadodestino = new javax.swing.JRadioButton();
        botondestinos = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Bnuevolocalidad = new javax.swing.JRadioButton();
        Blistadolocalidad = new javax.swing.JRadioButton();
        botonlocalidades = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Bnuevoempresa = new javax.swing.JRadioButton();
        Blistadoempresa = new javax.swing.JRadioButton();
        botonempresas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        botonpasaje = new javax.swing.JButton();
        Blistadopasaje = new javax.swing.JRadioButton();
        Bnuevopasaje = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        botonpasajero = new javax.swing.JButton();
        Blistadopasajero = new javax.swing.JRadioButton();
        Bnuevopasajero = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(0, 255, 255));
        Panel.setMaximumSize(new java.awt.Dimension(270, 300));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(140, 300));
        jPanel2.setLayout(new java.awt.GridLayout(5, 1));

        Bnuevodestino.setBackground(new java.awt.Color(204, 255, 204));
        botones_destinos.add(Bnuevodestino);
        Bnuevodestino.setText("Nuevo");
        Bnuevodestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevodestinoActionPerformed(evt);
            }
        });

        Blistadodestino.setBackground(new java.awt.Color(204, 255, 204));
        botones_destinos.add(Blistadodestino);
        Blistadodestino.setText("Listado");
        Blistadodestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlistadodestinoActionPerformed(evt);
            }
        });

        botondestinos.setText("Destinos");
        botondestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondestinosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botondestinos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(Bnuevodestino)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Blistadodestino)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(botondestinos)
                    .addGap(4, 4, 4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bnuevodestino)
                        .addComponent(Blistadodestino))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel4);

        Bnuevolocalidad.setBackground(new java.awt.Color(204, 255, 204));
        botones_localidad.add(Bnuevolocalidad);
        Bnuevolocalidad.setText("Nuevo");
        Bnuevolocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevolocalidadActionPerformed(evt);
            }
        });

        Blistadolocalidad.setBackground(new java.awt.Color(204, 255, 204));
        botones_localidad.add(Blistadolocalidad);
        Blistadolocalidad.setText("Listado");
        Blistadolocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlistadolocalidadActionPerformed(evt);
            }
        });

        botonlocalidades.setText("Localidad");
        botonlocalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlocalidadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botonlocalidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(Bnuevolocalidad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Blistadolocalidad)))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(botonlocalidades)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bnuevolocalidad)
                        .addComponent(Blistadolocalidad))
                    .addGap(26, 26, 26)))
        );

        jPanel2.add(jPanel7);

        Bnuevoempresa.setBackground(new java.awt.Color(204, 255, 204));
        botones_empresas.add(Bnuevoempresa);
        Bnuevoempresa.setText("Nuevo");
        Bnuevoempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevoempresaActionPerformed(evt);
            }
        });

        Blistadoempresa.setBackground(new java.awt.Color(204, 255, 204));
        botones_empresas.add(Blistadoempresa);
        Blistadoempresa.setText("Listado");
        Blistadoempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlistadoempresaActionPerformed(evt);
            }
        });

        botonempresas.setText("Empresas ");
        botonempresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonempresasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonempresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(Bnuevoempresa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Blistadoempresa)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(botonempresas)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bnuevoempresa)
                        .addComponent(Blistadoempresa))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel3);

        botonpasaje.setText("Pasaje");
        botonpasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpasajeActionPerformed(evt);
            }
        });

        Blistadopasaje.setBackground(new java.awt.Color(204, 255, 204));
        botones_pasaje.add(Blistadopasaje);
        Blistadopasaje.setText("Listado");
        Blistadopasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlistadopasajeActionPerformed(evt);
            }
        });

        Bnuevopasaje.setBackground(new java.awt.Color(204, 255, 204));
        botones_pasaje.add(Bnuevopasaje);
        Bnuevopasaje.setText("Nuevo");
        Bnuevopasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevopasajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonpasaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Bnuevopasaje)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Blistadopasaje)))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(botonpasaje)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bnuevopasaje)
                        .addComponent(Blistadopasaje))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel5);

        botonpasajero.setText("Pasajero");
        botonpasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpasajeroActionPerformed(evt);
            }
        });

        Blistadopasajero.setBackground(new java.awt.Color(204, 255, 204));
        botones_pasajero.add(Blistadopasajero);
        Blistadopasajero.setText("Listado");
        Blistadopasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlistadopasajeroActionPerformed(evt);
            }
        });

        Bnuevopasajero.setBackground(new java.awt.Color(204, 255, 204));
        botones_pasajero.add(Bnuevopasajero);
        Bnuevopasajero.setText("Nuevo");
        Bnuevopasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevopasajeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botonpasajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(Bnuevopasajero)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Blistadopasajero)))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(botonpasajero)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bnuevopasajero)
                        .addComponent(Blistadopasajero))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BnuevolocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevolocalidadActionPerformed
Panel.removeAll();
Panel.add(new PanelLocalidades(this));
Panel.repaint();
Panel.updateUI();   // TODO add your handling code here:
    }//GEN-LAST:event_BnuevolocalidadActionPerformed

    private void BnuevopasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevopasajeroActionPerformed
Panel.removeAll();
Panel.add(new PanelPasajero(this));
Panel.repaint();
Panel.updateUI();       // TODO add your handling code here:
    }//GEN-LAST:event_BnuevopasajeroActionPerformed

    private void BnuevopasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevopasajeActionPerformed
Panel.removeAll();
Panel.add(new PanelPasaje(this));
Panel.repaint();
Panel.updateUI();        // TODO add your handling code here:
    }//GEN-LAST:event_BnuevopasajeActionPerformed

    private void BnuevodestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevodestinoActionPerformed
Panel.removeAll();
Panel.add(new PanelDestinos(this));
Panel.repaint();
Panel.updateUI();        // TODO add your handling code here:
    }//GEN-LAST:event_BnuevodestinoActionPerformed

    private void BnuevoempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevoempresaActionPerformed
Panel.removeAll();
Panel.add(new PanelEmpresas(this));
Panel.repaint();
Panel.updateUI();    // TODO add your handling code here:
    }//GEN-LAST:event_BnuevoempresaActionPerformed

    private void botondestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondestinosActionPerformed
        Bnuevoempresa.setVisible(false);
        Blistadoempresa.setVisible(false);
        Bnuevodestino.setVisible(true);
        Blistadodestino.setVisible(true);
        Bnuevopasajero.setVisible(false);
        Blistadopasajero.setVisible(false);
        Bnuevopasaje.setVisible(false);
        Blistadopasaje.setVisible(false);
        Blistadolocalidad.setVisible(false);
        Bnuevolocalidad.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_botondestinosActionPerformed

    private void botonempresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonempresasActionPerformed
        Bnuevoempresa.setVisible(true);
        Blistadoempresa.setVisible(true);
        Bnuevodestino.setVisible(false);
        Blistadodestino.setVisible(false);
        Bnuevopasajero.setVisible(false);
        Blistadopasajero.setVisible(false);
        Bnuevopasaje.setVisible(false);
        Blistadopasaje.setVisible(false);
        Blistadolocalidad.setVisible(false);
        Bnuevolocalidad.setVisible(false);
    }//GEN-LAST:event_botonempresasActionPerformed

    private void botonpasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpasajeActionPerformed
        Bnuevoempresa.setVisible(false);
        Blistadoempresa.setVisible(false);
        Bnuevodestino.setVisible(false);
        Blistadodestino.setVisible(false);
        Bnuevopasajero.setVisible(false);
        Blistadopasajero.setVisible(false);
        Bnuevopasaje.setVisible(true);
        Blistadopasaje.setVisible(true);
        Blistadolocalidad.setVisible(false);
        Bnuevolocalidad.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_botonpasajeActionPerformed

    private void botonpasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpasajeroActionPerformed
        Bnuevoempresa.setVisible(false);
        Blistadoempresa.setVisible(false);
        Bnuevodestino.setVisible(false);
        Blistadodestino.setVisible(false);
        Bnuevopasajero.setVisible(true);
        Blistadopasajero.setVisible(true);
        Bnuevopasaje.setVisible(false);
        Blistadopasaje.setVisible(false);
        Blistadolocalidad.setVisible(false);
        Bnuevolocalidad.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_botonpasajeroActionPerformed

    private void botonlocalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlocalidadesActionPerformed
        Bnuevoempresa.setVisible(false);
        Blistadoempresa.setVisible(false);
        Bnuevodestino.setVisible(false);
        Blistadodestino.setVisible(false);
        Bnuevopasajero.setVisible(false);
        Blistadopasajero.setVisible(false);
        Bnuevopasaje.setVisible(false);
        Blistadopasaje.setVisible(false);
        Blistadolocalidad.setVisible(true);
        Bnuevolocalidad.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_botonlocalidadesActionPerformed

    private void BlistadodestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlistadodestinoActionPerformed
Panel.removeAll();
Panel.add(new PanelDestinosListado(this));
Panel.repaint();
Panel.updateUI();// TODO add your handling code here:
    }//GEN-LAST:event_BlistadodestinoActionPerformed

    private void BlistadolocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlistadolocalidadActionPerformed
Panel.removeAll();
Panel.add(new PanelLocalidadesListado(this));
Panel.repaint();
Panel.updateUI();          // TODO add your handling code here:
    }//GEN-LAST:event_BlistadolocalidadActionPerformed

    private void BlistadoempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlistadoempresaActionPerformed
Panel.removeAll();
Panel.add(new PanelEmpresasListado(this));
Panel.repaint();
Panel.updateUI();        // TODO add your handling code here:
    }//GEN-LAST:event_BlistadoempresaActionPerformed

    private void BlistadopasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlistadopasajeActionPerformed
Panel.removeAll();
Panel.add(new PanelPasajeListado(this));
Panel.repaint();
Panel.updateUI();        // TODO add your handling code here:
    }//GEN-LAST:event_BlistadopasajeActionPerformed

    private void BlistadopasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlistadopasajeroActionPerformed
 Panel.removeAll();
Panel.add(new PanelPasajeroListado(this));
Panel.repaint();
Panel.updateUI();        // TODO add your handling code here:
    }//GEN-LAST:event_BlistadopasajeroActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Blistadodestino;
    private javax.swing.JRadioButton Blistadoempresa;
    private javax.swing.JRadioButton Blistadolocalidad;
    private javax.swing.JRadioButton Blistadopasaje;
    private javax.swing.JRadioButton Blistadopasajero;
    private javax.swing.JRadioButton Bnuevodestino;
    private javax.swing.JRadioButton Bnuevoempresa;
    private javax.swing.JRadioButton Bnuevolocalidad;
    private javax.swing.JRadioButton Bnuevopasaje;
    private javax.swing.JRadioButton Bnuevopasajero;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton botondestinos;
    private javax.swing.JButton botonempresas;
    private javax.swing.ButtonGroup botones_destinos;
    private javax.swing.ButtonGroup botones_empresas;
    private javax.swing.ButtonGroup botones_localidad;
    private javax.swing.ButtonGroup botones_pasaje;
    private javax.swing.ButtonGroup botones_pasajero;
    private javax.swing.JButton botonlocalidades;
    private javax.swing.JButton botonpasaje;
    private javax.swing.JButton botonpasajero;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
