package com.example.coba3

fun balikKalimat(kalimat:String):String{
    var word=kalimat.split("\\s+".toRegex())
    var n=word.size
    var hasil:String=""


    var lp=n-1
    for(j in 0..lp){
        hasil=hasil+word[lp-j]+"\t"
    }
    return(hasil)
}

fun main(){
    print("masukan kalimat =")
    var k= readLine()!!.toString()
    print(balikKalimat(k))
}