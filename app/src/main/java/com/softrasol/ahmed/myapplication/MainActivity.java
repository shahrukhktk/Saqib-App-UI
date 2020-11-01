package com.softrasol.ahmed.myapplication;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.softrasol.ahmed.myapplication.Fragments.BarographFragment;
import com.softrasol.ahmed.myapplication.Fragments.BatteryFragment;
import com.softrasol.ahmed.myapplication.Fragments.DashboardFragment;
import com.softrasol.ahmed.myapplication.Fragments.SwitchPanelFragment;
import com.softrasol.ahmed.myapplication.Fragments.TanksFragment;
import com.softrasol.ahmed.myapplication.databinding.ActivityMainBinding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private BottomNavigationView mBottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setFragment(new DashboardFragment());

        binding.navBottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_dashboard:
                        setFragment(new DashboardFragment());
                        return true;

                    case R.id.nav_battery:
                        setFragment(new BatteryFragment());
                        return true;

                    case R.id.nav_switch_panel:
                        setFragment(new SwitchPanelFragment());
                        return true;

                    case R.id.nav_barograph:
                        setFragment(new BarographFragment());
                        return true;

                    case R.id.nav_tanks:
                        setFragment(new TanksFragment());
                        return true;

                    default:
                        return false;
                }
            }
        });
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, fragment);
        transaction.commit();
    }

}