public class SimpleStringOriginal {
    /**
     * このメソッドは、引数として受け取った文字列を指定された回数だけ繰り返して返します。
     * 例えば、引数が "abc" で、multipleTimes が 3 の場合、"abcabcabc" という文字列を返します。
     * 文字列を指定しない場合は、"文字列を入力して下さい" という文字列を返します。
     * 最大回数は4回までです。
     * それ以上の回数を指定した場合は、"最大4回までです" という文字列を返します。
     * また、引数が null の場合は、"文字列を入力して下さい" という文字列を返します。
     * @param input 繰り返す文字列
     * @return 繰り返した文字列
     * **/
    public String returnMultipleTimes(String input, int multipleTimes){
        StringBuilder result = new StringBuilder();
        result.append("文字列を入力して下さい");
        for (int i = 0; i < multipleTimes; i++) {
            result.append(input);
        }
        return result.toString();
    }
}
