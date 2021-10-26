package com.example.inventori.ui.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.inventori.R;
import com.example.inventori.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        /**Se utiliza el método onBackPressed para eliminar la Activity SingUpActivity,
         * y restaurar la activity anterior LoginActivity.
        */
        binding.btnSignUp.setOnClickListener(view -> onBackPressed());
    }
}