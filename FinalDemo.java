class FinalDemo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++)
            System.out.println("In loop");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println("InterruptedException occurred");
        }
    }
}
