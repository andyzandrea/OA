package mx.com.lania.oamtemplate.ViewModel.EjercicioPerpetuo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import mx.com.lania.oamtemplate.Repository.EjercicioPerpetuo.CapitalSocialRepository;

public class CapitalSocialViewModelFactory implements ViewModelProvider.Factory {
    @Inject
    CapitalSocialRepository capitalSocialRepository;

    CapitalSocialViewModel capitalSocialViewModel;

    public CapitalSocialViewModelFactory(CapitalSocialRepository capitalSocialRepository) {
        this.capitalSocialRepository = capitalSocialRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (capitalSocialViewModel == null) {
            if (modelClass.isAssignableFrom(CapitalSocialViewModel.class)) {
                capitalSocialViewModel = new CapitalSocialViewModel(capitalSocialRepository);
            }
        }
        if (capitalSocialViewModel == null)
            throw new IllegalArgumentException("Unknown class name");
        return (T) capitalSocialViewModel;
    }
}