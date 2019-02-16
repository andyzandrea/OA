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
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.AcreedoresDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.AlmacenDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.BancosDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.CapitalSocialDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.ClientesDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.CostoDeVentasDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.DepreciacionDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.EdificiosDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.MaquinariaDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.ProveedoresDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.ResultadoDao;
import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.VentasDao;
import mx.com.lania.oamtemplate.Database.Dao.EvaluationDao;
import mx.com.lania.oamtemplate.Database.Dao.ExampleDao;
import mx.com.lania.oamtemplate.Database.Dao.ExerciseDao;
import mx.com.lania.oamtemplate.Database.Dao.LearningObjectDao;
import mx.com.lania.oamtemplate.Database.Dao.LessonDao;
import mx.com.lania.oamtemplate.Database.Dao.QuestionDao;
import mx.com.lania.oamtemplate.Database.Dao.ResultDao;
import mx.com.lania.oamtemplate.OAMApplication;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.AcreedoresRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.AlmacenRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.BancosRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.CapitalSocialRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.ClientesRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.CostoDeVentasRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.DepreciacionRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.EdificiosRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.MaquinariaRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.ProveedoresRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.ResultadoRepository;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.VentasRepository;
import mx.com.lania.oamtemplate.Repository.EvaluationRepository;
import mx.com.lania.oamtemplate.Repository.ExampleRepository;
import mx.com.lania.oamtemplate.Repository.ExerciseRepository;
import mx.com.lania.oamtemplate.Repository.LearningObjectRepository;
import mx.com.lania.oamtemplate.Repository.LessonRepository;
import mx.com.lania.oamtemplate.Repository.QuestionRepository;
import mx.com.lania.oamtemplate.Repository.ResultRepository;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.AcreedoresViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.AlmacenViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.BancosViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.CapitalSocialViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.ClientesViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.CostoDeVentasViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.DepreciacionViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.EdificiosViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.MaquinariaViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.ProveedoresViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.ResultadoViewModelFactory;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.VentasViewModelFactory;
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
        database = Room
                .databaseBuilder(application, AppDatabase.class, AppDatabase.DB_NAME)
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .addCallback(new RoomDatabase.Callback() {
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

    //----------------- Ejercicio Perpetuo -------------------
    @Provides
    @Singleton
    @Named("AcreedoresFactory")
    ViewModelProvider.Factory provideAcreedoresFactory(AcreedoresRepository acreedoresRepository) {
        return new AcreedoresViewModelFactory(acreedoresRepository);
    }

    @Provides
    @Singleton
    @Named("AlmacenFactory")
    ViewModelProvider.Factory provideAlmacenFactory(AlmacenRepository almacenRepository) {
        return new AlmacenViewModelFactory(almacenRepository);
    }

    @Provides
    @Singleton
    @Named("BancosFactory")
    ViewModelProvider.Factory provideBancosFactory(BancosRepository bancosRepository) {
        return new BancosViewModelFactory(bancosRepository);
    }

    @Provides
    @Singleton
    @Named("CapitalSocialFactory")
    ViewModelProvider.Factory provideCapitalSocialFactory(CapitalSocialRepository capitalSocialRepository) {
        return new CapitalSocialViewModelFactory(capitalSocialRepository);
    }

    @Provides
    @Singleton
    @Named("ClientesFactory")
    ViewModelProvider.Factory provideClientesFactory(ClientesRepository clientesRepository) {
        return new ClientesViewModelFactory(clientesRepository);
    }

    @Provides
    @Singleton
    @Named("CostoDeVentasFactory")
    ViewModelProvider.Factory provideCostoDeVentasFactory(CostoDeVentasRepository costoDeVentasRepository) {
        return new CostoDeVentasViewModelFactory(costoDeVentasRepository);
    }

    @Provides
    @Singleton
    @Named("DepreciacionFactory")
    ViewModelProvider.Factory provideDepreciacionFactory(DepreciacionRepository depreciacionRepository) {
        return new DepreciacionViewModelFactory(depreciacionRepository);
    }

    @Provides
    @Singleton
    @Named("EdificiosFactory")
    ViewModelProvider.Factory provideEdificiosFactory(EdificiosRepository edificiosRepository) {
        return new EdificiosViewModelFactory(edificiosRepository);
    }

    @Provides
    @Singleton
    @Named("MaquinariaFactory")
    ViewModelProvider.Factory provideMaquinariaFactory(MaquinariaRepository maquinariaRepositoryi) {
        return new MaquinariaViewModelFactory(maquinariaRepositoryi);
    }

    @Provides
    @Singleton
    @Named("ProveedoresFactory")
    ViewModelProvider.Factory provideProveedoresFactory(ProveedoresRepository proveedoresRepository) {
        return new ProveedoresViewModelFactory(proveedoresRepository);
    }

    @Provides
    @Singleton
    @Named("ResultadoFactory")
    ViewModelProvider.Factory provideResultadoFactory(ResultadoRepository resultadoRepository) {
        return new ResultadoViewModelFactory(resultadoRepository);
    }

    @Provides
    @Singleton
    @Named("VentasFactory")
    ViewModelProvider.Factory provideVentasFactory(VentasRepository ventasRepository) {
        return new VentasViewModelFactory(ventasRepository);
    }

    @Provides
    @Singleton
    AcreedoresDao provideAcreedoresDao(AppDatabase appDatabase) {
        return appDatabase.getAcreedoresDao();
    }

    @Provides
    @Singleton
    AcreedoresRepository provideAcreedoresRepository(AcreedoresDao acreedoresDao) {
        return new AcreedoresRepository(acreedoresDao);
    }

    @Provides
    @Singleton
    AlmacenDao provideAlmacenDao(AppDatabase appDatabase) {
        return appDatabase.getAlmacenDao();
    }

    @Provides
    @Singleton
    AlmacenRepository provideAlmacenRepository(AlmacenDao almacenDao) {
        return new AlmacenRepository(almacenDao);
    }

    @Provides
    @Singleton
    BancosDao provideBancosDao(AppDatabase appDatabase) {
        return appDatabase.getBancosDao();
    }

    @Provides
    @Singleton
    BancosRepository provideBancosRepository(BancosDao bancosDao) {
        return new BancosRepository(bancosDao);
    }

    @Provides
    @Singleton
    CapitalSocialDao provideCapitalSocialDao(AppDatabase appDatabase) {
        return appDatabase.getCapitalSocialDao();
    }

    @Provides
    @Singleton
    CapitalSocialRepository provideCapitalSocialRepository(CapitalSocialDao capitalSocialDao) {
        return new CapitalSocialRepository(capitalSocialDao);
    }

    @Provides
    @Singleton
    ClientesDao provideClientesDao(AppDatabase appDatabase) {
        return appDatabase.getClientesDao();
    }

    @Provides
    @Singleton
    ClientesRepository provideClientesRepository(ClientesDao clientesDao) {
        return new ClientesRepository(clientesDao);
    }

    @Provides
    @Singleton
    CostoDeVentasDao provideCostoDeVentasDao(AppDatabase appDatabase) {
        return appDatabase.getCostoDeVentasDao();
    }

    @Provides
    @Singleton
    CostoDeVentasRepository provideCostoDeVentasRepository(CostoDeVentasDao costoDeVentasDao) {
        return new CostoDeVentasRepository(costoDeVentasDao);
    }

    @Provides
    @Singleton
    DepreciacionDao provideDepreciacionDao(AppDatabase appDatabase) {
        return appDatabase.getDepreciacionDao();
    }

    @Provides
    @Singleton
    DepreciacionRepository provideDepreciacionRepository(DepreciacionDao depreciacionDao) {
        return new DepreciacionRepository(depreciacionDao);
    }

    @Provides
    @Singleton
    EdificiosDao provideEdificiosDao(AppDatabase appDatabase) {
        return appDatabase.getEdificiosDao();
    }

    @Provides
    @Singleton
    EdificiosRepository provideEdificiosRepository(EdificiosDao edificiosDao) {
        return new EdificiosRepository(edificiosDao);
    }

    @Provides
    @Singleton
    MaquinariaDao provideMaquinariaDao(AppDatabase appDatabase) {
        return appDatabase.getMaquinariaDao();
    }

    @Provides
    @Singleton
    MaquinariaRepository provideMaquinariaRepository(MaquinariaDao maquinariaDao) {
        return new MaquinariaRepository(maquinariaDao);
    }

    @Provides
    @Singleton
    ProveedoresDao provideProveedoresDao(AppDatabase appDatabase) {
        return appDatabase.getProveedoresDao();
    }

    @Provides
    @Singleton
    ProveedoresRepository provideProveedoresRepository(ProveedoresDao proveedoresDao) {
        return new ProveedoresRepository(proveedoresDao);
    }

    @Provides
    @Singleton
    ResultadoDao provideResultadoDao(AppDatabase appDatabase) {
        return appDatabase.getResultadoDao();
    }

    @Provides
    @Singleton
    ResultadoRepository provideResultadoRepository(ResultadoDao resultadoDao) {
        return new ResultadoRepository(resultadoDao);
    }

    @Provides
    @Singleton
    VentasDao provideVentasDao(AppDatabase appDatabase) {
        return appDatabase.getVentasDao();
    }

    @Provides
    @Singleton
    VentasRepository provideVentasRepository(VentasDao ventasDao) {
        return new VentasRepository(ventasDao);
    }

    //--------------------------------------------------------

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
