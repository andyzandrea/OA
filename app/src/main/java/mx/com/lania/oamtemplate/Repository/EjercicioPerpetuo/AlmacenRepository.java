package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.AlmacenDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Almacen;

public class AlmacenRepository {
    private AlmacenDao almacenDao;

    @Inject
    public AlmacenRepository(AlmacenDao almacenDao) {
        this.almacenDao = almacenDao;
    }

    public void insertarAlmacen(Almacen almacen) {
        almacenDao.insertAlmacen(almacen);
    }

    public Almacen getAlmacen() {
        return almacenDao.getAlmacen();
    }

    public void borrarDatosTabla() {
        almacenDao.borrarDatosTabla();
    }
}
