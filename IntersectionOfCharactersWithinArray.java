
public class IntersectionOfCharactersWithinArray {
    
    public  static char[] intersectionCharacters(String[]arr){
        char[]array;
        StringBuilder temp=new StringBuilder(arr[0]);
        for(int i=1; arr.length>i; i++){
            for(int j=0; temp.length()>j; j++){
                if(!arr[i].contains(temp.charAt(j)+"")){
                    temp.deleteCharAt(j);
                }
            }
        }
        int size=temp.length();
        array=new char[size];
        for(int i=0; temp.length()>i; i++){
            array[i]=temp.charAt(i);
        }
        return array;
    } 
    
    
    public static void main(String[]args){
        String[]arr={"hello","vell0","deod","metro"};
        char[]array=intersectionCharacters(arr);
        System.out.println("Intersection characters within are--->");
        for(char c:array){
            System.out.print(c+" ");
        }    
    }
}
