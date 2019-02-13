package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import mx.com.lania.oamtemplate.View.Fragment.AcreedoresDiversos;
import mx.com.lania.oamtemplate.View.Fragment.Depreciacion;
import mx.com.lania.oamtemplate.View.Fragment.Maquinaria;
import mx.com.lania.oamtemplate.View.Fragment.Proveedores;

public class PasoCuatroContinuacionUnoAdapter extends FragmentPagerAdapter {
    private int numberOfTabs;

    public PasoCuatroContinuacionUnoAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numberOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Maquinaria();
            case 1:
                return new Depreciacion();
            case 2:
                return new Proveedores();
            case 3:
                return new AcreedoresDiversos();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
