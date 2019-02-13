package mx.com.lania.oamtemplate.Database.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.LearningObject;


@Dao
public interface LearningObjectDao {

    //TODO: Define database operations for Learning Object entity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertLearningObject(LearningObject learningObject);

    @Query("SELECT * FROM learning_object WHERE id = :learningObjectId")
    LiveData<LearningObject> selectLearningObject(int learningObjectId);


}
