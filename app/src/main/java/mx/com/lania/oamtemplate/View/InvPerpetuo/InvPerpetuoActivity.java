package mx.com.lania.oamtemplate.View.InvPerpetuo;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import es.dmoral.toasty.Toasty;
import mx.com.lania.oamtemplate.R;
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

public class InvPerpetuoActivity extends AppCompatActivity {
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


    @BindView(R.id.btnGuardarDatos)
    Button btnGuardarDatos;

    @BindViews({R.id.tvCuentaDesc1, R.id.tvNaturalezaDesc1,
            R.id.tvCuentaDesc2, R.id.tvNaturalezaDesc2,
            R.id.tvCuentaDesc3, R.id.tvNaturalezaDesc3,
            R.id.tvCuentaDesc4, R.id.tvNaturalezaDesc4,
            R.id.tvCuentaDesc5, R.id.tvNaturalezaDesc5,
            R.id.tvCuentaDesc6, R.id.tvNaturalezaDesc6,
            R.id.tvCuentaDesc7, R.id.tvNaturalezaDesc7,
            R.id.tvCuentaDesc8, R.id.tvNaturalezaDesc8,
            R.id.tvCuentaDesc9, R.id.tvNaturalezaDesc9,
            R.id.tvCuentaDesc10, R.id.tvNaturalezaDesc10})
    List<EditText> editTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inv_perpetuo);
        ButterKnife.bind(this);
        showToolbar();
    }


    @OnClick(R.id.btnGuardarDatos)
    public void setBtnGuardarDatos() {
        if (validarDatos()) {
            Bundle bundle = new Bundle();
            String tvCuentaDesc1 = editTexts.get(0).getText().toString();
            String tvNaturalezaDesc1 = editTexts.get(1).getText().toString();
            String tvCuentaDesc2 = editTexts.get(2).getText().toString();
            String tvNaturalezaDesc2 = editTexts.get(3).getText().toString();
            String tvCuentaDesc3 = editTexts.get(4).getText().toString();
            String tvNaturalezaDesc3 = editTexts.get(5).getText().toString();
            String tvCuentaDesc4 = editTexts.get(6).getText().toString();
            String tvNaturalezaDesc4 = editTexts.get(7).getText().toString();
            String tvCuentaDesc5 = editTexts.get(8).getText().toString();
            String tvNaturalezaDesc5 = editTexts.get(9).getText().toString();
            String tvCuentaDesc6 = editTexts.get(10).getText().toString();
            String tvNaturalezaDesc6 = editTexts.get(11).getText().toString();
            String tvCuentaDesc7 = editTexts.get(12).getText().toString();
            String tvNaturalezaDesc7 = editTexts.get(13).getText().toString();
            String tvCuentaDesc8 = editTexts.get(14).getText().toString();
            String tvNaturalezaDesc8 = editTexts.get(15).getText().toString();
            String tvCuentaDesc9 = editTexts.get(16).getText().toString();
            String tvNaturalezaDesc9 = editTexts.get(17).getText().toString();
            String tvCuentaDesc10 = editTexts.get(18).getText().toString();
            String tvNaturalezaDesc10 = editTexts.get(19).getText().toString();

            bundle.putString("tvCuentaDesc1", tvCuentaDesc1);
            bundle.putString("tvNaturalezaDesc1", tvNaturalezaDesc1);
            bundle.putString("tvCuentaDesc2", tvCuentaDesc2);
            bundle.putString("tvNaturalezaDesc2", tvNaturalezaDesc2);
            bundle.putString("tvCuentaDesc3", tvCuentaDesc3);
            bundle.putString("tvNaturalezaDesc3", tvNaturalezaDesc3);
            bundle.putString("tvCuentaDesc4", tvCuentaDesc4);
            bundle.putString("tvNaturalezaDesc4", tvNaturalezaDesc4);
            bundle.putString("tvCuentaDesc5", tvCuentaDesc5);
            bundle.putString("tvNaturalezaDesc5", tvNaturalezaDesc5);
            bundle.putString("tvCuentaDesc6", tvCuentaDesc6);
            bundle.putString("tvNaturalezaDesc6", tvNaturalezaDesc6);
            bundle.putString("tvCuentaDesc7", tvCuentaDesc7);
            bundle.putString("tvNaturalezaDesc7", tvNaturalezaDesc7);
            bundle.putString("tvCuentaDesc8", tvCuentaDesc8);
            bundle.putString("tvNaturalezaDesc8", tvNaturalezaDesc8);
            bundle.putString("tvCuentaDesc9", tvCuentaDesc9);
            bundle.putString("tvNaturalezaDesc9", tvNaturalezaDesc9);
            bundle.putString("tvCuentaDesc10", tvCuentaDesc10);
            bundle.putString("tvNaturalezaDesc10", tvNaturalezaDesc10);

            Intent validacion = new Intent(InvPerpetuoActivity.this, ResultadoInvPerpetuoActivity.class);
            validacion.putExtras(bundle);
            startActivity(validacion);
        }
    }

    public boolean validarDatos() {
        boolean estado;

        String tvCuentaDesc1 = editTexts.get(0).getText().toString();
        String tvNaturalezaDesc1 = editTexts.get(1).getText().toString();
        String tvCuentaDesc2 = editTexts.get(2).getText().toString();
        String tvNaturalezaDesc2 = editTexts.get(3).getText().toString();
        String tvCuentaDesc3 = editTexts.get(4).getText().toString();
        String tvNaturalezaDesc3 = editTexts.get(5).getText().toString();
        String tvCuentaDesc4 = editTexts.get(6).getText().toString();
        String tvNaturalezaDesc4 = editTexts.get(7).getText().toString();
        String tvCuentaDesc5 = editTexts.get(8).getText().toString();
        String tvNaturalezaDesc5 = editTexts.get(9).getText().toString();
        String tvCuentaDesc6 = editTexts.get(10).getText().toString();
        String tvNaturalezaDesc6 = editTexts.get(11).getText().toString();
        String tvCuentaDesc7 = editTexts.get(12).getText().toString();
        String tvNaturalezaDesc7 = editTexts.get(13).getText().toString();
        String tvCuentaDesc8 = editTexts.get(14).getText().toString();
        String tvNaturalezaDesc8 = editTexts.get(15).getText().toString();
        String tvCuentaDesc9 = editTexts.get(16).getText().toString();
        String tvNaturalezaDesc9 = editTexts.get(17).getText().toString();
        String tvCuentaDesc10 = editTexts.get(18).getText().toString();
        String tvNaturalezaDesc10 = editTexts.get(19).getText().toString();


        boolean a = esValido(tvCuentaDesc1, 0);
        boolean b = esValido(tvNaturalezaDesc1, 1);
        boolean c = esValido(tvCuentaDesc2, 2);
        boolean d = esValido(tvNaturalezaDesc2, 3);
        boolean e = esValido(tvCuentaDesc3, 4);
        boolean f = esValido(tvNaturalezaDesc3, 5);
        boolean g = esValido(tvCuentaDesc4, 6);
        boolean h = esValido(tvNaturalezaDesc4, 7);
        boolean i = esValido(tvCuentaDesc5, 8);
        boolean j = esValido(tvNaturalezaDesc5, 9);
        boolean k = esValido(tvCuentaDesc6, 10);
        boolean l = esValido(tvNaturalezaDesc6, 11);
        boolean m = esValido(tvCuentaDesc7, 12);
        boolean n = esValido(tvNaturalezaDesc7, 13);
        boolean o = esValido(tvCuentaDesc8, 14);
        boolean p = esValido(tvNaturalezaDesc8, 15);
        boolean q = esValido(tvCuentaDesc9, 16);
        boolean r = esValido(tvNaturalezaDesc9, 17);
        boolean s = esValido(tvCuentaDesc10, 18);
        boolean t = esValido(tvNaturalezaDesc10, 19);

        if (a && b && c && d && e && f && g && h && i && j
                && k && l && m && n && o && p && q && r && s && t) {
            estado = true;
        } else {
            Toasty.error(this, "Faltan datos por completar.", Toast.LENGTH_SHORT, true).show();
            estado = false;
        }
        return estado;

    }

    private boolean esValido(String tipo, int position) {
        if (!TextUtils.isEmpty(tipo)) {
            editTexts.get(position).setError(null);
            return true;
        } else {
            editTexts.get(position).setError("Este campo es obligatorio.");
        }
        return false;
    }


    private void showToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Inventario Perpetuo");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
