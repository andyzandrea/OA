package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import mx.com.lania.oamtemplate.View.Fragment.CapitalSociable;
import mx.com.lania.oamtemplate.View.Fragment.CostoVentas;
import mx.com.lania.oamtemplate.View.Fragment.ResultadoEjercicioAnterior;
import mx.com.lania.oamtemplate.View.Fragment.Ventas;

public class PasoCuatroContinuacionDosAdapter extends FragmentPagerAdapter {
    private int numberOfTabs;

    public PasoCuatroContinuacionDosAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numberOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CapitalSociable();
            case 1:
                return new ResultadoEjercicioAnterior();
            case 2:
                return new Ventas();
            case 3:
                return new CostoVentas();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
