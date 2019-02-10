package mx.com.lania.oamtemplate.View.Evaluacion;

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
import mx.com.lania.oamtemplate.View.MenuExerciseActivity;

public  class ResultadoEvaluationActivity extends AppCompatActivity {

    @BindView(R.id.btnGuardarDatos)
        Button btnGuardarDatos;

        @BindViews({R.id.tvCuentaDesc1, R.id.tvNaturalezaDesc1,
                R.id.tvCuentaDesc2, R.id.tvNaturalezaDesc2,
                R.id.tvCuentaDesc3, R.id.tvNaturalezaDesc3,
                R.id.tvCuentaDesc4, R.id.tvNaturalezaDesc4,
                R.id.tvCuentaDesc5, R.id.tvNaturalezaDesc5,
                R.id.tvCuentaDesc6, R.id.tvNaturalezaDesc6,
                R.id.tvCuentaDesc7, R.id.tvNaturalezaDesc7,
                R.id.tvCuentaDesc8, R.id.tvNaturalezaDesc8,
                R.id.tvCuentaDesc9, R.id.tvNaturalezaDesc9,
                R.id.tvCuentaDesc10, R.id.tvNaturalezaDesc10,
                R.id.tvCuentaDesc11, R.id.tvNaturalezaDesc11,
                R.id.tvCuentaDesc12, R.id.tvNaturalezaDesc12})
        List<EditText> editTexts;

