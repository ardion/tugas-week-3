package com.example.coba3


fun luas(jari:Int):Double{
    if(jari%7==0){
        var L=jari*jari*22/7
        return (L.toDouble())
    }else{
        var L=jari*jari*3.14
        return (L)
    }


}


fun main(){
    print("masukan jari-jari =")
    var r= readLine()!!.toInt()
    println("luasnya adalah ${luas(r)}")
}