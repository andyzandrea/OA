package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Almacen;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.AlmacenRepository;

public class AlmacenViewModel extends ViewModel {
    AlmacenRepository almacenRepository;


    public AlmacenViewModel(AlmacenRepository almacenRepository) {
        this.almacenRepository = almacenRepository;
    }

    public void insertarAlmacen(Almacen almacen) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> almacenRepository.insertarAlmacen(almacen));
    }

    public Almacen getAlmacen() {
        return almacenRepository.getAlmacen();
    }

    public void borrarDatosTabla() {
        almacenRepository.borrarDatosTabla();
    }
}
