package Main;

import Controlador.Controlador_Vista1;
import Vista.Vista1;
public class Principal {
    
    public static Vista1 Vst_1;
    public static Controlador.Controlador_Vista1 c_Vst_1;

    
    public static void main(String[] args) {
        Vista1 newframe = new Vista1();
        newframe.setVisible(true); 
        newframe.setLocationRelativeTo(null);
        
        c_Vst_1=new Controlador_Vista1(Vst_1); 
        
    }
    
}
