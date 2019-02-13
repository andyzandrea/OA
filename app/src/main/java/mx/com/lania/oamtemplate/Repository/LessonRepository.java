package mx.com.lania.oamtemplate.Repository;

import android.arch.lifecycle.LiveData;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.LessonDao;
import mx.com.lania.oamtemplate.Database.Entities.Lesson;

public class LessonRepository {

    //TODO: Perform data operations for Learning object

    private LessonDao lessonDao;

    @Inject
    public LessonRepository(LessonDao lessonDao) {
        this.lessonDao = lessonDao;
    }

    public LiveData<Lesson> selectLesson(int lessonId) {
        return lessonDao.selectLesson(lessonId);
    }

}
