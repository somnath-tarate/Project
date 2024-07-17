package com.tka.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "class_schedules")
@Data
@NoArgsConstructor
public class ClassSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "subject_id", nullable = false)
	private Long subjectId;

	@Column(name = "classroom_id", nullable = false)
	private Long classroomId;

	@Column(name = "day_of_week", nullable = false)
	private String dayOfWeek;

	@Column(name = "start_time", nullable = false)
	private Time startTime;

	@Column(name = "end_time", nullable = false)
	private Time endTime;

	public Object getSubjectId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSubjectId(Object subjectId2) {
		// TODO Auto-generated method stub
		
	}

	public void setClassroomId(Class<? extends ClassSchedule> class1) {
		// TODO Auto-generated method stub
		
	}

	public Object getDayOfWeek() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDayOfWeek(Object dayOfWeek2) {
		// TODO Auto-generated method stub
		
	}

	public Object getStartTime() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setStartTime(Object startTime2) {
		// TODO Auto-generated method stub
		
	}

	// Constructors, getters, and setters
}
