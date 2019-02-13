package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import mx.com.lania.oamtemplate.View.Fragment.Almacen;
import mx.com.lania.oamtemplate.View.Fragment.Edificios;
import mx.com.lania.oamtemplate.View.Fragment.bancos;
import mx.com.lania.oamtemplate.View.Fragment.clientes;

public class PasoCuatroAdapter extends FragmentPagerAdapter {
    private int numberOfTabs;

    public PasoCuatroAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numberOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new bancos();
            case 1:
                return new clientes();
            case 2:
                return new Almacen();
            case 3:
                return new Edificios();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
