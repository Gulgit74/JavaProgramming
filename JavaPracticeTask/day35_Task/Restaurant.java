package day35_Task;

import java.util.ArrayList;
import java.util.Arrays;

    public class Restaurant {
       /*
        public String owner, location;
        public int numberOfStars;
        public ArrayList<Server>servers=new ArrayList<>();
        public ArrayList<Chef>chefs=new ArrayList<>();

        public Restaurant(String owner, String location, int numberOfStars) {
            this.owner = owner;
            this.location = location;
            this.numberOfStars = numberOfStars;
        }

        public void hireServer(Server[server){
            servers.add(server);
        }
        public void hireServer(Server[] sevrs){
            servers.addAll(Arrays.asList(sevrs));
        }
        public void hireChef(Chef chef){
            chefs.add(chef);
        }
        public void hireChef(Chef[] cfs){
            chefs.addAll(Arrays.asList(chefs));
        }
        public void terminateChef(int employeeID){
            chefs.removeIf(p->p.getEmployeeID()==employeeID);
        }
        public void terminateServer(int employeeID){
            servers.removeIf(p->p.getEmployeeID()==employeeID);
        }

        public String toString() {
            return "Restaurant{" +
                    "owner='" + owner + '\'' +
                    ", location='" + location + '\'' +
                    ", numberOfStars=" + numberOfStars +
                    ",total servers=" + servers.size() +
                    ",total chefs=" + chefs.size() +
                    '}';
        }

    }
    /*
    5. Restaurant Task:
    re-do the Restaurant task by making all the fields private in each custom classes

    Encapsulate all the field
        (salary cannot be set to negative)
        (employeeId cannot be set to negative or zero)

    Avoid any duplicated code fragments in each class
     */

    }



