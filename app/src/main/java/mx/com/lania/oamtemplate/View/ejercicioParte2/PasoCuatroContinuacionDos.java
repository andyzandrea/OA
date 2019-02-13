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

public class PasoCuatroContinuacionDos extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tabPasoCuatro)
    TabLayout tabPasoCuatro;
    @BindView(R.id.viewPagerPasoCuatro)
    ViewPager viewPagerPasoCuatro;

    PasoCuatroContinuacionDosAdapter pasoCuatroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso_cuatro_continuacion_dos);
        ButterKnife.bind(this);

        //Acciones toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Paso cuatro");
        toolbar.setNavigationOnClickListener(view -> onBackPressed());

        //Llenado de tablayout
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Capital Social"));
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Resultados"));
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Ventas"));
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Costo de Ventas"));
        tabPasoCuatro.setTabGravity(TabLayout.GRAVITY_FILL);
        pasoCuatroAdapter = new PasoCuatroContinuacionDosAdapter(getSupportFragmentManager(), tabPasoCuatro.getTabCount());
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
        Intent siguiente = new Intent(this, PasoCuatroFinal.class);
        startActivity(siguiente);
    }
}
