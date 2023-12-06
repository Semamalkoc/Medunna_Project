package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentPojo implements Serializable {
	private String createdBy;
	private String createdDate;
	private int id;
	private String startDate;
	private String endDate;
	private String status;

	public AppointmentPojo(String createdBy, String createdDate, int id, String startDate, String endDate, String status, String anamnesis, String treatment, String diagnosis, String prescription, String description) {
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.anamnesis = anamnesis;
		this.treatment = treatment;
		this.diagnosis = diagnosis;
		this.prescription = prescription;
		this.description = description;
	}

	public AppointmentPojo() {
	}

	private String anamnesis;
	private String treatment;
	private String diagnosis;
	private String prescription;
	private String description;

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setAnamnesis(String anamnesis){
		this.anamnesis = anamnesis;
	}

	public String getAnamnesis(){
		return anamnesis;
	}

	public void setTreatment(String treatment){
		this.treatment = treatment;
	}

	public String getTreatment(){
		return treatment;
	}

	public void setDiagnosis(String diagnosis){
		this.diagnosis = diagnosis;
	}

	public String getDiagnosis(){
		return diagnosis;
	}

	public void setPrescription(String prescription){
		this.prescription = prescription;
	}

	public String getPrescription(){
		return prescription;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	@Override
 	public String toString(){
		return 
			"AppointmentPojo{" + 
			"createdBy = '" + createdBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",id = '" + id + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",status = '" + status + '\'' + 
			",anamnesis = '" + anamnesis + '\'' + 
			",treatment = '" + treatment + '\'' + 
			",diagnosis = '" + diagnosis + '\'' + 
			",prescription = '" + prescription + '\'' + 
			",description = '" + description + '\'' + 
			"}";
		}
}