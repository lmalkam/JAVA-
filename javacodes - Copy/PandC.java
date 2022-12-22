class Q { 
    int n;
    boolean flag = false;

    synchronized void put( int n) {	
			if(flag) {							      	                      
			   try  wait( );  catch(InterruptedException e);			      
			}							                            					                                      
	                    this.n = n;								                                      
			    System.out.println( "Produce :" + n);			      
													                                      
			    flag = true;							                      
			    notify( );							
		    }

    synchronized int get( ) {		
			if(! flag) {							                          
			  try  wait( );  catch(InterruptedException e);				      
			}							                              
													                                      
			System.out.println( "Consume :" + n);			          												                   
			                                                                              
			flag = false;						                      
			notify( );							                        	
	             return( n );						
		}

    class Producer implement Runnable
    {	
			 Q  q;

        Producer(Q q) { 
            this.q = q;
            new thread(this).start(); 
        }

        public void run() { 
            int i = 0;
            while (true)
                q.put(i++);
        }
    }

    class Consumer implement Runnable
    { 	
		Q q;

        Consumer(Q q) { 
            this.q = q;
            new Thread(this).start();
        }

        public void run() { 
            while (true)
                q.get();
        }
    }

    class PandC  { 			
		public static void main( String args[ ] ) {
		Q q = new Q( );		
		new Producer(q) ;		
		new Consumer (q);			
		   }
		}