package com.example.martin.shelem.activities;


import android.os.Bundle;

import com.example.martin.shelem.handlers.SocketService;
import com.example.martin.shelem.handlers.UserDetails;

import androidx.annotation.Nullable;

public class SocketActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SocketService.init(new UserDetails(this).getUserID());
    }
}
