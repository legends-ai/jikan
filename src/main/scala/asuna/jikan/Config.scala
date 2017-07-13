package asuna.jikan

import buildinfo.BuildInfo
import asuna.common.config.ConfigParser

case class JikanConfig()

object JikanConfigParser extends ConfigParser[JikanConfig](
  name = BuildInfo.name,
  version = BuildInfo.version,
  dependencies = Set(),
  port = 43404,
  metaPort = 43405,
  initial = JikanConfig()
) {

}
