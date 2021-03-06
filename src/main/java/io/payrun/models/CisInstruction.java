package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "CisInstruction")
public class CisInstruction
{

    @JsonProperty(value="CisLineType")
    public String cisLineType;

    @JsonProperty(value="PayFrequency")
    public SubContractorPayFrequency payFrequency = SubContractorPayFrequency.Monthly;

    @JsonProperty(value="TaxYearStart")
    public java.lang.Short taxYearStart;

    @JsonProperty(value="PeriodStart")
    public java.lang.Short periodStart;

    @JsonProperty(value="TaxYearEnd")
    public java.lang.Short taxYearEnd;

    @JsonProperty(value="PeriodEnd")
    public java.lang.Short periodEnd;

    @JsonProperty(value="UOM")
    public UomBasicPay uOM;

    @JsonProperty(value="Units")
    public java.lang.Double units;

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="VAT")
    public java.lang.Double vAT;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="CisLineTag")
    public String cisLineTag;
}
