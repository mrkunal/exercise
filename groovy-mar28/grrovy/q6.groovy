def check=  { n->  if(n%2==0)
                                 println "${n} is even"
                                 else
                                  println "${n} is odd"
                                 
                                 
                       }
         
         def list=(1..10)          
 list.each(check);
