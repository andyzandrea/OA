package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Proveedores;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.ProveedoresRepository;

public class ProveedoresViewModel extends ViewModel {
    private ProveedoresRepository proveedoresRepository;

    public ProveedoresViewModel(ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository;
    }

    public void insertarProveedores(Proveedores proveedores) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> proveedoresRepository.insertarProveedores(proveedores));
    }

    public Proveedores getProveedores() {
        return proveedoresRepository.getProveedores();
    }

    public void borrarDatosTabla() {
        proveedoresRepository.borrarDatosTabla();
    }
}
