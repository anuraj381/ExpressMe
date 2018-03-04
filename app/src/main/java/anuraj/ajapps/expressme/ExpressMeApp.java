package anuraj.ajapps.expressme;

import android.app.Application;
import javax.inject.Inject;
import anuraj.ajapps.expressme.data.DataManager;
import anuraj.ajapps.expressme.di.components.ApplicationComponent;
import anuraj.ajapps.expressme.di.components.DaggerApplicationComponent;
import anuraj.ajapps.expressme.di.modules.ApplicationModule;
import anuraj.ajapps.expressme.utils.AppLogger;

/**
 * Created by lenovo on 3/3/2018.
 */

public class ExpressMeApp extends Application{

    @Inject
    DataManager mDataManager;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        AppLogger.init();
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }

}
