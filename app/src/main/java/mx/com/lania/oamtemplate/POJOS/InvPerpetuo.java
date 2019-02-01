package mx.com.lania.oamtemplate.POJOS;

public class InvPerpetuo {
    String nombre;
    long importe;
    String cuenta;
    String naturaleza;

    public InvPerpetuo() {

    }

    public InvPerpetuo(String nombre, long importe, String cuenta, String naturaleza) {
        this.nombre = nombre;
        this.importe = importe;
        this.cuenta = cuenta;
        this.naturaleza = naturaleza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getImporte() {
        return importe;
    }

    public void setImporte(long importe) {
        this.importe = importe;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }
}
