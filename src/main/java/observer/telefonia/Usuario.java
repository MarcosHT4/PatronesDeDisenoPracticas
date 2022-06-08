package observer.telefonia;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements IUsuario{

    private Persona persona;
    private List<TipoNotificacion> tiposNotificacion;

    public Usuario(Persona persona, List<TipoNotificacion> tiposNotificacion) {

        this.persona = persona;
        this.tiposNotificacion = tiposNotificacion;

    }



    @Override
    public void update(String msg, Notificacion notificacion) {

        System.out.println("Notificacion: " + msg);
        System.out.print("Categorias del usuario: " + persona.getName() + ": ");
        for(TipoNotificacion tipoNotificacion: tiposNotificacion) {

            System.out.print(tipoNotificacion + ", ");

        }

        System.out.println();

        System.out.println("Contenido de la notificacion: " + notificacion.getContenido());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

    }

    @Override
    public List<TipoNotificacion> getPreferenciaNotificacion() {
        return tiposNotificacion;
    }
}
