package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import mx.com.lania.oamtemplate.Database.Entities.EjercicioPerpetuo.Maquinaria;
import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.MaquinariaRepository;

public class MaquinariaViewModel extends ViewModel {
    private MaquinariaRepository maquinariaRepository;

    public MaquinariaViewModel(MaquinariaRepository maquinariaRepository) {
        this.maquinariaRepository = maquinariaRepository;
    }

    public void insertarMaquinaria(Maquinaria maquinaria) {
        Executor myExecutor = Executors.newSingleThreadExecutor();
        myExecutor.execute(() -> maquinariaRepository.insertarMaquinaria(maquinaria));
    }

    public Maquinaria getMaquinaria() {
        return maquinariaRepository.getMaquinaria();
    }

    public void borrarDatosTabla() {
        maquinariaRepository.borrarDatosTabla();
    }

}