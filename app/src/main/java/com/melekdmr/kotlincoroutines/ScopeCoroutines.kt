package com.melekdmr.kotlincoroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//kotlin giriş fonksiyonu
  fun main(){
      runBlocking {
          launch {
              delay(5000)
              println("run blocking")

          }
         //Bu şekilde ya başka coroutine içerisinde ya da susbend içerisinde çalıştırılabilir
          coroutineScope {
              launch {
                  delay(3000)
                  println("coroutine scope")
              }
          }
      }
  }/* çalıştırıldıktan 3 sn sonra coroutinescope 2 sn sonrada run blocking çalışır.toplamda 5 sn sürer*/