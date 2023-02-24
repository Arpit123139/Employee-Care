package com.example.employeeexample.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface EmployeeShowDao{
    @Query("SELECT * FROM employee WHERE `id` = :id")
    fun getEmployee(id: Long): LiveData<Employee>
}
