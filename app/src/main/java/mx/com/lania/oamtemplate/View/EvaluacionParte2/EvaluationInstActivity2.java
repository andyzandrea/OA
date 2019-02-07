package mx.com.lania.oamtemplate.View.EvaluacionParte2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.ButterKnife;
import butterknife.OnClick;
import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.Evaluacion.EvaluationActivityUno;
import mx.com.lania.oamtemplate.View.Evaluacion.EvaluationInstActivity;

public class EvaluationInstActivity2 extends AppCompatActivity {
    private WebView lessonView;
    private String lessonTitle;
    private String lessonUrl = "file:///android_asset/Evaluacion/datosProblema.html";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation_inst2);
        ButterKnife.bind(this);
        showToolbar();
        setLessonView();

    }
    @OnClick(R.id.btnSiguiente)
    public void btnSiguiente(){
        Intent intent = new Intent(EvaluationInstActivity2.this, EvaluationActivityDos.class);
        startActivity(intent);
    }

    private void setLessonView() {
        lessonView = findViewById(R.id.lesson_view);
        lessonView.setWebViewClient(new WebViewClient());
        lessonView.loadUrl(lessonUrl);
        lessonView.getSettings().setJavaScriptEnabled(true);
    }

    private void showToolbar () {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Información");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
