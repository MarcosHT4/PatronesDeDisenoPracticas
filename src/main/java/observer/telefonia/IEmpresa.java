package observer.telefonia;

public interface IEmpresa {

    void attach(IUsuario usuario);

    void detach(IUsuario usuario);

    void notifyObservers(Notificacion notificacion);

}
