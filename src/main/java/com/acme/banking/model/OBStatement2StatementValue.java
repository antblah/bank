package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Set of elements used to provide details of a generic number value related to the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic number value related to the statement resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-18T20:50:45.363726-05:00[America/New_York]")
public class OBStatement2StatementValue   {
  @JsonProperty("Value")
  private String value;

  @JsonProperty("Type")
  private String type;

  public OBStatement2StatementValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value associated with the statement value type.
   * @return value
  */
  @ApiModelProperty(required = true, value = "Value associated with the statement value type.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OBStatement2StatementValue type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Statement value type, in a coded form.
   * @return type
  */
  @ApiModelProperty(required = true, value = "Statement value type, in a coded form.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementValue obStatement2StatementValue = (OBStatement2StatementValue) o;
    return Objects.equals(this.value, obStatement2StatementValue.value) &&
        Objects.equals(this.type, obStatement2StatementValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

