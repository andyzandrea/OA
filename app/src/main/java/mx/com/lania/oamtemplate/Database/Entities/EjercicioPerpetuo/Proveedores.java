package mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Proveedores")
public class Proveedores {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "debeMovimientos")
    long debeMovimientos;
    @ColumnInfo(name = "haberMovimientos")
    long haberMovimientos;
    @ColumnInfo(name = "deudorSaldoInicial")
    long deudorSaldoInicial;
    @ColumnInfo(name = "acreedorSaldoInicial")
    long acreedorSaldoInicial;
    @ColumnInfo(name = "deudorSaldoFinal")
    long deudorSaldoFinal;
    @ColumnInfo(name = "acreedorSaldoFinal")
    long acreedorSaldoFinal;


    @Ignore
    public Proveedores(long debeMovimientos, long haberMovimientos, long deudorSaldoInicial, long acreedorSaldoInicial, long deudorSaldoFinal, long acreedorSaldoFinal) {
        this.debeMovimientos = debeMovimientos;
        this.haberMovimientos = haberMovimientos;
        this.deudorSaldoInicial = deudorSaldoInicial;
        this.acreedorSaldoInicial = acreedorSaldoInicial;
        this.deudorSaldoFinal = deudorSaldoFinal;
        this.acreedorSaldoFinal = acreedorSaldoFinal;
    }

    public long getDebeMovimientos() {
        return debeMovimientos;
    }

    public void setDebeMovimientos(long debeMovimientos) {
        this.debeMovimientos = debeMovimientos;
    }

    public long getHaberMovimientos() {
        return haberMovimientos;
    }

    public void setHaberMovimientos(long haberMovimientos) {
        this.haberMovimientos = haberMovimientos;
    }

    public long getDeudorSaldoInicial() {
        return deudorSaldoInicial;
    }

    public void setDeudorSaldoInicial(long deudorSaldoInicial) {
        this.deudorSaldoInicial = deudorSaldoInicial;
    }

    public long getAcreedorSaldoInicial() {
        return acreedorSaldoInicial;
    }

    public void setAcreedorSaldoInicial(long acreedorSaldoInicial) {
        this.acreedorSaldoInicial = acreedorSaldoInicial;
    }

    public long getDeudorSaldoFinal() {
        return deudorSaldoFinal;
    }

    public void setDeudorSaldoFinal(long deudorSaldoFinal) {
        this.deudorSaldoFinal = deudorSaldoFinal;
    }

    public long getAcreedorSaldoFinal() {
        return acreedorSaldoFinal;
    }

    public void setAcreedorSaldoFinal(long acreedorSaldoFinal) {
        this.acreedorSaldoFinal = acreedorSaldoFinal;
    }
}


