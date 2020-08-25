package com.example.coba3

fun divideAndSort(deret:String){
    var b=deret.split("0")
    var n=b.size
    for (j in 0..n-1){
        var data=b[j].toCharArray()
        var p = data.sortedArray()
        print(p)
    }

}

fun main(){
    print("masukan deret =")
    var t= readLine()!!.toString()
    divideAndSort(t)
}
