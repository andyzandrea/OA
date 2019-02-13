package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mx.com.lania.oamtemplate.R;


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
            R.id.etDebeQuince, R.id.etHaberQuince,})
    List<EditText> editTexts;

    Bundle bundleInicial = new Bundle();

    @BindViews({R.id.etSumaDebeUnoUno, R.id.etSumaHaberUnoUno,
            R.id.etSumaDebeUnoUno2, R.id.etSumaHaberUnoUno2,
            R.id.etSumaDebeUnoUno3, R.id.etSumaHaberUnoUno3,
            R.id.etSumaDebeUnoUno7, R.id.etSumaHaberUnoUno7,
            R.id.etSumaDebeUnoUno9, R.id.etSumaHaberUnoUno9,
            R.id.etSumaDebeUnoUno8, R.id.etSumaHaberUnoUno8})
    List<EditText> editTextsSumas;

    @BindViews({R.id.etSumaDebeFinalUno, R.id.etSumaHaberFinalUno,
            R.id.etSumaDebeFinalUno2, R.id.etSumaHaberFinalUno2,
            R.id.etSumaDebeFinalUno3, R.id.etSumaHaberFinalUno3,
            R.id.etSumaDebeFinalUno7, R.id.etSumaHaberFinalUno7,
            R.id.etSumaDebeFinalUno9, R.id.etSumaHaberFinalUno9,
            R.id.etSumaDebeFinalUno8, R.id.etSumaHaberFinalUno8})
    List<EditText> editTextsSumasFinales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2_resul);
        ButterKnife.bind(this);
        showToolbar();
        bundleInicial = getIntent().getExtras();
        cargarDatos();
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

       /* editTexts.get(30).setText(bundleInicial.getString("etSumaDebeUno"));
        editTexts.get(31).setText(bundleInicial.getString("etSumaHaberUno"));
        editTexts.get(32).setText(bundleInicial.getString("etSumaDebeDos"));
        editTexts.get(33).setText(bundleInicial.getString("etSumaHaberDos"));
        editTexts.get(34).setText(bundleInicial.getString("etSumaDebeTres"));
        editTexts.get(35).setText(bundleInicial.getString("etSumaHaberTres"));
        editTexts.get(36).setText(bundleInicial.getString("etSumaDebeCuatro"));
        editTexts.get(37).setText(bundleInicial.getString("etSumaHaberCuatro"));
        editTexts.get(38).setText(bundleInicial.getString("etSumaDebeCinco"));
        editTexts.get(39).setText(bundleInicial.getString("etSumaHaberCinco"))*/
        ;

        /*editTexts.get(30).setText(bundleInicial.getString("etSumaDebeUnoUno"));
        editTexts.get(31).setText(bundleInicial.getString("etSumaHaberUnoUno"));
        editTexts.get(32).setText(bundleInicial.getString("etSumaDebeUnoUno2"));
        editTexts.get(33).setText(bundleInicial.getString("etSumaHaberUnoUno2"));
        editTexts.get(34).setText(bundleInicial.getString("etSumaDebeUnoUno3"));
        editTexts.get(35).setText(bundleInicial.getString("etSumaHaberUnoUn3"));
        editTexts.get(36).setText(bundleInicial.getString("etSumaDebeUnoUno7"));
        editTexts.get(37).setText(bundleInicial.getString("etSumaHaberUnoUno7"));
        editTexts.get(38).setText(bundleInicial.getString("etSumaDebeUnoUno9"));
        editTexts.get(39).setText(bundleInicial.getString("etSumaHaberUnoUno9"));
        editTexts.get(40).setText(bundleInicial.getString("etSumaDebeUnoUno8"));
        editTexts.get(41).setText(bundleInicial.getString("etSumaHaberUnoUno8"));*/
    }

    @OnClick(R.id.btnHacerSuma)
    public void setBtnHacerSuma() {
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

       /* String etSumaDebeUnoUno = editTexts.get(30).getText().toString();
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
        String etSumaHaberUnoUno8 = editTexts.get(41).getText().toString();*/


        //suma1

        long etDebeUno1 = 0;
        long etDebeDos2 = 0;
        long etDebeTres3 = 0;
        long etHaberUno1 = 0;
        long etHaberDos2 = 0;
        long etHaberTres3 = 0;
        long etDebeCuatro4 = 0;
        long etDebeCinco5 = 0;
        long etHaberCuatro4 = 0;
        long etHaberCinco5 = 0;
        long etDebeSeis6 = 0;
        long etDebeSiete7 = 0;
        long etHaberSeis6 = 0;
        long etHaberSiete7 = 0;
        long etDebeOcho8 = 0;
        long etDebeNueve9 = 0;
        long etDebeDiez10 = 0;
        long etDebeOnce11 = 0;
        long etHaberOcho8 = 0;
        long etHaberNueve9 = 0;
        long etHaberDiez10 = 0;
        long etHaberOnce11 = 0;
        long etDebeDoce12 = 0;
        long etDebeTrece13 = 0;
        long etDebeCatorce14 = 0;
        long etDebeQuince15 = 0;
        long etHaberDoce12 = 0;
        long etHaberTrece13 = 0;
        long etHaberCatorce14 = 0;
        long etHaberQuince15 = 0;


        //suma1
        if (!etDebeUno.isEmpty()) {
            etDebeUno1 = Long.parseLong(etDebeUno);
        }
        if (!etDebeDos.isEmpty()) {
            etDebeDos2 = Long.parseLong(etDebeDos);
        }
        if (!etDebeTres.isEmpty()) {
            etDebeTres3 = Long.parseLong(etDebeTres);
        }
        if (!etHaberUno.isEmpty()) {
            etHaberUno1 = Long.parseLong(etHaberUno);
        }
        if (!etHaberDos.isEmpty()) {
            etHaberDos2 = Long.parseLong(etHaberDos);
        }
        if (!etHaberTres.isEmpty()) {
            etHaberTres3 = Long.parseLong(etHaberTres);


            //suma2
        }
        if (!etDebeCuatro.isEmpty()) {
            etDebeCuatro4 = Long.parseLong(etDebeCuatro);
        }
        if (!etDebeCinco.isEmpty()) {
            etDebeCinco5 = Long.parseLong(etDebeCinco);
        }
        if (!etHaberCuatro.isEmpty()) {
            etHaberCuatro4 = Long.parseLong(etHaberCuatro);
        }
        if (!etHaberCinco.isEmpty()) {
            etHaberCinco5 = Long.parseLong(etHaberCinco);
        }


        //suma3
        if (!etDebeSeis.isEmpty()) {
            etDebeSeis6 = Long.parseLong(etDebeSeis);
        }
        if (!etDebeSiete.isEmpty()) {
            etDebeSiete7 = Long.parseLong(etDebeSiete);
        }
        if (!etHaberSeis.isEmpty()) {
            etHaberSeis6 = Long.parseLong(etHaberSeis);
        }
        if (!etHaberSiete.isEmpty()) {
            etHaberSiete7 = Long.parseLong(etHaberSiete);
        }

        //suma4
        if (!etDebeOcho.isEmpty()) {
            etDebeOcho8 = Long.parseLong(etDebeOcho);
        }
        if (!etDebeNueve.isEmpty()) {
            etDebeNueve9 = Long.parseLong(etDebeNueve);
        }
        if (!etDebeDiez.isEmpty()) {
            etDebeDiez10 = Long.parseLong(etDebeDiez);
        }
        if (!etDebeOnce.isEmpty()) {
            etDebeOnce11 = Long.parseLong(etDebeOnce);
        }
        if (!etHaberOcho.isEmpty()) {
            etHaberOcho8 = Long.parseLong(etHaberOcho);
        }
        if (!etHaberNueve.isEmpty()) {
            etHaberNueve9 = Long.parseLong(etHaberNueve);
        }
        if (!etHaberDiez.isEmpty()) {
            etHaberDiez10 = Long.parseLong(etHaberDiez);
        }
        if (!etHaberOnce.isEmpty()) {
            etHaberOnce11 = Long.parseLong(etHaberOnce);
        }


        //suma5
        if (!etDebeDoce.isEmpty()) {
            etDebeDoce12 = Long.parseLong(etDebeDoce);
        }
        if (!etDebeTrece.isEmpty()) {
            etDebeTrece13 = Long.parseLong(etDebeTrece);
        }
        if (!etDebeCatorce.isEmpty()) {
            etDebeCatorce14 = Long.parseLong(etDebeCatorce);
        }
        if (!etDebeQuince.isEmpty()) {
            etDebeQuince15 = Long.parseLong(etDebeQuince);
        }
        if (!etHaberDoce.isEmpty()) {
            etHaberDoce12 = Long.parseLong(etHaberDoce);

        }
        if (!etHaberTrece.isEmpty()) {
            etHaberTrece13 = Long.parseLong(etHaberTrece);

        }
        if (!etHaberCatorce.isEmpty()) {
            etHaberCatorce14 = Long.parseLong(etHaberCatorce);

        }
        if (!etHaberQuince.isEmpty()) {
            etHaberQuince15 = Long.parseLong(etHaberQuince);
        }

        long sumadebe1 = etDebeUno1 + etDebeCinco5 + etDebeSeis6 + etDebeOnce11 + etDebeTrece13;
        long sumahaber1 = etHaberUno1 + etHaberCinco5 + etHaberSeis6 + etHaberOnce11 + etHaberTrece13;

        long sumadebe2 = etDebeDos2 + etDebeSiete7 + etDebeOcho8;
        long sumahaber2 = etHaberDos2 + etHaberSiete7 + etHaberOcho8;

        long sumadebe3 = etDebeTres3 + etDebeCuatro4;
        long sumahaber3 = etHaberTres3 + etHaberCuatro4;


        long sumadebe4 = etDebeCatorce14;
        long sumahaber4 = etHaberCatorce14;

        long sumadebe5 = etDebeNueve9 + etDebeQuince15;
        long sumahaber5 = etHaberNueve9 + etHaberQuince15;

        long sumadebe6 = etDebeDiez10 + etDebeDoce12;
        long sumahaber6 = etHaberDiez10 + etHaberDoce12;


        String resudebe1 = String.valueOf(sumadebe1);
        String resuhaber1 = String.valueOf(sumahaber1);

        String resudebe2 = String.valueOf(sumadebe2);
        String resuhaber2 = String.valueOf(sumahaber2);

        String resudebe3 = String.valueOf(sumadebe3);
        String resuhaber3 = String.valueOf(sumahaber3);

        String resudebe4 = String.valueOf(sumadebe4);
        String resuhaber4 = String.valueOf(sumahaber4);

        String resudebe5 = String.valueOf(sumadebe5);
        String resuhaber5 = String.valueOf(sumahaber5);

        String resudebe6 = String.valueOf(sumadebe6);
        String resuhaber6 = String.valueOf(sumahaber6);

        resultadoetSumaDebeUno = findViewById(R.id.etSumaDebeUnoUno);
        resultadoetSumaHaberUno = findViewById(R.id.etSumaHaberUnoUno);
        resultadoetSumaDebeDos = findViewById(R.id.etSumaDebeUnoUno2);
        resultadoetSumaHaberDos = findViewById(R.id.etSumaHaberUnoUno2);
        resultadoetSumaDebeTres = findViewById(R.id.etSumaDebeUnoUno3);
        resultadoetSumaHaberTres = findViewById(R.id.etSumaHaberUnoUno3);
        resultadoetSumaDebeCuatro = findViewById(R.id.etSumaDebeUnoUno7);
        resultadoetSumaHaberCuatro = findViewById(R.id.etSumaHaberUnoUno7);
        resultadoetSumaDebeCinco = findViewById(R.id.etSumaDebeUnoUno9);
        resultadoetSumaHaberCinco = findViewById(R.id.etSumaHaberUnoUno9);
        resultadoetSumaDebeSeis = findViewById(R.id.etSumaDebeUnoUno8);
        resultadoetSumaHaberSeis = findViewById(R.id.etSumaHaberUnoUno8);

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
        cargarValidacion();
    }


    public void cargarValidacion() {
        String etSumaDebeUnoUno = editTextsSumas.get(0).getText().toString();
        String etSumaHaberUnoUno = editTextsSumas.get(1).getText().toString();
        String etSumaDebeUnoUno2 = editTextsSumas.get(2).getText().toString();
        String etSumaHaberUnoUno2 = editTextsSumas.get(3).getText().toString();
        String etSumaDebeUnoUno3 = editTextsSumas.get(4).getText().toString();
        String etSumaHaberUnoUno3 = editTextsSumas.get(5).getText().toString();
        String etSumaDebeUnoUno7 = editTextsSumas.get(6).getText().toString();
        String etSumaHaberUnoUno7 = editTextsSumas.get(7).getText().toString();
        String etSumaDebeUnoUno9 = editTextsSumas.get(8).getText().toString();
        String etSumaHaberUnoUno9 = editTextsSumas.get(9).getText().toString();
        String etSumaDebeUnoUno8 = editTextsSumas.get(10).getText().toString();
        String etSumaHaberUnoUno8 = editTextsSumas.get(11).getText().toString();

        long etSumaDebeUnoUno1 = 0;
        long etSumaHaberUnoUno1 = 0;
        long etSumaDebeUnoUno22 = 0;
        long etSumaHaberUnoUno22 = 0;
        long etSumaDebeUnoUno33 = 0;
        long etSumaHaberUnoUno33 = 0;
        long etSumaDebeUnoUno77 = 0;
        long etSumaHaberUnoUno77 = 0;
        long etSumaDebeUnoUno99 = 0;
        long etSumaHaberUnoUno99 = 0;
        long etSumaDebeUnoUno88 = 0;
        long etSumaHaberUnoUno88 = 0;


        if (!etSumaDebeUnoUno.isEmpty()) {
            etSumaDebeUnoUno1 = Long.parseLong(etSumaDebeUnoUno);
        }
        if (!etSumaHaberUnoUno.isEmpty()) {
            etSumaHaberUnoUno1 = Long.parseLong(etSumaHaberUnoUno);
        }
        if (!etSumaDebeUnoUno2.isEmpty()) {
            etSumaDebeUnoUno22 = Long.parseLong(etSumaDebeUnoUno2);
        }
        if (!etSumaHaberUnoUno2.isEmpty()) {
            etSumaHaberUnoUno22 = Long.parseLong(etSumaHaberUnoUno2);

        }
        if (!etSumaDebeUnoUno3.isEmpty()) {
            etSumaDebeUnoUno33 = Long.parseLong(etSumaDebeUnoUno3);

        }
        if (!etSumaHaberUnoUno3.isEmpty()) {
            etSumaHaberUnoUno33 = Long.parseLong(etSumaHaberUnoUno3);

        }
        if (!etSumaDebeUnoUno7.isEmpty()) {
            etSumaDebeUnoUno77 = Long.parseLong(etSumaDebeUnoUno7);

        }
        if (!etSumaHaberUnoUno7.isEmpty()) {
            etSumaHaberUnoUno77 = Long.parseLong(etSumaHaberUnoUno7);

        }

        if (!etSumaDebeUnoUno9.isEmpty()) {
            etSumaDebeUnoUno99 = Long.parseLong(etSumaDebeUnoUno9);

        }

        if (!etSumaHaberUnoUno9.isEmpty()) {
            etSumaHaberUnoUno99 = Long.parseLong(etSumaHaberUnoUno9);

        }
        if (!etSumaDebeUnoUno8.isEmpty()) {
            etSumaDebeUnoUno88 = Long.parseLong(etSumaDebeUnoUno8);

        }
        if (!etSumaHaberUnoUno8.isEmpty()) {
            etSumaHaberUnoUno88 = Long.parseLong(etSumaHaberUnoUno8);

        }


        long diferenciaFinalDebeHaber1 = Math.abs(etSumaDebeUnoUno1 - etSumaHaberUnoUno1);
        long diferenciaFinalDebeHaber2 = Math.abs(etSumaDebeUnoUno22 - etSumaHaberUnoUno22);
        long diferenciaFinalDebeHaber3 = Math.abs(etSumaDebeUnoUno33 - etSumaHaberUnoUno33);
        long diferenciaFinalDebeHaber4 = Math.abs(etSumaDebeUnoUno77 - etSumaHaberUnoUno77);
        long diferenciaFinalDebeHaber5 = Math.abs(etSumaDebeUnoUno99 - etSumaHaberUnoUno99);
        long diferenciaFinalDebeHaber6 = Math.abs(etSumaDebeUnoUno88 - etSumaHaberUnoUno88);

        String diferencia1 = String.valueOf(diferenciaFinalDebeHaber1);
        String diferencia2 = String.valueOf(diferenciaFinalDebeHaber2);
        String diferencia3 = String.valueOf(diferenciaFinalDebeHaber3);
        String diferencia4 = String.valueOf(diferenciaFinalDebeHaber4);
        String diferencia5 = String.valueOf(diferenciaFinalDebeHaber5);
        String diferencia6 = String.valueOf(diferenciaFinalDebeHaber6);
        //*------------------------------------------------------------------------------------*//*
        if (etSumaDebeUnoUno1 > etSumaHaberUnoUno1) {
            editTextsSumasFinales.get(0).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(0).setText(diferencia1);
        } else {
            editTextsSumasFinales.get(1).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(1).setText(diferencia1);
        }
        //*------------------------------------------------------------------------------------*//*

        if (etSumaDebeUnoUno22 > etSumaHaberUnoUno22) {

            editTextsSumasFinales.get(2).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(2).setText(diferencia2);
        } else {
            editTextsSumasFinales.get(3).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(3).setText(diferencia2);
        }
        //*------------------------------------------------------------------------------------*//*

        if (etSumaDebeUnoUno33 > etSumaHaberUnoUno33) {
            editTextsSumasFinales.get(4).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(4).setText(diferencia3);
        } else {
            editTextsSumasFinales.get(5).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(5).setText(diferencia3);
        }
        //*------------------------------------------------------------------------------------*//*

        if (etSumaDebeUnoUno77 > etSumaHaberUnoUno77) {
            editTextsSumasFinales.get(6).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(6).setText(diferencia4);
        } else {
            editTextsSumasFinales.get(7).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(7).setText(diferencia4);
        }
        //*------------------------------------------------------------------------------------*//*

        if (etSumaDebeUnoUno99 > etSumaHaberUnoUno99) {
            editTextsSumasFinales.get(8).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(8).setText(diferencia5);
        } else {
            editTextsSumasFinales.get(9).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(9).setText(diferencia5);
        }
        //*------------------------------------------------------------------------------------*//*

        if (etSumaDebeUnoUno88 > etSumaHaberUnoUno88) {
            editTextsSumasFinales.get(10).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(10).setText(diferencia6);
        } else {
            editTextsSumasFinales.get(11).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTextsSumasFinales.get(11).setText(diferencia6);
        }
        //*------------------------------------------------------------------------------------*//*


    }


    @OnClick(R.id.btnGuardarDatos)
    public void setBtnGuardarDatos() {
        Intent returnHome = new Intent(Part2ResulActivity.this, PasoCuatroActivity.class);
        returnHome.putExtras(bundleInicial);
        //returnHome.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(returnHome);
        //TODO:GUARDAR DATOS EN BD
    }

    private void showToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Resultados");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
