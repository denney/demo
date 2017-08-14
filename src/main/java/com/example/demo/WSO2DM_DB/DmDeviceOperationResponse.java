package com.example.demo.WSO2DM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_DEVICE_OPERATION_RESPONSE", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmDeviceOperationResponse {
    private int id;
    private int enrolmentId;
    private int operationId;
    private byte[] operationResponse;
    private Timestamp receivedTimestamp;
    private DmEnrolment dmEnrolmentByEnrolmentId;
    private DmOperation dmOperationByOperationId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ENROLMENT_ID")
    public int getEnrolmentId() {
        return enrolmentId;
    }

    public void setEnrolmentId(int enrolmentId) {
        this.enrolmentId = enrolmentId;
    }

    @Basic
    @Column(name = "OPERATION_ID")
    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    @Basic
    @Column(name = "OPERATION_RESPONSE")
    public byte[] getOperationResponse() {
        return operationResponse;
    }

    public void setOperationResponse(byte[] operationResponse) {
        this.operationResponse = operationResponse;
    }

    @Basic
    @Column(name = "RECEIVED_TIMESTAMP")
    public Timestamp getReceivedTimestamp() {
        return receivedTimestamp;
    }

    public void setReceivedTimestamp(Timestamp receivedTimestamp) {
        this.receivedTimestamp = receivedTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmDeviceOperationResponse that = (DmDeviceOperationResponse) o;

        if (id != that.id) return false;
        if (enrolmentId != that.enrolmentId) return false;
        if (operationId != that.operationId) return false;
        if (!Arrays.equals(operationResponse, that.operationResponse)) return false;
        if (receivedTimestamp != null ? !receivedTimestamp.equals(that.receivedTimestamp) : that.receivedTimestamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + enrolmentId;
        result = 31 * result + operationId;
        result = 31 * result + Arrays.hashCode(operationResponse);
        result = 31 * result + (receivedTimestamp != null ? receivedTimestamp.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ENROLMENT_ID", referencedColumnName = "ID", nullable = false)
    public DmEnrolment getDmEnrolmentByEnrolmentId() {
        return dmEnrolmentByEnrolmentId;
    }

    public void setDmEnrolmentByEnrolmentId(DmEnrolment dmEnrolmentByEnrolmentId) {
        this.dmEnrolmentByEnrolmentId = dmEnrolmentByEnrolmentId;
    }

    @ManyToOne
    @JoinColumn(name = "OPERATION_ID", referencedColumnName = "ID", nullable = false)
    public DmOperation getDmOperationByOperationId() {
        return dmOperationByOperationId;
    }

    public void setDmOperationByOperationId(DmOperation dmOperationByOperationId) {
        this.dmOperationByOperationId = dmOperationByOperationId;
    }
}
