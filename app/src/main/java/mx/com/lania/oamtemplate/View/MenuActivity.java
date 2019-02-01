package mx.com.lania.oamtemplate.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.Adapter.MenuAdapter;


public class MenuActivity extends AppCompatActivity {

    private GridView menu;
    private MenuAdapter menuAdapter;
    private String[] titleItemMenu;
    private int[] iconItemMenu,cardColor;

    public MenuActivity() {
        iconItemMenu = new int[]{R.drawable.ic_lessons, R.drawable.ic_example, R.drawable.ic_exercise, R.drawable.ic_evaluation};
        titleItemMenu = new String[]{"Lecciones","Ejemplos","Ejercicios","Evaluación"};
        cardColor = new int[]{R.color.colorBlue, R.color.colorGreen, R.color.colorYellow, R.color.colorRed};
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        showToolbar();
        initMenu();
        listenMenuClick();
    }

    private void initMenu() {
        menuAdapter = new MenuAdapter(this,titleItemMenu,iconItemMenu,cardColor);
        menu = findViewById(R.id.main_menu);
        menu.setAdapter(menuAdapter);
    }

    private void listenMenuClick() {
        menu.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = null;
            switch (position) {
                case 0: intent = new Intent(this,MenuLessonActivity.class); break;
                //case 1: intent = new Intent(this,UnityPlayerActivity.class);
                case 2: intent = new Intent(this,MenuExerciseActivity.class); break;
                case 3: intent = new Intent(this,MenuEvaluationActivity.class); break;
            }
            if (intent != null)
                startActivity(intent);
        });
    }

    private void showToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.begin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

}
