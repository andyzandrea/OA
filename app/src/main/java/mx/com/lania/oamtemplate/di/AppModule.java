package mx.com.lania.oamtemplate.di;

import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.support.annotation.NonNull;

import java.util.concurrent.Executors;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mx.com.lania.oamtemplate.AppDatabase;
import mx.com.lania.oamtemplate.Database.Dao.EvaluationDao;
import mx.com.lania.oamtemplate.Database.Dao.ExampleDao;
import mx.com.lania.oamtemplate.Database.Dao.ExerciseDao;
import mx.com.lania.oamtemplate.Database.Dao.LearningObjectDao;
import mx.com.lania.oamtemplate.Database.Dao.LessonDao;
import mx.com.lania.oamtemplate.Database.Dao.QuestionDao;
import mx.com.lania.oamtemplate.Database.Dao.ResultDao;
import mx.com.lania.oamtemplate.OAMApplication;
import mx.com.lania.oamtemplate.Repository.EvaluationRepository;
import mx.com.lania.oamtemplate.Repository.ExampleRepository;
import mx.com.lania.oamtemplate.Repository.ExerciseRepository;
import mx.com.lania.oamtemplate.Repository.LearningObjectRepository;
import mx.com.lania.oamtemplate.Repository.LessonRepository;
import mx.com.lania.oamtemplate.Repository.QuestionRepository;
import mx.com.lania.oamtemplate.Repository.ResultRepository;
import mx.com.lania.oamtemplate.ViewModel.EvaluationViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.ExerciseViewModelFactory;

/**
 * Created by macbook on 05/03/18.
 */

@Module
public class AppModule {

    private final OAMApplication application;
    private final AppDatabase database;

    public AppModule(OAMApplication application) {
        this.application = application;
        database = Room.databaseBuilder(application, AppDatabase.class, AppDatabase.DB_NAME).fallbackToDestructiveMigration().addCallback(new RoomDatabase.Callback() {
            @Override
            public void onCreate(@NonNull SupportSQLiteDatabase db) {
                super.onCreate(db);
                Executors.newSingleThreadScheduledExecutor().execute(() -> {
                    //Perform initial database operations
                    //provideAppDatabase().getXXXXDao().insertXXXX(new XXXX());
                });
            }
        }).build();
    }

    @Provides
    OAMApplication provideOamApplication() {
        return application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    AppDatabase provideAppDatabase() {
        return database;
    }

    @Provides
    @Singleton
    LearningObjectDao provideLearningObjectDao(AppDatabase appDatabase) {
        return appDatabase.getLearningObjectDao();
    }

    @Provides
    @Singleton
    LessonDao provideLessonDao(AppDatabase appDatabase) {
        return appDatabase.getLessonDao();
    }

    @Provides
    @Singleton
    ExampleDao provideExampleDao(AppDatabase appDatabase) {
        return appDatabase.getExampleDao();
    }

    @Provides
    @Singleton
    ExerciseDao provideExerciseDao(AppDatabase appDatabase) {
        return appDatabase.getExerciseDao();
    }

    @Provides
    @Singleton
    ResultDao provideResultDao(AppDatabase appDatabase) {
        return appDatabase.getResultDao();
    }

    @Provides
    @Singleton
    EvaluationDao provideEvaluationDao(AppDatabase appDatabase) {
        return appDatabase.getEvaluationDao();
    }

    @Provides
    @Singleton
    QuestionDao provideQuestionDao(AppDatabase appDatabase) {
        return appDatabase.getQuestionDao();
    }

    @Provides
    @Singleton
    LearningObjectRepository provideLearningObjectRepository(LearningObjectDao learningObjectDao) {
        return new LearningObjectRepository(learningObjectDao);
    }

    @Provides
    @Singleton
    LessonRepository provideLessonRepository(LessonDao lessonDao) {
        return new LessonRepository(lessonDao);
    }

    @Provides
    @Singleton
    ExampleRepository provideExampleRepository(ExampleDao exampleDao) {
        return new ExampleRepository(exampleDao);
    }

    @Provides
    @Singleton
    ExerciseRepository provideExerciseRepository(ExerciseDao exerciseDao) {
        return new ExerciseRepository(exerciseDao);
    }

    @Provides
    @Singleton
    ResultRepository provideResultRepository(ResultDao resultDao) {
        return new ResultRepository(resultDao);
    }

    @Provides
    @Singleton
    EvaluationRepository provideEvaluationRepository(EvaluationDao evaluationDao) {
        return new EvaluationRepository(evaluationDao);
    }

    @Provides
    @Singleton
    QuestionRepository provideQuestionRepository(QuestionDao questionDao) {
        return new QuestionRepository(questionDao);
    }


    @Provides
    @Singleton
    @Named("ExerciseFactory")
    ViewModelProvider.Factory provideExerciseFactory(ExerciseRepository exerciseRepository) {
        return new ExerciseViewModelFactory(exerciseRepository);
    }

    @Provides
    @Singleton
    @Named("EvaluationFactory")
    ViewModelProvider.Factory provideEvaluationFactory(EvaluationRepository evaluationRepository) {
        return new EvaluationViewModelFactory(evaluationRepository);
    }

}
