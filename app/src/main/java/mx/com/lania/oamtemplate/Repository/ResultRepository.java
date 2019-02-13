package mx.com.lania.oamtemplate.Repository;

import android.arch.lifecycle.LiveData;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.ResultDao;
import mx.com.lania.oamtemplate.Database.Entities.Result;

public class ResultRepository {

    //TODO: Perform data operations for results

    private ResultDao resultDao;

    @Inject
    public ResultRepository(ResultDao resultDao) {
        this.resultDao = resultDao;
    }

    public LiveData<Result> selectResult(int resultId) {
        return resultDao.selectResult(resultId);
    }

}
