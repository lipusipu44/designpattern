package command.udemy.client;

import command.udemy.command.AddMemberCommand;
import command.udemy.command.Command;
import command.udemy.command.EWSService;

public class Client {
    public static void main(String[] args) {
        EWSService ewsService=new EWSService();
        Command command1=new AddMemberCommand("anil.patro@gmail.com","adminList",ewsService);
        MailTasksRunner.getInstance().addCommand(command1);

        Command command2=new AddMemberCommand("amruta.patra@gmail.com","adminList",ewsService);
        MailTasksRunner.getInstance().addCommand(command2);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MailTasksRunner.getInstance().shutdown();
    }
}
