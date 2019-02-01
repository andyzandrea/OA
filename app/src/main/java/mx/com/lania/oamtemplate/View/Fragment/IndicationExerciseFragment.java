package mx.com.lania.oamtemplate.View.Fragment;


import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;
import javax.inject.Named;

import mx.com.lania.oamtemplate.Database.Entity.Exercise;
import mx.com.lania.oamtemplate.OAMApplication;
import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.ViewModel.ExerciseViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class IndicationExerciseFragment extends Fragment {

    @Inject
    @Named("ExerciseFactory")
    ViewModelProvider.Factory viewModelFactory;

    ExerciseViewModel exerciseViewModel;
    private int exerciseId;
    private Exercise exercise;

    public IndicationExerciseFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_indication_exercise, container, false);
        showToolbar(view);
        ((OAMApplication) getActivity().getApplication()).getAppComponent().inject(this);
        exerciseViewModel = ViewModelProviders.of(this,viewModelFactory).get(ExerciseViewModel.class);
        exerciseViewModel.getExercise(exerciseId).observe(this, exercise -> {
            this.exercise = exercise;
        });
        return view;
    }

    private void showToolbar(View view) {
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("");
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
