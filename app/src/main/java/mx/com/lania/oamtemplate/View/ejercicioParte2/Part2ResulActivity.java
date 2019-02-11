package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.ejercicioParte2.Part2ResulActivity;
import mx.com.lania.oamtemplate.View.MenuExerciseActivity;


public class Part2ResulActivity extends AppCompatActivity {
    @BindView(R.id.btnGuardarDatos)
    Button btnGuardarDatos;

    EditText resultadoetSumaDebeUno;
    EditText resultadoetSumaHaberUno;
    EditText resultadoetSumaDebeDos;
    EditText resultadoetSumaHaberDos;
    EditText resultadoetSumaDebeTres;
    EditText resultadoetSumaHaberTres;
    EditText resultadoetSumaDebeCuatro;
    EditText resultadoetSumaHaberCuatro;
    EditText resultadoetSumaDebeCinco;
    EditText resultadoetSumaHaberCinco;
    EditText resultadoetSumaDebeSeis;
    EditText resultadoetSumaHaberSeis;


    @BindViews({R.id.etDebeUno, R.id.etHaberUno,
            R.id.etDebeDos, R.id.etHaberDos,
            R.id.etDebeTres, R.id.etHaberTres,
            R.id.etDebeCuatro, R.id.etHaberCuatro,
            R.id.etDebeCinco, R.id.etHaberCinco,
            R.id.etDebeSeis, R.id.etHaberSeis,
            R.id.etDebeSiete, R.id.etHaberSiete,
            R.id.etDebeOcho, R.id.etHaberOcho,
            R.id.etDebeNueve, R.id.etHaberNueve,
            R.id.etDebeDiez, R.id.etHaberDiez,
            R.id.etDebeOnce, R.id.etHaberOnce,
            R.id.etDebeDoce, R.id.etHaberDoce,
            R.id.etDebeTrece, R.id.etHaberTrece,
            R.id.etDebeCatorce, R.id.etHaberCatorce,
            R.id.etDebeQuince, R.id.etHaberQuince,

            /*R.id.etSumaDebeUno, R.id.etSumaHaberUno,
            R.id.etSumaDebeDos, R.id.etSumaHaberDos,
            R.id.etSumaDebeTres, R.id.etSumaHaberTres,
            R.id.etSumaDebeCuatro, R.id.etSumaHaberCuatro,
            R.id.etSumaDebeCinco, R.id.etSumaHaberCinco*/})
    List<EditText> editTexts;

