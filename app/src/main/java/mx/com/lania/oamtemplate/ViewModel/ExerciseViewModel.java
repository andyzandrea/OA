package mx.com.lania.oamtemplate.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.ViewModel;
import mx.com.lania.oamtemplate.Database.Entity.Exercise;
import mx.com.lania.oamtemplate.Repository.ExerciseRepository;

/**
 * Created by macbook on 05/03/18.
 */

public class ExerciseViewModel extends ViewModel {

    private MediatorLiveData<Exercise> exercise;
    private ExerciseRepository exerciseRepository;

    public ExerciseViewModel(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public LiveData<Exercise> getExercise(int exerciseId) {
        exercise.addSource(
                exerciseRepository.selectExercise(exerciseId),
                ejercicio -> exercise.setValue(ejercicio)
        );
        return exercise;
    }

}
