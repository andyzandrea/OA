package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.EdificiosDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Edificios;

public class EdificiosRepository {
    private EdificiosDao edificiosDao;

    @Inject
    public EdificiosRepository(EdificiosDao edificiosDao) {
        this.edificiosDao = edificiosDao;
    }

    public void insertarEdificios(Edificios edificios) {
        edificiosDao.insertEdificios(edificios);
    }

    public Edificios getEdificios() {
        return edificiosDao.getEdificios();
    }

    public void borrarDatosTabla() {
        edificiosDao.borrarDatosTabla();
    }
}
