import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class DataStructures {

   
    static String type;
    static String[] fruits;
    static Integer[][] chess;
    static List<String> vegetables; 
    static HashMap<String,String> info;
    static TreeSet<Integer> numbers;

    public DataStructures(String[] fruits){
        fruits[0]="apple";
        DataStructures.fruits = new String[5];
        DataStructures.fruits = fruits;
    }

    public DataStructures(Integer[][] chess){
        DataStructures.chess = new Integer[8][8];
        chess[0][0]= 0;
        chess[1][0]= 1;
        chess[2][0]= 0;
        chess[3][0]= 1;
        chess[4][0]= 0;
        chess[5][0]= 1;
        chess[6][0]= 0;
        chess[7][0]= 1;

        chess[0][1]= 1;
        chess[1][1]= 0;
        chess[2][1]= 1;
        chess[3][1]= 0;
        chess[4][1]= 1;
        chess[5][1]= 0;
        chess[6][1]= 1;
        chess[7][1]= 0;
        
        chess[0][2]= 0;
        chess[1][2]= 1;
        chess[2][2]= 0;
        chess[3][2]= 1;
        chess[4][2]= 0;
        chess[5][2]= 1;
        chess[6][2]= 0;
        chess[7][2]= 1;

        chess[0][3]= 1;
        chess[1][3]= 0;
        chess[2][3]= 1;
        chess[3][3]= 0;
        chess[4][3]= 1;
        chess[5][3]= 0;
        chess[6][3]= 1;
        chess[7][3]= 0;

        chess[0][4]= 0;
        chess[1][4]= 1;
        chess[2][4]= 0;
        chess[3][4]= 1;
        chess[4][4]= 0;
        chess[5][4]= 1;
        chess[6][4]= 0;
        chess[7][4]= 1;

        chess[0][5]= 1;
        chess[1][5]= 0;
        chess[2][5]= 1;
        chess[3][5]= 0;
        chess[4][5]= 1;
        chess[5][5]= 0;
        chess[6][5]= 1;
        chess[7][5]= 0;

        chess[0][6]= 0;
        chess[1][6]= 1;
        chess[2][6]= 0;
        chess[3][6]= 1;
        chess[4][6]= 0;
        chess[5][6]= 1;
        chess[6][6]= 0;
        chess[7][6]= 1;

        chess[0][7]= 1;
        chess[1][7]= 0;
        chess[2][7]= 1;
        chess[3][7]= 0;
        chess[4][7]= 1;
        chess[5][7]= 0;
        chess[6][7]= 1;
        chess[7][7]= 0;

        
        DataStructures.chess = chess;
    }

    public DataStructures(List<String> vegetables){
        DataStructures.vegetables = new ArrayList<String>();
        vegetables.add("carrot");
        vegetables.add("broccoli");
        vegetables.add("tomato");
        DataStructures.vegetables = vegetables;
    }
    public DataStructures(HashMap<String,String> numbers){
        DataStructures.info = new HashMap<String,String>();
        numbers.put("firstName", "Sandra");
        numbers.put("LastName", "Gonzalez");
        numbers.put("YearOfBirth", "1997");
        numbers.put("MonthOfBirth", "April");
        numbers.put("DayOfBirth", "9");
        DataStructures.info = numbers;
    }

    public DataStructures(TreeSet<Integer> numbers){
        DataStructures.numbers = new TreeSet<Integer>();
        Integer[] numberArray = {3,7,2,8,5,9,1,0,2};
        numbers.addAll(Arrays.asList(numberArray));
        DataStructures.numbers = numbers;
    }

    public void print(){
        
        if (DataStructures.type != null){
            System.out.println(DataStructures.type);
        }else if(DataStructures.fruits != null){
            for (int i = 0; i < DataStructures.fruits.length; i++) {
                System.out.println(DataStructures.fruits[i]);
            }
        }else if(DataStructures.chess != null){
            for (int i = 0; i < DataStructures.chess.length; i++) {
                System.out.println("");
                for (int j = 0; j < chess.length; j++) {
                    if (DataStructures.chess[i][j]==0) {
                        System.out.print("[ ]"); 
                    } else {
                        System.out.print("[#]"); 
                    }
                }
            }
        }else if(DataStructures.vegetables != null){
            for (int i = 0; i < DataStructures.vegetables.size(); i++) {
                System.out.println(DataStructures.vegetables.get(i));
            }
        }else if(DataStructures.info != null){
            System.out.println("My name is "+DataStructures.info.get("firstName")+" "
                                            +DataStructures.info.get("LastName"));
            System.out.println("I was born in "+DataStructures.info.get("YearOfBirth")
                                           +"-"+DataStructures.info.get("MonthOfBirth")
                                           +"-"+DataStructures.info.get("DayOfBirth"));
            
        }else if(DataStructures.numbers != null){
            DataStructures.numbers.forEach(number ->{
                System.out.println(number);
            });
        }

    }

}
