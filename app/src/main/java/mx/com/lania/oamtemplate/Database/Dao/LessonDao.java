package mx.com.lania.oamtemplate.Database.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entity.Lesson;

@Dao
public interface LessonDao {

    //TODO: Define database operations for Lesson entity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertLesson(Lesson lesson);

    @Query("SELECT * FROM lesson WHERE id = :lessonId")
    LiveData<Lesson> selectLesson(int lessonId);

    @Delete
    void deleteLesson(Lesson lesson);

}
