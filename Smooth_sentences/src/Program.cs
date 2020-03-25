using System;

namespace Smooth_sentences
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please enter a sentence");
            string str1 = Console.ReadLine();
            Console.WriteLine(IsSmoothSentence(str1));
        }
        public static bool IsSmoothSentence(string str)
        {
            str = str.ToLower();
            int len = str.Length;

            char[] arr = str.ToCharArray();

            for (int i = 1; i < len - 1; i++)
            {
                if (Char.IsWhiteSpace(arr[i]))
                {
                    if (arr[i - 1] != arr[i + 1])
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}