package tw;

import java.util.List;

import tw.commands.GuessInputCommand;
import tw.controller.CheckInputFormat;
import tw.controller.CountGuessResult;
import tw.controller.GenerateGameAnswer;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
        String output = "";
        String result = "";
        String strCheckInput = "";
        String strCountGuess = "";
        List<Integer> gameAnswer = GenerateGameAnswer.GenerateFourNum();
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            strCheckInput = CheckInputFormat.checkInput(input);
            if("input normal".equals(strCheckInput)) {
                String[] inputs = input.trim().split(" ");
                strCountGuess = CountGuessResult.CountResult(inputs, gameAnswer);     
                result = strCountGuess;
            }else {
                result = strCheckInput;
            }
            output =output + input + " " +result + "\r\n";
            System.out.println(output.substring(0,output.length()-2));
        }
    }
}
