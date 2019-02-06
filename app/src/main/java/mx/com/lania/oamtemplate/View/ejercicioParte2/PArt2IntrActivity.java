package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.ButterKnife;
import butterknife.OnClick;
import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.InvPerpetuo.InstrInvPerpActivity;
import mx.com.lania.oamtemplate.View.InvPerpetuo.InvPerpetuoActivity;

public class PArt2IntrActivity extends AppCompatActivity {
    private WebView lessonView;
    private String lessonTitle;
    private String lessonUrl = "file:///android_asset/InvPerpetuo/datosProblema.html";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2_intr);
        ButterKnife.bind(this);
        showToolbar();
        setLessonView();
    }
    @OnClick(R.id.btnSiguiente)
    public void btnSiguiente(){
        Intent intent = new Intent(PArt2IntrActivity.this, Part2Activity.class);
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
