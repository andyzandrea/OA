package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import mx.com.lania.oamtemplate.View.ejercicioParte2.Part2Activity;
import mx.com.lania.oamtemplate.View.ejercicioParte2.Part2ResulActivity;


public class Part2Activity extends AppCompatActivity {

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);
        ButterKnife.bind(this);
        ButterKnife.bind(this);
        showToolbar();
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


            //bundle.putLong("etHaberCatorce14", etHaberQuince15);
        //suma1
        long etDebeUno1 = Long.parseLong(etDebeUno);
        long etDebeDos2 = Long.parseLong(etDebeDos);
        long etDebeTres3 = Long.parseLong(etDebeTres);
        //suma1
        long etHaberUno1 = Long.parseLong(etHaberUno);
        long etHaberDos2 = Long.parseLong(etHaberDos);
        long etHaberTres3 = Long.parseLong(etHaberTres);

        //suma2
        long etDebeCuatro4 = Long.parseLong(etDebeCuatro);
        long etDebeCinco5 = Long.parseLong(etDebeCinco);
        //suma2
        long etHaberCuatro4 = Long.parseLong(etHaberCuatro);
        long etHaberCinco5 = Long.parseLong(etHaberCinco);

        //suma3
        long etDebeSeis6 = Long.parseLong(etDebeSeis);
        long etDebeSiete7 = Long.parseLong(etDebeSiete);
        //suma3
        long etHaberSeis6 = Long.parseLong(etHaberSeis);
        long etHaberSiete7 = Long.parseLong(etHaberSiete);

        //suma4
        long etDebeOcho8 = Long.parseLong(etDebeOcho);
        long etDebeNueve9 = Long.parseLong(etDebeNueve);
        long etDebeDiez10 = Long.parseLong(etDebeDiez);
        long etDebeOnce11 = Long.parseLong(etDebeOnce);
        //suma4
        long etHaberOcho8 = Long.parseLong(etHaberOcho);
        long etHaberNueve9 = Long.parseLong(etHaberNueve);
        long etHaberDiez10 = Long.parseLong(etHaberDiez);
        long etHaberOnce11 = Long.parseLong(etHaberOnce);


        //suma5
        long etDebeDoce12 = Long.parseLong(etDebeDoce);
        long etDebeTrece13 = Long.parseLong(etDebeTrece);
        long etDebeCatorce14 = Long.parseLong(etDebeCatorce);
        long etDebeQuince15 = Long.parseLong(etDebeQuince);
        //suma5
        long etHaberDoce12 = Long.parseLong(etHaberDoce);
        long etHaberTrece13 = Long.parseLong(etHaberTrece);
        long etHaberCatorce14 = Long.parseLong(etHaberCatorce);
        long etHaberQuince15 = Long.parseLong(etHaberQuince);


        //   bundle.putLong("etHaberQuince15", etHaberCatorce14);



    long sumadebe1=etDebeTres3+etDebeDos2+etDebeUno1;
    long sumahaber1=etHaberUno1+etHaberDos2+etHaberTres3;

    long sumadebe2=etDebeCuatro4+etDebeCinco5;
    long sumahaber2=etHaberCuatro4+etHaberCinco5;

    long sumadebe3=etDebeSeis6+etDebeSiete7;
    long sumahaber3=etHaberSeis6+etHaberSiete7;

    long sumadebe4=etDebeOcho8+etDebeNueve9+etDebeDiez10+etDebeOnce11;
    long sumahaber4=etHaberOcho8+etHaberNueve9+etHaberDiez10+etHaberOnce11;

    long sumadebe5=etDebeDoce12+etDebeTrece13+etDebeCatorce14+etDebeQuince15;
    long sumahaber5=etHaberDoce12+etHaberTrece13+etHaberCatorce14+etHaberQuince15;


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


    resultadoetSumaDebeUno = findViewById(R.id.etSumaDebeUno) ;
    resultadoetSumaHaberUno = findViewById(R.id.etSumaHaberUno) ;
    resultadoetSumaDebeDos = findViewById(R.id.etSumaDebeDos) ;
    resultadoetSumaHaberDos = findViewById(R.id.etSumaHaberDos) ;
    resultadoetSumaDebeTres = findViewById(R.id.etSumaDebeTres) ;
    resultadoetSumaHaberTres = findViewById(R.id.etSumaHaberTres) ;
    resultadoetSumaDebeCuatro = findViewById(R.id.etSumaDebeCuatro) ;
    resultadoetSumaHaberCuatro = findViewById(R.id.etSumaHaberCuatro) ;
    resultadoetSumaDebeCinco = findViewById(R.id.etSumaDebeCinco) ;
    resultadoetSumaHaberCinco = findViewById(R.id.etSumaHaberCinco) ;


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


    }





    @OnClick(R.id.btnGuardarDatos)
       public void setBtnGuardarDatos() {
        if (validarDatos()) {
            Bundle bundle = new Bundle();

            String etDebeUno = editTexts.get(0).getText().toString();
            String etDebeDos = editTexts.get(1).getText().toString();
            String etDebeTres = editTexts.get(2).getText().toString();
            String etHaberUno = editTexts.get(3).getText().toString();
            String etHaberDos = editTexts.get(4).getText().toString();
            String etHaberTres = editTexts.get(5).getText().toString();
            String etDebeCuatro = editTexts.get(6).getText().toString();
            String etDebeCinco = editTexts.get(7).getText().toString();
            String etHaberCuatro = editTexts.get(8).getText().toString();
            String etHaberCinco = editTexts.get(9).getText().toString();
            String etDebeSeis = editTexts.get(10).getText().toString();
            String etDebeSiete = editTexts.get(11).getText().toString();
            String etHaberSeis = editTexts.get(12).getText().toString();
            String etHaberSiete = editTexts.get(13).getText().toString();
            String etDebeOcho = editTexts.get(14).getText().toString();
            String etDebeNueve = editTexts.get(15).getText().toString();
            String etDebeDiez = editTexts.get(16).getText().toString();
            String etDebeOnce = editTexts.get(17).getText().toString();
            String etHaberOcho = editTexts.get(18).getText().toString();
            String etHaberNueve = editTexts.get(19).getText().toString();
            String etHaberDiez = editTexts.get(20).getText().toString();
            String etHaberOnce = editTexts.get(21).getText().toString();
            String etDebeDoce = editTexts.get(22).getText().toString();
            String etDebeTrece = editTexts.get(23).getText().toString();
            String etDebeCatorce = editTexts.get(24).getText().toString();
            String etDebeQuince = editTexts.get(25).getText().toString();
            String etHaberDoce = editTexts.get(26).getText().toString();
            String etHaberTrece = editTexts.get(27).getText().toString();
            String etHaberCatorce = editTexts.get(28).getText().toString();
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
        String etDebeDos = editTexts.get(1).getText().toString();
        String etDebeTres = editTexts.get(2).getText().toString();
        String etHaberUno = editTexts.get(3).getText().toString();
        String etHaberDos = editTexts.get(4).getText().toString();
        String etHaberTres = editTexts.get(5).getText().toString();
        String etDebeCuatro = editTexts.get(6).getText().toString();
        String etDebeCinco = editTexts.get(7).getText().toString();
        String etHaberCuatro = editTexts.get(8).getText().toString();
        String etHaberCinco = editTexts.get(9).getText().toString();
        String etDebeSeis = editTexts.get(10).getText().toString();
        String etDebeSiete = editTexts.get(11).getText().toString();
        String etHaberSeis = editTexts.get(12).getText().toString();
        String etHaberSiete = editTexts.get(13).getText().toString();
        String etDebeOcho = editTexts.get(14).getText().toString();
        String etDebeNueve = editTexts.get(15).getText().toString();
        String etDebeDiez = editTexts.get(16).getText().toString();
        String etDebeOnce = editTexts.get(17).getText().toString();
        String etHaberOcho = editTexts.get(18).getText().toString();
        String etHaberNueve = editTexts.get(19).getText().toString();
        String etHaberDiez = editTexts.get(20).getText().toString();
        String etHaberOnce = editTexts.get(21).getText().toString();
        String etDebeDoce = editTexts.get(22).getText().toString();
        String etDebeTrece = editTexts.get(23).getText().toString();
        String etDebeCatorce = editTexts.get(24).getText().toString();
        String etDebeQuince = editTexts.get(25).getText().toString();
        String etHaberDoce = editTexts.get(26).getText().toString();
        String etHaberTrece = editTexts.get(27).getText().toString();
        String etHaberCatorce = editTexts.get(28).getText().toString();
        String etHaberQuince = editTexts.get(29).getText().toString();


        boolean a = esValido(etDebeDos , 0);
        boolean b = esValido(etDebeTres , 1);
        boolean c = esValido(etHaberUno , 2);
        boolean d = esValido(etHaberDos , 3);
        boolean e = esValido(etHaberTres , 4);
        boolean f = esValido(etDebeCuatro , 5);
        boolean g = esValido(etDebeCinco , 6);
        boolean h = esValido(etHaberCuatro , 7);
        boolean i = esValido(etHaberCinco , 8);
        boolean j = esValido(etDebeSeis , 9);
        boolean k = esValido(etDebeSiete , 10);
        boolean l = esValido(etHaberSeis , 11);
        boolean m = esValido(etHaberSiete , 12);
        boolean n = esValido(etDebeOcho , 13);
        boolean p = esValido(etDebeNueve , 14);
        boolean o = esValido(etDebeUno , 15);
        boolean q = esValido(etDebeDiez , 16);
        boolean r = esValido(etDebeOnce , 17);
        boolean s = esValido(etHaberOcho , 18);
        boolean t = esValido(etHaberNueve , 19);
        boolean u = esValido(etHaberDiez , 20);
        boolean w = esValido(etHaberOnce , 21);
        boolean x = esValido(etDebeDoce , 22);
        boolean y = esValido(etDebeTrece , 23);
        boolean z = esValido(etDebeCatorce , 24);
        boolean aa = esValido(etDebeQuince , 25);
        boolean bb = esValido(etHaberDoce , 26);
        boolean cc = esValido(etHaberTrece , 27);
        boolean dd = esValido(etHaberCatorce , 28);
        boolean ee = esValido(etHaberQuince  , 29);




        if (a && b && c && d && e && f && g && h && i && j
                && k && l && m && n && o && p && q && r && s && t && u && w && x && y && z && aa && bb && cc && dd  && ee) {
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
