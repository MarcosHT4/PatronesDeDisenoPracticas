package observer.telefonia;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        EmpresaTelefonia empresaTelefonia = new EmpresaTelefonia();

        List<TipoNotificacion> tipoNotificacions = new ArrayList<>();

        tipoNotificacions.add(TipoNotificacion.PREMIOS);
        tipoNotificacions.add(TipoNotificacion.PROMOCIONES);

        Usuario usuario1 = new Usuario(new Persona("384590", "Dalas"), tipoNotificacions);

        List<TipoNotificacion> tipoNotificacions2 = new ArrayList<>();

        tipoNotificacions2.add(TipoNotificacion.NOTICIA);

        Usuario usuario2 = new Usuario(new Persona("83980354", "Javi"), tipoNotificacions2);

        List<TipoNotificacion> tipoNotificacions3 = new ArrayList<>();

        tipoNotificacions3.add(TipoNotificacion.PRECIOSLLAMADAS);
        tipoNotificacions3.add(TipoNotificacion.PROMOCIONES);
        tipoNotificacions3.add(TipoNotificacion.NOTICIA);

        Usuario usuario3 = new Usuario(new Persona("37485735", "Nauter"), tipoNotificacions3);

        empresaTelefonia.attach(usuario1);
        empresaTelefonia.attach(usuario2);
        empresaTelefonia.attach(usuario3);

        empresaTelefonia.enviarPropaganda(new Notificacion(TipoNotificacion.NOTICIA, "Noticia sobre La Paz!"));
        empresaTelefonia.enviarPropaganda(new Notificacion(TipoNotificacion.PREMIOS, "Anunciando los ganadores del premio!"));
        empresaTelefonia.enviarPropaganda(new Notificacion(TipoNotificacion.PROMOCIONES, "Nueva promocion del Samsung S25!"));
        empresaTelefonia.enviarPropaganda(new Notificacion(TipoNotificacion.PRECIOSLLAMADAS, "Anunciando los nuevos precios!!"));




    }

}
