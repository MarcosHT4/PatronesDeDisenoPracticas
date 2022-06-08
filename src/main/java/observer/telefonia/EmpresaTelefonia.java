package observer.telefonia;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTelefonia implements IEmpresa{

    private List<IUsuario> users = new ArrayList<>();

    public EmpresaTelefonia() {}

    public void enviarPropaganda(Notificacion notificacion) {

        System.out.println("Enviando propaganda de: " + notificacion.getTipoNotificacion());
        this.notifyObservers(notificacion);

    }


    @Override
    public void attach(IUsuario usuario) {

        users.add(usuario);

    }

    @Override
    public void detach(IUsuario usuario) {

        users.remove(usuario);

    }

    @Override
    public void notifyObservers(Notificacion notificacion) {


        for(IUsuario usuario : users) {

            for(TipoNotificacion tipoNotificacion : usuario.getPreferenciaNotificacion()) {

                if(tipoNotificacion.equals(notificacion.getTipoNotificacion())) {

                    usuario.update("Propaganda de: " + notificacion.getTipoNotificacion(), notificacion);

                }

            }

        }

    }
}
