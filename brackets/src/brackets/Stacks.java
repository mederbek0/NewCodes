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
public class Stacks {
private char[] ar;
private int size;
private int top;
public Stacks(int size)
{
    ar = new char[size];
    this.size=size;
    top=-1;
}    
public char pop()
{
    return ar[top--];
}
public void push(char ch)
{
    ar[++top]=ch;
}
public boolean isEmpty()
{
    if (getTop() < 0)
        return true;
    else
        return false;
}
public char peek()
{
    return ar[getTop()];
}

    /**
     * @return the top
     */
    public int getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(int top) {
        this.top = top;
    }
}
