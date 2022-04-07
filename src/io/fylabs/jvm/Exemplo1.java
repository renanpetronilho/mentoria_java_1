package io.fylabs.jvm;

public class Exemplo1 {

    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        int sum = x+y;
        System.out.println("Resultado: "+ sum);

            processamento_objeto();
            processamento_sleep();
            System.out.println("acabou o processamento");
    }

    private static void processamento_objeto(){
        for(int index = 0; index < 100000; index++){
           Teste teste = new Teste();

           teste.setId(index);
            System.out.println(teste);
        }
    }

    private static void processamento_sleep(){
        try {
            Thread.sleep(60000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Teste{

        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

}
