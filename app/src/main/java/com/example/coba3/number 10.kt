package com.example.coba3

fun printWords(text:String){

    var kapital=text.toUpperCase()
    var vokal=""
    var konsonan=""
    var n=text.length-1

    for(i in 0..n){
        if (kapital[i]=='A' || kapital[i]=='I' || kapital[i]=='U' || kapital[i]=='E' || kapital[i]=='O'){
            vokal+=text[i]
        }else konsonan+=text[i]

    }

   var hasil=vokal+konsonan

    for(j in hasil){
        println(j)
    }

}


fun main(){
    print("masukan kata =")
    var r= readLine()!!.toString()
    printWords(r)
}