package mx.com.lania.oamtemplate.Repository;

import android.arch.lifecycle.LiveData;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.ExerciseDao;
import mx.com.lania.oamtemplate.Database.Entities.Exercise;

/**
 * Created by macbook on 05/03/18.
 */

public class ExerciseRepository {

    //TODO: Perform data operations for exercises

    private ExerciseDao exerciseDao;

    @Inject
    public ExerciseRepository(ExerciseDao exerciseDao) {
        this.exerciseDao = exerciseDao;
    }

    public LiveData<Exercise> selectExercise(int exerciseId) {
        return exerciseDao.selectExercise(exerciseId);
    }

}
