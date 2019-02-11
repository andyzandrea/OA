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
    EditText Uno;

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
