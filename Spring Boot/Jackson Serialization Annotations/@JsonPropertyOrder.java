// We can use the @JsonPropertyOrder annotation to specify the order of properties on serialization.

// Let's set a custom order for the properties of a MyBean entity:

            // @JsonPropertyOrder({ "name", "id" })
            // public class MyBean {
            //     public int id;
            //     public String name;
            // }

// Here's the output of serialization:

// {
//     "name":"My bean",
//     "id":1
// }
// Then we can do a simple test:

            // @Test
            // public void whenSerializingUsingJsonPropertyOrder_thenCorrect()
            //   throws JsonProcessingException {
            
            //     MyBean bean = new MyBean(1, "My bean");

            //     String result = new ObjectMapper().writeValueAsString(bean);
            //     assertThat(result, containsString("My bean"));
            //     assertThat(result, containsString("1"));
            // }
// We can also use @JsonPropertyOrder(alphabetic=true) to order the properties alphabetically. In that case, the output of serialization will be:

// {
//     "id":1,
//     "name":"My bean"
// }
