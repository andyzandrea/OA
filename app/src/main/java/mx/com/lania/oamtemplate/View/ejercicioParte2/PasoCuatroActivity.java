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

public class PasoCuatroActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tabPasoCuatro)
    TabLayout tabPasoCuatro;
    @BindView(R.id.viewPagerPasoCuatro)
    ViewPager viewPagerPasoCuatro;

    PasoCuatroAdapter pasoCuatroAdapter;

    Bundle bundleAnterior = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso_cuatro_activity);
        ButterKnife.bind(this);

        //Acciones toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Paso cuatro");
        toolbar.setNavigationOnClickListener(view -> onBackPressed());

        //Llenado de tablayout
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Bancos"));
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Clientes"));
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Almacen"));
        tabPasoCuatro.addTab(tabPasoCuatro.newTab().setText("Edificios"));
        tabPasoCuatro.setTabGravity(TabLayout.GRAVITY_FILL);
        pasoCuatroAdapter = new PasoCuatroAdapter(getSupportFragmentManager(), tabPasoCuatro.getTabCount());
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

        bundleAnterior = getIntent().getExtras();
    }

    @OnClick(R.id.btnSiguiente)
    public void onClick() {
        Intent siguiente = new Intent(this, PasoCuatroContinuacionUno.class);
        startActivity(siguiente);
    }
}
