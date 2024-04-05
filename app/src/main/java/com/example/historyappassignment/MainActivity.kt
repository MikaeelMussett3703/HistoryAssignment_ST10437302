package com.example.historyappassignment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Box where you can enter the age
        val textInput = findViewById<EditText>(R.id.editTextTextMultiLine)
        // Button when tapped generates an age of a famous dead person
        val clickMeButton = findViewById<Button>(R.id.BTN1)
        // Location where the message appears
        val textView = findViewById<TextView>(R.id.textline1)
        // Button that clears generated history
        val buttonClear = findViewById<Button>(R.id.BTN2)
        buttonClear.setOnClickListener {
            textView.text = ""
        }
        // When the button is tapped
        clickMeButton?.setOnClickListener {
            // Creating a spot to generate the dead person
            var message = ""
            // Spot that generates the age
            var text = textInput.text.toString().toIntOrNull()

            text?.let {
                // Depending on the age entered produce a different dead person
                when {
                    it in 0..9 -> {
                        // if the number is between 0 and 9, this message appears
                        message = "This age is invalid, please enter a valid number"
                    }
                    it in 10..19 -> {
                        // If the number is between 10 and 19, this message appears
                        message = " This age is invalid, please enter a valid number"
                    }
                    it in 20..25 -> {
                        // If the number is between 20 and 25, this message appears
                        message =
                            "Tupac Amaru Shakur, also known by his stage names 2Pac and Makaveli, was an American rapper. Considered one of the most influential and successful rappers of all time, who passed away at 25"
                    }
                    it in 26..29 -> {
                        // If the number is between 26 and 29, this message appears
                        message =
                            "Heath Ledger, famous Australian actor known for his role as Joker in Batman The Dark Knight, passed away at 28 years old"
                    }
                    it in 30..35 -> {
                        // If the number is between 30 and 35, this message appears
                        message = "Cory Monteith was a Canadian actor and musician. Famously known for his role in Glee, sadly he passed away at age 31"
                    }
                    it in 36..39 -> {
                        // If the number is between 36 and 39, this message appears
                        message = "Princess Diana, Princess of Wales, was a member of the British royal family. She was the first wife of Charles III and mother of Princes William and Harry. She passed away at age 36"
                    }
                    it in 40..45 -> {
                        // If the number is between 40 and 45, this message appears
                        message = "Elvis Aaron Presley,was an American singer and actor. Known as the KING OF ROCK AND ROLL, he is regarded as one of the most significant cultural figures of the 20th century. He passed away at age 42"
                    }
                    it in 46..49 -> {
                        // If the number is between 46 and 49, this message appears
                        message = "Whitney Elizabeth Houston was an American singer, record producer, actress, film producer, and philanthropist. She passed away at age at 48"
                    }
                    it in 50..55 -> {
                        // If the number is between 50 and 55, this message appears
                        message = "Micheal Jackson, known as the KING OF POP is regarded as one of the most cultural figures in the 20th century. He passed away at age 50"
                    }
                    it in 56..59 -> {
                        // If the number is between 56 and 59, this message appears
                        message = "Humphrey Bogart was an American actor. His performances in classic Hollywood cinema films made him an American cultural icon. He passed away at age 57"
                    }
                    it in 60..65 -> {
                        // If the number is between 60 and 65, this message appears
                        message = "Robin Williams, an American comedian and actor who starred in popular movie Jumanji know for his role as Allan Parrish passed away at age 63"
                    }
                    it in 66..69 -> {
                        // If the number is between 66 and 69, this message appears
                        message = "Johan Cruyff was a Dutch professional football player and manager. Regarded as one of the greatest players in history and as the greatest Dutch footballer ever, he won the Ballon d'Or three times and passed away at age 68"
                    }
                    it in 70..75 -> {
                        // If the number is between 70 and 75, this message appears
                        message = "Charles Darwin, an English naturalist, geologist and biologist, widely known for his contributions to evolutionary biology passed away at age 73"
                    }
                    it in 76..79 -> {
                        // If the number is between 76 and 79, this message appears
                        message = "Galileo Galilei or simply Galileo, was an Italian astronomer, physicist and engineer, sometimes described as a polymath who passed away at age 77"
                    }
                    it in 80..85 -> {
                        // If the number is between 80 and 85,this message appears
                        message =
                            "Isaac Newton, English polymath active as a mathematician, physicist, astronomer, alchemist, theologian, and author.He was a key figure in the Scientific Revolution and the Enlightenment that followed He passed away at age 84"
                    }
                    it in 86..89 -> {
                        // If the number is between 86 and 89, this message appears
                        message = "Helen Adams Keller was an American author, disability rights advocate, political activist and lecturer.She lost her sight and her hearing after a bout of illness when she was 19 months old but managed to inspire many before passing away at age 87"
                    }
                    it in 90..95 -> {
                        // If the number is between 90 and 95, this message appears
                        message = "Pablo Picasso one of the 20th centuries most influential figures with regards to art and art movements passed away at age 91"
                    }
                    it in 96..100 -> {
                        // If the number is between 96 and 100, this message appears
                        message = "Queen Elizabeth II was the longest-serving monarch in British history. She passed away at age 96"
                    }
                    else -> {
                        message = "Invalid age entered"
                    }
                }
            } ?: run {
                message = "Please enter a valid age"
            }

            // Show the death of the person in the bottom box
            textView.text = message
        }
    }
}
