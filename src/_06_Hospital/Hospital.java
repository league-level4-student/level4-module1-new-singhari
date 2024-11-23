package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctorList;
	ArrayList<Patient> patientList;

	public Hospital() {
		// TODO Auto-generated constructor stub
		doctorList = new ArrayList<Doctor>();
		patientList = new ArrayList<Patient>();
	}
	
	public void addDoctor(Doctor d) {
		doctorList.add(d);
	}
	public ArrayList<Doctor> getDoctors(){
		return doctorList;
	}
	public void addPatient(Patient p) {
		patientList.add(p);
	}
	public ArrayList<Patient> getPatients(){
		return patientList;
	}

}
