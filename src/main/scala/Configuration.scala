
import com.typesafe.config._

/**
  * A trait to mixin configuration.
  * Any place you need config just mix this trait in:
  *  <xmp>
  *   with Configuration
  *  ....
  *  then access:  Option(config.getInt("mongo.hostname")).getOrElse("localhost")
  * </xmp>
  */
trait Configuration {
  protected lazy val config: Config = ConfigFactory.load("mtrx." + sys.props.getOrElse("environment", "localhost"))
}
