package com.example.profiletest;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class Fragment_Info extends AppCompatActivity {
    TextView txtName,txtQuocTich;
    ImageView imgLengends;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_info);
        Intent intent = getIntent();
        AnhXa();





        if(intent != null){

            CauThu cauThu = (CauThu) intent.getSerializableExtra("data");
            txtName.setText(cauThu.getTen());
            txtQuocTich.setText(cauThu.getDtu());
            imgLengends.setImageResource(cauThu.getAdd());



        }


    }


    private void AnhXa(){
        txtName = findViewById(R.id.tv_namelegends);
        txtQuocTich= findViewById(R.id.tv_quocgia);
        imgLengends = findViewById(R.id.img_legends);
    }
}
