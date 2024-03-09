package ColaDeSolicitud;
import javax.swing.JOptionPane;

public class Tecnico {

        Solicitud mensaje = new Solicitud();
        int opcion=0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar solicitud \n 2. Mostrar cola"));
                switch (opcion) {
                    case 1:
                        mensaje.agregarcola();
                        break;
                    case 2:
                        // Se muestra la cola
                        mensaje.MostrarCola();

                        break;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
        }while (opcion!=3);



}



