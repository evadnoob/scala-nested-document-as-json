
import com.foursquare.index.IndexedRecord
import com.foursquare.rogue.LiftRogue._
import com.foursquare.rogue.ObjectIdKey
import net.liftweb.mongodb.{JsonObject, JsonObjectMeta, MongoIdentifier}
import net.liftweb.mongodb.record._
import net.liftweb.mongodb.record.field._
import net.liftweb.record.field._
import org.bson.types.ObjectId

class User extends MongoRecord[User] with ObjectIdKey[User] with IndexedRecord[User] {

  def meta: MongoMetaRecord[User] = User
  object email extends StringField(this, 255)
  object loginCount extends LongField(this)
  object visibility extends BsonRecordMapField[User, VisibilityBson](this, VisibilityBson)

  // override def toString: String = {
  //   this.asJSON.toString
  // }
}
object User extends User with MongoMetaRecord[User]  with JsonStringConversion[User] {
  override def collectionName: String = "users.persons"
  override def mongoIdentifier: MongoIdentifier = RogueMongo
}


class VisibilityBson extends BsonRecord[VisibilityBson]  {
  def meta: BsonMetaRecord[VisibilityBson] = VisibilityBson
  object visible extends BooleanField(this)
}

object VisibilityBson extends VisibilityBson with BsonMetaRecord[VisibilityBson]