    Bundle bundleInicial = new Bundle();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2_resul);
        ButterKnife.bind(this);
        showToolbar();
        bundleInicial = getIntent().getExtras();
       cargarDatos();
      //  cargarValidacion();
    }

    public void cargarDatos() {

      editTexts.get(0).setText(bundleInicial.getString("etDebeUno"));
        editTexts.get(1).setText(bundleInicial.getString("etHaberUno"));
        editTexts.get(2).setText(bundleInicial.getString("etDebeDos"));
        editTexts.get(3).setText(bundleInicial.getString("etHaberDos"));
        editTexts.get(4).setText(bundleInicial.getString("etDebeTres"));
        editTexts.get(5).setText(bundleInicial.getString("etHaberTres"));
        editTexts.get(6).setText(bundleInicial.getString("etDebeCuatro"));
        editTexts.get(7).setText(bundleInicial.getString("etHaberCuatro"));
        editTexts.get(8).setText(bundleInicial.getString("etDebeCinco"));
        editTexts.get(9).setText(bundleInicial.getString("etHaberCinco"));
        editTexts.get(10).setText(bundleInicial.getString("etDebeSeis"));
        editTexts.get(11).setText(bundleInicial.getString("etHaberSeis"));
        editTexts.get(12).setText(bundleInicial.getString("etDebeSiete"));
        editTexts.get(13).setText(bundleInicial.getString("etHaberSiete"));
        editTexts.get(14).setText(bundleInicial.getString("etDebeOcho"));
        editTexts.get(15).setText(bundleInicial.getString("etHaberOcho"));
        editTexts.get(16).setText(bundleInicial.getString("etDebeNueve"));
        editTexts.get(17).setText(bundleInicial.getString("etHaberNueve"));
        editTexts.get(18).setText(bundleInicial.getString("etDebeDiez"));
        editTexts.get(19).setText(bundleInicial.getString("etHaberDiez"));
        editTexts.get(20).setText(bundleInicial.getString("etDebeOnce"));
        editTexts.get(21).setText(bundleInicial.getString("etHaberOnce"));
        editTexts.get(22).setText(bundleInicial.getString("etDebeDoce"));
        editTexts.get(23).setText(bundleInicial.getString("etHaberDoce"));
        editTexts.get(24).setText(bundleInicial.getString("etDebeTrece"));
        editTexts.get(25).setText(bundleInicial.getString("etHaberTrece"));
        editTexts.get(26).setText(bundleInicial.getString("etDebeCatorce"));
        editTexts.get(27).setText(bundleInicial.getString("etHaberCatorce"));
        editTexts.get(28).setText(bundleInicial.getString("etDebeQuince"));
        editTexts.get(29).setText(bundleInicial.getString("etHaberQuince"));
/*
        editTexts.get(30).setText(bundleInicial.getString("etSumaDebeUno"));
        editTexts.get(31).setText(bundleInicial.getString("etSumaHaberUno"));
        editTexts.get(32).setText(bundleInicial.getString("etSumaDebeDos"));
        editTexts.get(33).setText(bundleInicial.getString("etSumaHaberDos"));
        editTexts.get(34).setText(bundleInicial.getString("etSumaDebeTres"));
        editTexts.get(35).setText(bundleInicial.getString("etSumaHaberTres"));
        editTexts.get(36).setText(bundleInicial.getString("etSumaDebeCuatro"));
        editTexts.get(37).setText(bundleInicial.getString("etSumaHaberCuatro"));
        editTexts.get(38).setText(bundleInicial.getString("etSumaDebeCinco"));
        editTexts.get(39).setText(bundleInicial.getString("etSumaHaberCinco"));*/
    }


    @OnClick(R.id.btnHacerSuma)
    public void setBtnHacerSuma() {

        Bundle bundle = new Bundle();

        String etDebeUno = editTexts.get(0).getText().toString();
        String etHaberUno = editTexts.get(1).getText().toString();
        String etDebeDos = editTexts.get(2).getText().toString();
        String etHaberDos = editTexts.get(3).getText().toString();
        String etDebeTres = editTexts.get(4).getText().toString();
        String etHaberTres = editTexts.get(5).getText().toString();
        String etDebeCuatro = editTexts.get(6).getText().toString();
        String etHaberCuatro = editTexts.get(7).getText().toString();
        String etDebeCinco = editTexts.get(8).getText().toString();
        String etHaberCinco = editTexts.get(9).getText().toString();
        String etDebeSeis = editTexts.get(10).getText().toString();
        String etHaberSeis = editTexts.get(11).getText().toString();
        String etDebeSiete = editTexts.get(12).getText().toString();
        String etHaberSiete = editTexts.get(13).getText().toString();
        String etDebeOcho = editTexts.get(14).getText().toString();
        String etHaberOcho = editTexts.get(15).getText().toString();
        String etDebeNueve = editTexts.get(16).getText().toString();
        String etHaberNueve = editTexts.get(17).getText().toString();
        String etDebeDiez = editTexts.get(18).getText().toString();
        String etHaberDiez = editTexts.get(19).getText().toString();
        String etDebeOnce = editTexts.get(20).getText().toString();
        String etHaberOnce = editTexts.get(21).getText().toString();
        String etDebeDoce = editTexts.get(22).getText().toString();
        String etHaberDoce = editTexts.get(23).getText().toString();
        String etDebeTrece = editTexts.get(24).getText().toString();
        String etHaberTrece = editTexts.get(25).getText().toString();
        String etDebeCatorce = editTexts.get(26).getText().toString();
        String etHaberCatorce = editTexts.get(27).getText().toString();
        String etDebeQuince = editTexts.get(28).getText().toString();
        String etHaberQuince = editTexts.get(29).getText().toString();

      /*  String etSumaDebeUnoUno = editTexts.get(30).getText().toString();
        String etSumaHaberUnoUno = editTexts.get(31).getText().toString();
        String etSumaDebeUnoUno2 = editTexts.get(32).getText().toString();
        String etSumaHaberUnoUno2 = editTexts.get(33).getText().toString();
        String etSumaDebeUnoUno3 = editTexts.get(34).getText().toString();
        String etSumaHaberUnoUno3 = editTexts.get(35).getText().toString();
        String etSumaDebeUnoUno7 = editTexts.get(36).getText().toString();
        String etSumaHaberUnoUno7 = editTexts.get(37).getText().toString();
        String etSumaDebeUnoUno9 = editTexts.get(38).getText().toString();
        String etSumaHaberUnoUno9 = editTexts.get(39).getText().toString();
        String etSumaDebeUnoUno8 = editTexts.get(40).getText().toString();
        String etSumaHaberUnoUno8 = editTexts.get(41).getText().toString();

*/
        //suma1
        long etDebeUno1 = Long.parseLong(etDebeUno);
        long etDebeCinco5 = Long.parseLong(etDebeCinco);
        long etDebeSeis6 = Long.parseLong(etDebeSeis);
        long etDebeOnce11 = Long.parseLong(etDebeOnce);
        long etDebeTrece13 = Long.parseLong(etDebeTrece);

        //suma1
        long etHaberUno1 = Long.parseLong(etHaberUno);
        long etHaberCinco5 = Long.parseLong(etHaberCinco);
        long etHaberSeis6 = Long.parseLong(etHaberSeis);
        long etHaberOnce11 = Long.parseLong(etHaberOnce);
        long etHaberTrece13 = Long.parseLong(etHaberTrece);

        //suma2

        long etDebeDos2 = Long.parseLong(etDebeDos);
        long etDebeSiete7 = Long.parseLong(etDebeSiete);
        long etDebeOcho8 = Long.parseLong(etDebeOcho);
        //suma2
        long etHaberDos2 = Long.parseLong(etHaberDos);
        long etHaberSiete7 = Long.parseLong(etHaberSiete);
        long etHaberOcho8 = Long.parseLong(etHaberOcho);

        //suma3
        long etDebeTres3 = Long.parseLong(etDebeTres);
        long etDebeCuatro4 = Long.parseLong(etDebeCuatro);

        //suma3
        long etHaberTres3 = Long.parseLong(etHaberTres);
        long etHaberCuatro4 = Long.parseLong(etHaberCuatro);


        //suma4

        long etDebeNueve9 = Long.parseLong(etDebeNueve);
        long etDebeDiez10 = Long.parseLong(etDebeDiez);

        //suma4

        long etHaberNueve9 = Long.parseLong(etHaberNueve);
        long etHaberDiez10 = Long.parseLong(etHaberDiez);

        //suma5
        long etDebeCatorce14 = Long.parseLong(etDebeCatorce);

        //suma5
        long etHaberCatorce14 = Long.parseLong(etHaberCatorce);

        //suma6
        long etDebeDoce12 = Long.parseLong(etDebeDoce);
        long etDebeQuince15 = Long.parseLong(etDebeQuince);
        //suma6
        long etHaberDoce12 = Long.parseLong(etHaberDoce);
        long etHaberQuince15 = Long.parseLong(etHaberQuince);



        long sumadebe1=etDebeUno1+etDebeCinco5 +etDebeSeis6+etDebeOnce11+etDebeTrece13;
        long sumahaber1=etHaberUno1+etHaberCinco5 +etHaberSeis6+etHaberOnce11+etHaberTrece13;

        long sumadebe2=etDebeDos2 +etDebeSiete7+ etDebeOcho8 ;
        long sumahaber2=etHaberDos2 +etHaberSiete7+ etHaberOcho8 ;

        long sumadebe3=etDebeTres3+etDebeCuatro4;
        long sumahaber3=etHaberTres3+etHaberCuatro4;


        long sumadebe4=etDebeCatorce14;
        long sumahaber4=etHaberCatorce14;

        long sumadebe5=etDebeNueve9+etDebeQuince15;
        long sumahaber5=etHaberNueve9+etHaberQuince15;

        long sumadebe6=etDebeDiez10+etDebeDoce12;
        long sumahaber6=etHaberDiez10+etHaberDoce12;


        String resudebe1=String.valueOf(sumadebe1);
        String resuhaber1=String.valueOf(sumahaber1);

        String resudebe2=String.valueOf(sumadebe2);
        String resuhaber2=String.valueOf(sumahaber2);

        String resudebe3=String.valueOf(sumadebe3);
        String resuhaber3=String.valueOf(sumahaber3);

        String resudebe4=String.valueOf(sumadebe4);
        String resuhaber4=String.valueOf(sumahaber4);

        String resudebe5=String.valueOf(sumadebe5);
        String resuhaber5=String.valueOf(sumahaber5);

        String resudebe6=String.valueOf(sumadebe6);
        String resuhaber6=String.valueOf(sumahaber6);

                resultadoetSumaDebeUno = findViewById(R.id.etSumaDebeUnoUno) ;
        resultadoetSumaHaberUno = findViewById(R.id.etSumaHaberUnoUno) ;
        resultadoetSumaDebeDos = findViewById(R.id.etSumaDebeUnoUno2) ;
        resultadoetSumaHaberDos = findViewById(R.id.etSumaHaberUnoUno2) ;
        resultadoetSumaDebeTres = findViewById(R.id.etSumaDebeUnoUno3) ;
        resultadoetSumaHaberTres = findViewById(R.id.etSumaHaberUnoUno3) ;
        resultadoetSumaDebeCuatro = findViewById(R.id.etSumaDebeUnoUno7) ;
        resultadoetSumaHaberCuatro = findViewById(R.id.etSumaHaberUnoUno7) ;
        resultadoetSumaDebeCinco = findViewById(R.id.etSumaDebeUnoUno9) ;
        resultadoetSumaHaberCinco = findViewById(R.id.etSumaHaberUnoUno9) ;
        resultadoetSumaDebeSeis = findViewById(R.id.etSumaDebeUnoUno8) ;
        resultadoetSumaHaberSeis = findViewById(R.id.etSumaHaberUnoUno8) ;

        resultadoetSumaDebeUno.setText(resudebe1);
        resultadoetSumaHaberUno.setText(resuhaber1);
        resultadoetSumaDebeDos.setText(resudebe2);
        resultadoetSumaHaberDos.setText(resuhaber2);
        resultadoetSumaDebeTres.setText(resudebe3);
        resultadoetSumaHaberTres.setText(resuhaber3);
        resultadoetSumaDebeCuatro.setText(resudebe4);
        resultadoetSumaHaberCuatro.setText(resuhaber4);
        resultadoetSumaDebeCinco.setText(resudebe5);
        resultadoetSumaHaberCinco.setText(resuhaber5);
        resultadoetSumaDebeSeis.setText(resudebe6);
        resultadoetSumaHaberSeis.setText(resuhaber6);
        //cargarValidacion();


    }

