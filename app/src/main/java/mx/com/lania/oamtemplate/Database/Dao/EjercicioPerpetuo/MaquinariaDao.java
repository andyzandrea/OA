package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Maquinaria;

@Dao
public interface MaquinariaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertMaquinaria(Maquinaria maquinaria);

    @Query("SELECT * FROM Maquinaria")
    Maquinaria getMaquinaria();

    @Query("DELETE FROM Maquinaria")
    void borrarDatosTabla();
}
