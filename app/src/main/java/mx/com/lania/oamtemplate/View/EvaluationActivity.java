package mx.com.lania.oamtemplate.View;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.Fragment.AnswerEvaluationFragment;
import mx.com.lania.oamtemplate.View.Fragment.IndicationEvaluationFragment;

public class EvaluationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.evaluation_container, new IndicationEvaluationFragment())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null)
                .commit();
    }

    public void beginEvaluation(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.evaluation_container, new AnswerEvaluationFragment())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onBackPressed() {
        finish();
    }

}
