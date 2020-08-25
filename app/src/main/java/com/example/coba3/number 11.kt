package com.example.coba3

fun cekPalindrom(text:String):String{
    var balik:String=""
    var n=text.length-1

    for(i in 0..n){
        balik+=text[n-i]
    }

    if (text.compareTo(balik)==0)return("Palindrom")
    else return("Bukan Palindrom")
}

fun main(){
    print("masukan kata =")
    var k= readLine()!!.toString()
    print(cekPalindrom(k))
}