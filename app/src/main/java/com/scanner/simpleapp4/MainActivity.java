package com.scanner.simpleapp4;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


//    GuessingGame gg;
//    BottomNavigationView bnv;
//    FragmentContainerView fcv;

    Private Button onNavigationItemSelected;
    private Random random = new Random();

    TextView txtResult;
    TextView txtScore;

    Button door1;
    Button door2;
    Button door3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtResult = findViewById(R.id.txtResult);
        txtScore = findViewById(R.id.txtScore);

        door1 = findViewById(R.id.btnDoor1);
        door2 = findViewById(R.id.btnDoor2);
        door3 = findViewById(R.id.btnDoor3);

                                                    }


//        bnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//
//                FragmentTransaction ft = fm.beginTransaction();
//
//                if(menuItem.getItemId() == R.id.rulesMenuItem)
//                {
//                    ft.replace(R.id.fragmentContainer, IntroFragment.class, null);
//                }
//                else if(menuItem.getItemId() == R.id.gameMenuItem)
//                {
//                    GameFragment newGameFragment = GameFragment.newInstance(gg, myself);
//                    ft.replace(R.id.fragmentContainer, newGameFragment);
//                }
//
//                ft.commit();
//
//                return false;
//            }
//        });
//    }
//
    public void openDoor() {

    }
}
