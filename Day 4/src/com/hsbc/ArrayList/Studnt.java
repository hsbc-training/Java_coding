package com.hsbc.ArrayList;

import java.util.Comparator;

public class Studnt {
	private String Studntname;
	private int rollno;
	private int Studntage;

	public Studnt(int rollno, String Studntname, int Studntage) {
		this.rollno = rollno;
		this.Studntname = Studntname;
		this.Studntage = Studntage;
	}

	public String getStudntname() {
		return Studntname;
	}

	public void setStudntname(String Studntname) {
		this.Studntname = Studntname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudntage() {
		return Studntage;
	}

	public void setStudntage(int Studntage) {
		this.Studntage = Studntage;
	}

	/* Comparator for sorting the list by Studnt Name */
	public static Comparator<Studnt> StuNameComparator = new Comparator<Studnt>() {

		public int compare(Studnt s1, Studnt s2) {
			String StudntName1 = s1.getStudntname().toUpperCase();
			String StudntName2 = s2.getStudntname().toUpperCase();

			// ascending order
			return StudntName1.compareTo(StudntName2);

			// descending order
			// return StudntName2.compareTo(StudntName1);
		}
	};

	/* Comparator for sorting the list by roll no */
	public static Comparator<Studnt> StuRollno = new Comparator<Studnt>() {

		public int compare(Studnt s1, Studnt s2) {

			int rollno1 = s1.getRollno();
			int rollno2 = s2.getRollno();

			/* For ascending order */
			return rollno1 - rollno2;

			/* For descending order */
			// rollno2-rollno1;
		}
	};

	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + Studntname + ", age=" + Studntage + "]";
	}

}
