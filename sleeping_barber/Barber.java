public class Barber {
    // the barber's state
    public boolean sleeping;
    // TODO: initialize the barber chair

    // constructors
    public Barber() {
        sleeping = false;
    }

    public Barber(boolean sleeping) {
        this.sleeping = sleeping;
    }

    private void checkForCustomer() {
        // TODO: query the barber chair for a waiting customer
        boolean customerWaiting = false;
        // determine whether to go to sleep
        if (!customerWaiting) {
            this.sleeping = true;
        }
    }

    public void wake() {
        this.sleeping = false;
    }

    private void askForPayment() {
        // TODO: write this method
    }

    private void processPayment() {
        // TODO: write this method
    }

    private void callCustomer() {
        // TODO: write this method
    }

    private void cutHair() {
        // TODO: write this method
    }

    private void work() {
        // TODO: write this method
    }
}
