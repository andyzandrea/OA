package mx.com.lania.oamtemplate.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import mx.com.lania.oamtemplate.View.Fragment.Almacen;
import mx.com.lania.oamtemplate.View.Fragment.AnswerEvaluationFragment;
import mx.com.lania.oamtemplate.View.Fragment.AnswerExerciseFragment;
import mx.com.lania.oamtemplate.View.Fragment.Edificios;
import mx.com.lania.oamtemplate.View.Fragment.IndicationEvaluationFragment;
import mx.com.lania.oamtemplate.View.Fragment.IndicationExerciseFragment;
import mx.com.lania.oamtemplate.View.Fragment.bancos;
import mx.com.lania.oamtemplate.View.Fragment.clientes;
import mx.com.lania.oamtemplate.View.ejercicioParte2.Part2ResulActivity;


/**
 * Created by macbook on 05/03/18.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(IndicationExerciseFragment indicationExerciseFragment);

    void inject(IndicationEvaluationFragment indicationEvaluationFragment);

    void inject(AnswerExerciseFragment answerExerciseFragment);

    void inject(AnswerEvaluationFragment answerEvaluationFragment);

    void inject(Part2ResulActivity part2ResulActivity);

    void inject(bancos bancos);

    void inject(clientes clientes);

    void inject(Almacen almacen);

    void inject(Edificios edificios);

    Application application();

}
