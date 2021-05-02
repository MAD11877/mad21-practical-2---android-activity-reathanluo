package sg.edu.np.s10205205;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User("SHIAO", "It's me", 1);
        Button follow_button = findViewById(R.id.follow_button);
        if (user.isFollowed()){
            follow_button.setText("UNFOLLOW");
        }
        else{
            follow_button.setText("FOLLOW");
        }
        follow_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("debug", "Follow Button Pressed");
                if (user.isFollowed()){
                    follow_button.setText("FOLLOW");
                    user.setFollowed(false);
                }
                else{
                    follow_button.setText("UNFOLLOW");
                    user.setFollowed(true);
                }
            }
        });
//        EditText txt = findViewById(R.id.Input);
//        txt.setText("Hello baby");
//        Log.d("debug","create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug","start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug","stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug","destory");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug","pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug","resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug","restart");

    }
}