/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brackets;

/**
 *
 * @author mederbekbegmatov
 */
public class check {
    private String s;
       
    int i=0;
    public check(String input)
    {
        s=input;
    }
   public boolean checking()
   {
       Stacks r= new Stacks(s.length());
       boolean yes=false;
       int i=0;
       while(i<s.length())
       {
           char ch=s.charAt(i);
           char sch='z';
           if (r.getTop()>-1)
              sch=r.peek();
           if((ch=='(')||(ch=='{')||(ch=='['))
           {
               r.push(ch);
           }else if(r.getTop()>-1){
               if(((ch==')')||(ch=='}')||(ch==']'))&&(r.getTop()>-1))
           {
               if (sch=='(' && ch==')')
                   r.pop();
               else if (sch=='{' && ch=='}')
                   r.pop();
               else if (sch=='[' && ch==']')
                   r.pop();
           
                 
           }}
           else
               if(r.getTop()==-1)
                   if((ch==')')||(ch=='}')||(ch==']'))
                       yes=true;
       i++;
    
       }
        if (r.getTop()==-1 && yes==false) 
            return true;
      return false;
       }
}
    

