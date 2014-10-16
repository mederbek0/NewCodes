/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seperatechaining;

/**
 *
 * @author mederbekbegmatov
 */
public class List {
  
  Link first;  
  private int size;
  //constructor
  public List()
  {
      this.first=null;
  }
  //Insert
  public void add(int i)
  {
      //System.out.println("a");
      Link current=first;
      Link previous;
      boolean yes=false;
      Link temp= new Link(i);
      if (first==null){
          first=temp;
      }else if (first.getData()<=i)
      {
          temp.setNext(first);
          first=temp;
      }
      else 
      {while(current.getData()<i && current.getNext()!=null)
          {
              previous=current;
              current=current.getNext();
              if (current.getData()>i)
              {
                  temp.setNext(current);
                  previous.setNext(temp);
                  if (current.getNext()==null)
                      yes=true;
              }    
          }
        if(!yes)current.setNext(temp);
      }     
  }//end of add function
  public void delete(int i)
  {
      Link current=first,previous=null;
      boolean yes=false;
     if(first.getData()==i)
     {
         if (first.getNext()!=null)
            first=first.getNext();
         else
             first=null;
         
     }
     else
     {
        while (current.getNext()!=null && current.getData()!=i)
        {
            previous=current;
            current=current.getNext();
         if (current.getData()==i)
         {
             previous.setNext(current.getNext());
             yes=true;
         }
        }
        if (!yes)
            System.out.println("Not found");
          
     }
  }//end of delete function
  public void print()
  {
      Link current=this.first;
      while(current!=null){
            System.out.print(current.getData()+" ");
            current=current.getNext();
      }
      System.out.println();
  }

    
}
