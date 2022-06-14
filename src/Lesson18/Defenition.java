package Lesson18;

public class Defenition {

    private void notify(String[] userEmails) {

        for (String email : userEmails) {

            try {
// send email to user - error
                System.out.println("Email " + email + "was send");
            } catch (Exception e) {
                // how should i do
                System.out.println("Email " + email + "was not send");
            } finally {
// updateStatus
            }
//        } catch (type2 e){
//
//        }
        }
    }
}
