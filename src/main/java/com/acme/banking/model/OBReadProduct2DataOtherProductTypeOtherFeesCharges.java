package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataOtherProductTypeFeeChargeCap;
import com.acme.banking.model.OBReadProduct2DataOtherProductTypeFeeChargeDetail;
import com.acme.banking.model.OBReadProduct2DataOtherProductTypeOtherTariffType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-18T20:50:45.363726-05:00[America/New_York]")
public class OBReadProduct2DataOtherProductTypeOtherFeesCharges   {
  /**
   * TariffType which defines the fee and charges.
   */
  public enum TariffTypeEnum {
    TTEL("TTEL"),
    
    TTMX("TTMX"),
    
    TTOT("TTOT");

    private String value;

    TariffTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TariffTypeEnum fromValue(String value) {
      for (TariffTypeEnum b : TariffTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("TariffType")
  private TariffTypeEnum tariffType;

  @JsonProperty("TariffName")
  private String tariffName;

  @JsonProperty("OtherTariffType")
  private OBReadProduct2DataOtherProductTypeOtherTariffType otherTariffType;

  @JsonProperty("FeeChargeDetail")
  
  private List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> feeChargeDetail = new ArrayList<>();

  @JsonProperty("FeeChargeCap")
  
  private List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap = null;

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges tariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
    return this;
  }

  /**
   * TariffType which defines the fee and charges.
   * @return tariffType
  */
  @ApiModelProperty(value = "TariffType which defines the fee and charges.")
  public TariffTypeEnum getTariffType() {
    return tariffType;
  }

  public void setTariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges tariffName(String tariffName) {
    this.tariffName = tariffName;
    return this;
  }

  /**
   * Name of the tariff
   * @return tariffName
  */
  @ApiModelProperty(value = "Name of the tariff")
  public String getTariffName() {
    return tariffName;
  }

  public void setTariffName(String tariffName) {
    this.tariffName = tariffName;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges otherTariffType(OBReadProduct2DataOtherProductTypeOtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
    return this;
  }

  /**
   * Get otherTariffType
   * @return otherTariffType
  */
  @ApiModelProperty(value = "")
  public OBReadProduct2DataOtherProductTypeOtherTariffType getOtherTariffType() {
    return otherTariffType;
  }

  public void setOtherTariffType(OBReadProduct2DataOtherProductTypeOtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges feeChargeDetail(List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges addFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeFeeChargeDetail feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

  /**
   * Get feeChargeDetail
   * @return feeChargeDetail
  */
  @ApiModelProperty(required = true, value = "")
  public List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeFeeChargeDetail> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges feeChargeCap(List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOtherFeesCharges addFeeChargeCapItem(OBReadProduct2DataOtherProductTypeFeeChargeCap feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Get feeChargeCap
   * @return feeChargeCap
  */
  @ApiModelProperty(value = "")
  public List<OBReadProduct2DataOtherProductTypeFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeOtherFeesCharges obReadProduct2DataOtherProductTypeOtherFeesCharges = (OBReadProduct2DataOtherProductTypeOtherFeesCharges) o;
    return Objects.equals(this.tariffType, obReadProduct2DataOtherProductTypeOtherFeesCharges.tariffType) &&
        Objects.equals(this.tariffName, obReadProduct2DataOtherProductTypeOtherFeesCharges.tariffName) &&
        Objects.equals(this.otherTariffType, obReadProduct2DataOtherProductTypeOtherFeesCharges.otherTariffType) &&
        Objects.equals(this.feeChargeDetail, obReadProduct2DataOtherProductTypeOtherFeesCharges.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, obReadProduct2DataOtherProductTypeOtherFeesCharges.feeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffType, tariffName, otherTariffType, feeChargeDetail, feeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOtherFeesCharges {\n");
    
    sb.append("    tariffType: ").append(toIndentedString(tariffType)).append("\n");
    sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
    sb.append("    otherTariffType: ").append(toIndentedString(otherTariffType)).append("\n");
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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

