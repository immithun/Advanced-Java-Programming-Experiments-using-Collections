import java.util.*;
class Main{
    
    public static String[] minimumsumindex(String[] list1, String[] list2) {
        int k = Integer.MAX_VALUE;
        List<String> a = new ArrayList<String>();
        List<Integer> b = new ArrayList<Integer>();
        List<String> result = new ArrayList<String>();
        for(int i = 0;i<list1.length;i++){
            for(int j = 0;j<list2.length;j++){
                String m = list1[i];
                String n = list2[j];
                if(m.equals(n)){
                    if(i+j<=k){
                        k=i+j;
                        a.add(m);
                        b.add(k);
                    }
                }
                }
            }
        for(int i = 0;i<b.size();i++){
            if(b.get(i)==k){
                result.add(a.get(i));
            }
        }
    return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings for list1: ");
        String[] list1 = sc.nextLine().split(" ");
        System.out.println("Enter Strings for list2: ");
        String[] list2 = sc.nextLine().split(" ");
        String[] list3 = minimumsumindex(list1,list2);
        List<String> list4 = Arrays.asList(list3);
        System.out.println(list4);
        
    }
}
