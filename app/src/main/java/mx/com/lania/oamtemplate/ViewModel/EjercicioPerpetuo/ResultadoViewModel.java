package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Resultado;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.ResultadoRepository;

public class ResultadoViewModel extends ViewModel {
    private ResultadoRepository resultadoRepository;

    public ResultadoViewModel(ResultadoRepository resultadoRepository) {
        this.resultadoRepository = resultadoRepository;
    }

    public void insertarResultado(Resultado resultado) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> resultadoRepository.insertarResultado(resultado));
    }

    public Resultado getResultado() {
        return resultadoRepository.getResultado();
    }

    public void borrarDatosTabla() {
        resultadoRepository.borrarDatosTabla();
    }
}