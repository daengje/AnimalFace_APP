package com.project.animalface_app.ksyapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.project.animalface_app.R
import com.project.animalface_app.kdkapp.AnimalFaceActivity
import com.project.animalface_app.ohjapp.ksyAPI.CreateGameMainActivity

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        Log.d("Main2Activity", "Activity 생성됨")

        val createGame: Button = findViewById(R.id.createGame)
        createGame.setOnClickListener {
            val intent = Intent(this, CreateGameMainActivity::class.java)
            startActivity(intent)
            Log.d("Main2Activity", "게임 생성 클릭")
        }

        val largeRectangle: Button = findViewById(R.id.large_rectangle)
        largeRectangle.setOnClickListener {
            val intent = Intent(this, AnimalFaceActivity::class.java)
            startActivity(intent)
            Log.d("Main2Activity", "동물상 테스트 버튼 클릭됨")
        }
    }
}
