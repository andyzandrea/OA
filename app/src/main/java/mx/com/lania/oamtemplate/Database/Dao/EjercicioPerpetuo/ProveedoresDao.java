package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Proveedores;

@Dao
public interface ProveedoresDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertProveedores(Proveedores proveedores);

    @Query("SELECT * FROM Proveedores")
    Proveedores getProveedores();
}
