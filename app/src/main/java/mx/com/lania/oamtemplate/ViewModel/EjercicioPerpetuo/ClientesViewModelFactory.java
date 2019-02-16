package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.ClientesRepository;

public class ClientesViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    ClientesRepository clientesRepository;

    ClientesViewModel clientesViewModel;

    public ClientesViewModelFactory(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (clientesViewModel == null) {
            if (modelClass.isAssignableFrom(ClientesViewModel.class)) {
                clientesViewModel = new ClientesViewModel(clientesRepository);
            }
        }
        if (clientesViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) clientesViewModel;
    }
}