package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.CostoDeVentas;

@Dao
public interface CostoDeVentasDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertCostoDeVentas(CostoDeVentas costoDeVentas);

    @Query("SELECT * FROM CostoDeVentas")
    CostoDeVentas getCostoDeVentas();
}
