package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.DepreciacionDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Depreciacion;

public class DepreciacionRepository {
    private DepreciacionDao depreciacionDao;

    @Inject
    public DepreciacionRepository(DepreciacionDao depreciacionDao) {
        this.depreciacionDao = depreciacionDao;
    }

    public void insertarDepreciacion(Depreciacion depreciacion) {
        depreciacionDao.insertDepreciacion(depreciacion);
    }

    public Depreciacion getDepreciacion() {
        return depreciacionDao.getDepreciacion();
    }

    public void borrarDatosTabla() {
        depreciacionDao.borrarDatosTabla();
    }
}
