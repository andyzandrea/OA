package mx.com.lania.oamtemplate.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import mx.com.lania.oamtemplate.R;

public class LessonActivity extends AppCompatActivity {

    private TextView tVTitle;
    private WebView lessonView;
    String lessonTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        Bundle extras = getIntent().getExtras();
        lessonTitle = extras.getString("LESSON_TITLE");
        String lessonHtml="file:///android_asset/"+extras.getString("LESSON_HTML");
        showToolbar();

        tVTitle = findViewById(R.id.text_view_theme_title);
        tVTitle.setText(lessonTitle);
        lessonView = findViewById(R.id.lesson_view);
        lessonView.setWebViewClient(new WebViewClient());
        lessonView.loadUrl(lessonHtml);
        lessonView.getSettings().setJavaScriptEnabled(true);
      /*  setTextViewTitle();
        setLessonView();*/
    }

    private void showToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(lessonTitle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

  /*  private void setTextViewTitle() {
        tVTitle = findViewById(R.id.text_view_theme_title);
        tVTitle.setText(lessonTitle);
    }


    private void setLessonView() {
        lessonView = findViewById(R.id.lesson_view);
        lessonView.setWebViewClient(new WebViewClient());
        lessonView.loadUrl(lessonHtml);
        lessonView.getSettings().setJavaScriptEnabled(true);
    }*/

}
