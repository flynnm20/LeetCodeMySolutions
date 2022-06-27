public class main {
    public static void main(String[] args) {
        String egg = "abc";
        String add ="ahbgdc";
        if(isSubsequence(egg, add)){
            System.out.println("True");
        }
    }

    public static boolean isSubsequence(String s, String t) {
        StringBuilder sStringbuilder= new StringBuilder();
        int j = 0; char nextChar; boolean found;
        for(int i = 0; i < s.length(); i++){
            nextChar = s.charAt(i);
            found = false;
            while(j < t.length() && !found){
                if(t.charAt(j) == nextChar){
                    sStringbuilder.append(nextChar);
                    found = true;
                }
                j++;
            }
        }
        System.out.println(sStringbuilder);
        return sStringbuilder.toString().equals(s);
    }
}
