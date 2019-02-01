package mx.com.lania.oamtemplate.Repository;

import android.arch.lifecycle.LiveData;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.ExampleDao;
import mx.com.lania.oamtemplate.Database.Entity.Example;


public class ExampleRepository {

    //TODO: Perform data operations for examples

    private ExampleDao exampleDao;

    @Inject
    public ExampleRepository(ExampleDao exampleDao) { this.exampleDao = exampleDao; }

    public LiveData<Example> selectExample(int exampleId) {
        return exampleDao.selectExample(exampleId);
    }

}
