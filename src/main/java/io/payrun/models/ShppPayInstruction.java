package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ShppPayInstruction")
public class ShppPayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="Description")
    public String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceStart")
    public java.util.Date absenceStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceEnd")
    public java.util.Date absenceEnd;

    @JsonProperty(value="StatutoryOffset")
    public Boolean statutoryOffset = false;

    @JsonProperty(value="AverageWeeklyEarningOverride")
    public java.lang.Double averageWeeklyEarningOverride;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="BabyDueDate")
    public java.util.Date babyDueDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="BabyBornDate")
    public java.util.Date babyBornDate;

    @JsonProperty(value="SmpSapWeeksTaken")
    public java.lang.Integer smpSapWeeksTaken;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="SplStartDate")
    public java.util.Date splStartDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="SplEndDate")
    public java.util.Date splEndDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="MothersDateOfDeath")
    public java.util.Date mothersDateOfDeath;













}
