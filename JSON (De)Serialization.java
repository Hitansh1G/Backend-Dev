// Java stores information as Objects. How to (De) Serialize Java POJO to JSON vice-versa?

// de Serialize is basically converting stream of bytes into objects



// How to (De) Serialize Java POJO to JSON vice-versa?
    // Serialize the Object data and send. Receiver will deserialize to convert it back to Object. 
    // Needed since the network transferring the data doesn’t understand Objects and doesn’t understand Java. The other endpoint need not even be in Java.
    // Libraries like Jackson simplify this serialization/deserialization.


// public class Member {
//     public String name;
//     public Integer age;
//     public String secretIdentity;
//     ...
// }


            // on serializing 


// {
//     "name": "J Jonah Jameson",
//     "age": 60,
//     "secretIdentity": "Omni Man"
// }
            


                // on deserializing



// public class Member {
//     public String name;
//     public Integer age;
//     public String secretIdentity;
//     ...
// }



// The Java ObjectMapper is part of the Jackson library. It provides an easy way to serialize Java to JSON:
            // String jsonString = objectMapper.writeValueAsString(new User());


// And deserialize JSON to Java:

            // User user = objectMapper.readValue(jsonString, User.class);

            


//How Jackson ObjectMapper serialization works

// When you call writeValue() or a similar method the Object mapper creates a JsonGenerator. This is what's actually responsible for writing the JSON output.

// The JsonGenerator is created via a JsonFactory. The JsonFactory allows for the creation of JsonGenerators with different output sources. This means you can serialize JSON output to a file, output stream, etc. using the ObjectMapper class.


