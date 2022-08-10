// The @JsonGetter annotation is an alternative to the @JsonProperty annotation, which marks a method as a getter method.

// In the following example, we specify the method getTheName() as the getter method of the name property of a MyBean entity:

                // public class MyBean {
                //     public int id;
                //     private String name;

                //     @JsonGetter("name")
                //     public String getTheName() {
                //         return name;
                //     }
                // }

// Here's how this works in practice:

                // @Test
                // public void whenSerializingUsingJsonGetter_thenCorrect()
                // throws JsonProcessingException {
                
                //     MyBean bean = new MyBean(1, "My bean");

                //     String result = new ObjectMapper().writeValueAsString(bean);
                
                //     assertThat(result, containsString("My bean"));
                //     assertThat(result, containsString("1"));
                // }
