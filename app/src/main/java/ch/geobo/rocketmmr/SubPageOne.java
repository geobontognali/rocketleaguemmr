package ch.geobo.rocketmmr;

/**
 * Created by Geo Bontognali on 03.11.2016.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SubPageOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.subpage_one, container, false);
        return rootView;
    }
}
