package Command;

public class CommandMain {
    public static void main(String[] args) {
        Computer computer = new Computer();

        ComputerOnCommand computerOnCmd = new ComputerOnCommand(computer);
        ComputerOffCommand computerOffCmd = new ComputerOffCommand(computer);

        Button btn = new Button(computerOnCmd);
        btn.pressButton();
        btn.setCommand(computerOffCmd);
        btn.pressButton();
    }
}
