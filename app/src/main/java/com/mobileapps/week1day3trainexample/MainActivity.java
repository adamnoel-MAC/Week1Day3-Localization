package com.mobileapps.week1day3trainexample;

import android.service.autofill.TextValueSanitizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mobileapps.week1day3trainexample.model.Animal;
import com.mobileapps.week1day3trainexample.model.Eagle;
import com.mobileapps.week1day3trainexample.model.Person;

public class MainActivity extends AppCompatActivity {

    TextView tvHelloMessage;
    TextView tvMainMessage;
    TextView tvMainMessage2;
    TextView tvMainMessage3;
    TextView tvMainMessage4;
    TextView tvAnimalName;
    TextView tvAnimalLegs;
    TextView tvPersonPiercings;
    TextView tvPersonTats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHelloMessage = findViewById(R.id.hello_message);
        tvMainMessage = findViewById(R.id.mainMessage);
        tvMainMessage2 = findViewById(R.id.mainMessage2);
        tvMainMessage3 = findViewById(R.id.mainMessage3);
        tvMainMessage4 = findViewById(R.id.mainMessage4);
        tvAnimalName =  findViewById(R.id.AnimalName);
        tvAnimalLegs = findViewById(R.id.AnimalLegs);
        tvPersonPiercings = findViewById(R.id.PersonPiercings);
        tvPersonTats = findViewById(R.id.PersonTats);

        Animal animal = new Animal();
        animal.setName("Hippo");
        animal.setNumberOfLegs(4);

        Person person = new Person();
        person.setNumberOfPiercings(2);
        person.setNumberOfTatoos(0);


        //tvHelloMessage.setText(eagle.getName());
        tvAnimalName.setText("\n\nAnimal Name: " + animal.getName());
        tvAnimalLegs.setText("Number of Legs: " + String.valueOf(animal.getNumberOfLegs()));
        tvPersonPiercings.setText("\n\nPerson\nNumber of Piercings: " + String.valueOf(person.getNumberOfPiercings()));
        tvPersonTats.setText("Number of Tatoos: " + String.valueOf(person.getNumberOfTatoos()));
//*/
    }
}
