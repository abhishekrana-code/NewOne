interface FUnctionalInter {
        void show();
}
class Demo
{
        static void main() {
//                FUnctionalInter m = new FUnctionalInter()
//                {
//                        public void show()
//                        {
//                                System.out.println("In show");
//                        }
//                };
                FUnctionalInter m =() -> System.out.println("in show");
                m.show();
        }
}