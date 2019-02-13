package mx.com.lania.oamtemplate.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import mx.com.lania.oamtemplate.View.Fragment.AnswerEvaluationFragment;
import mx.com.lania.oamtemplate.View.Fragment.AnswerExerciseFragment;
import mx.com.lania.oamtemplate.View.Fragment.IndicationEvaluationFragment;
import mx.com.lania.oamtemplate.View.Fragment.IndicationExerciseFragment;


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

    Application application();

}
