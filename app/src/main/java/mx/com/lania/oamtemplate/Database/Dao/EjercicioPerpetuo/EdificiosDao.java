package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Edificios;

@Dao
public interface EdificiosDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertEdificios(Edificios edificios);

    @Query("SELECT * FROM Edificios")
    Edificios getEdificios();
}
