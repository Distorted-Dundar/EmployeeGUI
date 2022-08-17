package EmployeeGUI;

/**
 * @author Brian Flores CS 313 Summer
 */

public class Employee implements Comparable<Employee>{
    private String fName, lName, IDNum;

    protected Employee() { //Consider a situation where someone makes a empty employee perhaps they would like to modify by other means we would use a null employee
        this.fName = "NULL";
        this.lName = "NULL";
        this.IDNum = "NULL";
    }

    protected Employee(String firstname, String lastname, String IDNumber) throws EmployeeException {
    	if(firstname.equals("")  || lastname.equals("") ||
    			IDNumber.equals("")){
    		throw new EmployeeException("Not a valid employee");
    	}
        this.fName = firstname;
        this.lName = lastname;
        this.IDNum = IDNumber;
    }

    public String getFirstName() {
        return this.fName;
    }

    public String getLastName() {
        return this.lName;
    }

    public String getIDNumber() {
        return this.IDNum;
    }

    public void setFirstname(String name) {
        this.fName = name;
    }

    public void setLastname(String name) {
        this.lName = name;
    }

    public void setIDNumber(String number) {
        this.IDNum = number;
    }

    /**
     * compare 2 objects (by using the compareTo interface since they are strings)
     * first check by last name if equal check first name else Return the original comparison by last names
     *
     * @return return < 0 if this(left) is smaller than other
     * return > 0 if this(left) is greater than other
     * return 0  if equal
     */
    public int compareTo(Employee other) {
        if (this.lName.compareTo(other.lName) == 0)
            return this.fName.compareTo(other.fName);

        return this.lName.compareTo(other.lName);
    }

    /**
     * check if this(left) employee has the same ID Number as other(right) Employee
     *
     * @return true if equal false otherwise
     */
    public boolean equals(Employee other) {
        if (this.IDNum.equals(other.IDNum)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return  "["+fName + " " + lName + " " + IDNum+"]";
    }
    public String toStringTxtFile() {
        return  fName + " " + lName + " " + IDNum;
    }
}
