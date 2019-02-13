package mx.com.lania.oamtemplate.Database.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.Question;

@Dao
public interface QuestionDao {

    //TODO: Define database operations for Question entity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertResult(Question question);

    @Query("SELECT * FROM question WHERE id = :questionId")
    LiveData<Question> selectQuestion(int questionId);

    @Query("SELECT * FROM question")
    LiveData<Question> selectQuestions();

    @Delete
    void deleteQuestion(Question question);


}
