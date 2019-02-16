package mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Database.Dao.EjercicioPerpetuo.ClientesDao;
import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Clientes;

public class ClientesRepository {
    private ClientesDao clientesDao;

    @Inject
    public ClientesRepository(ClientesDao clientesDao) {
        this.clientesDao = clientesDao;
    }

    public void insertarClientes(Clientes clientes) {
        clientesDao.insertCliente(clientes);
    }

    public Clientes getClientes() {
        return clientesDao.getClientes();
    }
}
