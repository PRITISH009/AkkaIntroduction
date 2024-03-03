package part1recap

import scala.annotation.tailrec

object GeneralRecap extends App {

  // Declaration of Value
  val aCondition: Boolean = false

  var aVariable = 42
  aVariable += 1 // aVariable = 43

  // expressions
  val aConditionalValue = if(aCondition) 32 else 42

  // code Block

  val aCodeBlock = {
    if(aCondition) 43
    100 // result of a code block is the result of its last expression
  }

  // types
  // Unit (does not return anything. Side Effects)

  val aUnit = println("Hello, Scala")

  // Functions
  def aFunction(x: Int): Int = x + 1

  // Recursion
  // tailRecursion
  @tailrec
  def factorial(n: Int, acc: Int): Int = {
    if(n <= 0) acc
    else factorial(n-1, acc * n)
  }

  // OOP

  class Animal
  class Dog extends Animal
  val aDog: Animal = new Dog // Polymorphism

  trait Carnivore {
    def eat(a: Animal): Unit // Abstract Method
  }

  class Crocodile extends Animal with Carnivore { // Mixing happening of trait with Class
    override def eat(a: Animal): Unit = println("Croc Eating!")
  }

  // method Notations
  val aCroc = new Crocodile
  aCroc eat aDog // aCroc.eat(aDoc)

  // Anonymous Classes
  val aCarnivore = new Carnivore {
    override def eat(a: Animal): Unit = println("roar!!")
  }

  aCarnivore eat aDog

  // generics

}
