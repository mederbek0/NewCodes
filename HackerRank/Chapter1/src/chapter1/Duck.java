/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter1;

/**
 *
 * @author mederbekbegmatov
 */
public abstract class Duck {
 quackbehavior quackbehavior;
 flyBehavior flyBehavior;
 public abstract void color();
 public void setQuack(quackbehavior behavior){
     this.quackbehavior = behavior;
 }
 public void setFly(flyBehavior behavior){
     this.flyBehavior=behavior;
 }
}
