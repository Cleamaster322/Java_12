package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextUsername = findViewById(R.id.editTextUsername);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonLogin = findViewById(R.id.buttonLogin);
        Button buttonShowTasks = findViewById(R.id.buttonShowTasks);
        Button buttonAddTask = findViewById(R.id.buttonAddTask);

        buttonShowTasks.setVisibility(View.GONE);
        buttonAddTask.setVisibility(View.GONE);

        buttonLogin.setOnClickListener(v -> {
            String username = editTextUsername.getText().toString();
            String password = editTextPassword.getText().toString();

            // Проверка логина и пароля
            if (username.equals("username") && password.equals("login")) {
                buttonShowTasks.setVisibility(View.VISIBLE);
                buttonAddTask.setVisibility(View.VISIBLE);
            }
        });

        Button buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(v -> {
            String username = editTextUsername.getText().toString();
            String password = editTextPassword.getText().toString();

            // Формируем строку с данными пользователя
            String userData = username + "," + password + "\n";

            // Здесь должна быть логика сохранения данных пользователя
        });
    }
}
