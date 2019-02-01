package mx.com.lania.oamtemplate.Database.Dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import java.util.List;
import mx.com.lania.oamtemplate.Database.Entity.Result;


/**
 * Created by macbook on 22/02/18.
 */

@Dao
public interface ResultDao {

    //TODO: Define database operations for Result entity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertResult(Result result);

    @Query("SELECT * FROM result WHERE id = :resultId")
    LiveData<Result> selectResult(int resultId);

    @Query("SELECT * FROM result")
    LiveData<List<Result>> selectResults();

    @Delete
    void deleteResult(Result result);

}
