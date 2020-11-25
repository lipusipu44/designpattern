package adapter.objectAdapter;
public class Client {

    public static void main(String[] args) {
        Employee employee=new Employee();
        getEmployeeDetails(employee);
        EmployeeObjectAdapter employeeObjectAdapter=new EmployeeObjectAdapter(employee);
        BusinessCardDesigner businessCardDesigner=new BusinessCardDesigner();
        businessCardDesigner.setCard(employeeObjectAdapter);
        System.out.println(businessCardDesigner.getCard());

    }

    public static void getEmployeeDetails(Employee employee){
        employee.setFullName("Amruta Patra");
        employee.setJobTitle("Lead Qa Engineer");
        employee.setOfficeLocation("Digital Harbor Bangalore");
    }
}
