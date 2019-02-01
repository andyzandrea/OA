package mx.com.lania.oamtemplate.Repository;

import android.arch.lifecycle.LiveData;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.QuestionDao;
import mx.com.lania.oamtemplate.Database.Entity.Question;

public class QuestionRepository {

    //TODO: Perform data operations for questions

    private QuestionDao questionDao;

    @Inject
    public QuestionRepository(QuestionDao questionDao) { this.questionDao = questionDao; }

    public LiveData<Question> selectQuestion(int questionId) {
        return questionDao.selectQuestion(questionId);
    }

}
