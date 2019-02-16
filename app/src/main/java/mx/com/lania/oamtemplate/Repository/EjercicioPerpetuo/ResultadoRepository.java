package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.ResultadoDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Resultado;

public class ResultadoRepository {
    private ResultadoDao resultadoDao;

    @Inject
    public ResultadoRepository(ResultadoDao resultadoDao) {
        this.resultadoDao = resultadoDao;
    }

    public void insertarResultado(Resultado resultado) {
        resultadoDao.insertResultado(resultado);
    }

    public Resultado getResultado() {
        return resultadoDao.getResultado();
    }

    public void borrarDatosTabla() {
        resultadoDao.borrarDatosTabla();
    }
}
