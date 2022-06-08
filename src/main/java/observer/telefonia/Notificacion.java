package observer.telefonia;

public class Notificacion {

    private TipoNotificacion tipoNotificacion;
    private String contenido;

    public Notificacion(TipoNotificacion tipoNotificacion, String contenido) {

        this.tipoNotificacion = tipoNotificacion;
        this.contenido = contenido;


    }

    public TipoNotificacion getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
