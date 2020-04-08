package com.examplevinhphutvp.oop25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnListenerClick{

    OnListenerClick onListenerClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tính kế thừa
        // khi kkees thừa . lớp cha có thể khởi tạo ra, ngược lại thì không
//        Person person = new User(); true
//        User person = new person(); false
        //khi kế thừa. lớp cha sẽ chia sẽ cho lớp con các phương thức và thuộc tính lớp cha có
//       User user = new User();
//       user.showName();
        // Phương thức ghi đè
//        Person person = new Person();
//        person.name = "Human 1";
//        person.showName();

//        User user = new User();
//        user.name = "Client 1";
//        user.showName();
        // Tính trừu tượng

        // Tính đa hình
        // + tên phương thức giống nhau chỉ khác nhau than hàm
        // + 2 phương thức này phải nằm 2 nơi
        // Phương thức nạp chồng

        // Tính đóng gói
        // + phạm vi truy cập public , private , protected , default
        // Quan hệ has A
//        showToast(R.string.app_name);

        onListenerClick = this;
        Button button = new Button(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onListenerClick.onClick();

            }
        });
        button.performClick();
    }
    @Override
    public void onClick() {
        Log.d("BBB","Đã click");
    }
}