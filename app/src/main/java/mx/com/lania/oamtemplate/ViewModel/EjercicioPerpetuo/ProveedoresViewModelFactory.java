package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.ProveedoresRepository;

public class ProveedoresViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    ProveedoresRepository proveedoresRepository;

    ProveedoresViewModel proveedoresViewModel;

    public ProveedoresViewModelFactory(ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (proveedoresViewModel == null) {
            if (modelClass.isAssignableFrom(ProveedoresViewModel.class)) {
                proveedoresViewModel = new ProveedoresViewModel(proveedoresRepository);
            }
        }
        if (proveedoresViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) proveedoresViewModel;
    }
}