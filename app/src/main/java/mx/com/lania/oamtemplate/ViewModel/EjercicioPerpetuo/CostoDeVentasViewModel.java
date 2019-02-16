package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.CostoDeVentas;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.CostoDeVentasRepository;

public class CostoDeVentasViewModel extends ViewModel {
    private CostoDeVentasRepository costoDeVentasRepository;

    public CostoDeVentasViewModel(CostoDeVentasRepository costoDeVentasRepository) {
        this.costoDeVentasRepository = costoDeVentasRepository;
    }

    public void insertarCostoDeVentas(CostoDeVentas costoDeVentas) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> costoDeVentasRepository.insertarCostoDeVentas(costoDeVentas));
    }

    public CostoDeVentas getCostoDeVentas() {
        return costoDeVentasRepository.getCostoDeVentas();
    }

    public void borrarDatosTabla() {
        costoDeVentasRepository.borrarDatosTabla();
    }
}