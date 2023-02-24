package com.example.employeeexample.ui

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.employeeexample.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_employee_list.*
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

fun createFile(context: Context, folder: String, ext: String): File {
    val timeStamp: String =
        SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
    val filesDir: File? = context.getExternalFilesDir(folder)
    val newFile = File(filesDir, "$timeStamp.$ext")
    newFile.createNewFile()
    return newFile
}


fun Activity.showToast(msg: String, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, msg, duration).show()
}

class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        // Show the toolbar as the actionbar
//        setSupportActionBar(toolbar)
//        supportActionBar?.title = ""

        // code to add back option in detail Fragment

    //    val navController = NavHostFragment.findNavController(nav_host_fragment)
    //    appBarConfiguration = AppBarConfiguration(navController.graph)
  //      toolbar.setupWithNavController(navController, appBarConfiguration)

    }
    // This code is implement to close the drawer when the app closes so that when it reopens the drawer is close
    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}
