package com.melekdmr.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness=Coroutines

       /* GlobalScope.launch {
            repeat(100000){
                launch {
                    println("android")
                }
            }
        }*/
        //Scope
      /*  //GlobalScope,runBlocking,CoroutineScop
      //run blocking

        println("run blocking start")
        runBlocking {
            launch{
               delay(5000)
                println("run blocking")
            }
        }
        println("run blocking end")

           //GlobalScope
        println("global  scope start")
          GlobalScope.launch{
              delay(5000)
              println("global scope")

           }
        println("global scope end") */

        //CoroutineScope

        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")

    }
}
