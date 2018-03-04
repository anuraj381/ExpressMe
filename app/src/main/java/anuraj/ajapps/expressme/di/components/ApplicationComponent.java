package anuraj.ajapps.expressme.di.components;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import anuraj.ajapps.expressme.ExpressMeApp;
import anuraj.ajapps.expressme.data.DataManager;
import anuraj.ajapps.expressme.di.ApplicationContext;
import anuraj.ajapps.expressme.di.modules.ApplicationModule;
import dagger.Component;

/**
 * Created by lenovo on 3/4/2018.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(ExpressMeApp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();

}
