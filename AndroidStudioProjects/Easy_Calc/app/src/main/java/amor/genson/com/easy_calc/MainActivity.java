package amor.genson.com.easy_calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etFnum, etSnum;
    Button Add, Minus, Mult, Div, Clear, Exit;
    TextView result;
    String fNum, sNum;
    Operations mOperations = new Operations();
    double num1 = 0, num2 = 0, mResult = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    public void findViews() {
        etFnum = (EditText) findViewById(R.id.firstNum);
        etFnum = (EditText) findViewById(R.id.secNum);
        result = (TextView) findViewById(R.id.txtResult);
        Add = (Button) findViewById(R.id.btnAdd);
        Minus = (Button) findViewById(R.id.btnMinus);
        Mult = (Button) findViewById(R.id.btnMult);
        Div = (Button) findViewById(R.id.btnDiv);
        Clear = (Button) findViewById(R.id.btnClear);
        Exit = (Button) findViewById(R.id.btnExit);
        Add.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        fNum = etFnum.getText().toString();
        sNum = etSnum.getText().toString();

        num1 = Double.parseDouble(fNum);
        num2 = Double.parseDouble(sNum);

        mResult = mOperations.actAdd(num1, num2);
        String fResult = String.format("%,.2f", mResult);
        result.setText(fResult);
    }

    public void Subtract(View view) {
        fNum = etFnum.getText().toString();
        sNum = etSnum.getText().toString();

        num1 = Double.parseDouble(fNum);
        num2 = Double.parseDouble(sNum);

        mResult = mOperations.actSub(num1, num2);
        String fResult = String.format("%,.2f", mResult);
        result.setText(fResult);
    }

    public void Multiply(View view) {
        fNum = etFnum.getText().toString();
        sNum = etSnum.getText().toString();

        num1 = Double.parseDouble(fNum);
        num2 = Double.parseDouble(sNum);

        mResult = mOperations.actMult(num1, num2);
        String fResult = String.format("%,.2f", mResult);
        result.setText(fResult);
    }

    public void Divide(View view) {
        fNum = etFnum.getText().toString();
        sNum = etSnum.getText().toString();

        num1 = Double.parseDouble(fNum);
        num2 = Double.parseDouble(sNum);

        mResult = mOperations.actDiv(num1, num2);
        String fResult = String.format("%,.2f", mResult);
        result.setText(fResult);
    }

    public void fClear(View view) {
        result.setText("0");
        etFnum.setText(" ");
        etSnum.setText(" ");
    }

    public void fExit(View view) {
        finish();
        System.exit(0);
    }


}
