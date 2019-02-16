package mx.com.lania.oamtemplate.View.Fragment;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.List;

import javax.inject.Named;

import butterknife.BindViews;
import butterknife.ButterKnife;
import mx.com.lania.oamtemplate.OAMApplication;
import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.AlmacenViewModel;

public class Almacen extends Fragment {
    @Named("AlmacenFactory")
    ViewModelProvider.Factory viewModelAlmacen;
    private AlmacenViewModel almacenViewModel;

    @BindViews({R.id.etDeudorSIValor, R.id.etAcreedorSIValor, R.id.etDebeMovValor, R.id.etHaberMovValor,
            R.id.etdeudorSFValor, R.id.etAcreedorSFValor})
    List<EditText> editTexts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_almacen, container, false);
        ButterKnife.bind(this, view);

        //Inicializar Dagger2
        ((OAMApplication) getActivity().getApplication()).getAppComponent().inject(this);
        //Cargar ViewModel
        almacenViewModel = ViewModelProviders.of(this, viewModelAlmacen).get(AlmacenViewModel.class);

        mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Almacen almacen = almacenViewModel.getAlmacen();

        editTexts.get(0).setText(String.valueOf(almacen.getDeudorSaldoInicial()));
        editTexts.get(1).setText(String.valueOf(almacen.getAcreedorSaldoInicial()));
        editTexts.get(2).setText(String.valueOf(almacen.getDebeMovimientos()));
        editTexts.get(3).setText(String.valueOf(almacen.getHaberMovimientos()));
        editTexts.get(4).setText(String.valueOf(almacen.getDeudorSaldoFinal()));
        editTexts.get(5).setText(String.valueOf(almacen.getAcreedorSaldoFinal()));

        return view;
    }
}