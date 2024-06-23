import java.util.Scanner;

public class Game {
    public char matrix[][] ;
    public int cn=0;
    public Game()
    {
        matrix= new char [3][3];
       for(int i=0;i<3;i++)
         {
          for(int j =0;j<3;j++)
           matrix[i][j]=' ';
         }
    }
    public  void setdefault()
    {
        matrix= new char [3][3];
       for(int i=0;i<3;i++)
         {
          for(int j =0;j<3;j++)
           matrix[i][j]=' ';
         }
         cn=0;
    }
    public void display()
    {
        for(int i=0;i<3;i++)
          {
            if(i==0)
            System.out.println("--------------");
            for(int j =0;j<3;j++)
            {
                if (j==1)
                System.out.print(" "+ matrix[i][j] +" ");
                else
                System.out.print( "| "+matrix[i][j] + " | ");
                if(j==2)
                System.out.println("");
                

            }
            if(i==0 ||i==1)
           System.out.println("--------------");
             
         }
         System.out.println("--------------");
    }
    public void insertX()
    {
 if(cn<=9)
   {
        
        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.println("Player X : please enter the position");
        System.out.println("Player X : please enter row between [1,3]");
        row=input.nextInt();
        System.out.println("Player X : please enter column between [1,3]");
        col=input.nextInt();
       while(row<1 || col<1||row>3||col>3)
       {
        System.out.println("Player X : invalid position ,  please enter the position again");
        System.out.println("Player X : please enter row between [1,3]");
        row=input.nextInt();
        System.out.println("Player X : please enter column between [1,3]");
        col=input.nextInt();

       } 

       while(matrix[row-1][col-1]!=' ')
       {
      
           System.out.println("Plater X : this position is full ,  please enter the position again");
           System.out.println("Player X : please entera new row between [1,3]");
           row=input.nextInt();
           System.out.println("Player X : please enter a new column between [1,3]");
           col=input.nextInt();
            while(row<1 || col<1||row>3||col>3)
            {
               System.out.println("Plater X : invalid position ,  please enter the position again");
               System.out.println("Player X : please entera new row between [1,3]");
               row=input.nextInt();
               System.out.println("Player X : please enter a new column between [1,3]");
               col=input.nextInt();

            }
        
       }
          
           matrix[row-1][col-1]='X';  
          cn++;
    }
    else
    return;
                
        }
        public void insertO()
        {
         if(cn<=8)
         {  
            Scanner input = new Scanner(System.in);
            int row,col;
            System.out.println("Player O : please enter the position");
            System.out.println("Player O : please enter row between [1,3]");
            row=input.nextInt();
            System.out.println("Player O : please enter column between [1,3]");
            col=input.nextInt();
           while(row<1 || col<1||row>3||col>3)
           {
            System.out.println("Player O : invalid position ,  please enter the position again");
            System.out.println("Player O : please enter row between [1,3]");
            row=input.nextInt();
            System.out.println("Player O : please enter column between [1,3]");
            col=input.nextInt();
    
           } 
    
           while(matrix[row-1][col-1]!=' ')
           {
               System.out.println("Plater O : this position is full ,  please enter the position again");
               System.out.println("Player O : please entera new row between [1,3]");
               row=input.nextInt();
               System.out.println("Player O : please enter a new column between [1,3]");
               col=input.nextInt();
                while(row<1 || col<1||row>3||col>3)
                {
                   System.out.println("Plater O : invalid position ,  please enter the position again");
                   System.out.println("Player O : please entera new row between [1,3]");
                   row=input.nextInt();
                   System.out.println("Player O : please enter a new column between [1,3]");
                   col=input.nextInt();
    
                }
            
           }
           
               matrix[row-1][col-1]='O';  
               cn++;
        }
               else
               return;
                    
            }
            public boolean isFull()
            {
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        if(matrix[i][j]==' ')
                        return false;
                    }
                }
                return true;
            } 
            public boolean isWinningX()
            {
                if((matrix[1][1]=='X' )&&(matrix[0][1])=='X'&&(matrix[2][1]=='X'))
                return true;
                if((matrix[1][0]=='X' )&&(matrix[1][1])=='X'&&(matrix[1][2]=='X'))
                return true;
                if((matrix[0][0]=='X' )&&(matrix[1][1])=='X'&&(matrix[2][2]=='X'))
                return true;   
                if((matrix[0][2]=='X' )&&(matrix[1][1])=='X'&&(matrix[2][0]=='X'))
                return true;
                 
                 if((matrix[0][0]=='X' )&&(matrix[1][0])=='X'&&(matrix[2][0]=='X'))
                 return true;
                 if((matrix[0][2]=='X' )&&(matrix[1][2])=='X'&&(matrix[2][2]=='X'))
                 return true;
                 if((matrix[0][0]=='X' )&&(matrix[0][1])=='X'&&(matrix[0][2]=='X'))
                 return true;
                 if((matrix[2][0]=='X' )&&(matrix[2][1])=='X'&&(matrix[2][2]=='X'))
                 return true;
                return false;
            }
            public boolean isWinningO()
            {
                if((matrix[1][1]=='O' )&&(matrix[0][1])=='O'&&(matrix[2][1]=='O'))
                return true;
                if((matrix[1][0]=='O' )&&(matrix[1][1])=='O'&&(matrix[1][2]=='O'))
                return true;
                if((matrix[0][0]=='O' )&&(matrix[1][1])=='O'&&(matrix[2][2]=='O'))
                return true;   
                if((matrix[0][2]=='O' )&&(matrix[1][1])=='O'&&(matrix[2][0]=='O'))
                return true;
                ////////
                if((matrix[0][0]=='O' )&&(matrix[1][0])=='O'&&(matrix[2][0]=='O'))
                return true;
                if((matrix[0][2]=='O' )&&(matrix[1][2])=='O'&&(matrix[2][2]=='O'))
                return true;
                if((matrix[0][0]=='O' )&&(matrix[0][1])=='O'&&(matrix[0][2]=='O'))
                return true;
                if((matrix[2][0]=='O' )&&(matrix[2][1])=='O'&&(matrix[2][2]=='O'))
                return true;
                
                return false;
            }
            public static void main(String[] args) {
                Game obj=new Game();
                int cnt=0;
               
               
        
                    while(cnt<=8)
                    {
                    

                        
                         if(obj.isFull()==true)
                            {
                            System.out.println("-------------------------");
                            System.out.print("| ");
                            System.out.println("      Draw game    | ");
                            System.out.println("-------------------------");
                            return;
                            }
                         
                       
                            obj.display();
                            obj.insertX();
                             cnt++;
                            if(obj.isWinningX()==true)
                              {
                                obj.display();
                                System.out.println("------------------------------------------------");
                                System.out.print("| ");
                                System.out.println("congratulation ...... player X is the winner | ");
                                System.out.println("------------------------------------------------");
                                 return;
                              }
                    
                                   obj.display();
                                   obj.insertO();
                                   cnt++;
                                   if(obj.isWinningO()==true)
                                 {
                                    obj.display();
                                    System.out.println("------------------------------------------------");
                                    System.out.print("| ");
                                    System.out.println("congratulation ...... player O is the winner | ");
                                    System.out.println("------------------------------------------------");
                                     return ;
                                 }
                                 
                    }
                   
                    obj.display();
                    
                           if(obj.isWinningX()==true)
                              {
                                obj.display();
                                System.out.println("------------------------------------------------");
                                System.out.print("| ");
                                System.out.println("congratulation ...... player X is the winner | ");
                                System.out.println("------------------------------------------------");
                                 return;
                              }
                            else if(obj.isWinningO()==true)
                              {
                                 obj.display();
                                 System.out.println("------------------------------------------------");
                                 System.out.print("| ");
                                 System.out.println("congratulation ...... player O is the winner | ");
                                 System.out.println("------------------------------------------------");
                                  return ;
                              }
                              else 
                              {
                                System.out.println("------------------------");
                                System.out.print("| ");
                                System.out.println("      Draw game    | ");
                                System.out.println("------------------------");
                                return;
                                }
                              
                    
                
                            
                    }         
           
}    