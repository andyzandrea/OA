package mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Clientes;

@Dao
public interface ClientesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertCliente(Clientes clientes);

    @Query("SELECT * FROM Clientes")
    Clientes getClientes();

    @Query("DELETE FROM Clientes")
    void borrarDatosTabla();
}
