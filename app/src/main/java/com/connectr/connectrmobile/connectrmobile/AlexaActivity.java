package com.connectr.connectrmobile.connectrmobile;

import android.support.v4.app.Fragment;

/**
 * Created by Johnny on 3/5/16.
 */
public class AlexaActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return AlexaFragment.newInstance();
    }
}
