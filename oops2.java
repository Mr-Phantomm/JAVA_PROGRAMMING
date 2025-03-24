//Develop a Hospital Management System in Java integrating class variables (static), instance variables, methods, this keyword, method overloading, inheritance, super keyword, and method overriding by implementing a 
//Person superclass (with name, age, gender), a Patient subclass (adding patientID, disease, and overriding displayInfo()),
// a Doctor subclass (adding doctorID, specialization, and overriding displayInfo()), 
//using constructor overloading in Patient to allow different ways of registering a patient, and a Hospital class that manages multiple patients and doctors, displays their details, and prints the total count of registered patients and doctors.


public class oops2 {
   public static void main(String[] args) {
    patient arun =new patient(1, "fever");
    Doctor arun2 =new Doctor(1, "ortho");
    arun.displayInfo();
    arun2.displayInfo();
   } 
}
class person{
    String name;
    int age;
    String gender;
    person(){
        this.name="Arun";
        this.age=20;
        this.gender="Male";
    }
    
}

class patient extends person{
    int patientid;
    String disease;
    patient(int patientid,String disease){
        this.patientid=patientid;
        this.disease=disease;
    }
    void displayInfo(){
        System.out.println(this.patientid +" "+ this.disease );
    }
}
class Doctor extends person{
    int doctorid;
    String specialization;
    Doctor(int doctorid,String specialization){
        this.doctorid=doctorid;
        this.specialization=specialization;
    }
    void displayInfo(){
        System.out.println(this.doctorid+" "+this.specialization);
    }
}