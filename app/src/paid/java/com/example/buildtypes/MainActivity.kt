package com.example.buildtypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.buildtypes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    //Когда вы выбираете какой-то build, Android Studio генерирует файл, в котором содержатся общие
//данные о нем. Тут вы можете найти и вашу переменную после комментария. Дело в том, что через
//Gradle разработчик может сохранить какие-то данные в зависимости от типа сборки. Для этого
//достаточно указать тип сохраняемой переменной и данные в виде «ключ-значение». В нашем случае
//это строка под названием TYPE и значение DEBUG. Всё это попадает в Java-класс в виде обычных
//переменных, а значит, вы можете получить это непосредственно из кода.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = getString(R.string.hello)
        binding.paidButton.setOnClickListener {
            Toast.makeText(this, "Paid version", Toast.LENGTH_LONG).show()
        }
    }
}