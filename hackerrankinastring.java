    public static String hackerrankInString(String s) {
    // Write your code here
       String target = "hackerrank";
        int j = 0;

        
        for (int i = 0; i < s.length(); i++) {
          
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            
           
            if (j == target.length()) {
                return "YES";
            }
        }

        return "NO";
    }
}
