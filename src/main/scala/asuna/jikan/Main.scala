package asuna.jikan

import monix.execution.Scheduler

object Main {

  def main(args: Array[String]): Unit = {
    implicit val scheduler: Scheduler = Scheduler.global
    new JikanServer(args).standReady()
  }

}
