package com.example.naveenkumark.testjava8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
public static final String TAG = "TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener((View v) ->
        {
            testLambda1();
            testLambda2();
        }
        );

        /*Person p1 = new Person("Naveen", 31, 1);
        Person p2 = new Person("Naveen", 31, 2);
        testFunctionalInterfaceLambda(p1);
*/
    }


    public void testLambda1(){

        Log.d("TAG", "testLambda1: ");
        Log.e(TAG, "testLambdaerror: " );
        Log.i(TAG, "testLambdainfo: ");
        Log.v(TAG, "verbose");
        Log.w(TAG, "testLambdaw: ");
        Log.wtf(TAG, "WTF");
        Log.wtf(TAG, "WTF");

    }
    public void testLambda2(){
        Log.d("TAG", "testLambda2: ");
    }

    public void testFunctionalInterfaceLambda(Person p){


    }

}
