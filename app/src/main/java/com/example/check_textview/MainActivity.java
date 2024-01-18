package com.example.check_textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.Toast;

        public class MainActivity extends AppCompatActivity {
            CheckedTextView checkedTextView;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        checkedTextView = findViewById(R.id.checkedTextView);


        checkedTextView.setChecked(false);


        checkedTextView.setCheckMarkDrawable(android.R.drawable.checkbox_off_background);

        checkedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkedTextView.setChecked(!checkedTextView.isChecked());
                checkedTextView.setCheckMarkDrawable(checkedTextView.isChecked() ?
                        android.R.drawable.checkbox_on_background :
                        android.R.drawable.checkbox_off_background);

                String msg = getString(R.string.pre_msg) + " " + (checkedTextView.isChecked() ?
                        getString(R.string.checked) : getString(R.string.unchecked));


                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
//

    }
}