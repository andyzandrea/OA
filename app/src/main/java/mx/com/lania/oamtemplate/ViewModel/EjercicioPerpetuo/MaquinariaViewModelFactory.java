package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.MaquinariaRepository;

public class MaquinariaViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    MaquinariaRepository maquinariaRepository;

    MaquinariaViewModel maquinariaViewModel;

    public MaquinariaViewModelFactory(MaquinariaRepository maquinariaRepository) {
        this.maquinariaRepository = maquinariaRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (maquinariaViewModel == null) {
            if (modelClass.isAssignableFrom(MaquinariaViewModel.class)) {
                maquinariaViewModel = new MaquinariaViewModel(maquinariaRepository);
            }
        }
        if (maquinariaViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) maquinariaViewModel;
    }
}