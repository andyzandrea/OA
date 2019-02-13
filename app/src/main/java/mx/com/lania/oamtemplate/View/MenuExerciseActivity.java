package mx.com.lania.oamtemplate.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;

import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.Adapter.ExpandableListAdapter;
import mx.com.lania.oamtemplate.View.InvPerpetuo.InfInvPerpActivity;
import mx.com.lania.oamtemplate.View.ejercicioParte2.Part2Activity;
import mx.com.lania.oamtemplate.View.ejercicioParte2.Part2InfoActivity;
import mx.com.lania.oamtemplate.View.ejercicioParte2.PasoCuatroActivity;

public class MenuExerciseActivity extends AppCompatActivity {

    private ExpandableListView exerciseList;
    private ExpandableListAdapter exerciseListAdapter;
    private List<String> listExerciseHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);
        showToolbar();
        fillExerciseTitles();
        initMenu();
        listenMenuClick();
    }

    private void listenMenuClick() {
        exerciseList.setOnGroupClickListener((parent, v, groupPosition, id) -> {
            switch (groupPosition) {
                //TODO: Write the code to set the exercise clicked to ExerciseActivity
                case 0:
                    Intent intent = new Intent(this, InfInvPerpActivity.class);
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent2 = new Intent(this, Part2InfoActivity.class);
                    startActivity(intent2);
                    break;
                case 2:
                    Intent intent22 = new Intent(this, Part2Activity.class);
                    startActivity(intent22);
                    break;
                case 3:
                    Intent intent3 = new Intent(this, PasoCuatroActivity.class);
                    startActivity(intent3);
                    break;
            }

            return true;
        });
    }

    private void initMenu() {
        exerciseList = findViewById(R.id.exercises_list);
        exerciseListAdapter = new ExpandableListAdapter(this, listExerciseHeader, null);
        exerciseList.setAdapter(exerciseListAdapter);
    }

    private void fillExerciseTitles() {
        listExerciseHeader = new ArrayList<>();
        //TODO: Add exercise titles
        listExerciseHeader.add("Ejercicio 1.1");
        listExerciseHeader.add("Ejercicio 1.2");
        listExerciseHeader.add("PAra revisar completo");
        listExerciseHeader.add("paso4");
    }

    private void showToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.menu_exercise);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
