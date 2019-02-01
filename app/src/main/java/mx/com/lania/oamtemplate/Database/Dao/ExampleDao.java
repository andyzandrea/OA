package mx.com.lania.oamtemplate.Database.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entity.Example;

@Dao
public interface ExampleDao {

    //TODO: Define database operations for Example entity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertExample(Example example);

    @Query("SELECT * FROM example WHERE id = :exampleId")
    LiveData<Example> selectExample(int exampleId);

    @Delete
    void deleteExample(Example example);

}
