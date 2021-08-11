package com.sda.coding_exercises.ex25;


class BasketEmptyException extends  Exception{
    public BasketEmptyException() {
        super("No more items");
    }


}
