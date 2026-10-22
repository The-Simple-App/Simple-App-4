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
import androidx.lifecycle.ViewModelProvider;

import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private DoorView viewModel;

    private TextView txtResult;
    private TextView txtScore;

    private Button door1;
    private Button door2;
    private Button door3;

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

        viewModel = new ViewModelProvider(this).get(DoorView.class);

        txtResult = findViewById(R.id.txtResult);
        txtScore = findViewById(R.id.txtScore);

        door1 = findViewById(R.id.btnDoor1);
        door2 = findViewById(R.id.btnDoor2);
        door3 = findViewById(R.id.btnDoor3);

        door1.setOnClickListener(v -> doorChoice(1));
        door2.setOnClickListener(v -> doorChoice(2));
        door3.setOnClickListener(v -> doorChoice(3));

        updateUi(); // shows the preserved state right after recreation
    }

    private void doorChoice(int chosenDoor) {
        viewModel.choose(chosenDoor);
        updateUi();
    }

    private void updateUi() {
        txtResult.setText(viewModel.getResultText());
        txtScore.setText("Win: " + viewModel.getWin() + " Lose: " + viewModel.getLose());
    }
}

