package asuna.jikan

import monix.execution.Scheduler
import asuna.common.BaseGrpcService
import asuna.proto.league.jikan._
import scala.concurrent.Future

class JikanServer(args: Seq[String])(implicit sched: Scheduler)
  extends BaseGrpcService(args, JikanConfigParser, JikanGrpc.bindService)
  with JikanGrpc.Jikan {

  def schedule(job: Job): Future[JobTask] = {
    ???
  }
}
