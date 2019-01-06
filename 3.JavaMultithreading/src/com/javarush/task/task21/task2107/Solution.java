package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable{

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }



    protected Map<String, User> users = new LinkedHashMap();


    @Override
    public Object clone() throws CloneNotSupportedException {
        Solution obj=null;
        try{
            obj=(Solution) super.clone();
            Map<String, User> copyusers = new LinkedHashMap();
            for (Map.Entry<String, User> entry : users.entrySet()) {
copyusers.put(entry.getKey(),entry.getValue());
            }
            obj.users=copyusers;
            return obj;



        }catch (CloneNotSupportedException e){
            System.out.println("Something wrong!!!");
        }
        return obj;
    }

    public static class User implements Cloneable  {
        int age;
        String name;

        @Override
        public Object clone() throws CloneNotSupportedException {
            User obj=null;
            try{
                obj=(User) super.clone();
            }catch (CloneNotSupportedException e){
                System.out.println("Something wrong!!!");
            }
            return obj;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (age != user.age) return false;
            return name != null ? name.equals(user.name) : user.name == null;
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }


        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
