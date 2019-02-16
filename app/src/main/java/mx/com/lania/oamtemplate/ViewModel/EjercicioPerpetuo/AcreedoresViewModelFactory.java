package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.AcreedoresRepository;

public class AcreedoresViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    AcreedoresRepository acreedoresRepository;

    AcreedoresViewModel acreedoresViewModel;

    public AcreedoresViewModelFactory(AcreedoresRepository acreedoresRepository) {
        this.acreedoresRepository = acreedoresRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (acreedoresViewModel == null) {
            if (modelClass.isAssignableFrom(AcreedoresViewModel.class)) {
                acreedoresViewModel = new AcreedoresViewModel(acreedoresRepository);
            }
        }
        if (acreedoresViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) acreedoresViewModel;
    }
}
