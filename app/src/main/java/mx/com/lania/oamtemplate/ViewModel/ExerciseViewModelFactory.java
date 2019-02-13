package mx.com.lania.oamtemplate.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.ExerciseRepository;

/**
 * Created by macbook on 05/03/18.
 */

public class ExerciseViewModelFactory implements ViewModelProvider.Factory {


    @Inject
    ExerciseRepository exerciseRepository;

    ExerciseViewModel exerciseViewModel;

    public ExerciseViewModelFactory(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (exerciseViewModel == null) {
            if (modelClass.isAssignableFrom(ExerciseViewModel.class)) {
                exerciseViewModel = new ExerciseViewModel(exerciseRepository);
            }
        }
        if (exerciseViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) exerciseViewModel;
    }

}
