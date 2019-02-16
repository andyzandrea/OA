package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Clientes;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.ClientesRepository;

public class ClientesViewModel extends ViewModel {
    private ClientesRepository clientesRepository;

    public ClientesViewModel(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public void insertarClientes(Clientes clientes) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> clientesRepository.insertarClientes(clientes));
    }

    public Clientes getCliente() {
        return clientesRepository.getClientes();
    }
}