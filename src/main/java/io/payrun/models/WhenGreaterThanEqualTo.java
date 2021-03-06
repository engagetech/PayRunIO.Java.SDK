package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "WhenGreaterThanEqualTo")
public class WhenGreaterThanEqualTo extends CompareConditionBase
{

    @JsonProperty(value="@ValueA")
    public String valueA;

    @JsonProperty(value="@ValueB")
    public String valueB;
}
