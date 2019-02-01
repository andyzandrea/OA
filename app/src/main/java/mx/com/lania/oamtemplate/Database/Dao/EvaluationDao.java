package mx.com.lania.oamtemplate.Database.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entity.Evaluation;

/**
 * Created by macbook on 21/02/18.
 */

@Dao
public interface EvaluationDao {

    //TODO: Define database operations for Evaluation entity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertEvaluation(Evaluation evaluation);

    @Query("SELECT * FROM evaluation WHERE id = :evaluationId")
    LiveData<Evaluation> selectEvaluation(int evaluationId);

    @Delete
    void deleteEvaluation(Evaluation evaluation);


}