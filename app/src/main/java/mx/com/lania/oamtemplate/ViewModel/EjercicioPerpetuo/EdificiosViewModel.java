package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Edificios;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.EdificiosRepository;

public class EdificiosViewModel extends ViewModel {
    private EdificiosRepository edificiosRepository;

    public EdificiosViewModel(EdificiosRepository edificiosRepository) {
        this.edificiosRepository = edificiosRepository;
    }

    public void insertarEdificios(Edificios edificios) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> edificiosRepository.insertarEdificios(edificios));
    }

    public Edificios getEdificios() {
        return edificiosRepository.getEdificios();
    }
}