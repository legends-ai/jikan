package asuna.jikan

import monix.execution.Scheduler
import asuna.common.BaseGrpcService
import asuna.proto.league.jikan.JikanGrpc
import asuna.proto.league.jikan.rpc._
import scala.concurrent.Future

class JikanServer(args: Seq[String])(implicit sched: Scheduler)
  extends BaseGrpcService(args, JikanConfigParser, JikanGrpc.bindService)
  with JikanGrpc.Jikan {

  def schedule(request: ScheduleRequest): Future[ScheduleResponse] = {
    ???
  }
}
