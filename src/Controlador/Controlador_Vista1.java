package Controlador;

import Modelo.ListarProductos;
import Modelo.Producto;
import Modelo.Registro;
import Vista.Vista1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_Vista1 implements ActionListener{
    
    Vista1 Vst_1;
    
    public Controlador_Vista1(Vista1 Vst_1){
        this.Vst_1 = Vst_1;
        this.Vst_1.btnregistro.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Vst_1.btnregistro){
            
            String seleccion=Vst_1.txtseleccion.getText();
            int cantidad=Integer.parseInt(Vst_1.txtcantidad.getText());
            
            Producto P=new Producto(seleccion,cantidad);
            Registro R=new Registro();
            R.registrarbd(P);
            
            ListarProductos lp=new ListarProductos();
            lp.MostrarTable(Vst_1.jTable);
            limpiarentradas();
            
        }
    }

    private void limpiarentradas() {
        Vst_1.txtseleccion.setText("");
        Vst_1.txtcantidad.setText("");
    }
    
}
