package br.edu.pucgoias.cmp1552;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Tela2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aula_teste);

        Button btn = findViewById(R.id.btn02);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela2.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optional: finish current activity so back button doesn't cycle
            }
        });
    }
}