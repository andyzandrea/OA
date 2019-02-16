package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.MaquinariaDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Maquinaria;

public class MaquinariaRepository {
    private MaquinariaDao maquinariaDao;

    @Inject
    public MaquinariaRepository(MaquinariaDao maquinariaDao) {
        this.maquinariaDao = maquinariaDao;
    }

    public void insertarMaquinaria(Maquinaria maquinaria) {
        maquinariaDao.insertMaquinaria(maquinaria);
    }

    public Maquinaria getMaquinaria() {
        return maquinariaDao.getMaquinaria();
    }
}
