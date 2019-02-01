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

import mx.com.lania.oamtemplate.Database.Entity.Evaluation;
import mx.com.lania.oamtemplate.OAMApplication;
import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.ViewModel.EvaluationViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnswerEvaluationFragment extends Fragment {

    @Inject
    @Named("EvaluationFactory")
    ViewModelProvider.Factory viewModelFactory;

    EvaluationViewModel evaluationViewModel;
    private int evaluationId;
    private Evaluation evaluation;

    public AnswerEvaluationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_answer_evaluation, container, false);
        showToolbar(view);
        ((OAMApplication) getActivity().getApplication()).getAppComponent().inject(this);
        evaluationViewModel = ViewModelProviders.of(this,viewModelFactory).get(EvaluationViewModel.class);
        evaluationViewModel.getEvaluation(evaluationId).observe(this, evaluation -> {
            this.evaluation = evaluation;
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
