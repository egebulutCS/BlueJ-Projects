import java.util.ArrayList;
/**
 * Write a description of class asdf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class asdf
{
    public String asdf(String s){
        String str = "";
        ArrayList list = new ArrayList<String>();
        int i = 0;

        for(String w : s.split("\\s",0)){
            list.add(w);
            i++;
        }

        for(int z = list.size()-1; z>=0; z--){
            str += list.get(z);
            if(z!=0){
                str += " ";
            }
        }

        return str;
    }
}
