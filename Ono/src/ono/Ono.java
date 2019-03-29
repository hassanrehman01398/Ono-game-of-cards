/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ono;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Ono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int m=-1,q,o=0,count=-1,count1=-1,ii=0,store=0,extra=0,extra1=0;
         String temp;
         String turn1="";
         char wild;
         String return1="";
                                           //array of cards
         String[] a={"r1","r1","r2","r3","r4","r5","r6","r7","r8","r9","r1","r2","r3","r4","r5","r6","r7","r8","r9","rskip","rdrawtwo","rreverse","rskip","rreverse","rdrawtwo","b1","b1","b2","b3","b4","b5","b6","b7","b8","b9","b1","b2","b3","b4","b5","b6","b7","b8","b9","bskip","bdrawtwo","breverse","bdrawtwo","bskip","breverse","g1","g1","g2","g3","g4","g5","g6","g7","g8","g9","g1","g2","g3","g4","g5","g6","g7","g8","g9","gskip","gdrawtwo","greverse","gskip","greverse","gdrawtwo","y1","y1","y2","y3","y4","y5","y6","y7","y8","y9","y1","y2","y3","y4","y5","y6","y7","y8","y9","yskip","ydrawtwo","yreverse","yskip","ydrawtwo","yreverse","wild","drawfour","wild","drawfour","wild","drawfour","wild","drawfour"};
                                           //array of wild cards
         String[] k={"red","blue","green","yellow"};
String[] user=new String[a.length];
String[] computer=new String[a.length];
        System.out.println("\t\t\t ______ \t\t|\\      |\t\t _______");
        System.out.println("\t\t\t|      |\t\t| \\     |\t\t|       |");
        System.out.println("\t\t\t|      |\t\t|  \\    |\t\t|       |");
        System.out.println("\t\t\t|      |\t\t|   \\   |\t\t|       |");
        System.out.println("\t\t\t|      |\t\t|    \\  |\t\t|       |");
        System.out.println("\t\t\t|______|\t\t|     \\ |\t\t|_______|");
        System.out.println("\t\t\t___________________________________________________________");
        System.out.println("\t\t\t___________________________________________________________");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t _______ \t\t ________ \t\t _______ \t\t ________");
        System.out.println("\t\t|       |\t\t|        |\t\t|       |\t\t|        |");
        System.out.println("\t\t|       |\t\t|        |\t\t|       |\t\t|        |");
        System.out.println("\t\t|       |\t\t|        |\t\t|       |\t\t|        |");
        System.out.println("\t\t|       |\t\t|        |\t\t|       |\t\t|        |");
        System.out.println("\t\t|_______|\t\t|________|\t\t|_______|\t\t|________|");
        System.out.println("\t\t         \t\t _________ \t\t _______ ");
        System.out.println("\t\t         \t\t|    |    |\t\t|       |");
        System.out.println("\t\t         \t\t|____|____|\t\t|       |");
        System.out.println("\t\t         \t\t|    |    |\t\t|       |");
        System.out.println("\t\t         \t\t|____|____|\t\t|_______|");
       
       ii=14;
        for(int c=0;c<a.length;c++)
        {int d=rd.nextInt(a.length-1);
        temp=a[c];
        a[c]=a[d];
        a[d]=temp;}
