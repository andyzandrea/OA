package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.DepreciacionRepository;

public class DepreciacionViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    DepreciacionRepository depreciacionRepository;

    DepreciacionViewModel depreciacionViewModel;

    public DepreciacionViewModelFactory(DepreciacionRepository depreciacionRepository) {
        this.depreciacionRepository = depreciacionRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (depreciacionViewModel == null) {
            if (modelClass.isAssignableFrom(DepreciacionViewModel.class)) {
                depreciacionViewModel = new DepreciacionViewModel(depreciacionRepository);
            }
        }
        if (depreciacionViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) depreciacionViewModel;
    }
}