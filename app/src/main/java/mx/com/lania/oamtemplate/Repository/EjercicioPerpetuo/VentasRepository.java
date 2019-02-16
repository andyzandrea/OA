package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.VentasDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Ventas;

public class VentasRepository {
    private VentasDao ventasDao;

    @Inject
    public VentasRepository(VentasDao ventasDao) {
        this.ventasDao = ventasDao;
    }

    public void insertarVentas(Ventas ventas) {
        ventasDao.insertVentas(ventas);
    }

    public Ventas getVentas() {
        return ventasDao.getVentas();
    }

    public void borrarDatosTabla() {
        ventasDao.borrarDatosTabla();
    }
}
