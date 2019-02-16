package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Depreciacion;

@Dao
public interface DepreciacionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertDepreciacion(Depreciacion depreciacion);

    @Query("SELECT * FROM Depreciacion")
    Depreciacion getDepreciacion();

    @Query("DELETE FROM Depreciacion")
    void borrarDatosTabla();
}
