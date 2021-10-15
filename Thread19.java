
class Sharable
  {
   int data,available=0;

    synchronized void sendData(int n)
      {
           
        try
          {
            while(available==1)
             {
               wait();
             }
               
            data=n;
            available=1;
            System.out.println(Thread.currentThread().getName()+" : "+data);
            Thread.sleep(1000);
            notify();
          }
        catch(InterruptedException e)
          {
             System.out.println(e);
          }
            
       } 
        
     
    synchronized void receiveData()
      {
            
        try
         {
           while(available==0)
             {
                wait();
             }
               
                         
            System.out.println(Thread.currentThread().getName()+" : "+data);
            Thread.sleep(1000);
            available=0;
            notify();
         }
        catch(InterruptedException e)
         {
            System.out.println(e);
         }
      
      }
 }  

class Producer implements Runnable
 {  
   Sharable sh;
   int i;
   Producer(Sharable sh1)
    {
      sh=sh1;
    }
   public void run()
    {  
       for(i=1;i<=5;i++)
         sh.sendData(i);
    }  
 }

class Consumer implements Runnable
 {  
   Sharable sh;
   Consumer(Sharable sh1)
    {
      sh=sh1;
    }
   public void run()
    {  
       while(true)
         sh.receiveData();
    }  
 }

class Thread19
  {
    public static void main(String args[])
      {  
         Sharable sh=new Sharable();
         Consumer c=new Consumer(sh);  
         Producer p=new Producer(sh);
         Thread t1 =new Thread(c,"consumer");  
         Thread t2 =new Thread(p,"producer");  
         
         t1.start();
         t2.start();
	
         System.out.println("Press Control-c to stop");
                    
      }  
  }  
