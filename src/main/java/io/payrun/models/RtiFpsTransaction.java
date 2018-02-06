package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RtiFpsTransaction")
public class RtiFpsTransaction
{

    @JsonProperty(value="RtiType")
    public String rtiType;

    @JsonProperty(value="TransactionStatus")
    public RtiTransactionStatus transactionStatus = RtiTransactionStatus.New;

    @JsonProperty(value="Timestamp")
    public java.util.Date timestamp;

    @JsonProperty(value="TransmissionDate")
    public java.util.Date transmissionDate;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="Request")
    public String request;

    @JsonProperty(value="Response")
    public String response;

    @JsonProperty(value="RequestData")
    public String requestData;

    @JsonProperty(value="ResponseData")
    public String responseData;

    @JsonProperty(value="EmployerCore")
    public Link employerCore;

    @JsonProperty(value="PaySchedule")
    public Link paySchedule;

    @JsonProperty(value="PaymentDate")
    public java.util.Date paymentDate;

    @JsonProperty(value="SchemeCeased")
    public java.util.Date schemeCeased;

    @JsonProperty(value="LateReason")
    public FpsLateReason lateReason;














}
