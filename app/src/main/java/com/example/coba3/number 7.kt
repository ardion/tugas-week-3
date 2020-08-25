package com.example.coba3

fun cekTahun(tahun:Int):String{
    if(tahun%4==0 && tahun%100!=0|| tahun%400==0){
        return ("tahun kabisat")
    }else{
        return ("bukan tahun kabisat")
    }

}

fun main(){
    print("masukan tahun =")
    var t= readLine()!!.toInt()
    println("Tahun $t adalah ${cekTahun(t)}")
}