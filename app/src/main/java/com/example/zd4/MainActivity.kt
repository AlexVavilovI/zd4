package com.example.zd4
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private  class Сarnivores(val Name:String, val LongLife: Int) // класс плотоядных Имя ,продолжительность жизни
    private  class Herbivores(val Name:String, val TypeEat: String) // класс травоядных Имя ,тип корма

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // вводим энцеклопидические знания о животных
        val Cat=Сarnivores("Кошка",16)
        val Pigeon=Сarnivores("Голубь",10)
        val Cow=Herbivores("Корова","Траву")
        val Hare=Herbivores("Заяц","Морковку")
// помещаем в список
        val Carni = listOf(Cat,Pigeon)
        val Herbi = listOf(Cow,Hare)
        // инициализируем переменную типа TextView
        val textView: TextView = findViewById(R.id.textView)
        for(element in Carni){
            textView.append("Плотоядная  ${element.Name}  Продолжительность жизни около ${element.LongLife} лет")
            textView.append("\n")
            //
        }
        for(element in Herbi){
            textView.append("Травоядная  ${element.Name}  очень любит есть ${element.TypeEat}  " )
            textView.append("\n")
        }

    }


}