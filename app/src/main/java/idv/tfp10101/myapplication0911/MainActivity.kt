package idv.tfp10101.myapplication0911

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import idv.tfp10101.mylibrary.TestBbt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestBbt.testFun()
    }
}