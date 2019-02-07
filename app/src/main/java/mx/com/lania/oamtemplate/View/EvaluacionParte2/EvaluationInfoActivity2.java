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
import mx.com.lania.oamtemplate.View.Evaluacion.EvaluationInfoActivity;
import mx.com.lania.oamtemplate.View.Evaluacion.EvaluationInstActivity;

public class EvaluationInfoActivity2 extends AppCompatActivity {
    private WebView evaluationView;
    private String evaluationTitle;
    private String EvaluationinfoUrl = "file:///android_asset/Evaluacion/informacion.html";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation_info2);
        ButterKnife.bind(this);
        showToolbar();
        setEvaluationView();
    }
    @OnClick(R.id.btnSiguiente)
    public void btnSiguiente(){
        Intent intent = new Intent(EvaluationInfoActivity2.this, EvaluationInstActivity2.class);
        startActivity(intent);
    }

    private void setEvaluationView() {
        evaluationView = findViewById(R.id.evaluation_view);
        evaluationView.setWebViewClient(new WebViewClient());
        evaluationView.loadUrl(EvaluationinfoUrl);
        evaluationView.getSettings().setJavaScriptEnabled(true);
    }

    private void showToolbar () {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Información");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
