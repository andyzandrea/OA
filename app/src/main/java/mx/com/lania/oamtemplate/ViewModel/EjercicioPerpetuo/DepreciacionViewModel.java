package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Depreciacion;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.DepreciacionRepository;

public class DepreciacionViewModel extends ViewModel {
    private DepreciacionRepository depreciacionRepository;

    public DepreciacionViewModel(DepreciacionRepository depreciacionRepository) {
        this.depreciacionRepository = depreciacionRepository;
    }

    public void insertarDepreciacion(Depreciacion depreciacion) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> depreciacionRepository.insertarDepreciacion(depreciacion));
    }

    public Depreciacion getDepreciacion() {
        return depreciacionRepository.getDepreciacion();
    }

    public void borrarDatosTabla() {
        depreciacionRepository.borrarDatosTabla();
    }
}
