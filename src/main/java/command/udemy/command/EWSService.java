package command.udemy.command;

public class EWSService {

    public void addMember(String contact, String contactGroup){
        //contact exchange
        System.out.println("Added "+contact +" to "+contactGroup);
    }
    //Remove member from mailing list
    public void removeMember(String contact, String contactGroup) {
        //contact exchange
        System.out.println("Removed "+contact +" from "+contactGroup);
    }

}
