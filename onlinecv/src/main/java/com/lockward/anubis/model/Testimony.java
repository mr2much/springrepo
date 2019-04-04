package com.lockward.anubis.model;

import java.util.Date;

public class Testimony {
	Long id;
	String posterName;
	String posterProfession;
	Date yearMet;
	Date datePosted;
	String testimonyDescription;

	public Testimony() {
	}

	public Testimony(Long id, String posterName, String posterProfession, Date yearMet, Date datePosted,
			String testimonyDescription) {
		super();
		this.id = id;
		this.posterName = posterName;
		this.posterProfession = posterProfession;
		this.yearMet = yearMet;
		this.datePosted = datePosted;
		this.testimonyDescription = testimonyDescription;
	}

	public Date getDatePosted() {
		return datePosted;
	}

	public Long getId() {
		return id;
	}

	public String getPosterName() {
		return posterName;
	}

	public String getPosterProfession() {
		return posterProfession;
	}

	public String getTestimonyDescription() {
		return testimonyDescription;
	}

	public Date getYearMet() {
		return yearMet;
	}

	public void setDatePosted() {
		this.datePosted = new Date();
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public void setPosterProfession(String posterProfession) {
		this.posterProfession = posterProfession;
	}

	public void setTestimonyDescription(String testimonyDescription) {
		this.testimonyDescription = testimonyDescription;
	}

	public void setYearMet(Date yearMet) {
		this.yearMet = yearMet;
	}

	@Override
	public String toString() {
		return "Testimony [id=" + id + ", posterName=" + posterName + ", posterProfession=" + posterProfession
				+ ", yearMet=" + yearMet + ", datePosted=" + datePosted + ", testimonyDescription="
				+ testimonyDescription + "]";
	}

}
