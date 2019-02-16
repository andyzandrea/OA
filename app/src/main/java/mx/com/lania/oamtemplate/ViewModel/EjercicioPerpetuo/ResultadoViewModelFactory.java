package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.ResultadoRepository;

public class ResultadoViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    ResultadoRepository resultadoRepository;

    ResultadoViewModel resultadoViewModel;

    public ResultadoViewModelFactory(ResultadoRepository resultadoRepository) {
        this.resultadoRepository = resultadoRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (resultadoViewModel == null) {
            if (modelClass.isAssignableFrom(ResultadoViewModel.class)) {
                resultadoViewModel = new ResultadoViewModel(resultadoRepository);
            }
        }
        if (resultadoViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) resultadoViewModel;
    }
}