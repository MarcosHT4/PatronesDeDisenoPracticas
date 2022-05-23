package prototype.distribuidorCelulares;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Accesorio> accesorioList = new ArrayList<>();

        Accesorio audifonos = new Accesorio();

        audifonos.setTipoDeAccesorio("Audifonos");

        Accesorio cargador = new Accesorio();

        cargador.setTipoDeAccesorio("Cargador");

        Accesorio estuche = new Accesorio();

        estuche.setTipoDeAccesorio("Estuche");

        accesorioList.add(audifonos);
        accesorioList.add(cargador);
        accesorioList.add(estuche);

        Sim defaultSim = new Sim();

        defaultSim.setNombreEmpresaTel("");
        defaultSim.setNumTelefono("");



        SamsungR10 template = new SamsungR10();



        template.setSize("Mediano");
        template.setVersionAndroid("13");
        template.setBluetooth("5.2");
        template.setCantidadDeMemoriasExternas(3);
        template.setCamara("20 Mpx");
        template.setMemory("16 Gb Ram");
        template.setTipoDeBateria("4000 mAh LiOn");
        template.setCpu("Snapdragon 865");
        template.setAccesorios(accesorioList);
        template.setSim(defaultSim);

        SamsungR10 samsung1 = (SamsungR10) template.clone();

        Sim sim1 = new Sim();

        sim1.setNumTelefono("76789943");
        sim1.setNombreEmpresaTel("TIGO");

        samsung1.setSim(sim1);
        samsung1.showInfo();

        SamsungR10 samsung2 = (SamsungR10) template.clone();

        Sim sim2 = new Sim();

        sim2.setNumTelefono("69957375");
        sim2.setNombreEmpresaTel("Entel");

        samsung2.setSim(sim2);
        samsung2.showInfo();


        SamsungR10 samsung3 = (SamsungR10) template.clone();

        Sim sim3 = new Sim();

        sim3.setNumTelefono("767422847");
        sim3.setNombreEmpresaTel("VIVA");

        samsung3.setSim(sim3);
        samsung3.showInfo();









    }

}
