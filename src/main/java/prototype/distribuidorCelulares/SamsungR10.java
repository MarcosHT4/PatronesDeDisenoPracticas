package prototype.distribuidorCelulares;

import java.util.ArrayList;
import java.util.List;

public class SamsungR10 implements ISamsungR10 {

    private String size;
    private String cpu;
    private String memory;
    private Sim sim;
    private String versionAndroid;
    private String camara;
    private String bluetooth;
    private int cantidadDeMemoriasExternas;
    private String tipoDeBateria;
    private List<Accesorio> accesorios;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(int cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    public String getTipoDeBateria() {
        return tipoDeBateria;
    }

    public void setTipoDeBateria(String tipoDeBateria) {
        this.tipoDeBateria = tipoDeBateria;
    }

    public List<Accesorio> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(List<Accesorio> accesorios) {
        this.accesorios = accesorios;
    }

    @Override

    public Object clone() {

        Sim cloneS = new Sim();
        cloneS.setNumTelefono(this.sim.getNumTelefono());
        cloneS.setNombreEmpresaTel(this.sim.getNombreEmpresaTel());

        List<Accesorio> cloneListA = new ArrayList<>();

        for (Accesorio a : accesorios) {

            Accesorio accesorio = new Accesorio();
            accesorio.setTipoDeAccesorio(a.getTipoDeAccesorio());
            cloneListA.add(accesorio);

        }


        SamsungR10 cloneSam = new SamsungR10();

        cloneSam.setSim(cloneS);
        cloneSam.setAccesorios(cloneListA);
        cloneSam.setCpu(this.getCpu());
        cloneSam.setMemory(this.getMemory());
        cloneSam.setCamara(this.getCamara());
        cloneSam.setBluetooth(this.getBluetooth());
        cloneSam.setTipoDeBateria(this.getTipoDeBateria());
        cloneSam.setVersionAndroid(this.getVersionAndroid());
        cloneSam.setSize(this.getSize());
        cloneSam.setCantidadDeMemoriasExternas(3);




        return cloneSam;

    }

    public void showInfo() {

        System.out.println("Samsung R10: ");
        System.out.println("Tamaño: " + size);
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("Sim NombreEmpresaTel: " + sim.getNombreEmpresaTel());
        System.out.println("Sim NumeroTelefono: " + sim.getNumTelefono());
        System.out.println("Version Android: " + versionAndroid);
        System.out.println("Camara: " + camara);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("Cantidad de Memorias Externas: " + cantidadDeMemoriasExternas);
        System.out.println("Tipo Bateria: " + tipoDeBateria);


        for(int i = 0; i< accesorios.size(); i++) {

            System.out.println("Accesorio " + (i+1) + ": " + accesorios.get(i).getTipoDeAccesorio() );

        }

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");


    }



}
