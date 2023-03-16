fun main(){
    oddNumbers()

    var longstrings = names(arrayOf("sun", "Wambui", "Anitab", "Ada", "Mwangi"))
    println(longstrings)

    guestsAge(4)
    guestsAge(10)
    guestsAge(19)

    prints()
}

fun oddNumbers(){
    val num = 1..100
    for (i in num){
        if (i%2!=0){
            println(i)
        }
    }
}

fun names(name:Array<String>):Int{
    var names = 0
    for (n in name){
        if (n.length >= 5){
            names++
        }
    }
    return names
}

fun guestsAge(age:Int){
    val drinks = when(age){
      in 0..5 -> "Milk for ages 0-5"
      in 6..14 ->"Fanta Orange for ages 6-14"
      else -> "CocaCola for ages 15 and above"
    }
    println(drinks)
}

fun prints(){
    val nums = 1..100
   for (n in nums){
       val check3 = n%3
       val check5 = n%5

        if (check3==0 && check5==0) {
            println("FizzBuzz")
        }
       else if (check3 == 0){
           println("Fizz")
       }
       else if (check5 == 0){
           println("Buzz")
       }
       else{
           println(n)
       }
   }
}