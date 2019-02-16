package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.AlmacenRepository;

public class AlmacenViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    AlmacenRepository almacenRepository;

    AlmacenViewModel almacenViewModel;

    public AlmacenViewModelFactory(AlmacenRepository almacenRepository) {
        this.almacenRepository = almacenRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (almacenViewModel == null) {
            if (modelClass.isAssignableFrom(AlmacenViewModel.class)) {
                almacenViewModel = new AlmacenViewModel(almacenRepository);
            }
        }
        if (almacenViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) almacenViewModel;
    }
}