        Bundle bundleInicial = new Bundle();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_resultado_evaluation);
            ButterKnife.bind(this);
            showToolbar();

            bundleInicial = getIntent().getExtras();
            cargarDatos();
            cargarValidacion();
        }

        public void cargarDatos() {
            editTexts.get(0).setText(bundleInicial.getString("tvCuentaDesc1"));
            editTexts.get(1).setText(bundleInicial.getString("tvNaturalezaDesc1"));
            editTexts.get(2).setText(bundleInicial.getString("tvCuentaDesc2"));
            editTexts.get(3).setText(bundleInicial.getString("tvNaturalezaDesc2"));
            editTexts.get(4).setText(bundleInicial.getString("tvCuentaDesc3"));
            editTexts.get(5).setText(bundleInicial.getString("tvNaturalezaDesc3"));
            editTexts.get(6).setText(bundleInicial.getString("tvCuentaDesc4"));
            editTexts.get(7).setText(bundleInicial.getString("tvNaturalezaDesc4"));
            editTexts.get(8).setText(bundleInicial.getString("tvCuentaDesc5"));
            editTexts.get(9).setText(bundleInicial.getString("tvNaturalezaDesc5"));
            editTexts.get(10).setText(bundleInicial.getString("tvCuentaDesc6"));
            editTexts.get(11).setText(bundleInicial.getString("tvNaturalezaDesc6"));
            editTexts.get(12).setText(bundleInicial.getString("tvCuentaDesc7"));
            editTexts.get(13).setText(bundleInicial.getString("tvNaturalezaDesc7"));
            editTexts.get(14).setText(bundleInicial.getString("tvCuentaDesc8"));
            editTexts.get(15).setText(bundleInicial.getString("tvNaturalezaDesc8"));
            editTexts.get(16).setText(bundleInicial.getString("tvCuentaDesc9"));
            editTexts.get(17).setText(bundleInicial.getString("tvNaturalezaDesc9"));
            editTexts.get(18).setText(bundleInicial.getString("tvCuentaDesc10"));
            editTexts.get(19).setText(bundleInicial.getString("tvNaturalezaDesc10"));
            editTexts.get(20).setText(bundleInicial.getString("tvCuentaDesc11"));
            editTexts.get(21).setText(bundleInicial.getString("tvNaturalezaDesc11"));
            editTexts.get(22).setText(bundleInicial.getString("tvCuentaDesc12"));
            editTexts.get(23).setText(bundleInicial.getString("tvNaturalezaDesc12"));

        }

        public void cargarValidacion() {
            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(0).getText().toString().equals("Activo circulante")
                    || editTexts.get(0).getText().toString().equals("Activo Circulante")
                    || editTexts.get(0).getText().toString().equals("activo Circulante")
                    || editTexts.get(0).getText().toString().equals("activo circulante")) {

                editTexts.get(0).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(0).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }





            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(1).getText().toString().equals("Deudor")
                    || editTexts.get(1).getText().toString().equals("deudor")) {

                editTexts.get(1).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(1).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }


            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(2).getText().toString().equals("Activo circulante")
                    || editTexts.get(2).getText().toString().equals("Activo Circulante")
                    || editTexts.get(2).getText().toString().equals("activo Circulante")
                    || editTexts.get(2).getText().toString().equals("activo circulante")) {

                editTexts.get(2).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(2).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(3).getText().toString().equals("Deudor")
                    || editTexts.get(3).getText().toString().equals("deudor")) {

                editTexts.get(3).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(3).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }
            /*------------------------------------------------------------------------------------*/

            if (editTexts.get(4).getText().toString().equals("Activo circulante")
                    || editTexts.get(4).getText().toString().equals("Activo Circulante")
                    || editTexts.get(4).getText().toString().equals("activo Circulante")
                    || editTexts.get(4).getText().toString().equals("activo circulante")) {

                editTexts.get(4).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(4).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }


            /*------------------------------------------------------------------------------------*/

            if (editTexts.get(5).getText().toString().equals("Deudor")
                    || editTexts.get(5).getText().toString().equals("deudor")) {

                editTexts.get(5).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(5).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(6).getText().toString().equals("Activo no circulante")
                    || editTexts.get(6).getText().toString().equals("Activo No Circulante")
                    || editTexts.get(6).getText().toString().equals("activo no Circulante")
                    || editTexts.get(6).getText().toString().equals("activo No Circulante")
                    || editTexts.get(6).getText().toString().equals("activo No circulante")) {

                editTexts.get(6).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(6).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/

            if (editTexts.get(7).getText().toString().equals("Deudor")
                    || editTexts.get(7).getText().toString().equals("deudor")) {

                editTexts.get(7).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(7).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(8).getText().toString().equals("Activo no circulante")
                    || editTexts.get(8).getText().toString().equals("Activo No Circulante")
                    || editTexts.get(8).getText().toString().equals("activo no Circulante")
                    || editTexts.get(8).getText().toString().equals("activo No Circulante")
                    || editTexts.get(8).getText().toString().equals("activo No circulante")) {

                editTexts.get(8).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(8).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(9).getText().toString().equals("Deudor")
                    || editTexts.get(9).getText().toString().equals("deudor")) {

                editTexts.get(9).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(9).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(10).getText().toString().equals("Activo no circulante")
                    || editTexts.get(10).getText().toString().equals("Activo No Circulante")
                    || editTexts.get(10).getText().toString().equals("activo no Circulante")
                    || editTexts.get(10).getText().toString().equals("activo No Circulante")
                    || editTexts.get(10).getText().toString().equals("activo No circulante")) {

                editTexts.get(10).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(10).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/

            if (editTexts.get(11).getText().toString().equals("Acreedor")
                    || editTexts.get(11).getText().toString().equals("acreedor")) {

                editTexts.get(11).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(11).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/


            if (editTexts.get(12).getText().toString().equals("Pasivo A Corto Plazo")
                    || editTexts.get(12).getText().toString().equals("pasivo a corto plazo")
                    || editTexts.get(12).getText().toString().equals("Pasivo a corto plazo")
                    || editTexts.get(12).getText().toString().equals("pasivo A corto plazo")
                    || editTexts.get(12).getText().toString().equals("Pasivo a Corto plazo")) {

                editTexts.get(12).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(12).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }
            /*------------------------------------------------------------------------------------*/

            if (editTexts.get(13).getText().toString().equals("Acreedor")
                    || editTexts.get(13).getText().toString().equals("acreedor")) {

                editTexts.get(13).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(13).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(14).getText().toString().equals("Pasivo A Corto Plazo")
                    || editTexts.get(14).getText().toString().equals("pasivo a corto plazo")
                    || editTexts.get(14).getText().toString().equals("Pasivo a corto plazo")
                    || editTexts.get(14).getText().toString().equals("pasivo A corto plazo")
                    || editTexts.get(14).getText().toString().equals("Pasivo a Corto plazo")) {

                editTexts.get(14).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(14).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }


            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(15).getText().toString().equals("Acreedor")
                    || editTexts.get(15).getText().toString().equals("acreedor")) {

                editTexts.get(15).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(15).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }


            /*------------------------------------------------------------------------------------*/

            if (editTexts.get(16).getText().toString().equals("Capital Contable")
                    || editTexts.get(16).getText().toString().equals("capital contable")
                    || editTexts.get(16).getText().toString().equals("Capital contable")
                    || editTexts.get(16).getText().toString().equals("capital Contable")) {

                editTexts.get(16).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(16).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(17).getText().toString().equals("Acreedor")
                    || editTexts.get(17).getText().toString().equals("acreedor")) {

                editTexts.get(17).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(17).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }
            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(18).getText().toString().equals("Capital Contable")
                    || editTexts.get(18).getText().toString().equals("capital contable")
                    || editTexts.get(18).getText().toString().equals("Capital contable")
                    || editTexts.get(18).getText().toString().equals("capital Contable")) {

                editTexts.get(18).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(18).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(19).getText().toString().equals("Acreedor")
                    || editTexts.get(19).getText().toString().equals("acreedor")) {

                editTexts.get(19).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(19).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }


            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(20).getText().toString().equals("Activo no circulante")
                    || editTexts.get(20).getText().toString().equals("Activo No Circulante")
                    || editTexts.get(20).getText().toString().equals("activo no Circulante")
                    || editTexts.get(20).getText().toString().equals("activo No Circulante")
                    || editTexts.get(20).getText().toString().equals("activo No circulante")) {

                editTexts.get(20).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(20).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }


            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(21).getText().toString().equals("Deudor")
                    || editTexts.get(21).getText().toString().equals("deudor")) {

                editTexts.get(21).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(21).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }

            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(22).getText().toString().equals("Activo no circulante")
                    || editTexts.get(22).getText().toString().equals("Activo No Circulante")
                    || editTexts.get(22).getText().toString().equals("activo no Circulante")
                    || editTexts.get(22).getText().toString().equals("activo No Circulante")
                    || editTexts.get(22).getText().toString().equals("activo No circulante")) {

                editTexts.get(22).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(22).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }
            /*------------------------------------------------------------------------------------*/
            if (editTexts.get(23).getText().toString().equals("Acreedor")
                    || editTexts.get(23).getText().toString().equals("acreedor")) {

                editTexts.get(23).setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
            } else {
                editTexts.get(23).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }


            /*------------------------------------------------------------------------------------*/



        }

        @OnClick(R.id.btnGuardarDatos)
        public void setBtnGuardarDatos () {
            Intent returnHome = new Intent(ResultadoEvaluationActivity.this, MenuExerciseActivity.class);
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
