package vijay.com.timber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    Button btn_log_string, btn_log_exception;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_log_string = findViewById(R.id.btn_log_string);
        btn_log_exception = findViewById(R.id.btn_log_exception);
        boolean isWeekend = false;
        Timber.e("This prints the boolean value. Is weekend: %b", isWeekend);
        int a = 100;
        Timber.e("Integer a value is: %d", a);
        float pi = 3.14159f;
        Timber.e("Pi value is: %f", pi);


        btn_log_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Timber.e("Hello from Timber!");
            }
        });

        btn_log_exception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int a = 10 / 0;
                    Timber.e("Value of a: %d", a);
                } catch (Exception e) {
                    Timber.e(e);
                    Timber.e("Exception in math operation: %s", e.getMessage());
                }
            }
        });

    }
}