/*
    public void cargarValidacion() {
        *//*------------------------------------------------------------------------------------*//*
        if (sumadebe1 < sumahaber1) {

            editTexts.get(30).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));

        } else {
            editTexts.get(31).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        }
        *//*------------------------------------------------------------------------------------*//*

        if (sumadebe2 < sumahaber2) {

            editTexts.get(32).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));

        } else {

            editTexts.get(33).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        }
        *//*------------------------------------------------------------------------------------*//*

        if (sumadebe3 < sumahaber3) {

            editTexts.get(34).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));

        } else {
            editTexts.get(35).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        }
        *//*------------------------------------------------------------------------------------*//*

        if (sumadebe4 < sumahaber4) {

            editTexts.get(36).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));

        } else {
            editTexts.get(37).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        }
        *//*------------------------------------------------------------------------------------*//*

        if (sumadebe5 < sumahaber5) {

            editTexts.get(38).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));

        } else {
            editTexts.get(39).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        }
        *//*------------------------------------------------------------------------------------*//*

        if (sumadebe6 < sumahaber6) {

            editTexts.get(40).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));

        } else {
            editTexts.get(41).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        }
        *//*------------------------------------------------------------------------------------*//*



    }*/
   @OnClick(R.id.btnGuardarDatos)
    public void setBtnGuardarDatos () {
        Intent returnHome = new Intent(Part2ResulActivity.this, MenuExerciseActivity.class);
        returnHome.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(returnHome);
    }

    private void showToolbar () {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Resultados");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
