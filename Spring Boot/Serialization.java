//Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

//The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different platform.

// To make a Java object serializable we implement the java.io.Serializable interface.
// The ObjectOutputStream class contains writeObject() method for serializing an Object.

// public final void writeObject(Object obj) throws IOException


// The ObjectInputStream class contains readObject() method for deserializing an object.

// public final Object readObject()
//                   throws IOException,
//                ClassNotFoundException