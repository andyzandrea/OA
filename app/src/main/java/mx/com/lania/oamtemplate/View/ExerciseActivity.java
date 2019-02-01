package mx.com.lania.oamtemplate.View;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.Fragment.AnswerExerciseFragment;
import mx.com.lania.oamtemplate.View.Fragment.IndicationExerciseFragment;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.exercise_container,new IndicationExerciseFragment())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null)
                .commit();
    }

    public void insertResult(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.exercise_container,new AnswerExerciseFragment())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onBackPressed() {
        finish();
    }

}
