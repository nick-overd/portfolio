using System;

namespace src
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(Isograms("hello"));
            Console.ReadLine();
        }
        public static bool Isograms(string args){
            string temp = "";
            bool lmao = true;
            args = args.ToLower();
            for(int i= 0; i< args.Length - 1; i++){
                temp = args[i].ToString();
                for(int j = i + 1; j < args.Length -1; j++){
                    if(temp.Equals(args[j].ToString()))
                    {
                        lmao = false;
                    }
                }
            }
        return lmao;
        }
    }
}
