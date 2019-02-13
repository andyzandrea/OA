package mx.com.lania.oamtemplate.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EvaluationRepository;

public class EvaluationViewModelFactory implements ViewModelProvider.Factory {


    @Inject
    EvaluationRepository evaluationRepository;

    EvaluationViewModel evaluationViewModel;

    public EvaluationViewModelFactory(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (evaluationViewModel == null) {
            if (modelClass.isAssignableFrom(EvaluationViewModel.class)) {
                evaluationViewModel = new EvaluationViewModel(evaluationRepository);
            }
        }
        if (evaluationViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) evaluationViewModel;
    }
}
