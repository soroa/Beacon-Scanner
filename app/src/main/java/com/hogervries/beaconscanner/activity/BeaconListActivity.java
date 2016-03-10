package com.hogervries.beaconscanner.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.hogervries.beaconscanner.adapter.BeaconAdapter.OnBeaconSelectedListener;
import com.hogervries.beaconscanner.fragment.BeaconListFragment;

import org.altbeacon.beacon.Beacon;

/**
 * Beacon Scanner, file created on 07/03/16.
 *
 * @author Boyd Hogerheijde
 * @author Mitchell de Vries
 */
public class BeaconListActivity extends SingleFragmentActivity implements OnBeaconSelectedListener {

    public static Intent newIntent(Context packageContext) {
        return new Intent(packageContext, BeaconListActivity.class);
    }

    @Override
    protected Fragment createFragment() {
        return BeaconListFragment.newInstance();
    }

    @Override
    public void onBeaconSelected(Beacon beacon) {
        Intent beaconIntent = BeaconActivity.newIntent(this, beacon);
        startActivity(beaconIntent);
    }
}