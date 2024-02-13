package com.melekdmr.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    //Dispatcher
          runBlocking {
              launch (Dispatchers.Main){
                  println("Main Thread: ${ Thread.currentThread().name}")
              }
              launch(Dispatchers.IO) {
                  println("IO Thread: ${Thread.currentThread().name}")
              }
              launch(Dispatchers.Default) {
                  println("Default Thread: ${Thread.currentThread().name}")
              }
              launch(Dispatchers.Unconfined) {
                  println("Unconfined Thread: ${Thread.currentThread().name}")
              }
    }}