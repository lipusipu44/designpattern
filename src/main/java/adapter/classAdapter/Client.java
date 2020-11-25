package adapter.classAdapter;

public class Client {

    public static void main(String[] args) {
        EmployeeClassAdapter employeeClassAdapter=new EmployeeClassAdapter();
        getEmployeeDetails(employeeClassAdapter);
        BusinessCardDesigner businessCardDesigner=new BusinessCardDesigner();
        businessCardDesigner.setCard(employeeClassAdapter);
        System.out.println(businessCardDesigner.getCard());


    }

    public static Employee getEmployeeDetails(Employee employee){
        employee.setFullName("Anil Kumar Patro");
        employee.setJobTitle("Principal Engineer");
        employee.setOfficeLocation("BigBasket Bangalore");

        return employee;
    }
}
