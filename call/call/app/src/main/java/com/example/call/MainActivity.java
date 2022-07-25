package com.example.call;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        Button buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive;
        Button buttonSix,buttonSeven,buttonEight,buttonNine,buttonZero;
        Button buttonDel,buttonStar,buttonHash,buttonCall,buttonSave;
        EditText txtPhonenumber;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne=(Button)findViewById(R.id.button1);
        buttonOne.setOnClickListener(this);
        buttonTwo=(Button)findViewById(R.id.button2);
        buttonTwo.setOnClickListener(this);
        buttonThree=(Button)findViewById(R.id.button3);
        buttonThree.setOnClickListener(this);
        buttonFour=(Button)findViewById(R.id.button4);
        buttonFour.setOnClickListener(this);
        buttonFive=(Button)findViewById(R.id.button5);
        buttonFive.setOnClickListener(this);
        buttonSix=(Button)findViewById(R.id.button6);
        buttonSix.setOnClickListener(this);
        buttonSeven=(Button)findViewById(R.id.button7);
        buttonSeven.setOnClickListener(this);
        buttonEight=(Button)findViewById(R.id.button8);
        buttonEight.setOnClickListener(this);
        buttonNine=(Button)findViewById(R.id.button9);
        buttonNine.setOnClickListener(this);
        buttonZero=(Button)findViewById(R.id.button12);
        buttonZero.setOnClickListener(this);
        buttonStar=(Button)findViewById(R.id.button10);
        buttonStar.setOnClickListener(this);
        buttonHash=(Button)findViewById(R.id.button11);
        buttonHash.setOnClickListener(this);
        buttonCall=(Button)findViewById(R.id.button13);
        buttonCall.setOnClickListener(this);
        buttonSave=(Button)findViewById(R.id.button14);
        buttonSave.setOnClickListener(this);
        buttonDel=(Button)findViewById(R.id.button15);
        buttonDel.setOnClickListener(this);
        txtPhonenumber=(EditText)findViewById(R.id.txt_phonenumber);
        txtPhonenumber.setText("");
        }
public void onClick(View v)
        {
        if(v.equals(buttonOne))
        txtPhonenumber.append("1");
        else if(v.equals(buttonTwo))
        txtPhonenumber.append("2");
        else if(v.equals(buttonThree))
        txtPhonenumber.append("3");
        else if(v.equals(buttonFour))
        txtPhonenumber.append("4");
        else if(v.equals(buttonFive))
        txtPhonenumber.append("5");
        else if(v.equals(buttonSix))
        txtPhonenumber.append("6");
        else if(v.equals(buttonSeven))
        txtPhonenumber.append("7");
        else if(v.equals(buttonEight))
        txtPhonenumber.append("8");
        else if(v.equals(buttonNine))
        txtPhonenumber.append("9");
        else if(v.equals(buttonZero))
        txtPhonenumber.append("0");
        else if(v.equals(buttonStar))
        txtPhonenumber.append("*");
        else if(v.equals(buttonHash))
        txtPhonenumber.append("#");
        else if(v.equals(buttonSave))
        {
        Intent contactIntent= new Intent
        (ContactsContract.Intents.Insert.ACTION);
        contactIntent.setType
        (ContactsContract.RawContacts.CONTENT_TYPE);
        contactIntent
        .putExtra(ContactsContract.Intents.Insert.NAME,"Unknown");
        contactIntent.putExtra(ContactsContract.Intents.Insert.PHONE,
        txtPhonenumber.getText().toString());
        startActivity(contactIntent);
        }
        else if(v.equals(buttonDel))
        {
        String data=txtPhonenumber.getText().toString();
        if(data.length()>0)
        {
        txtPhonenumber.setText
        (data.substring(0,data.length()-1));
        }
        else
        {
        txtPhonenumber.setText("");
        }
        }
        buttonCall.setOnClickListener(new View.OnClickListener()
        {
@Override
public void onClick(View v) {
        String data = txtPhonenumber.getText().toString();
        Intent intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+ data));
        startActivity(intent);
        }
        }
        );
        }
        }