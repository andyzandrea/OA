package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.CapitalSocial;

@Dao
public interface CapitalSocialDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertCapitalSocial(CapitalSocial capitalSocial);

    @Query("SELECT * FROM CapitalSocial")
    CapitalSocial getCapitalSocial();

    @Query("DELETE FROM CapitalSocial")
    void borrarDatosTabla();
}

