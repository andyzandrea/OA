package mx.com.lania.oamtemplate.View.Evaluacion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.ButterKnife;
import butterknife.OnClick;
import mx.com.lania.oamtemplate.R;

public class EvaluationInfoActivity extends AppCompatActivity {
    private WebView evaluationView;
    private String evaluationTitle;
    private String EvaluationinfoUrl = "file:///android_asset/Evaluacion/informacion.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation_info);
        ButterKnife.bind(this);
        showToolbar();
        setEvaluationView();
    }

    @OnClick(R.id.btnSiguiente)
    public void btnSiguiente() {
        Intent intent = new Intent(EvaluationInfoActivity.this, EvaluationInstActivity.class);
        startActivity(intent);
    }

    private void setEvaluationView() {
        evaluationView = findViewById(R.id.evaluation_view);
        evaluationView.setWebViewClient(new WebViewClient());
        evaluationView.loadUrl(EvaluationinfoUrl);
        evaluationView.getSettings().setJavaScriptEnabled(true);
    }

    private void showToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Información");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
