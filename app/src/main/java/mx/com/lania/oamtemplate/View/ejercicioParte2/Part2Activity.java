package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import es.dmoral.toasty.Toasty;
import mx.com.lania.oamtemplate.R;


public class Part2Activity extends AppCompatActivity {
    @BindView(R.id.btnGuardarDatos)
    Button btnGuardarDatos;

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

            R.id.etSumaDebeUno, R.id.etSumaHaberUno,
            R.id.etSumaDebeDos, R.id.etSumaHaberDos,
            R.id.etSumaDebeTres, R.id.etSumaHaberTres,
            R.id.etSumaDebeCuatro, R.id.etSumaHaberCuatro,
            R.id.etSumaDebeCinco, R.id.etSumaHaberCinco})
    List<EditText> editTexts;

    @BindViews({R.id.etSumaDebeUno, R.id.etSumaDebeDos})
    List<EditText> editTextsSumas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);
        ButterKnife.bind(this);
        showToolbar();

        //Bloquear edittexts de suma
        for (int i = 30; i < editTexts.size(); i++) {
            editTexts.get(i).setEnabled(false);
        }
    }


    @OnClick(R.id.btnHacerSuma)
    public void setBtnHacerSuma() {
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


        long sumadebe1 = etDebeTres3 + etDebeDos2 + etDebeUno1;
        long sumahaber1 = etHaberUno1 + etHaberDos2 + etHaberTres3;

        long sumadebe2 = etDebeCuatro4 + etDebeCinco5;
        long sumahaber2 = etHaberCuatro4 + etHaberCinco5;

        long sumadebe3 = etDebeSeis6 + etDebeSiete7;
        long sumahaber3 = etHaberSeis6 + etHaberSiete7;

        long sumadebe4 = etDebeOcho8 + etDebeNueve9 + etDebeDiez10 + etDebeOnce11;
        long sumahaber4 = etHaberOcho8 + etHaberNueve9 + etHaberDiez10 + etHaberOnce11;

        long sumadebe5 = etDebeDoce12 + etDebeTrece13 + etDebeCatorce14 + etDebeQuince15;
        long sumahaber5 = etHaberDoce12 + etHaberTrece13 + etHaberCatorce14 + etHaberQuince15;


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


        editTexts.get(30).setText(resudebe1);
        editTexts.get(31).setText(resuhaber1);
        editTexts.get(32).setText(resudebe2);
        editTexts.get(33).setText(resuhaber2);
        editTexts.get(34).setText(resudebe3);
        editTexts.get(35).setText(resuhaber3);
        editTexts.get(36).setText(resudebe4);
        editTexts.get(37).setText(resuhaber4);
        editTexts.get(38).setText(resudebe5);
        editTexts.get(39).setText(resuhaber5);

        cargarValidacion();
    }


    @OnClick(R.id.btnGuardarDatos)
    public void setBtnGuardarDatos() {
        if (validarDatos()) {
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

            String etSumaDebeUno = editTexts.get(30).getText().toString();
            String etSumaHaberUno = editTexts.get(31).getText().toString();
            String etSumaDebeDos = editTexts.get(32).getText().toString();
            String etSumaHaberDos = editTexts.get(33).getText().toString();
            String etSumaDebeTres = editTexts.get(34).getText().toString();
            String etSumaHaberTres = editTexts.get(35).getText().toString();
            String etSumaDebeCuatro = editTexts.get(36).getText().toString();
            String etSumaHaberCuatro = editTexts.get(37).getText().toString();
            String etSumaDebeCinco = editTexts.get(38).getText().toString();
            String etSumaHaberCinco = editTexts.get(39).getText().toString();


            bundle.putString("etDebeUno", etDebeUno);
            bundle.putString("etHaberUno", etHaberUno);
            bundle.putString("etHaberDos", etHaberDos);
            bundle.putString("etDebeDos", etDebeDos);
            bundle.putString("etDebeTres", etDebeTres);
            bundle.putString("etHaberTres", etHaberTres);
            bundle.putString("etDebeCuatro", etDebeCuatro);
            bundle.putString("etHaberCuatro", etHaberCuatro);
            bundle.putString("etDebeCinco", etDebeCinco);
            bundle.putString("etHaberCinco", etHaberCinco);
            bundle.putString("etDebeSeis", etDebeSeis);
            bundle.putString("etHaberSeis", etHaberSeis);
            bundle.putString("etDebeSiete", etDebeSiete);
            bundle.putString("etHaberSiete", etHaberSiete);
            bundle.putString("etDebeOcho", etDebeOcho);
            bundle.putString("etHaberOcho", etHaberOcho);
            bundle.putString("etDebeNueve", etDebeNueve);
            bundle.putString("etHaberNueve", etHaberNueve);
            bundle.putString("etDebeDiez", etDebeDiez);
            bundle.putString("etHaberDiez", etHaberDiez);
            bundle.putString("etDebeOnce", etDebeOnce);
            bundle.putString("etHaberOnce", etHaberOnce);
            bundle.putString("etDebeDoce", etDebeDoce);
            bundle.putString("etHaberDoce", etHaberDoce);
            bundle.putString("etDebeTrece", etDebeTrece);
            bundle.putString("etHaberTrece", etHaberTrece);
            bundle.putString("etDebeCatorce", etDebeCatorce);
            bundle.putString("etHaberCatorce", etHaberCatorce);
            bundle.putString("etDebeQuince", etDebeQuince);
            bundle.putString("etHaberQuince", etHaberQuince);

            bundle.putString("etSumaDebeUno", etSumaDebeUno);
            bundle.putString("etSumaHaberUno", etSumaHaberUno);
            bundle.putString("etSumaDebeDos", etSumaDebeDos);
            bundle.putString("etSumaHaberDos", etSumaHaberDos);
            bundle.putString("etSumaDebeTres", etSumaDebeTres);
            bundle.putString("etSumaHaberTres", etSumaHaberTres);
            bundle.putString("etSumaDebeCuatro", etSumaDebeCuatro);
            bundle.putString("etSumaHaberCuatro", etSumaHaberCuatro);
            bundle.putString("etSumaDebeCinco", etSumaDebeCinco);
            bundle.putString("etSumaHaberCinco", etSumaHaberCinco);

            Intent validacion = new Intent(Part2Activity.this, Part2ResulActivity.class);
            validacion.putExtras(bundle);
            startActivity(validacion);
        }
    }


    public boolean validarDatos() {
        boolean estado;

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


        boolean a = esValido(etDebeUno, 0);
        boolean b = esValido(etHaberUno, 1);
        boolean c = esValido(etDebeDos, 2);
        boolean d = esValido(etHaberDos, 3);
        boolean e = esValido(etHaberTres, 4);
        boolean f = esValido(etDebeTres, 5);
        boolean g = esValido(etDebeCuatro, 6);
        boolean h = esValido(etHaberCuatro, 7);
        boolean i = esValido(etDebeCinco, 8);
        boolean j = esValido(etHaberCinco, 9);
        boolean k = esValido(etDebeSeis, 10);
        boolean l = esValido(etHaberSeis, 11);
        boolean m = esValido(etDebeSiete, 12);
        boolean n = esValido(etHaberSiete, 13);
        boolean o = esValido(etDebeOcho, 14);
        boolean p = esValido(etHaberOcho, 15);
        boolean q = esValido(etDebeNueve, 16);
        boolean r = esValido(etHaberNueve, 17);
        boolean s = esValido(etDebeDiez, 18);
        boolean t = esValido(etHaberDiez, 19);
        boolean u = esValido(etDebeOnce, 20);
        boolean w = esValido(etHaberOnce, 21);
        boolean x = esValido(etDebeDoce, 22);
        boolean y = esValido(etHaberDoce, 23);
        boolean z = esValido(etDebeTrece, 24);
        boolean aa = esValido(etHaberTrece, 25);
        boolean bb = esValido(etDebeCatorce, 26);
        boolean cc = esValido(etHaberCatorce, 27);
        boolean dd = esValido(etDebeQuince, 28);
        boolean ee = esValido(etHaberQuince, 29);


        if ((a || b) && (c || d) && (e || f) && (g || h) && (i || j)
                && (k || l) && (m || n) && (o || p) && (q || r) && (s || t) && (u || w) && (x || y)
                && (z || aa) && (bb || cc) && (dd || ee)) {
            estado = true;


        } else {
            Toasty.error(this, "Faltan datos por completar.", Toast.LENGTH_SHORT, true).show();
            estado = false;
        }
        return estado;

    }

    private boolean esValido(String tipo, int position) {
        if (!TextUtils.isEmpty(tipo)) {
            editTexts.get(position).setError(null);
            return true;
        } else {
            editTexts.get(position).setError("Este campo es obligatorio.");
        }
        return false;
    }

    public void cargarValidacion() {
        /*------------------------------------------------------------------------------------*/
        if (editTexts.get(30).getText().toString().equals(editTexts.get(31).getText().toString())) {

            editTexts.get(30).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTexts.get(31).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        } else {
            editTexts.get(30).setBackgroundColor(getResources().getColor(R.color.colorRed));
            editTexts.get(31).setBackgroundColor(getResources().getColor(R.color.colorRed));
        }
        /*------------------------------------------------------------------------------------*/

        if (editTexts.get(32).getText().toString().equals(editTexts.get(33).getText().toString())) {

            editTexts.get(32).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTexts.get(33).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        } else {
            editTexts.get(32).setBackgroundColor(getResources().getColor(R.color.colorRed));
            editTexts.get(33).setBackgroundColor(getResources().getColor(R.color.colorRed));
        }
        /*------------------------------------------------------------------------------------*/

        if (editTexts.get(34).getText().toString().equals(editTexts.get(35).getText().toString())) {

            editTexts.get(34).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTexts.get(35).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        } else {
            editTexts.get(34).setBackgroundColor(getResources().getColor(R.color.colorRed));
            editTexts.get(35).setBackgroundColor(getResources().getColor(R.color.colorRed));
        }
        /*------------------------------------------------------------------------------------*/

        if (editTexts.get(36).getText().toString().equals(editTexts.get(37).getText().toString())) {

            editTexts.get(36).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTexts.get(37).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        } else {
            editTexts.get(36).setBackgroundColor(getResources().getColor(R.color.colorRed));
            editTexts.get(37).setBackgroundColor(getResources().getColor(R.color.colorRed));
        }
        /*------------------------------------------------------------------------------------*/

        if (editTexts.get(38).getText().toString().equals(editTexts.get(39).getText().toString())) {

            editTexts.get(38).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            editTexts.get(39).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        } else {
            editTexts.get(38).setBackgroundColor(getResources().getColor(R.color.colorRed));
            editTexts.get(39).setBackgroundColor(getResources().getColor(R.color.colorRed));
        }
        /*------------------------------------------------------------------------------------*/


    }

    private void showToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Inventario Perpetuo");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
