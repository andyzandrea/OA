package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.CapitalSocialDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.CapitalSocial;

public class CapitalSocialRepository {
    private CapitalSocialDao capitalSocialDao;

    @Inject
    public CapitalSocialRepository(CapitalSocialDao capitalSocialDao) {
        this.capitalSocialDao = capitalSocialDao;
    }

    public void insertarCapitalSocial(CapitalSocial capitalSocial) {
        capitalSocialDao.insertCapitalSocial(capitalSocial);
    }

    public CapitalSocial getCapitalSocial() {
        return capitalSocialDao.getCapitalSocial();
    }

    public void borrarDatosTabla() {
        capitalSocialDao.borrarDatosTabla();
    }
}
