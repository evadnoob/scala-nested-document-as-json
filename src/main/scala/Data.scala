
import com.mongodb.{Mongo, ServerAddress}
import net.liftweb.mongodb.{MongoDB, MongoIdentifier}
import com.typesafe.scalalogging.slf4j._


object RogueMongo extends MongoIdentifier with Logging with Configuration {
  private val DEFAULT_MONGODB_PORT = 27017

  private var mongo: Option[Mongo] = None

  override def jndiName: String = "rogue_mongo" // required by MongoIdentifier

  def connectToMongo: Unit = {
    logger.debug("config" + config)
    mongo = Some(new Mongo(new ServerAddress(Option(config.getString("mongo.host")).getOrElse("localhost"),
      Option(config.getInt("mongo.port")).getOrElse(DEFAULT_MONGODB_PORT))))
    MongoDB.defineDb(RogueMongo, mongo.get, "db")
  }

  def disconnectFromMongo: Unit = {
    mongo.foreach(_.close)
    MongoDB.close
    mongo = None
  }
}
