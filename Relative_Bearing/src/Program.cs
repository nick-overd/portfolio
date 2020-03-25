using System;

namespace src
{
    class Program
    {
        static void Main(string[] args)
        {   Console.WriteLine("Please enter a degree");
            int str1 = Console.ReadLine();
            Console.WriteLine("Please enter a degree");
            int str2 = Console.ReadLine();
            Console.WriteLine(Bearing(str1, str2));
            Console.Read();
        }
        public static double Bearing(int pt1, int pt2)
        {
            if (0 <= pt1 && pt1 > 360 && 0 <= pt2 && pt2>360){
            double x = 
                Math.Cos(DegreesToRadians(pt1))
                * Math.Sin(DegreesToRadians(pt2))
                - Math.Sin(DegreesToRadians(pt1))
                * Math.Cos(DegreesToRadians(pt2))
                * Math.Cos(DegreesToRadians(pt2 - pt1));
            double y = Math.Sin(DegreesToRadians(pt2 - pt1))
                * Math.Cos(DegreesToRadians(pt2));

    // Math.Atan2 can return negative value, 0 <= output value < 2*PI expected 
            return (Math.Atan2(y, x) + Math.PI * 2) % (Math.PI * 2);
            }
            else {
                Console.WriteLine("invalid inputs please input in degrees");
            }
            }

        public static double DegreesToRadians(double angle)
        {
            return angle * Math.PI / 180.0d;
        }
    }
}
