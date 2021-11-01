class Solution 
{
    public String row1 = "qwertyuiop";
    public String row2 = "asdfghjkl";
    public String row3 = "zxcvbnm";

    public int find_rowID(char cc)
    {
        char c = Character.toLowerCase(cc);
        if (row1.contains("" + c) == true){
            return 1;
        }
        else if (row2.contains("" + c) == true){
            return 2;
        }
        else{
            return 3;
        }
    }

    public String[] findWords(String[] words) 
    {
        List<String> tmp_res = new ArrayList<>();
        for (String word : words)
        {
            int a = find_rowID(word.charAt(0));
            boolean ok = true;
            for (int i = 1; i < word.length(); i ++)
            {
                if (a != find_rowID(word.charAt(i)))
                {
                    ok = false;
                    break;
                }
            }
            if (ok == true)
            {
                tmp_res.add(word);
            }
        }

        int rn = tmp_res.size();
        String [] res = new String [rn];
        for (int i = 0; i < rn ; i ++)
        {
            res[i] = tmp_res.get(i);
        }
        return res;
    }
}
