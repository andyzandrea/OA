package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.OnClick;
import mx.com.lania.oamtemplate.R;

public class PasoCincoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso_cinco);
    }
    @OnClick(R.id.btnGuardarDatos)
    public void onClick() {
        Intent siguiente = new Intent(PasoCincoActivity.this,PasoSeisActivity.class);
        startActivity(siguiente);
    }
}
