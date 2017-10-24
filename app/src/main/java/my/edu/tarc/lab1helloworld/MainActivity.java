package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName,editTextAge;
    private TextView textViewMessage;

    //onCreate = main()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //display the UI
        //R = resources class
        setContentView(R.layout.activity_main);

        //Linking Ui to program
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);


    }
    public void displayMessage(View view){
        String name;
        int age;
        name = editTextName.getText().toString();
        age= Integer.parseInt(editTextAge.getText().toString());
        age++;
        textViewMessage.setText("Hi, " + name +", you will be #" + age +" years old in 2018");
    }

    public void deleteMessage(View view){
        textViewMessage.setText("");
        editTextAge.setText("");
        editTextName.setText("");

    }
}