int tr=rd.nextInt(1);
                                                                //who will get cards first
        if(tr==0)
            
        {
            System.out.println("User will get Cards First\n");
            System.out.println("\t\tUser gets 7 cards");
            for(int c=0;c<7;c++)
           {
               user[c]=a[c];
               count++;
       //    System.out.println("\t\t\t"+user[c]);
                     }
            System.out.println("\t\tComputers gets 7 cards\n");
            for(int c=7,j=0;c<14&&j<7;c++,j++)
            {
                computer[j]=a[c];
                count1++;
                System.out.println("\t\t\t"+computer[j]);
//           System.out.println(a[c]);
                            }
                                    }
         if(tr==1)
        {
                    System.out.println("Computer will ge first card\n");
                    System.out.println("\t\tComputers gets 7 cards");
       
                     for(int c=0;c<7;c++)
            {
                       computer[c]=a[c];
                       count1++;
                       System.out.println("\t\t\t"+computer[c]);}
        //System.out.println("The User gets 7 cards");
       
                    for(int c=7,j=0;c<14&&j<7;c++,j++)
                     
                    {
                            user[j]=computer[c];
                            count++;
                            System.out.println("\t\t\t"+a[j]);}
        
                                                
                     }
                            else if(tr!=0&&tr!=1)
                                         {
                                          System.out.println("Plz Enter correct number");
          
           
                                              }
                                 tr=rd.nextInt(1);
         
                                  count++;
                                  count1++;
        
                                if(tr==0)
                                        {
            
                                             System.out.println("User Get First Turn");
            
            
                                                   for(;;)
            
                                                        {
             
                                                             for(int i=0;i<count;i++)
                                                                           {
                                                                                 if(i==0)   
                                                                                        {
                                                                                            System.out.println("\t\t\t      User cards are\n");
                                                                                                for(int n=0;n<count;n++)
                                                                                                            {
         
         
                                                                                                                System.out.println("\t\t\t\t\t"+user[n]);}
                                                                                                                System.out.println("User has turn");   
                                                                                                                        turn1=sc.next();
                                                                                                                                 }
        
//        store=0;
                                                                                                                         o=0;
                                                                                                                         m=0;
                                                                                                                         extra1=0;

                                                                                                    if(turn1.equals(user[i]))
                                                                                                       { 

                                                                                                          if(extra==0)
                                                                                                            {  

                                                                                                                if(turn1.equals("rskip")||turn1.equals("rreverse")||turn1.equals("bskip")||turn1.equals("breverse")||turn1.equals("yskip")||turn1.equals("yreverse")||turn1.equals("gskip")||turn1.equals("greverse"))
                                                                                                                   {

                                                                                                                        extra++;
                                                                                                                        user[i]="00";
                                                                                                                        o++;
                                                                                                                        i=-1;
                                                                                                                        return1=turn1;

                                                                                                                        continue;
                                                                                                                     } 
                                                                                                           else if(turn1.equals("rdrawtwo")||turn1.equals("bdrawtwo")||turn1.equals("gdrawtwo")||turn1.equals("ydrawtwo"))
                                                                                                            {

                                                                                                                user[i]="00";
                                                                                                                o++;
                                                                                                                extra++;
                                                                                                                System.out.println("\t\t\tComputer picked 2 cards");
                                                                                                                   for(int c=ii;c<ii+2;c++)
                                                                                                                   {
                                                                                                                         computer[count1]=a[c];
                                                                                                                         count1++;
                                                                                                                   }
                                                                                                                ii=ii+2;
                                                                                                                break;

                                                                                                            }
                                                                                                            else if(turn1.equals("drawfour"))
                                                                                                             {
                                                                                                                user[i]="00";
                                                                                                                extra++;
                                                                                                                o++;
                                                                                                                System.out.println("\t\t\tComputer picked 4 cards");
                                                                                                                    for(int c=ii;c<ii+4;c++)
                                                                                                                          {
                                                                                                                            computer[count1]=a[c];
                                                                                                                            count1++;
                                                                                                                          }
                                                                                                                ii=ii+4;
                                                                                                                System.out.println("User want to change colour(red,green,blue AND yellow)");
                                                                                                                turn1=sc.next();

                                                                                                                return1=turn1;

                                                                                                                System.out.println("Now the colour is changed to = "+turn1);
                                                                                                                break;
                                                                                                              }



                                                                                                            else if(turn1.equals("wild"))
                                                                                                              {

                                                                                                                o++;
                                                                                                                user[i]="00";
                                                                                                                extra++;
                                                                                                                System.out.println("User want to change colour Press red,green,blue AND yellow");
                                                                                                                turn1=sc.next();
                                                                                                                break;

                                                                                                              }
                                                                                                            else 
                                                                                                               {
                                                                                                                    user[i]="00";
                                                                                                                    extra++;
                                                                                                                    o++;
                                                                                                                    break;
                                                                                                              }

                                                                                                            }

                                                                                        //        for(int y=0;y<count;y++)
                                                                                        //        {if(user[y].equals("00"))
                                                                                        //        {m++;}}
                                                                                        //        
                                                                                        //       if(m==count)
                                                                                        //       {System.out.println("\t\tUSER WINS");
                                                                                        //       break;}
                                                                                                    else
                                                                                                       {

                                                                                                   if(turn1.charAt(1)=='s')
                                                                                                        {   

                                                                                                      if((turn1.charAt(0)==return1.charAt(0)||(turn1.charAt(1)==return1.charAt(1))))
                                                                                                          {

                                                                                                            user[i]="00";
                                                                                                            o++;
                                                                                                            i=-1;
                                                                                                            return1=turn1;
                                                                                                            continue;
                                                                                                           }

                                                                                                        }
                                                                                                   else if(turn1.equals("drawfour"))
                                                                                                       {
                                                                                                    user[i]="00";
                                                                                                    o++;
                                                                                                 System.out.println("\t\t\tComputer picked 4 cards");
                                                                                                    for(int c=ii;c<ii+4;c++)
                                                                                                {
                                                                                                    computer[count1]=a[c];
                                                                                                count1++;
                                                                                                    }
                                                                                                    ii=ii+4;
                                                                                                    System.out.println("User want to change colour(red,green,blue AND yellow)");
                                                                                                turn1=sc.next();

                                                                                                return1=turn1;

                                                                                                      System.out.println("Now the colour is changed to = "+turn1);


                                                                                                    break;
                                                                                                }
                                                                                               else if(turn1.charAt(1)=='r')
                                                                                               {

                                                                                                   if(turn1.charAt(0)==return1.charAt(0)||turn1.charAt(1)==return1.charAt(1))
                                                                                               {

                                                                                                   user[i]="00";
                                                                                                   o++;
                                                                                             i=-1;
                                                                                             return1=turn1;
                                                                                                   continue;


                                                                                                 }
                                                                                                    }
                                                                                               else if(turn1.charAt(1)=='d')
                                                                                               {

                                                                                                   if((turn1.charAt(0)==return1.charAt(0)||(turn1.charAt(1)==return1.charAt(1))))
                                                                                                {

                                                                                                    user[i]="00";
                                                                                                    o++;
                                                                                                    System.out.println("\t\t\tComputer picked 2 cards");
                                                                                                    for(int c=ii;c<ii+2;c++)
                                                                                                {
                                                                                                    computer[count1]=a[c];
                                                                                                count1++;

                                                                                                   }
                                                                                                ii=ii+2;

                                                                                                }
                                                                                               break;
                                                                                                 }



                                                                                                else if(turn1.equals("wild"))
                                                                                                {

                                                                                                    user[i]="00";
                                                                                                    o++;
                                                                                                    System.out.println("User want to change colour(red,green,blue AND yellow)");
                                                                                                turn1=sc.next();
                                                                                                break;
                                                                                                }
                                                                                                else if(turn1.charAt(0)==return1.charAt(0))
                                                                                        {


                                                                                            o++;
                                                                                        user[i]="00";

                                                                                        break;
                                                                                        }
                                                                                        else if(turn1.charAt(1)==return1.charAt(1))
                                                                                                {

                                                                                                    o++;
                                                                                                user[i]="00";

                                                                                                break;
                                                                                                }





                                                                                               }


                                                                                             }
                                                                                                      else if(turn1.equals("No card")||turn1.equals("nocard")||turn1.equals("no card"))
                                                                                        {o++;

                                                                                        turn1=return1;
                                                                                            System.out.println("User pick one card from deck");
                                                                                            for(int c=ii;c<=ii;c++)
                                                                                                {
                                                                                                    user[count]=a[c];
                                                                                                count++;

                                                                                                   }
                                                                                                ii=ii+1;
                                                                                                break;
                                                                                                }
                                                                                                     }
                                                                                                         for(int y=0;y<count;y++)
                                                                                                {

                                                                                                    if(user[y].equals("00"))
                                                                                                {
                                                                                                    m++;

                                                                                                    }

                                                                                                        }
                                                                                               if(m==count)
                                                                                               {
                                                                                                   System.out.println("\t\tUSER WINS");
                                                                                                   break;


                                                                                                           }

                                                                                                     if(o==0)
                                                                                        {

                                                                                            System.out.println("Plz Enter correct option");
                                                                                        continue;

                                                                                            }



                                                                                        //computer turn
                                                                                        for(int c=0;c<count1;c++)
                                                                                        {

                                                                                             m=0;
                                                                                            if(computer[c].charAt(1)=='s')
                                                                                            {

                                                                                                if((turn1.charAt(0)==computer[c].charAt(0)||turn1.charAt(1)==computer[c].charAt(1)))
                                                                                        {
                                                                                            System.out.println("Computer drop = "+computer[c]);
                                                                                        turn1=computer[c];
                                                                                        return1=computer[c];

                                                                                            computer[c]="00";
                                                                                        store=c;


                                                                                        continue;


                                                                                        }

                                                                                            }
                                                                                            else if(computer[c].charAt(1)=='r')
                                                                                            {

                                                                                                if((turn1.charAt(0)==computer[c].charAt(0)||turn1.charAt(1)==computer[c].charAt(1)))
                                                                                        {

                                                                                            System.out.println("Computer drop = "+computer[c]);
                                                                                            turn1=computer[c];

                                                                                        return1=computer[c];
                                                                                            computer[c]="00";
                                                                                        store=c;
                                                                                        continue;



                                                                                           }

                                                                                            }
                                                                                            else if(computer[c].charAt(1)=='d')
                                                                                            {

                                                                                                if((turn1.charAt(0)==computer[c].charAt(0)||turn1.charAt(1)==computer[c].charAt(1)))
                                                                                        {

                                                                                            extra1++;

                                                                                        return1=computer[c];
                                                                                            System.out.println("Computer drop = "+computer[c]);
                                                                                            computer[c]="00";
                                                                                        store=c;

                                                                                        for(int p=ii;p<ii+2;p++)
                                                                                        {
                                                                                            user[count]=a[p];
                                                                                            count++;
                                                                                           }
                                                                                         System.out.println("\t\t\tUser picked 2 cards");
                                                                                        ii=ii+2;
                                                                                        break;

                                                                                        }
                                                                                             }

                                                                                        else if(turn1.charAt(0)==computer[c].charAt(0))
                                                                                        {

                                                                                            extra1++;

                                                                                        return1=computer[c];
                                                                                            System.out.println("Computer drop = "+computer[c]);
                                                                                            computer[c]="00";
                                                                                        store=c;
                                                                                        break;
                                                                                          }
                                                                                        else if(turn1.charAt(1)==computer[c].charAt(1))
                                                                                                {

                                                                                                    extra1++;

                                                                                        return1=computer[c];
                                                                                                    System.out.println("Computer drop = "+computer[c]);
                                                                                                    computer[c]="00";
                                                                                           store=c;    
                                                                                                break;


                                                                                                }
                                                                                        else if(computer[c].equals("wild"))
                                                                                                {

                                                                                                    extra1++;

                                                                                        return1=computer[c];


                                                                                                    System.out.println("Computer drop = "+computer[c]);
                                                                                                    computer[c]="00";
                                                                                                    System.out.println("");
                                                                                                c=rd.nextInt(k.length-1);
                                                                                                return1=k[c];
                                                                                                store=c;
                                                                                                      System.out.println("Now the colour is changed to = "+k[c]);

                                                                                                    break;
                                                                                                }
                                                                                        else if(computer[c].equals("drawfour"))
                                                                                        {
                                                                                            extra1++;

                                                                                        return1=computer[c];
                                                                                            store=c;
                                                                                            System.out.println("Computer drop = "+computer[c]);
                                                                                            computer[c]="00";
                                                                                            System.out.println("\t\t\tUser is pickeing 4 cards");
                                                                                            for(int h=ii;h<ii+4;h++)
                                                                                        {
                                                                                            user[count]=a[h];
                                                                                        count++;

                                                                                               }
                                                                                             c=rd.nextInt(k.length-1);
                                                                                                return1=k[c];
                                                                                                store=c;
                                                                                                      System.out.println("Now the colour is changed to = "+k[c]);

                                                                                        ii=ii+4;

                                                                                        break;
                                                                                        }
                                                                                        //else
                                                                                        //{
                                                                                        //    computer[count1]=a[ii];
                                                                                        //}
                                                                                        for(int y=0;y<count1;y++)
                                                                                                {

                                                                                                    if(computer[y].equals("00"))
                                                                                                {
                                                                                                    m++;
                                                                                                     }
                                                                                                           }

                                                                                               if(m==count1)
                                                                                               {
                                                                                                   System.out.println("\t\tUSER WINS");
                                                                                                   break;

                                                                                                       }




                                                                                        }
                                                                                            if(extra1==0)
                                                                                        {

                                                                                            for(int c=ii;c<=ii;c++)
                                                                                                {

                                                                                                    System.out.println("Computer picked one card from deck");
                                                                                                    computer[count1]=a[c];

                                                                                                            }
                                                                                                count1++;
                                                                                                return1=turn1;
                                                                                                ii++;
                                                                                                                    }

                                                                                        }

                                                                                                }

                                                                                                                     }


                                                                                                        }       


        
         
        
        

       
       
//        System.out.println(a.length);
   
    
//}
