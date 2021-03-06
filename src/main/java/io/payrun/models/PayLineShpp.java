package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineShpp")
public class PayLineShpp extends PayLine
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceStart")
    public java.util.Date absenceStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceEnd")
    public java.util.Date absenceEnd;

    @JsonProperty(value="AverageWeeklyEarnings")
    public java.lang.Double averageWeeklyEarnings = 0d;;

    @JsonProperty(value="WeeksUsed")
    public java.lang.Double weeksUsed = 0d;;

    @JsonProperty(value="ExclusionReason")
    public ShppExclusionReason exclusionReason = ShppExclusionReason.None;
}
