package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Ventas;

@Dao
public interface VentasDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertVentas(Ventas ventas);

    @Query("SELECT * FROM Ventas")
    Ventas getVentas();

    @Query("DELETE FROM Ventas")
    void borrarDatosTabla();
}
