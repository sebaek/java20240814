package ch09.sec06.exam03;

import ch08.exercise.p8.B;
import ch08.exercise.p8.C;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK 버튼 클릭했습니다.");
            }
        }

        btnOk.setClickListener(new OkListener());
        btnOk.click();

        //
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭됨");
            }
        }
        Button btnCancel = new Button();
        btnCancel.setClickListener(new CancelListener());
        btnCancel.click();
    }
}
