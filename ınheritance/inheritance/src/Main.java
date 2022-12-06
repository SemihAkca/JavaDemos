public class Main {
    public static void main(String[] args) {
        BaseCrediManager[] crediManagers = new BaseCrediManager[]{new TeacherCreditManager(), new TarimCrediManager(),
                new OgrenciCrediManager()};

        for (BaseCrediManager crediManager : crediManagers) {
            System.out.println(crediManager.hesapla(1000));
        }
    }
}