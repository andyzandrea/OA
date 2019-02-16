package mx.com.lania.oamtemplate.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import mx.com.lania.oamtemplate.View.Fragment.AcreedoresDiversos;
import mx.com.lania.oamtemplate.View.Fragment.Almacen;
import mx.com.lania.oamtemplate.View.Fragment.AnswerEvaluationFragment;
import mx.com.lania.oamtemplate.View.Fragment.AnswerExerciseFragment;
import mx.com.lania.oamtemplate.View.Fragment.CapitalSociable;
import mx.com.lania.oamtemplate.View.Fragment.CostoVentas;
import mx.com.lania.oamtemplate.View.Fragment.Depreciacion;
import mx.com.lania.oamtemplate.View.Fragment.Edificios;
import mx.com.lania.oamtemplate.View.Fragment.IndicationEvaluationFragment;
import mx.com.lania.oamtemplate.View.Fragment.IndicationExerciseFragment;
import mx.com.lania.oamtemplate.View.Fragment.Maquinaria;
import mx.com.lania.oamtemplate.View.Fragment.Proveedores;
import mx.com.lania.oamtemplate.View.Fragment.ResultadoEjercicioAnterior;
import mx.com.lania.oamtemplate.View.Fragment.Ventas;
import mx.com.lania.oamtemplate.View.Fragment.bancos;
import mx.com.lania.oamtemplate.View.Fragment.clientes;
import mx.com.lania.oamtemplate.View.MenuActivity;
import mx.com.lania.oamtemplate.View.ejercicioParte2.Part2ResulActivity;


/**
 * Created by macbook on 05/03/18.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MenuActivity menuActivity);

    void inject(IndicationExerciseFragment indicationExerciseFragment);

    void inject(IndicationEvaluationFragment indicationEvaluationFragment);

    void inject(AnswerExerciseFragment answerExerciseFragment);

    void inject(AnswerEvaluationFragment answerEvaluationFragment);

    void inject(Part2ResulActivity part2ResulActivity);

    // ----------------------Ejercicio perpetuo ----------------------------------------------------

    void inject(bancos bancos);

    void inject(clientes clientes);

    void inject(Almacen almacen);

    void inject(Edificios edificios);

    void inject(Maquinaria maquinaria);

    void inject(Depreciacion depreciacion);

    void inject(Proveedores proveedores);

    void inject(AcreedoresDiversos acreedores);

    void inject(CapitalSociable capitalSocial);

    void inject(ResultadoEjercicioAnterior resultado);

    void inject(Ventas ventas);

    void inject(CostoVentas costoDeVentas);

    // ---------------------------------------------------------------------------------------------

    Application application();

}
