package kalpesh.mac.com.raandroid_header.injector.components;

import dagger.Component;
import kalpesh.mac.com.raandroid_header.MainActivity;
import kalpesh.mac.com.raandroid_header.injector.modules.APIModule;
import kalpesh.mac.com.raandroid_header.injector.scope.UserScope;
import kalpesh.mac.com.raandroid_header.presenters.RestaurantPresenter;


/**
 * Created by kalpesh on 20/01/2016.
 */

@UserScope
@Component(dependencies = NetComponent.class, modules = APIModule.class)
public interface APIComponents {

    void inject(RestaurantPresenter restaurantPresenter);

}
