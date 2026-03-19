// https://leetcode.com/problems/remove-outermost-parentheses
public class RemoveParenthesis { 
    public String removeOuterParentheses(String s) {
       StringBuilder st = new StringBuilder();
        int level = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                if(level > 0)
                {
                    st.append(ch);
                }        
                level++;
            } 
            
            else
            {
                level--;
                if(level > 0) st.append(ch);
            }
        }
        return st.toString(); 
    }
}

class Main{

    public static void main(String[] args) {
        RemoveParenthesis remove = new RemoveParenthesis();

        String s = "((()))";
        String ans = remove.removeOuterParentheses(s);
        System.out.println(ans);
    }
}
