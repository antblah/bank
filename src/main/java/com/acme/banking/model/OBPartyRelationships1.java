package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBPartyRelationships1Account;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The Party&#39;s relationships with other resources.
 */
@ApiModel(description = "The Party's relationships with other resources.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-18T20:50:45.363726-05:00[America/New_York]")
public class OBPartyRelationships1   {
  @JsonProperty("Account")
  private OBPartyRelationships1Account account;

  public OBPartyRelationships1 account(OBPartyRelationships1Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @ApiModelProperty(value = "")
  public OBPartyRelationships1Account getAccount() {
    return account;
  }

  public void setAccount(OBPartyRelationships1Account account) {
    this.account = account;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPartyRelationships1 obPartyRelationships1 = (OBPartyRelationships1) o;
    return Objects.equals(this.account, obPartyRelationships1.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1 {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

