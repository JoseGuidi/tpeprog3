/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal;

/**
 *
 * @author PC
 */
public class EmpresasMicro {
    int idempresa;
    String nomyap;
    public EmpresasMicro(){
    idempresa=-1;
    nomyap="";
    }
    public EmpresasMicro(int id,String nya)
    {
    idempresa=id;
    nomyap=nya;
    }
    public int get_idempresa()
    {
        return idempresa;
    }
    public void set_nomyap(String nya){
   nomyap=nya;
    }
    public String get_nomyap()
    {
        return nomyap;
    }
    public void set_id(int id)
{
idempresa=id;
}
}
