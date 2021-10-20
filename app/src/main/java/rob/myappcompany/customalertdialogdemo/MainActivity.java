package rob.myappcompany.customalertdialogdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mShowDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                View view1 = getLayoutInflater().inflate(R.layout.dialog_login, null);
                EditText mEmail = view1.findViewById(R.id.emailEditText);
                EditText mPasswort = view1.findViewById(R.id.passwortEditText);
                Button mLogin = view1.findViewById(R.id.loginButton);

                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!mEmail.getText().toString().isEmpty() && !mPasswort.getText().toString().isEmpty()){
                            Toast.makeText(MainActivity.this, "seccessfull ", Toast.LENGTH_LONG).show();
                        }
                    }
                });

                builder.setView(view1);
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
    }

    public void init(){
        mShowDialog = findViewById(R.id.dialogShow);
    }


}