package com.insurance.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Claim
{

	//身份证号
	private String insuredId;

	//被保人姓名
	private String insuredName;

	//被保人电话
	private String insuredTel;

	//理赔类型
	private String claimType;

	//疾病代码
	private String icdCode;

	//就诊日
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date incidentDate;

	//入院日
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date admissionDate;

	//出院日
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dischargeDate;

	//医院代码
	private Integer hospitalNo;

	//手术代码
	private String surgicalCode;

	//手术日
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date surgicalDate;

	//与被保人关系
	private String relationship;

	//索保人证件号
	private String claimantId;

	//索保人姓名
	private String claimantName;

	//索保人电话
	private String claimantTel;

	public String getInsuredName()
	{
		return insuredName;
	}

	public void setInsuredName(String insuredName)
	{
		this.insuredName = insuredName;
	}

	public String getClaimType()
	{
		return claimType;
	}

	public void setClaimType(String claimType)
	{
		this.claimType = claimType;
	}

	public String getIcdCode()
	{
		return icdCode;
	}

	public void setIcdCode(String icdCode)
	{
		this.icdCode = icdCode;
	}

	public Date getIncidentDate()
	{
		return incidentDate;
	}

	public void setIncidentDate(Date incidentDate)
	{
		this.incidentDate = incidentDate;
	}

	public Date getAdmissionDate()
	{
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate)
	{
		this.admissionDate = admissionDate;
	}

	public Date getDischargeDate()
	{
		return dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate)
	{
		this.dischargeDate = dischargeDate;
	}

	public Integer getHospitalNo()
	{
		return hospitalNo;
	}

	public void setHospitalNo(Integer hospitalNo)
	{
		this.hospitalNo = hospitalNo;
	}

	public String getSurgicalCode()
	{
		return surgicalCode;
	}

	public void setSurgicalCode(String surgicalCode)
	{
		this.surgicalCode = surgicalCode;
	}

	public Date getSurgicalDate()
	{
		return surgicalDate;
	}

	public void setSurgicalDate(Date surgicalDate)
	{
		this.surgicalDate = surgicalDate;
	}

	public String getRelationship()
	{
		return relationship;
	}

	public void setRelationship(String relationship)
	{
		this.relationship = relationship;
	}

	public String getClaimantName()
	{
		return claimantName;
	}

	public void setClaimantName(String claimantName)
	{
		this.claimantName = claimantName;
	}

	public String getInsuredId()
	{
		return insuredId;
	}

	public void setInsuredId(String insuredId)
	{
		this.insuredId = insuredId;
	}

	public String getInsuredTel()
	{
		return insuredTel;
	}

	public void setInsuredTel(String insuredTel)
	{
		this.insuredTel = insuredTel;
	}

	public String getClaimantId()
	{
		return claimantId;
	}

	public void setClaimantId(String claimantId)
	{
		this.claimantId = claimantId;
	}

	public String getClaimantTel()
	{
		return claimantTel;
	}

	public void setClaimantTel(String claimantTel)
	{
		this.claimantTel = claimantTel;
	}

	@Override
	public String toString()
	{
		return "Claim{" + "insuredId='" + insuredId + '\'' + ", insuredName=" + insuredName + ", insuredTel='" + insuredTel + '\'' + ", claimType='" + claimType + '\'' + ", icdCode='" + icdCode + '\''
				+ ", incidentDate='" + incidentDate + '\'' + ", admissionDate='" + admissionDate + '\'' + ", dischargeDate='" + dischargeDate + '\'' + ", hospitalNo='" + hospitalNo + '\''
				+ ", surgicalCode='" + surgicalCode + '\'' + ", surgicalDate='" + surgicalDate + '\'' + ", relationship='" + relationship + '\'' + ", claimantId='" + claimantId + '\''
				+ ", claimantName='" + claimantName + '\'' + ", claimantTel='" + claimantTel + '\'' + '}';
	}
}
