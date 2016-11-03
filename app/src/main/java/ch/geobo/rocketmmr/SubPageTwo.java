package ch.geobo.rocketmmr;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Geo Bontognali on 03.11.2016.
 */

public class SubPageTwo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.subpage_two, container, false);
        return rootView;
    }
}
