package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Ventas;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.VentasRepository;

public class VentasViewModel extends ViewModel {
    private VentasRepository ventasRepository;

    public VentasViewModel(VentasRepository ventasRepository) {
        this.ventasRepository = ventasRepository;
    }

    public void insertarVentas(Ventas ventas) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> ventasRepository.insertarVentas(ventas));
    }

    public Ventas getVentas() {
        return ventasRepository.getVentas();
    }

    public void borrarDatosTabla() {
        ventasRepository.borrarDatosTabla();
    }
}