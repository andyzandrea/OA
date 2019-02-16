package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.EdificiosRepository;

public class EdificiosViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    EdificiosRepository edificiosRepository;

    EdificiosViewModel edificiosViewModel;

    public EdificiosViewModelFactory(EdificiosRepository edificiosRepository) {
        this.edificiosRepository = edificiosRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (edificiosViewModel == null) {
            if (modelClass.isAssignableFrom(EdificiosViewModel.class)) {
                edificiosViewModel = new EdificiosViewModel(edificiosRepository);
            }
        }
        if (edificiosViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) edificiosViewModel;
    }
}