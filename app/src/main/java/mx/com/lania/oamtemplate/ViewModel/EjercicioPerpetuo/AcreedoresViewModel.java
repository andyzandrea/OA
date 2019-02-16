package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Acreedores;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.AcreedoresRepository;

public class AcreedoresViewModel extends ViewModel {
    private AcreedoresRepository acreedoresRepository;

    public AcreedoresViewModel(AcreedoresRepository acreedoresRepository) {
        this.acreedoresRepository = acreedoresRepository;
    }

    public void insertarAcreedores(Acreedores acreedores) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> acreedoresRepository.insertarAcreedores(acreedores));
    }

    public Acreedores getAcreedor() {
        return acreedoresRepository.getAcreedores();
    }
}