package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Resultado;

@Dao
public interface ResultadoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertResultado(Resultado resultado);

    @Query("SELECT * FROM Resultado")
    Resultado getResultado();

    @Query("DELETE FROM Resultado")
    void borrarDatosTabla();
}
