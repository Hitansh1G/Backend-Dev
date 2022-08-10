
// The @JsonAnyGetter annotation allows for the flexibility of using a Map field as standard properties.

// For example, the ExtendableBean entity has the name property and a set of extendable attributes in the form of key/value pairs:


// public class ExtendableBean {
//     public String name;
//     private Map<String, String> properties;

//     @JsonAnyGetter
//     public Map<String, String> getProperties() {
//         return properties;
//     }
// }


// When we serialize an instance of this entity, we get all the key-values in the Map as standard, plain properties:

// {
//     "name":"My bean",
//     "attr2":"val2",
//     "attr1":"val1"
// }


// Here's how the serialization of this entity looks in practice:

// @Test
// public void whenSerializingUsingJsonAnyGetter_thenCorrect()
//   throws JsonProcessingException {
 
//     ExtendableBean bean = new ExtendableBean("My bean");
//     bean.add("attr1", "val1");
//     bean.add("attr2", "val2");

//     String result = new ObjectMapper().writeValueAsString(bean);
 
//     assertThat(result, containsString("attr1"));
//     assertThat(result, containsString("val1"));
// }


// We can also use the optional argument enabled as false to disable @JsonAnyGetter(). In this case, the Map will be converted as JSON and will appear under the properties variable after serialization.

