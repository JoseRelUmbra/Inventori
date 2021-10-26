package com.example.inventori.ui.login;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.inventori.databinding.ActivityLoginBinding;
import com.example.inventori.ui.MainActivity;
import com.example.inventori.ui.signup.SignUpActivity;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnRegistrar.setOnClickListener(v -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        });
        binding.btnRegistrar.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}