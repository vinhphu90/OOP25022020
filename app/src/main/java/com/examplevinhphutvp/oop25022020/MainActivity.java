package com.examplevinhphutvp.oop25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


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
        // + tên phương thức giống nhau chỉ khác nhau than hàm
        // + 2 phương thức này phải nằm 2 nơi
        // Phương thức nạp chồng

        // Tính đóng gói
        // Tính trừu tượng
        // Tính đa hình
        // Quan hệ has A
        showToast(R.string.app_name);
    }
    public  void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
    public void showToast(int resId){
        Toast.makeText(this,getResources().getString(resId), Toast.LENGTH_SHORT).show();
    }
}
