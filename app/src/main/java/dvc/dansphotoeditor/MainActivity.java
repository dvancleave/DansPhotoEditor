package dvc.dansphotoeditor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.URL;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    /**called when user taps the send button*/
    public void sendMessage(View view) {
        //do something in response to the button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    private ImageView imageView;
    private Button button2;
    private Button button3;



    @Override
    protected void onCreate(Bundle savedInstanceStat) {
        super.onCreate(savedInstanceStat);
        setContentView(R.layout.activity_main);

        this.imageView = this.findViewById(R.id.imageView);

        this.button2 = (Button) this.findViewById(R.id.button2);
        this.button3 = (Button) this.findViewById(R.id.button3);

        this.button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage1();
            }

        });


        this.button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage2();
            }


        });
    }


        public void showImage1() {
            this.imageView.setBackgroundResource(R.drawable.duck1);


        }

        public void showImage2(){
            this.imageView.setBackgroundResource(R.drawable.duck3);
        }


    public void showImage1(View view) {
        this.imageView.setBackgroundResource(R.drawable.ic_launcher_foreground);
    }
}
