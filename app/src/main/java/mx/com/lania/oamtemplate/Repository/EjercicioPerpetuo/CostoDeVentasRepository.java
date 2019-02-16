package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.CostoDeVentasDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.CostoDeVentas;

public class CostoDeVentasRepository {
    private CostoDeVentasDao costoDeVentasDao;

    @Inject
    public CostoDeVentasRepository(CostoDeVentasDao costoDeVentasDao) {
        this.costoDeVentasDao = costoDeVentasDao;
    }

    public void insertarCostoDeVentas(CostoDeVentas costoDeVentas) {
        costoDeVentasDao.insertCostoDeVentas(costoDeVentas);
    }

    public CostoDeVentas getCostoDeVentas() {
        return costoDeVentasDao.getCostoDeVentas();
    }

    public void borrarDatosTabla() {
        costoDeVentasDao.borrarDatosTabla();
    }
}
