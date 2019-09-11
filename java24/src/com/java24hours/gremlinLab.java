package com.java24hours;
class gremlinlab
{
    public static void main(String[] args) {
        int numgremlins=Integer.parseInt(args[0]);
        if(numgremlins>0)
        {
            gremlin []gremlins=new gremlin[numgremlins];
            for(int i=0;i<numgremlins;i++)
            {
                gremlins[i]=new gremlin();
            }
            System.out.println("there are "+gremlin.getgremlincount()+" gremlins");
            
        }
    }
}