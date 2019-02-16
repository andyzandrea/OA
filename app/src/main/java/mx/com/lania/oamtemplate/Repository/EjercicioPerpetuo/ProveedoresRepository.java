package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.ProveedoresDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Proveedores;

public class ProveedoresRepository {
    private ProveedoresDao proveedoresDao;

    @Inject
    public ProveedoresRepository(ProveedoresDao proveedoresDao) {
        this.proveedoresDao = proveedoresDao;
    }

    public void insertarProveedores(Proveedores proveedores) {
        proveedoresDao.insertProveedores(proveedores);
    }

    public Proveedores getProveedores() {
        return proveedoresDao.getProveedores();
    }

    public void borrarDatosTabla() {
        proveedoresDao.borrarDatosTabla();
    }
}
