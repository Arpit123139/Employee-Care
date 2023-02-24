package com.example.employeeexample.data

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData

class EmployeeShowRepository(context: Application) {
    private val employeeShowDao: EmployeeDetailDao = EmployeeDatabase.getDatabase(context).employeeDetailDao()

    fun getEmployee(id: Long): LiveData<Employee> {
        return employeeShowDao.getEmployee(id)
    }
}