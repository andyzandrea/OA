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

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindViews;
import butterknife.ButterKnife;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Clientes;
import mx.com.lania.oamtemplate.OAMApplication;
import mx.com.lania.oamtemplate.R;
import mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo.ClientesViewModel;

public class clientes extends Fragment {
    @Inject
    @Named("ClientesFactory")
    ViewModelProvider.Factory viewModelClientes;
    private ClientesViewModel clientesViewModel;

    @BindViews({R.id.etDeudorSIValor, R.id.etAcreedorSIValor, R.id.etDebeMovValor, R.id.etHaberMovValor,
            R.id.etdeudorSFValor, R.id.etAcreedorSFValor})
    List<EditText> editTexts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_clientes, container, false);
        ButterKnife.bind(this, view);

        //Inicializar Dagger2
        ((OAMApplication) getActivity().getApplication()).getAppComponent().inject(this);
        //Cargar ViewModel
        clientesViewModel = ViewModelProviders.of(this, viewModelClientes).get(ClientesViewModel.class);

        Clientes clientes = clientesViewModel.getCliente();

        editTexts.get(0).setText(String.valueOf(clientes.getDeudorSaldoInicial()));
        editTexts.get(1).setText(String.valueOf(clientes.getAcreedorSaldoInicial()));
        editTexts.get(2).setText(String.valueOf(clientes.getDebeMovimientos()));
        editTexts.get(3).setText(String.valueOf(clientes.getHaberMovimientos()));
        editTexts.get(4).setText(String.valueOf(clientes.getDeudorSaldoFinal()));
        editTexts.get(5).setText(String.valueOf(clientes.getAcreedorSaldoFinal()));

        return view;
    }
}