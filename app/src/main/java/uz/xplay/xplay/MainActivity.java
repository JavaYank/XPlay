package uz.xplay.xplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    User user = new User();
    private ViewPager viewPager;
    private Toolbar toolbar;

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_Dark);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!AuthorizationUtils.isAuthorized(this)) {
            onLogout();
            return;
        }
        setContentView(R.layout.activity_main);
        initToolbar();
        initTabs();
        initNavigationView();

    }

    private void initToolbar() {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
    }

    private void initTabs() {
        viewPager = findViewById(R.id.viewPager);
        TabsPagerFragmentAdapter adapter = new TabsPagerFragmentAdapter(getApplicationContext(), getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void initNavigationView() {
        final DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();
                switch (item.getItemId()){
                    case R.id.news:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.cs_tab:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.dota2_tab:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.live_stream_item:
                        Toast.makeText(getApplicationContext(), "Live Stream", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.info_item:
                        Toast.makeText(getApplicationContext(), "i.hayriev@gmail.com", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.exit:
                        onLogout();
                        break;
                }
                return true;
            }
        });

    }

    private void onLogout() {
        Intent login = new Intent(this, LoginActivity.class);
        login.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(login);
        finish();
    }
}
