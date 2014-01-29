
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
  object displayName extends StringField(this, 255)
  object status extends StringField(this, 255)
  object organization extends ObjectIdField(this)
  object loginCount extends LongField(this)
  object groups extends MongoListField[User, ObjectId](this)
  object createdOn extends DateTimeField(this)

  object visibility extends MongoMapField[User, VisibilityBson](this)

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
  object _id extends ObjectIdField(this)
  object inProgress extends BooleanField(this)
  object discovery extends StringField(this, 200)
  object personal extends StringField(this, 200)
  object relationship extends StringField(this, 200)
  object team extends StringField(this, 200)
  object development extends StringField(this, 200)
  object action extends StringField(this, 200)
  object discoveryCompleted extends BooleanField(this)
  object accessedTimestamp extends StringField(this, 50)
  object visible extends BooleanField(this)
}

object VisibilityBson extends VisibilityBson with BsonMetaRecord[VisibilityBson]

