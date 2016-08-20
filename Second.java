/**
 * Created by Aleksandr on 20.08.2016.
 */
public class Second {
        private String name;
        private String says;

        public Second(String name,String says){
            this.name = name;
            this.says = says;
        }

        public static void main(String[] args) {
            Second dog1 = new Second("spot","Ruff!");
            Second dog2 = new Second ("scruffy","Wurf!");

            System.out.println(dog1.name+" says "+dog1.says);
            System.out.println(dog2.name+" says "+dog2.says);
        }
    }

