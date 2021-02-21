package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName = "FirstName";
    private String lastName = "LastName";
    private String subject = "Subject";
    private int yearsTeaching = 0;

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public String getSubject(){ return subject; }
    public int getYearsTeaching(){ return yearsTeaching; }

    public void setFirstName(String aFirstName) { firstName = aFirstName; }
    public void setLastName(String aLastName) { lastName = aLastName; }
    public void setSubject(String aSubject) { subject = aSubject; }
    public void setYearsTeaching(int aYearsTeaching) { yearsTeaching = aYearsTeaching; }


}
