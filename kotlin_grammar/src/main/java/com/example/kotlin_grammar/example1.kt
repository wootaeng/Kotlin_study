package com.example.kotlin_grammar

fun main(){
    HelloWorld()
}


//1. 함수
// : 다음에는 보통 return type 을 쓴다. 리턴할 타입이 없다면 Unit 또는 생략가능
// 자바에는 int, string , void.. 타입을 지정해서 사용
fun HelloWorld() : Unit {
    println("Hello!!")
}