package mx.com.lania.oamtemplate.Repository;

import android.arch.lifecycle.LiveData;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EvaluationDao;
import mx.com.lania.oamtemplate.Database.Entity.Evaluation;

public class EvaluationRepository {

    //TODO: Perform data operations for evaluation

    private EvaluationDao evaluationDao;

    @Inject
    public EvaluationRepository(EvaluationDao evaluationDao) { this.evaluationDao = evaluationDao; }

    public LiveData<Evaluation> selectEvaluation(int evaluationId) {
        return evaluationDao.selectEvaluation(evaluationId);
    }

}
