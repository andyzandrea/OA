package mx.com.lania.oamtemplate.Repository;

import android.arch.lifecycle.LiveData;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.LearningObjectDao;
import mx.com.lania.oamtemplate.Database.Entities.LearningObject;

public class LearningObjectRepository {

    //TODO: Perform data operations for Learning object

    private LearningObjectDao learningObjectDao;

    @Inject
    public LearningObjectRepository(LearningObjectDao learningObjectDao) {
        this.learningObjectDao = learningObjectDao;
    }

    public LiveData<LearningObject> selectLearningObject(int learningObjectId) {
        return learningObjectDao.selectLearningObject(learningObjectId);
    }

}
