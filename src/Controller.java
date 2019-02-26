import java.util.Scanner;

public class Controller {


    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setValue1(inputValueWithScanner(sc, view.FIRST_VALUE, view.VALUE1, view.WRONG_VALUE));
        model.setValue2(inputValueWithScanner(sc, view.SECOND_VALUE, view.VALUE2, view.WRONG_VALUE));

        view.printMessage(model.twoWordSentence(model.getValue1(), model.getValue2()));

    }

    public String inputValueWithScanner(Scanner sc, String rightWord, String expectedWord, String wrongWord) {
        String inputWord = "";
        view.printMessage(rightWord);

        while (sc.hasNextLine()) {
            inputWord = sc.nextLine();
            if (inputWord.equals(expectedWord)) {
                break;
            } else
                view.printMessage(wrongWord + rightWord);
        }
            return inputWord;
        }

    }




