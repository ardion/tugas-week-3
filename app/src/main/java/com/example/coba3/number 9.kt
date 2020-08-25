package com.example.coba3

fun main() {
    print("input number=")
    var printSegitiga = readLine()!!.toInt()

    for (i in 0..printSegitiga-1) {
        for (j in 1..printSegitiga-i) {
            print(j)
        }
        print("\n")
    }

}