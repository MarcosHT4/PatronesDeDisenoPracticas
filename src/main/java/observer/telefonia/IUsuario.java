package observer.telefonia;

import java.util.List;

public interface IUsuario {

    void update(String msg, Notificacion notificacion);

    List<TipoNotificacion> getPreferenciaNotificacion();

}
