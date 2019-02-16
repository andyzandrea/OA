package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Almacen;

@Dao
public interface AlmacenDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertAlmacen(Almacen almacen);

    @Query("SELECT * FROM Almacen")
    Almacen getAlmacen();

    @Query("DELETE FROM Almacen")
    void borrarDatosTabla();
}
