package kalpesh.mac.com.raandroid_header.presenters;

import android.support.v7.widget.SearchView;

import java.util.List;

import kalpesh.mac.com.raandroid_header.model.Restaurant;

/**
 * Created by Karma on 05/04/16.
 */
public interface RestaurantView {
    void hidePDialog();

    void setListAdapter(List<Restaurant> restaurants);

    void displayRxError(int resId);

    String getSearchViewValue();

    void searchByPostcode(String query);

    int getAdapterListSize();

    void showSearchEmptyErrorText(int resId);
}
