package playground

import akka.actor.ActorSystem

object Playground extends App {

  val actorSystem = ActorSystem("HelloAkka")

  // Testing Actor Instantiation
  println(actorSystem.name)



}
