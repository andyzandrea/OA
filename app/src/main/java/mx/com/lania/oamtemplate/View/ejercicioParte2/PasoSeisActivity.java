package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.OnClick;
import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.MenuExerciseActivity;

public class PasoSeisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso_seis);
    }

    @OnClick(R.id.btnGuardarDatos)
    public void setBtnGuardarDatos() {
        Intent returnHome = new Intent(PasoSeisActivity.this, MenuExerciseActivity.class);
        returnHome.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(returnHome);
    }
}
