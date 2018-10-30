public class TodoPrint {
    public static void main(String [] args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String lead = "My todo:\n";
        String todoText2 = " - Download games \n";
        String todoText3 = "\t - Diablo/n";

        todoText = lead.concat(todoText= todoText.concat(todoText2=todoText2.concat(todoText3)));

        System.out.println(todoText);
    }
}
