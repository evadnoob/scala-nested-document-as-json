import com.mongodb.casbah.Imports._
import net.liftweb.json._


object Main {

  def main(args: Array[String]) {
    println("starting")

    sys.addShutdownHook {
      println("shutting down...")

      RogueMongo.disconnectFromMongo
    }

  RogueMongo.connectToMongo

    //client.execute { create index "persons" }

    implicit val formats = DefaultFormats

    val _id = new ObjectId("52e9624f02c5119abc15b897")
    val json1 = """
      {
        "_id": "%s",
        "email": "david@xyz.com",
        "loginCount": 0,
        "visibility": {
         "504d9d2411f2ff573c5af067": {"visible": true},
         "504d9d20bb2e657747650c3b": {"visible": false}
         }
      }""".format(_id.toString)

      val json2 = """
      {
        "_id": "%s",
        "email": "david@xyz.com",
        "loginCount": 0
     }""".format(_id.toString)

      val user = User.createRecord
    user.setFieldsFromJValue(parse(json1))
    user.save

    println(user.asJSON.toString)

    //val o = User.createRecord.email("xyz").visibilit
    //o.save

    //val user = User.where(_._id eqs new ObjectId("52e9624f02c5119abc15b897")).fetch.headOption

  }
}
