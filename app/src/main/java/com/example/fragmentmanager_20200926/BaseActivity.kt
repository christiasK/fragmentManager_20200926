package com.example.fragmentmanager_20200926

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    abstract fun setEvents()
    abstract fun setValues()
}