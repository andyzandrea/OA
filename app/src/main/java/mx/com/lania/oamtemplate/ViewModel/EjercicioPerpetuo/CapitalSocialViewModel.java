package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.CapitalSocial;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.CapitalSocialRepository;

public class CapitalSocialViewModel extends ViewModel {
    private CapitalSocialRepository capitalSocialRepository;

    public CapitalSocialViewModel(CapitalSocialRepository capitalSocialRepository) {
        this.capitalSocialRepository = capitalSocialRepository;
    }

    public void insertarCapitalSocial(CapitalSocial capitalSocial) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> capitalSocialRepository.insertarCapitalSocial(capitalSocial));
    }

    public CapitalSocial getCapitalSocial() {
        return capitalSocialRepository.getCapitalSocial();
    }

    public void borrarDatosTabla() {
        capitalSocialRepository.borrarDatosTabla();
    }
}