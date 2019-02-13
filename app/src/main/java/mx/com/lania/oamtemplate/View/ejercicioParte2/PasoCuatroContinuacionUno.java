package mx.com.lania.oamtemplate.View.ejercicioParte2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mx.com.lania.oamtemplate.R;

public class PasoCuatroContinuacionUno extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tabPasoCuatro)
    TabLayout tabPasoCuatro;
    @BindView(R.id.viewPagerPasoCuatro)
    ViewPager viewPagerPasoCuatro;

    PasoCuatroContinuacionUnoAdapter pasoCuatroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso_cuatro_continuacion_uno);
        ButterKnife.bind(this);

        //Acciones toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Paso cuatro");
        toolbar.setNavigationOnClickListener(view -> onBackPressed());

        //Llenado de tablayout
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Maquinaria"));
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Depreciacion"));
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Proveedores"));
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Acreedores"));
        tabPasoCuatro.setTabGravity(TabLayout.GRAVITY_FILL);
        pasoCuatroAdapter = new PasoCuatroContinuacionUnoAdapter(getSupportFragmentManager(), tabPasoCuatro.getTabCount());
        viewPagerPasoCuatro.setAdapter(pasoCuatroAdapter);
        viewPagerPasoCuatro.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabPasoCuatro));
        tabPasoCuatro.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerPasoCuatro.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @OnClick(R.id.btnSiguiente)
    public void onClick() {
        Intent siguiente = new Intent(this, PasoCuatroContinuacionDos.class);
        startActivity(siguiente);
    }
}
