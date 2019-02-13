package mx.com.lania.oamtemplate.Database.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import mx.com.lania.oamtemplate.Database.Entities.Exercise;

/**
 * Created by macbook on 21/02/18.
 */

@Dao
public interface ExerciseDao {

    //TODO: Define database operations for Exercise entity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void inserExercise(Exercise exercise);

    @Query("SELECT * FROM Exercise WHERE id = :exerciseId")
    LiveData<Exercise> selectExercise(int exerciseId);

    @Query("SELECT * FROM Exercise")
    LiveData<List<Exercise>> selectExercises();

    @Delete
    void deleteExercise(Exercise exercise);

}
