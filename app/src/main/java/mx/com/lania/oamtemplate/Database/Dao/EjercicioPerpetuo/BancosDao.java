package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Bancos;

@Dao
public interface BancosDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertBanco(Bancos bancos);

    @Query("SELECT * FROM Bancos")
    Bancos getBanco();

    @Query("DELETE FROM Bancos")
    void borrarDatosTabla();
}
