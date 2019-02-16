package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Bancos;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.BancosRepository;

public class BancosViewModel extends ViewModel {
    private BancosRepository bancosRepository;

    public BancosViewModel(BancosRepository bancosRepository) {
        this.bancosRepository = bancosRepository;
    }

    public void insertarBancos(Bancos bancos) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> bancosRepository.insertarBancos(bancos));
    }

    public Bancos getBanco() {
        return bancosRepository.getBanco();
    }
}
