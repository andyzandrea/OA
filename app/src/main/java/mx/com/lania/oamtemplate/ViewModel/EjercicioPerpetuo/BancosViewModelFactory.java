package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.BancosRepository;

public class BancosViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    BancosRepository bancosRepository;

    BancosViewModel bancosViewModel;

    public BancosViewModelFactory(BancosRepository bancosRepository) {
        this.bancosRepository = bancosRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (bancosViewModel == null) {
            if (modelClass.isAssignableFrom(BancosViewModel.class)) {
                bancosViewModel = new BancosViewModel(bancosRepository);
            }
        }
        if (bancosViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) bancosViewModel;
    }
}