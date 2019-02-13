package mx.com.lania.oamtemplate;

import android.app.Application;

import mx.com.lania.oamtemplate.di.AppComponent;
import mx.com.lania.oamtemplate.di.AppModule;
import mx.com.lania.oamtemplate.di.DaggerAppComponent;

/**
 * Created by macbook on 05/03/18.
 */

public class OAMApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    ;
}
