scala-nested-document-as-json
=============================

simple nested document crud from json

to execute: 
  sbt run
  
  
Results in
```
java.lang.IllegalArgumentException: can't serialize class scala.collection.immutable.Map$Map1
        at org.bson.BasicBSONEncoder._putObjectField(BasicBSONEncoder.java:270)
        at org.bson.BasicBSONEncoder.putObject(BasicBSONEncoder.java:174)
        at org.bson.BasicBSONEncoder._putObjectField(BasicBSONEncoder.java:226)
        at org.bson.BasicBSONEncoder.putObject(BasicBSONEncoder.java:174)
        at org.bson.BasicBSONEncoder.putObject(BasicBSONEncoder.java:120)
        at com.mongodb.DefaultDBEncoder.writeObject(DefaultDBEncoder.java:27)
        at com.mongodb.OutMessage.putObject(OutMessage.java:289)
        at com.mongodb.OutMessage.writeUpdate(OutMessage.java:175)
        at com.mongodb.OutMessage.update(OutMessage.java:62)
        at com.mongodb.DBApiLayer$MyCollection.update(DBApiLayer.java:347)
        at com.mongodb.DBCollection.update(DBCollection.java:177)
        at com.mongodb.DBCollection.save(DBCollection.java:817)
        at net.liftweb.mongodb.record.MongoMetaRecord$$anonfun$save$1$$anonfun$apply$mcV$sp$1.apply(MongoMetaRecord.scala:244)
        at net.liftweb.mongodb.record.MongoMetaRecord$$anonfun$save$1$$anonfun$apply$mcV$sp$1.apply(MongoMetaRecord.scala:243)
        at net.liftweb.mongodb.MongoDB$.useCollection(Mongo.scala:179)
        at net.liftweb.mongodb.MongoMeta$class.useColl(MongoMeta.scala:71)
        at User$.useColl(User.scala:22)
        at net.liftweb.mongodb.record.MongoMetaRecord$$anonfun$save$1.apply$mcV$sp(MongoMetaRecord.scala:243)
        at net.liftweb.mongodb.record.MongoMetaRecord$class.saveOp(MongoMetaRecord.scala:233)
        at User$.saveOp(User.scala:22)
        at net.liftweb.mongodb.record.MongoMetaRecord$class.save(MongoMetaRecord.scala:242)
        at User$.save(User.scala:22)
        at net.liftweb.mongodb.record.MongoRecord$$anonfun$save$1.apply$mcZ$sp(MongoRecord.scala:50)
        at net.liftweb.mongodb.record.MongoRecord$$anonfun$save$1.apply(MongoRecord.scala:50)
        at net.liftweb.mongodb.record.MongoRecord$$anonfun$save$1.apply(MongoRecord.scala:50)
        at net.liftweb.util.ThreadGlobal.doWith(ThreadGlobal.scala:71)
        at net.liftweb.util.Safe$.runSafe(Safe.scala:36)
        at net.liftweb.record.Record$class.runSafe(Record.scala:53)
        at User.runSafe(User.scala:11)
        at net.liftweb.mongodb.record.MongoRecord$class.save(MongoRecord.scala:49)
        at User.save(User.scala:11)
        at net.liftweb.mongodb.record.MongoRecord$class.save(MongoRecord.scala:66)
        at User.save(User.scala:11)
        at net.liftweb.mongodb.record.MongoRecord$class.save(MongoRecord.scala:74)
        at User.save(User.scala:11)
        at Main$.main(Main.scala:42)
        at Main.main(Main.scala)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:606)
        
```
