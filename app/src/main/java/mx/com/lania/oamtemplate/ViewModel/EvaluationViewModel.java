package mx.com.lania.oamtemplate.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.ViewModel;

import mx.com.lania.oamtemplate.Database.Entity.Evaluation;
import mx.com.lania.oamtemplate.Repository.EvaluationRepository;

/**
 * Created by macbook on 21/02/18.
 */

public class EvaluationViewModel extends ViewModel {
    private MediatorLiveData<Evaluation> evaluation;
    private EvaluationRepository evaluationRepository;

    public EvaluationViewModel(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    public LiveData<Evaluation> getEvaluation(int evaluationId) {
        evaluation.addSource(
                evaluationRepository.selectEvaluation(evaluationId),
                ejercicio -> evaluation.postValue(ejercicio)
        );
        return evaluation;
    }
}
