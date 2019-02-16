package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.VentasRepository;

public class VentasViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    VentasRepository ventasRepository;

    VentasViewModel ventasViewModel;

    public VentasViewModelFactory(VentasRepository ventasRepository) {
        this.ventasRepository = ventasRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (ventasViewModel == null) {
            if (modelClass.isAssignableFrom(VentasViewModel.class)) {
                ventasViewModel = new VentasViewModel(ventasRepository);
            }
        }
        if (ventasViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) ventasViewModel;
    }
}