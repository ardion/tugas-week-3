package com.example.coba3

fun luas(alas:Int,tinggi:Int):Double{
    var L=0.5*alas*tinggi
    return(L)
}

fun main(){
    print("masukan alas =")
    var a= readLine()!!.toInt()
    print("masukan tinggi =")
    var t= readLine()!!.toInt()
    println("luasnya adalah ${luas(a,t)}")
}