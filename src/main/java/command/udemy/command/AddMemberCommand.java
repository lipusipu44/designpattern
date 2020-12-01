package command.udemy.command;

public class AddMemberCommand implements Command{

    private String emailAddress;
    private String listName;
    private EWSService ewsService;

    public AddMemberCommand(String emailAddress, String listName, EWSService ewsService) {
        this.emailAddress = emailAddress;
        this.listName = listName;
        this.ewsService = ewsService;
    }


    @Override
    public void execute() {
            ewsService.addMember(emailAddress,listName);
    }
}
