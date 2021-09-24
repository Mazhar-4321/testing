package com.mazhar.Assignments;

public class ReverseStringWithWords
{
    public static void main(String[] args) {
        String s= "Geekster        is my class room";
        Integer i;
        /*

        SELECT DISTINCT S1.SNAME,B.COLOR FROM (SELECT S.SNAME,R.BID FROM sailors S INNER JOIN reserves R ON S.sid=R.SID AND S.sname='LUBBER') S1
INNER JOIN
BOATS B
ON S1.BID=B.BID


        SELECT S.sname,R.BID FROM sailors S
INNER JOIN reserves R
ON S.sid=R.SID AND R.BID=103

SELECT DISTINCT S2.SID,S2.SNAME,S1.COLOR FROM SAILORS S2
INNER JOIN
(SELECT r.SID,R.BID,B.COLOR FROM RESERVES R
INNER JOIN BOATS B
ON R.BID=B.BID AND B.COLOR='RED') S1
ON S2.SID=S1.SID

SELECT DISTINCT S2.COLOR FROM (SELECT S.SID,S.SNAME,R.BID FROM sailors S
INNER JOIN
RESERVES R
ON R.SID=S.SID AND S.sname='LUBBER') S1
INNER JOIN BOATS S2
ON S1.BID=S2.BID

         */
        //System.out.println(i);
        usingSplitMethod(s);
        System.out.println();
        withoutUsingSplitMethod(s);

    }
    static void usingSplitMethod(String s)
    {
        String s_array[] =s.split(" ");

        int l= s_array.length-1;
        for(int i=0;i<=l;i++)
        {
            System.out.print(s_array[l-i]+" ");
        }
    }
    static  void withoutUsingSplitMethod(String s)
    {
        String temp="";
        String ans="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                temp=s.charAt(i)+temp;
            }
            else
            {
                ans=ans+temp+" ";
                temp="";
            }
        }
        System.out.println(ans+temp);
    }
}
