package com.example.caleb.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // initializes the input blanks in the display
    EditText blankTotalBill,tipPercentage;
    TextView calculatedTip,billAndTip;
    Button tipButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Locates elements and assigns them to variables
        //the (EditText), (TextView), and (Button) caste the elements
        blankTotalBill = (EditText)findViewById(R.id.BillInput);
        tipPercentage = (EditText)findViewById(R.id.percentageTip);
        calculatedTip = (TextView)findViewById(R.id.calculatedTip);
        billAndTip = (TextView)findViewById(R.id.billAndTip);
        tipButton = (Button)findViewById(R.id.calculateTipButton);


        tipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Double.parseDouble() castes each variable as a double, (the rest is just simple equations )
                double finalAmount = Double.parseDouble(blankTotalBill.getText().toString()) * (Double.parseDouble(tipPercentage.getText().toString())/100);
                double billAndTipFinal = Double.parseDouble(blankTotalBill.getText().toString()) + Double.parseDouble(blankTotalBill.getText().toString()) * (Double.parseDouble(tipPercentage.getText().toString())/100);

                // Displays each amount from the formulas above and assigns them to TextViews Above
                calculatedTip.setText(finalAmount + "");
                billAndTip.setText(billAndTipFinal + "");


            }
        });
    }
}
