package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.CostoDeVentasRepository;

public class CostoDeVentasViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    CostoDeVentasRepository costoDeVentasRepository;

    CostoDeVentasViewModel costoDeVentasViewModel;

    public CostoDeVentasViewModelFactory(CostoDeVentasRepository costoDeVentasRepository) {
        this.costoDeVentasRepository = costoDeVentasRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (costoDeVentasViewModel == null) {
            if (modelClass.isAssignableFrom(CostoDeVentasViewModel.class)) {
                costoDeVentasViewModel = new CostoDeVentasViewModel(costoDeVentasRepository);
            }
        }
        if (costoDeVentasViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) costoDeVentasViewModel;
    }
}