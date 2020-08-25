package com.example.coba3

fun main(){

    print("input score of mathematic=")
    var mtk= readLine()!!.toFloat()

    print("input score of bahasa =")
    var bhs= readLine()!!.toFloat()

    print("input score of english =")
    var eng= readLine()!!.toFloat()

    print("input score of science =")
    var scn= readLine()!!.toFloat()


    var sum= mtk+bhs+eng+scn
    var avg=sum/4
    println("average = $avg")
    if (avg in 0..59) print("Grade = E")
    if (avg in 60..69) print("Grade = D")
    if (avg in 70..79) print("Grade = C")
    if (avg in 80..89) print("Grade = B")
    if (avg in 90..100) print("Grade = A")

}