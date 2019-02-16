package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.AcreedoresDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Acreedores;

public class AcreedoresRepository {
    private AcreedoresDao acreedoresDao;

    @Inject
    public AcreedoresRepository(AcreedoresDao acreedoresDao) {
        this.acreedoresDao = acreedoresDao;
    }

    public void insertarAcreedores(Acreedores acreedores) {
        acreedoresDao.insertAcreedores(acreedores);
    }

    public Acreedores getAcreedores() {
        return acreedoresDao.getAcreedor();
    }

    public void borrarDatosTabla() {
        acreedoresDao.borrarDatosTabla();
    }
}
