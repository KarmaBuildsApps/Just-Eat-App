package kalpesh.mac.com.raandroid_header;

import android.app.Application;

import kalpesh.mac.com.raandroid_header.constants.Constants;
import kalpesh.mac.com.raandroid_header.injector.components.APIComponents;
import kalpesh.mac.com.raandroid_header.injector.components.DaggerAPIComponents;
import kalpesh.mac.com.raandroid_header.injector.components.DaggerNetComponent;
import kalpesh.mac.com.raandroid_header.injector.components.NetComponent;
import kalpesh.mac.com.raandroid_header.injector.modules.APIModule;
import kalpesh.mac.com.raandroid_header.injector.modules.AppModule;
import kalpesh.mac.com.raandroid_header.injector.modules.NetModule;


/**
 * Created by kalpesh on 20/01/2016.
 */
public class MyApp extends Application {
   private NetComponent mNetComponent;
   private APIComponents mApiComponents;
    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent= DaggerNetComponent.builder()
                .netModule(new NetModule(Constants.BASE_URL))
                .appModule(new AppModule(this))
                .build();

        mApiComponents= DaggerAPIComponents.builder()
                .netComponent(mNetComponent)
                .aPIModule(new APIModule())
                .build();

        // specify the full namespace of the component
        // Dagger_xxxx (where xxxx = component name)
     /*  mNetComponent= DaggerNetComponent.builder()
               .netModule(new NetModule(Constants.BASE_URL))
               .appModule(new AppModule(this))
               .build();

        mApiComponents= DaggerAPIComponents.builder()
                .netComponent(mNetComponent)
                .aPIModule(new APIModule())
                .build();
                */
    }
    public NetComponent getNetComponent() {
        return mNetComponent;
    }

    public APIComponents getApiComponent() {
        return mApiComponents;
    }
}
