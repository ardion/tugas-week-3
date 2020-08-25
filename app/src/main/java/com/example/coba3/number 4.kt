package com.example.coba3


fun checkAge(x:Int):Int{
    var Age=2020-x
return(Age)
}

fun main(){
    print("input year of birth=")
    var a= readLine()!!.toInt()
 println("your age is ${checkAge(a)}")
}