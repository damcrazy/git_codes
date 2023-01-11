import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   boolean isNewOp= true;
   String newNumber,oldNumber,op;
   EditText ed1;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       ed1= findViewById(R.id.editText);
   }

   public void numberEvent(View view){
       if(isNewOp)
           ed1.setText("");
       isNewOp = false;
       String number = ed1.getText().toString();
       switch (view.getId()){
           case R.id.b13:
               number +="1";
               break;
           case R.id.b14:
               number +="2";
               break;
           case R.id.b15:
               number +="3";
               break;
           case R.id.b9:
               number +="4";
               break;
           case R.id.b10:
               number +="5";
               break;
           case R.id.b11:
               number +="6";
               break;
           case R.id.b5:
               number +="7";
               break;
           case R.id.b6:
               number +="8";
               break;
           case R.id.b7:
               number +="9";
               break;
           case R.id.b17:
               number +="0";
               break;
           case R.id.b18:
               number +=".";
               break;
           case R.id.b2:
               number = "-"+number;
               break;
       }
       ed1.setText(number);
   }

   public void operatorEvent(View view){
       isNewOp = true;
       oldNumber=ed1.getText().toString();
       switch (view.getId()){
           case R.id.bd:op="/"; break;
           case R.id.bm:op="*"; break;
           case R.id.ba:op="+"; break;
           case R.id.bs:op="-"; break;
       }
   }

   public void equalEvent(View view){
       newNumber = ed1.getText().toString();
       double result = 0.0;
       switch (op){
           case "+":
               result= Double.parseDouble(oldNumber)+ Double.parseDouble(newNumber);
               break;
           case "-":
               result= Double.parseDouble(oldNumber)- Double.parseDouble(newNumber);
               break;
           case "*":
               result= Double.parseDouble(oldNumber)* Double.parseDouble(newNumber);
               break;
           case "/":
               result= Double.parseDouble(oldNumber)/ Double.parseDouble(newNumber);
               break;
       }
       ed1.setText(result+"");
   }

   public void acEvent(View view){
       ed1.setText("0");
       isNewOp= true;
   }

   public void percentEvent(View view){
       double no= Double.parseDouble(ed1.getText().toString())/100;
       ed1.setText(no+"");
       isNewOp=true;
   }
}
