public class test {
        public static void main(String[] args) {
            System.out.println(sumPower3(59076));
        }
        public static boolean sumPower3(int num) {

            return RunExp(num, num / 3);
        }

        private static boolean RunExp(int num, int exp) {

            boolean result = RunNum(num, exp);

            if(result) {

                return true;
            }
            if (exp > 0) {

                return RunNum(num, exp - 1);
            }

            return false;
        }

        private static boolean RunNum(int num, int exp) {

            int result = (int) Math.pow(3, exp);

            if(result == num) {

                return true;
            }
            if (exp > 0) {
                if (result < num) {

                    return RunExp(num - result, exp - 1);
                }
                return RunExp(num , exp - 1);
            }
            return false;
        }
    }
