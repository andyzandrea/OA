package mx.com.lania.oamtemplate.View;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import javax.inject.Inject;
import javax.inject.Named;

import mx.com.lania.oamtemplate.OAMApplication;
import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.View.Adapter.MenuAdapter;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.AcreedoresViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.AlmacenViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.BancosViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.CapitalSocialViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.ClientesViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.CostoDeVentasViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.DepreciacionViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.EdificiosViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.MaquinariaViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.ProveedoresViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.ResultadoViewModel;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.VentasViewModel;


public class MenuActivity extends AppCompatActivity {
    @Inject
    @Named("AcreedoresFactory")
    ViewModelProvider.Factory viewModelAcreedores;
    private AcreedoresViewModel acreedoresViewModel;

    @Inject
    @Named("AlmacenFactory")
    ViewModelProvider.Factory viewModelAlmacen;
    private AlmacenViewModel almacenViewModel;

    @Inject
    @Named("BancosFactory")
    ViewModelProvider.Factory viewModelBancos;
    private BancosViewModel bancosViewModel;

    @Inject
    @Named("CapitalSocialFactory")
    ViewModelProvider.Factory viewModelCapitalSocial;
    private CapitalSocialViewModel capitalSocialViewModel;

    @Inject
    @Named("ClientesFactory")
    ViewModelProvider.Factory viewModelClientes;
    private ClientesViewModel clientesViewModel;

    @Inject
    @Named("CostoDeVentasFactory")
    ViewModelProvider.Factory viewModelCostoDeVentas;
    private CostoDeVentasViewModel costoDeVentasViewModel;

    @Inject
    @Named("DepreciacionFactory")
    ViewModelProvider.Factory viewModelDepreciacion;
    private DepreciacionViewModel depreciacionViewModel;

    @Inject
    @Named("EdificiosFactory")
    ViewModelProvider.Factory viewModelEdificios;
    private EdificiosViewModel edificiosViewModel;

    @Inject
    @Named("MaquinariaFactory")
    ViewModelProvider.Factory viewModelMaquinaria;
    private MaquinariaViewModel maquinariaViewModel;

    @Inject
    @Named("ProveedoresFactory")
    ViewModelProvider.Factory viewModelProveedores;
    private ProveedoresViewModel proveedoresViewModel;

    @Inject
    @Named("ResultadoFactory")
    ViewModelProvider.Factory viewModelResultado;
    private ResultadoViewModel resultadoViewModel;

    @Inject
    @Named("VentasFactory")
    ViewModelProvider.Factory viewModelVentas;
    private VentasViewModel ventasViewModel;

    private GridView menu;
    private MenuAdapter menuAdapter;
    private String[] titleItemMenu;
    private int[] iconItemMenu, cardColor;

    public MenuActivity() {
        iconItemMenu = new int[]{R.drawable.ic_lessons, R.drawable.ic_example, R.drawable.ic_exercise, R.drawable.ic_evaluation};
        titleItemMenu = new String[]{"Lecciones", "Ejemplos", "Ejercicios", "Evaluación"};
        cardColor = new int[]{R.color.colorBlue, R.color.colorGreen, R.color.colorYellow, R.color.colorRed};
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        showToolbar();
        initMenu();
        listenMenuClick();
        //Inicializar Dagger2
        ((OAMApplication) getApplication()).getAppComponent().inject(this);
        //Cargar ViewModel
        acreedoresViewModel = ViewModelProviders.of(this, viewModelAcreedores).get(AcreedoresViewModel.class);
        almacenViewModel = ViewModelProviders.of(this, viewModelAlmacen).get(AlmacenViewModel.class);
        bancosViewModel = ViewModelProviders.of(this, viewModelBancos).get(BancosViewModel.class);
        capitalSocialViewModel = ViewModelProviders.of(this, viewModelCapitalSocial).get(CapitalSocialViewModel.class);
        clientesViewModel = ViewModelProviders.of(this, viewModelClientes).get(ClientesViewModel.class);
        costoDeVentasViewModel = ViewModelProviders.of(this, viewModelCostoDeVentas).get(CostoDeVentasViewModel.class);
        depreciacionViewModel = ViewModelProviders.of(this, viewModelDepreciacion).get(DepreciacionViewModel.class);
        edificiosViewModel = ViewModelProviders.of(this, viewModelEdificios).get(EdificiosViewModel.class);
        maquinariaViewModel = ViewModelProviders.of(this, viewModelMaquinaria).get(MaquinariaViewModel.class);
        proveedoresViewModel = ViewModelProviders.of(this, viewModelProveedores).get(ProveedoresViewModel.class);
        resultadoViewModel = ViewModelProviders.of(this, viewModelResultado).get(ResultadoViewModel.class);
        ventasViewModel = ViewModelProviders.of(this, viewModelVentas).get(VentasViewModel.class);

        // ----------------------Inicializar ejercicio perpetuo ----------------------------------------------------
        acreedoresViewModel.borrarDatosTabla();
        almacenViewModel.borrarDatosTabla();
        bancosViewModel.borrarDatosTabla();
        capitalSocialViewModel.borrarDatosTabla();
        clientesViewModel.borrarDatosTabla();
        costoDeVentasViewModel.borrarDatosTabla();
        depreciacionViewModel.borrarDatosTabla();
        edificiosViewModel.borrarDatosTabla();
        maquinariaViewModel.borrarDatosTabla();
        proveedoresViewModel.borrarDatosTabla();
        resultadoViewModel.borrarDatosTabla();
        ventasViewModel.borrarDatosTabla();
    }

    private void initMenu() {
        menuAdapter = new MenuAdapter(this, titleItemMenu, iconItemMenu, cardColor);
        menu = findViewById(R.id.main_menu);
        menu.setAdapter(menuAdapter);
    }

    private void listenMenuClick() {
        menu.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = null;
            switch (position) {
                case 0:
                    intent = new Intent(this, MenuLessonActivity.class);
                    break;
                //case 1: intent = new Intent(this,UnityPlayerActivity.class);
                case 2:
                    intent = new Intent(this, MenuExerciseActivity.class);
                    break;
                case 3:
                    intent = new Intent(this, MenuEvaluationActivity.class);
                    break;
            }
            if (intent != null)
                startActivity(intent);
        });
    }

    private void showToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.begin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

}
