package cassino;

public class Jogos {
    Cadastro play = new Cadastro ();
    int num;
    double golds;
    Jogos ()
            {
                this.num = 0;
                this.golds = 0.0;
            }
    
    public int Dados (int num, double golds)
    {
        int soma;
        int aleat;
        int aleat1;
        double mult;
        this.num = num;
        this.golds = golds;
        
        do
        {
        aleat = (int) (Math.random() * 6 );
        }
        while(aleat == 0);
        do
        {
        aleat1 = (int) (Math.random() * 6 );
        } 
        while(aleat1 == 0);
        
        soma = aleat + aleat1;
        if (soma == num)
        {
            mult = golds * 12;
            play.Adicionar(mult);
            num = soma;
            return num;
        }
        if ( soma == (num - 1) || soma == (num + 1))
        {
            mult = golds * 5;
            play.Adicionar(mult);
            num = soma;
            return num;
        }
        else
        {
            num = soma;
            return num;
        }
        
    }
     public boolean Roleta1 (int num, double gold)
    {
        
        int roleta;
        double mult1;
         if (play.getGold() > gold)
         {
         roleta = (int) (Math.random() * 36 );
         if (num == roleta)
         {
             
             mult1 = gold;
             play.Adicionar(mult1);
             this.num = roleta;
             
         }
        }
         else 
         {
             return false;
         }
         return true;
    }
    
    public boolean Roleta2 (int op, int num1, double gold)
    {
        int roleta2, roleta3, roleta4;
        double mult2, mult3, mult4;
        if (play.getGold() > gold)
       {
           
           if (op == 1)
           {
               do {
                    roleta2 = (int) (Math.random() * 12 );
           }while (roleta2 < 0);
                
                    if (num1 == roleta2 )
                    {
                        mult2 = golds * 2; 
                        play.Adicionar(mult2);
                        this.num = roleta2;
                    }
               
                return true;
          } 
                if (op == 2)
                {
                    do {
                    roleta3 = (int) (Math.random() * 24 );
                       }while (roleta3 < 12);
                    if (num1 == roleta3)
                    {
                        mult3 = golds * 2; 
                        play.Adicionar(mult3);
                        this.num = roleta3;
                    }
                    return true;
                
                }
                
                if (op == 3)
                {
                    do {
                        
                        roleta4 = (int) (Math.random() * 36 );
                       }while (roleta4 < 24);
                    if (num1 == roleta4)
                    {
                        mult4 = golds * 2; 
                        play.Adicionar(mult4);
                        this.num = roleta4;
                    }
                    return true;
                }
    
     }
        else 
        {
            return false;
        }
        return true;
       }
    
    
    
 public void Roleta3 (int op3, int num3, double money3)
            {
               int roleta6, roleta8;
               double mult6;
             if (play.getGold() > money3 )
             {
              if (op3 == 1)
                    {
                        do {
                            roleta6 = (int) (Math.random() * 18 );
                       }while (roleta6 < 0);
                    if (num3 == roleta6)
                    {
                        mult6 = golds * 1; 
                        play.Adicionar(mult6);
                        this.num = roleta6;
                    }
                
                
                
                }
              if (op3 == 2)
               {
            
                do {
                        roleta8 = (int) (Math.random() * 36 );
                }while (roleta8 < 18);
                    
                    if (num3 == roleta8)
                    {
                        mult6 = golds * 1; 
                        play.Adicionar(mult6);
                        this.num = roleta8;
                        
                    }
               }
                    
                    
             
                }
            
    
            }
    public void Roleta4 (int numip, double money4)
            {
               int roleta7;
               double mult7;
            if (play.getGold() > money4)
            {
                do {
                        roleta7 = (int) (Math.random() * 100 );
                   }while (roleta7 < 0);
                
                if (roleta7 % 2 == numip)
                {
                    mult7 = golds * 1; 
                    play.Adicionar(mult7);
                    this.num = roleta7;
                    
                }
            }
           
            }
        
 }
