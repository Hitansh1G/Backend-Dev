// Working with a simple entity:

// public class MyDto {
//     private String stringValue;

//     public MyDto() {
//         super();
//     }

//     public String getStringValue() {
//         return stringValue;
//     }

//     public void setStringValue(String stringValue) {
//         this.stringValue = stringValue;
//     }
// }
// Serializing it will result in the following JSON:

// {"stringValue":"some value"}
// To customize that output so that, instead of stringValue we get – for example – strVal, we need to simply annotate the getter:

// @JsonProperty("strVal")
// public String getStringValue() {
//     return stringValue;
// }
// Now, on serialization, we will get the desired output:

// {"strVal":"some value"}
// A simple unit test should verify the output is correct:

// @Test
// public void givenNameOfFieldIsChanged_whenSerializing_thenCorrect() 
//   throws JsonParseException, IOException {
//     ObjectMapper mapper = new ObjectMapper();
//     MyDtoFieldNameChanged dtoObject = new MyDtoFieldNameChanged();
//     dtoObject.setStringValue("a");

//     String dtoAsString = mapper.writeValueAsString(dtoObject);

//     assertThat(dtoAsString, not(containsString("stringValue")));
//     assertThat(dtoAsString, containsString("strVal"));
// }