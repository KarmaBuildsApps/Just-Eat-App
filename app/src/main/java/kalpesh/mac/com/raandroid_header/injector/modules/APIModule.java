package kalpesh.mac.com.raandroid_header.injector.modules;


import dagger.Module;
import dagger.Provides;
import kalpesh.mac.com.raandroid_header.injector.scope.UserScope;
import kalpesh.mac.com.raandroid_header.observables.IRestaurant;
import retrofit.RestAdapter;

@Module
public class APIModule {

    @Provides
    @UserScope
    public IRestaurant providesIRestaurantInterface(RestAdapter retrofit) {
        return retrofit.create(IRestaurant.class);
    }
}
