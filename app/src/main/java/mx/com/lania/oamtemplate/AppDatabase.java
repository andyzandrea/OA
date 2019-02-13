package mx.com.lania.oamtemplate;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import mx.com.lania.oamtemplate.Database.Dao.EvaluationDao;
import mx.com.lania.oamtemplate.Database.Dao.ExampleDao;
import mx.com.lania.oamtemplate.Database.Dao.ExerciseDao;
import mx.com.lania.oamtemplate.Database.Dao.LearningObjectDao;
import mx.com.lania.oamtemplate.Database.Dao.LessonDao;
import mx.com.lania.oamtemplate.Database.Dao.QuestionDao;
import mx.com.lania.oamtemplate.Database.Dao.ResultDao;
import mx.com.lania.oamtemplate.Database.Entities.Evaluation;
import mx.com.lania.oamtemplate.Database.Entities.Example;
import mx.com.lania.oamtemplate.Database.Entities.Exercise;
import mx.com.lania.oamtemplate.Database.Entities.LearningObject;
import mx.com.lania.oamtemplate.Database.Entities.Lesson;
import mx.com.lania.oamtemplate.Database.Entities.Question;
import mx.com.lania.oamtemplate.Database.Entities.Result;


/**
 * Created by macbook on 05/03/18.
 */

@Database(entities = {LearningObject.class, Lesson.class, Example.class, Exercise.class, Result.class, Evaluation.class, Question.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public static final String DB_NAME = "app_db";

    public abstract LearningObjectDao getLearningObjectDao();

    public abstract LessonDao getLessonDao();

    public abstract ExampleDao getExampleDao();

    public abstract ExerciseDao getExerciseDao();

    public abstract ResultDao getResultDao();

    public abstract EvaluationDao getEvaluationDao();

    public abstract QuestionDao getQuestionDao();

}
