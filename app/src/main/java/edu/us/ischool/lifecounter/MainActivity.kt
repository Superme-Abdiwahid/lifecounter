package edu.us.ischool.lifecounter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var player_1_Health = 20;
    private var player_2_Health = 20;
    private var player_3_Health = 30;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var player_1_Add: Button = findViewById<Button>(R.id.player_1_Add1)

        var player_1_Minus1: Button = findViewById<Button>(R.id.Player_1_Minus1)

        var player_1_Add5: Button = findViewById<Button>(R.id.Player_1_Add5)

        var player_1_Health_Text: EditText = findViewById<EditText>(R.id.editTextTextPersonName)

        var player_1_minus5: Button = findViewById<Button>(R.id.Player_1_Minus5)

        var players_who_lost: TextView = findViewById<TextView>(R.id.player1_lost)

        var player_2_lost: TextView = findViewById<TextView>(R.id.player2_lost)



        var player_2_Add: Button = findViewById<Button>(R.id.player_2_Add1)

        var player_2_Minus1: Button = findViewById<Button>(R.id.Player_2_Minus1)

        var player_2_Add5: Button = findViewById<Button>(R.id.Player_2_Add5)

        var player_2_Health_Text: EditText = findViewById<EditText>(R.id.editTextTextPersonName2)

        var player_2_minus5: Button = findViewById<Button>(R.id.Player_2_Minus5)



        var player_3_Add: Button = findViewById<Button>(R.id.player_3_Add1)


        var player_3_Minus1: Button = findViewById<Button>(R.id.player_3_Minus1)

        var player3_Add_5: Button = findViewById<Button>(R.id.player_3_Add5)

        var player3_Minus_5: Button = findViewById<Button>(R.id.player_3_Minus5)

        var player_3_text: TextView = findViewById<TextView>(R.id.player_3_text)




        player_1_Add.setOnClickListener(){
            player_1_Health++;
            player_1_Health_Text.setText("Player 1's Health = $player_1_Health")
        }

        player_1_Minus1.setOnClickListener(){
            player_1_Health--;
            if(player_1_Health <= 0){
                players_who_lost.setText("Player 1 Lost and is elimanted ")
                players_who_lost.setTextColor(Color.RED)
                player_1_Health_Text.setTextColor(Color.RED)
                player_2_lost.setText("");
            }
            player_1_Health_Text.setText("Player 1's Health = $player_1_Health")

        }
        player_1_Add5.setOnClickListener() {
            player_1_Health += 5;
            player_1_Health_Text.setText("Player 1's Health = $player_1_Health")

        }

        player_1_minus5.setOnClickListener(){
            player_1_Health -= 5;
            if(player_1_Health <= 0){
                players_who_lost.setText("Player 1 Lost and is elimanted ")
                player_1_Health_Text.setTextColor(Color.RED)
                players_who_lost.setTextColor(Color.RED)
                player_2_lost.setText("");
            }
            player_1_Health_Text.setText("Player 1's Health = $player_1_Health")

        }




        player_2_Add.setOnClickListener(){
            player_2_Health++;
            player_2_Health_Text.setText("Player 2's Health = $player_2_Health")
        }

        player_2_Minus1.setOnClickListener(){
            player_2_Health--;
            if(player_2_Health <= 0){
                player_2_lost.setText("Player 2 Lost and is elimanted ")
                players_who_lost.setTextColor(Color.RED)
                player_2_Health_Text.setTextColor(Color.RED)
                players_who_lost.setText("");
            }
            player_2_Health_Text.setText("Player 2's Health = $player_2_Health")

        }
        player_2_Add5.setOnClickListener() {
            player_2_Health += 5;
            player_2_Health_Text.setText("Player 2's Health = $player_2_Health")

        }

        player_2_minus5.setOnClickListener(){
            player_2_Health -= 5;
            if(player_2_Health <= 0){
                player_2_lost.setText("Player 2 Lost and is elimanted ")
                player_2_lost.setTextColor(Color.RED)
                player_2_Health_Text.setTextColor(Color.RED)
                players_who_lost.setText("");
            }
            player_2_Health_Text.setText("Player 2's Health = $player_2_Health")

        }
//***************************************************************************


        player_3_Add.setOnClickListener(){
            player_3_Health++;
            player_3_text.setText("Player 3's Health = $player_3_Health")
        }

        player_3_Minus1.setOnClickListener(){
            player_3_Health--;
            if(player_3_Health <= 0){
                player_3_text.setText("Player 3 Lost and is elimanted ")
                player_3_text.setTextColor(Color.RED)
                players_who_lost.setText("");
            }
            player_3_text.setText("Player 3's Health = $player_3_Health")

        }
        player3_Add_5.setOnClickListener() {
            player_3_Health += 5;
            player_3_text.setText("Player 3's Health = $player_3_Health")

        }

        player3_Minus_5.setOnClickListener(){
            player_3_Health -= 5;
            if(player_3_Health <= 0){
                players_who_lost.setText("");
                players_who_lost.setTextColor(Color.RED)
                player_2_lost.setText("")
                players_who_lost.setText("Player 3 Lost and is elimanted")
                player_3_text.setTextColor(Color.RED)
                player_3_text.setText("");
                player_3_text.setText("Elimaninted")
            }
            player_3_text.setText("Player 3's Health = $player_3_Health")

        }








    }
}