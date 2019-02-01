package mx.com.lania.oamtemplate.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.List;
import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.Adapter.ExpandableListAdapter;
import mx.com.lania.oamtemplate.View.Evaluacion.EvaluationInfoActivity;
import mx.com.lania.oamtemplate.View.Evaluacion.EvaluationInstActivity;
import mx.com.lania.oamtemplate.View.InvPerpetuo.InfInvPerpActivity;

public class MenuEvaluationActivity extends AppCompatActivity {

    private ExpandableListView evaluationList;
    private ExpandableListAdapter evaluationListAdapter;
    private List<String> listEvaluationHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_evaluation);
        showToolbar();
        fillExerciseTitles();
        initMenu();
        listenMenuClick();
    }

    private void listenMenuClick() {
        evaluationList.setOnGroupClickListener((parent, v, groupPosition, id) -> {
            switch (groupPosition) {
                //TODO: Write the code to set the exercise clicked to EvaluationActivity
                case 0:
                    Intent intent = new Intent(this, EvaluationInstActivity.class);
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent2 = new Intent(this, EvaluationInfoActivity.class);
                    startActivity(intent2);
                    break;
            }

            return true;
        });
    }

    private void initMenu() {
        evaluationList = findViewById(R.id.evaluation_list);
        evaluationListAdapter = new ExpandableListAdapter(this,listEvaluationHeader,null);
        evaluationList.setAdapter(evaluationListAdapter);
    }

    private void fillExerciseTitles() {
        listEvaluationHeader = new ArrayList<>();
        //TODO: Add exercise titles
        listEvaluationHeader.add("Evaluacion 1.1");
        listEvaluationHeader.add("Evaluacion 1.2");
    }

    private void showToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.menu_evaluation);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
