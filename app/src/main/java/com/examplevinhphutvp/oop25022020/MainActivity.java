package com.examplevinhphutvp.oop25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Object va class
//        String a = "5";
        // function construrtor
//        Giangvien nguyenvana = new Giangvien();
//        nguyenvana.experience = "1";
//        nguyenvana.name = "Nguyen Van A";
//        Log.d("BBB", nguyenvana.name + " " + nguyenvana.age);
        Person nguyenvanA = new Person("Nguyen Van A",20,"Quận 10",1234567891,200,700000);

    }
    // Access modifier
    // Public, Default , private , protected
}
