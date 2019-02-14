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
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Acreedores;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Almacen;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Bancos;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.CapitalSocial;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Clientes;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.CostoDeVentas;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Depreciacion;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Edificios;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Maquinaria;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Proveedores;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Resultado;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Ventas;
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

@Database(entities = {LearningObject.class,
        Lesson.class,
        Example.class,
        Exercise.class,
        Result.class,
        Evaluation.class,
        Question.class,
        /* --- Ejercicio Perpetuo ----------*/
        Acreedores.class,
        Almacen.class,
        Bancos.class,
        CapitalSocial.class,
        Clientes.class,
        CostoDeVentas.class,
        Depreciacion.class,
        Edificios.class,
        Maquinaria.class,
        Proveedores.class,
        Resultado.class,
        Ventas.class
        /*-----------------------*/
}, version = 2)
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
