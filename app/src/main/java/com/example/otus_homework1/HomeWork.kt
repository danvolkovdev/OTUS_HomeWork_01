package com.example.otus_homework1

fun main()
{
    task1()
    task2()
    task3()
}

fun task1(){
    println("###\nTASK#1\n###\n")
    val res = (0 .. 99)
        .filter { it % 2 == 0 }
        .slice(10..20)
        .fold(0){acc, i -> acc+(i+1)}

    println(res)
}

data class Person (val name:String, val surname:String, val age:Int)

fun List<Person>.sortByAge() : List<Person>
{
    return this.sortedByDescending { it.age }
}

fun List<Person>.sortByAlohabet() : List<Person>
{
    return this.sortedWith { first, second ->
        if (first.name != second.name)
            compareValues(first.name, second.name)
        else
            compareValues(first.surname, second.surname)
    }
}

fun task2(){
    println("###\nTASK#2\n###\n")
    val list = listOf(
        Person("Den", "Figel", 22),
        Person("Ivan", "Figel", 25),
        Person("Yasha", "Lava", 51),
        Person("Anton", "G", 32),
        Person("Vinny", "Puh", 33),
        Person("Yasos", "Biba", 42),
        Person("Den", "Koli", 18),
        Person("Anatoliy", "Vaserman", 54))
    list.forEach{println(it)}
    println("\nSorted by descending age:\n")
    list.sortByAge().forEach{ println(it) }
    println("\nSorted by alphabet:\n")
    list.sortByAlohabet().forEach{ println(it) }
}

fun foo()
{
    Thread.sleep(2000)
}

fun runWithTimer(func : () -> Unit) : Long
{
    val start = System.currentTimeMillis()
    func()
    return System.currentTimeMillis() - start
}

fun task3(){
    println("###\nTASK#3\n###\n")
    println("The execution of the function took ${runWithTimer{ foo()} } seconds")
}
